#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "disk_space_monitor_descriptor_disk_space.h"



disk_space_monitor_descriptor_disk_space_t *disk_space_monitor_descriptor_disk_space_create(
    char *_class,
    int timestamp,
    char *path,
    int size
    ) {
    disk_space_monitor_descriptor_disk_space_t *disk_space_monitor_descriptor_disk_space_local_var = malloc(sizeof(disk_space_monitor_descriptor_disk_space_t));
    if (!disk_space_monitor_descriptor_disk_space_local_var) {
        return NULL;
    }
    disk_space_monitor_descriptor_disk_space_local_var->_class = _class;
    disk_space_monitor_descriptor_disk_space_local_var->timestamp = timestamp;
    disk_space_monitor_descriptor_disk_space_local_var->path = path;
    disk_space_monitor_descriptor_disk_space_local_var->size = size;

    return disk_space_monitor_descriptor_disk_space_local_var;
}


void disk_space_monitor_descriptor_disk_space_free(disk_space_monitor_descriptor_disk_space_t *disk_space_monitor_descriptor_disk_space) {
    if(NULL == disk_space_monitor_descriptor_disk_space){
        return ;
    }
    listEntry_t *listEntry;
    if (disk_space_monitor_descriptor_disk_space->_class) {
        free(disk_space_monitor_descriptor_disk_space->_class);
        disk_space_monitor_descriptor_disk_space->_class = NULL;
    }
    if (disk_space_monitor_descriptor_disk_space->path) {
        free(disk_space_monitor_descriptor_disk_space->path);
        disk_space_monitor_descriptor_disk_space->path = NULL;
    }
    free(disk_space_monitor_descriptor_disk_space);
}

cJSON *disk_space_monitor_descriptor_disk_space_convertToJSON(disk_space_monitor_descriptor_disk_space_t *disk_space_monitor_descriptor_disk_space) {
    cJSON *item = cJSON_CreateObject();

    // disk_space_monitor_descriptor_disk_space->_class
    if(disk_space_monitor_descriptor_disk_space->_class) {
    if(cJSON_AddStringToObject(item, "_class", disk_space_monitor_descriptor_disk_space->_class) == NULL) {
    goto fail; //String
    }
    }


    // disk_space_monitor_descriptor_disk_space->timestamp
    if(disk_space_monitor_descriptor_disk_space->timestamp) {
    if(cJSON_AddNumberToObject(item, "timestamp", disk_space_monitor_descriptor_disk_space->timestamp) == NULL) {
    goto fail; //Numeric
    }
    }


    // disk_space_monitor_descriptor_disk_space->path
    if(disk_space_monitor_descriptor_disk_space->path) {
    if(cJSON_AddStringToObject(item, "path", disk_space_monitor_descriptor_disk_space->path) == NULL) {
    goto fail; //String
    }
    }


    // disk_space_monitor_descriptor_disk_space->size
    if(disk_space_monitor_descriptor_disk_space->size) {
    if(cJSON_AddNumberToObject(item, "size", disk_space_monitor_descriptor_disk_space->size) == NULL) {
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

disk_space_monitor_descriptor_disk_space_t *disk_space_monitor_descriptor_disk_space_parseFromJSON(cJSON *disk_space_monitor_descriptor_disk_spaceJSON){

    disk_space_monitor_descriptor_disk_space_t *disk_space_monitor_descriptor_disk_space_local_var = NULL;

    // disk_space_monitor_descriptor_disk_space->_class
    cJSON *_class = cJSON_GetObjectItemCaseSensitive(disk_space_monitor_descriptor_disk_spaceJSON, "_class");
    if (_class) { 
    if(!cJSON_IsString(_class))
    {
    goto end; //String
    }
    }

    // disk_space_monitor_descriptor_disk_space->timestamp
    cJSON *timestamp = cJSON_GetObjectItemCaseSensitive(disk_space_monitor_descriptor_disk_spaceJSON, "timestamp");
    if (timestamp) { 
    if(!cJSON_IsNumber(timestamp))
    {
    goto end; //Numeric
    }
    }

    // disk_space_monitor_descriptor_disk_space->path
    cJSON *path = cJSON_GetObjectItemCaseSensitive(disk_space_monitor_descriptor_disk_spaceJSON, "path");
    if (path) { 
    if(!cJSON_IsString(path))
    {
    goto end; //String
    }
    }

    // disk_space_monitor_descriptor_disk_space->size
    cJSON *size = cJSON_GetObjectItemCaseSensitive(disk_space_monitor_descriptor_disk_spaceJSON, "size");
    if (size) { 
    if(!cJSON_IsNumber(size))
    {
    goto end; //Numeric
    }
    }


    disk_space_monitor_descriptor_disk_space_local_var = disk_space_monitor_descriptor_disk_space_create (
        _class ? strdup(_class->valuestring) : NULL,
        timestamp ? timestamp->valuedouble : 0,
        path ? strdup(path->valuestring) : NULL,
        size ? size->valuedouble : 0
        );

    return disk_space_monitor_descriptor_disk_space_local_var;
end:
    return NULL;

}
