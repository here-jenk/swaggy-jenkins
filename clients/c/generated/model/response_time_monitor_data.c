#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "response_time_monitor_data.h"



response_time_monitor_data_t *response_time_monitor_data_create(
    char *_class,
    int timestamp,
    int average
    ) {
    response_time_monitor_data_t *response_time_monitor_data_local_var = malloc(sizeof(response_time_monitor_data_t));
    if (!response_time_monitor_data_local_var) {
        return NULL;
    }
    response_time_monitor_data_local_var->_class = _class;
    response_time_monitor_data_local_var->timestamp = timestamp;
    response_time_monitor_data_local_var->average = average;

    return response_time_monitor_data_local_var;
}


void response_time_monitor_data_free(response_time_monitor_data_t *response_time_monitor_data) {
    if(NULL == response_time_monitor_data){
        return ;
    }
    listEntry_t *listEntry;
    if (response_time_monitor_data->_class) {
        free(response_time_monitor_data->_class);
        response_time_monitor_data->_class = NULL;
    }
    free(response_time_monitor_data);
}

cJSON *response_time_monitor_data_convertToJSON(response_time_monitor_data_t *response_time_monitor_data) {
    cJSON *item = cJSON_CreateObject();

    // response_time_monitor_data->_class
    if(response_time_monitor_data->_class) {
    if(cJSON_AddStringToObject(item, "_class", response_time_monitor_data->_class) == NULL) {
    goto fail; //String
    }
    }


    // response_time_monitor_data->timestamp
    if(response_time_monitor_data->timestamp) {
    if(cJSON_AddNumberToObject(item, "timestamp", response_time_monitor_data->timestamp) == NULL) {
    goto fail; //Numeric
    }
    }


    // response_time_monitor_data->average
    if(response_time_monitor_data->average) {
    if(cJSON_AddNumberToObject(item, "average", response_time_monitor_data->average) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

response_time_monitor_data_t *response_time_monitor_data_parseFromJSON(cJSON *response_time_monitor_dataJSON){

    response_time_monitor_data_t *response_time_monitor_data_local_var = NULL;

    // response_time_monitor_data->_class
    cJSON *_class = cJSON_GetObjectItemCaseSensitive(response_time_monitor_dataJSON, "_class");
    if (_class) { 
    if(!cJSON_IsString(_class))
    {
    goto end; //String
    }
    }

    // response_time_monitor_data->timestamp
    cJSON *timestamp = cJSON_GetObjectItemCaseSensitive(response_time_monitor_dataJSON, "timestamp");
    if (timestamp) { 
    if(!cJSON_IsNumber(timestamp))
    {
    goto end; //Numeric
    }
    }

    // response_time_monitor_data->average
    cJSON *average = cJSON_GetObjectItemCaseSensitive(response_time_monitor_dataJSON, "average");
    if (average) { 
    if(!cJSON_IsNumber(average))
    {
    goto end; //Numeric
    }
    }


    response_time_monitor_data_local_var = response_time_monitor_data_create (
        _class ? strdup(_class->valuestring) : NULL,
        timestamp ? timestamp->valuedouble : 0,
        average ? average->valuedouble : 0
        );

    return response_time_monitor_data_local_var;
end:
    return NULL;

}
