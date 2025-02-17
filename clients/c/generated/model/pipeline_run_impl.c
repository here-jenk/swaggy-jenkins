#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pipeline_run_impl.h"



pipeline_run_impl_t *pipeline_run_impl_create(
    char *_class,
    pipeline_run_impllinks_t *_links,
    int duration_in_millis,
    char *en_queue_time,
    char *end_time,
    int estimated_duration_in_millis,
    char *id,
    char *organization,
    char *pipeline,
    char *result,
    char *run_summary,
    char *start_time,
    char *state,
    char *type,
    char *commit_id
    ) {
    pipeline_run_impl_t *pipeline_run_impl_local_var = malloc(sizeof(pipeline_run_impl_t));
    if (!pipeline_run_impl_local_var) {
        return NULL;
    }
    pipeline_run_impl_local_var->_class = _class;
    pipeline_run_impl_local_var->_links = _links;
    pipeline_run_impl_local_var->duration_in_millis = duration_in_millis;
    pipeline_run_impl_local_var->en_queue_time = en_queue_time;
    pipeline_run_impl_local_var->end_time = end_time;
    pipeline_run_impl_local_var->estimated_duration_in_millis = estimated_duration_in_millis;
    pipeline_run_impl_local_var->id = id;
    pipeline_run_impl_local_var->organization = organization;
    pipeline_run_impl_local_var->pipeline = pipeline;
    pipeline_run_impl_local_var->result = result;
    pipeline_run_impl_local_var->run_summary = run_summary;
    pipeline_run_impl_local_var->start_time = start_time;
    pipeline_run_impl_local_var->state = state;
    pipeline_run_impl_local_var->type = type;
    pipeline_run_impl_local_var->commit_id = commit_id;

    return pipeline_run_impl_local_var;
}


void pipeline_run_impl_free(pipeline_run_impl_t *pipeline_run_impl) {
    if(NULL == pipeline_run_impl){
        return ;
    }
    listEntry_t *listEntry;
    if (pipeline_run_impl->_class) {
        free(pipeline_run_impl->_class);
        pipeline_run_impl->_class = NULL;
    }
    if (pipeline_run_impl->_links) {
        pipeline_run_impllinks_free(pipeline_run_impl->_links);
        pipeline_run_impl->_links = NULL;
    }
    if (pipeline_run_impl->en_queue_time) {
        free(pipeline_run_impl->en_queue_time);
        pipeline_run_impl->en_queue_time = NULL;
    }
    if (pipeline_run_impl->end_time) {
        free(pipeline_run_impl->end_time);
        pipeline_run_impl->end_time = NULL;
    }
    if (pipeline_run_impl->id) {
        free(pipeline_run_impl->id);
        pipeline_run_impl->id = NULL;
    }
    if (pipeline_run_impl->organization) {
        free(pipeline_run_impl->organization);
        pipeline_run_impl->organization = NULL;
    }
    if (pipeline_run_impl->pipeline) {
        free(pipeline_run_impl->pipeline);
        pipeline_run_impl->pipeline = NULL;
    }
    if (pipeline_run_impl->result) {
        free(pipeline_run_impl->result);
        pipeline_run_impl->result = NULL;
    }
    if (pipeline_run_impl->run_summary) {
        free(pipeline_run_impl->run_summary);
        pipeline_run_impl->run_summary = NULL;
    }
    if (pipeline_run_impl->start_time) {
        free(pipeline_run_impl->start_time);
        pipeline_run_impl->start_time = NULL;
    }
    if (pipeline_run_impl->state) {
        free(pipeline_run_impl->state);
        pipeline_run_impl->state = NULL;
    }
    if (pipeline_run_impl->type) {
        free(pipeline_run_impl->type);
        pipeline_run_impl->type = NULL;
    }
    if (pipeline_run_impl->commit_id) {
        free(pipeline_run_impl->commit_id);
        pipeline_run_impl->commit_id = NULL;
    }
    free(pipeline_run_impl);
}

cJSON *pipeline_run_impl_convertToJSON(pipeline_run_impl_t *pipeline_run_impl) {
    cJSON *item = cJSON_CreateObject();

    // pipeline_run_impl->_class
    if(pipeline_run_impl->_class) {
    if(cJSON_AddStringToObject(item, "_class", pipeline_run_impl->_class) == NULL) {
    goto fail; //String
    }
    }


    // pipeline_run_impl->_links
    if(pipeline_run_impl->_links) {
    cJSON *_links_local_JSON = pipeline_run_impllinks_convertToJSON(pipeline_run_impl->_links);
    if(_links_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "_links", _links_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // pipeline_run_impl->duration_in_millis
    if(pipeline_run_impl->duration_in_millis) {
    if(cJSON_AddNumberToObject(item, "durationInMillis", pipeline_run_impl->duration_in_millis) == NULL) {
    goto fail; //Numeric
    }
    }


    // pipeline_run_impl->en_queue_time
    if(pipeline_run_impl->en_queue_time) {
    if(cJSON_AddStringToObject(item, "enQueueTime", pipeline_run_impl->en_queue_time) == NULL) {
    goto fail; //String
    }
    }


    // pipeline_run_impl->end_time
    if(pipeline_run_impl->end_time) {
    if(cJSON_AddStringToObject(item, "endTime", pipeline_run_impl->end_time) == NULL) {
    goto fail; //String
    }
    }


    // pipeline_run_impl->estimated_duration_in_millis
    if(pipeline_run_impl->estimated_duration_in_millis) {
    if(cJSON_AddNumberToObject(item, "estimatedDurationInMillis", pipeline_run_impl->estimated_duration_in_millis) == NULL) {
    goto fail; //Numeric
    }
    }


    // pipeline_run_impl->id
    if(pipeline_run_impl->id) {
    if(cJSON_AddStringToObject(item, "id", pipeline_run_impl->id) == NULL) {
    goto fail; //String
    }
    }


    // pipeline_run_impl->organization
    if(pipeline_run_impl->organization) {
    if(cJSON_AddStringToObject(item, "organization", pipeline_run_impl->organization) == NULL) {
    goto fail; //String
    }
    }


    // pipeline_run_impl->pipeline
    if(pipeline_run_impl->pipeline) {
    if(cJSON_AddStringToObject(item, "pipeline", pipeline_run_impl->pipeline) == NULL) {
    goto fail; //String
    }
    }


    // pipeline_run_impl->result
    if(pipeline_run_impl->result) {
    if(cJSON_AddStringToObject(item, "result", pipeline_run_impl->result) == NULL) {
    goto fail; //String
    }
    }


    // pipeline_run_impl->run_summary
    if(pipeline_run_impl->run_summary) {
    if(cJSON_AddStringToObject(item, "runSummary", pipeline_run_impl->run_summary) == NULL) {
    goto fail; //String
    }
    }


    // pipeline_run_impl->start_time
    if(pipeline_run_impl->start_time) {
    if(cJSON_AddStringToObject(item, "startTime", pipeline_run_impl->start_time) == NULL) {
    goto fail; //String
    }
    }


    // pipeline_run_impl->state
    if(pipeline_run_impl->state) {
    if(cJSON_AddStringToObject(item, "state", pipeline_run_impl->state) == NULL) {
    goto fail; //String
    }
    }


    // pipeline_run_impl->type
    if(pipeline_run_impl->type) {
    if(cJSON_AddStringToObject(item, "type", pipeline_run_impl->type) == NULL) {
    goto fail; //String
    }
    }


    // pipeline_run_impl->commit_id
    if(pipeline_run_impl->commit_id) {
    if(cJSON_AddStringToObject(item, "commitId", pipeline_run_impl->commit_id) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pipeline_run_impl_t *pipeline_run_impl_parseFromJSON(cJSON *pipeline_run_implJSON){

    pipeline_run_impl_t *pipeline_run_impl_local_var = NULL;

    // define the local variable for pipeline_run_impl->_links
    pipeline_run_impllinks_t *_links_local_nonprim = NULL;

    // pipeline_run_impl->_class
    cJSON *_class = cJSON_GetObjectItemCaseSensitive(pipeline_run_implJSON, "_class");
    if (_class) { 
    if(!cJSON_IsString(_class))
    {
    goto end; //String
    }
    }

    // pipeline_run_impl->_links
    cJSON *_links = cJSON_GetObjectItemCaseSensitive(pipeline_run_implJSON, "_links");
    if (_links) { 
    _links_local_nonprim = pipeline_run_impllinks_parseFromJSON(_links); //nonprimitive
    }

    // pipeline_run_impl->duration_in_millis
    cJSON *duration_in_millis = cJSON_GetObjectItemCaseSensitive(pipeline_run_implJSON, "durationInMillis");
    if (duration_in_millis) { 
    if(!cJSON_IsNumber(duration_in_millis))
    {
    goto end; //Numeric
    }
    }

    // pipeline_run_impl->en_queue_time
    cJSON *en_queue_time = cJSON_GetObjectItemCaseSensitive(pipeline_run_implJSON, "enQueueTime");
    if (en_queue_time) { 
    if(!cJSON_IsString(en_queue_time))
    {
    goto end; //String
    }
    }

    // pipeline_run_impl->end_time
    cJSON *end_time = cJSON_GetObjectItemCaseSensitive(pipeline_run_implJSON, "endTime");
    if (end_time) { 
    if(!cJSON_IsString(end_time))
    {
    goto end; //String
    }
    }

    // pipeline_run_impl->estimated_duration_in_millis
    cJSON *estimated_duration_in_millis = cJSON_GetObjectItemCaseSensitive(pipeline_run_implJSON, "estimatedDurationInMillis");
    if (estimated_duration_in_millis) { 
    if(!cJSON_IsNumber(estimated_duration_in_millis))
    {
    goto end; //Numeric
    }
    }

    // pipeline_run_impl->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(pipeline_run_implJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }
    }

    // pipeline_run_impl->organization
    cJSON *organization = cJSON_GetObjectItemCaseSensitive(pipeline_run_implJSON, "organization");
    if (organization) { 
    if(!cJSON_IsString(organization))
    {
    goto end; //String
    }
    }

    // pipeline_run_impl->pipeline
    cJSON *pipeline = cJSON_GetObjectItemCaseSensitive(pipeline_run_implJSON, "pipeline");
    if (pipeline) { 
    if(!cJSON_IsString(pipeline))
    {
    goto end; //String
    }
    }

    // pipeline_run_impl->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(pipeline_run_implJSON, "result");
    if (result) { 
    if(!cJSON_IsString(result))
    {
    goto end; //String
    }
    }

    // pipeline_run_impl->run_summary
    cJSON *run_summary = cJSON_GetObjectItemCaseSensitive(pipeline_run_implJSON, "runSummary");
    if (run_summary) { 
    if(!cJSON_IsString(run_summary))
    {
    goto end; //String
    }
    }

    // pipeline_run_impl->start_time
    cJSON *start_time = cJSON_GetObjectItemCaseSensitive(pipeline_run_implJSON, "startTime");
    if (start_time) { 
    if(!cJSON_IsString(start_time))
    {
    goto end; //String
    }
    }

    // pipeline_run_impl->state
    cJSON *state = cJSON_GetObjectItemCaseSensitive(pipeline_run_implJSON, "state");
    if (state) { 
    if(!cJSON_IsString(state))
    {
    goto end; //String
    }
    }

    // pipeline_run_impl->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(pipeline_run_implJSON, "type");
    if (type) { 
    if(!cJSON_IsString(type))
    {
    goto end; //String
    }
    }

    // pipeline_run_impl->commit_id
    cJSON *commit_id = cJSON_GetObjectItemCaseSensitive(pipeline_run_implJSON, "commitId");
    if (commit_id) { 
    if(!cJSON_IsString(commit_id))
    {
    goto end; //String
    }
    }


    pipeline_run_impl_local_var = pipeline_run_impl_create (
        _class ? strdup(_class->valuestring) : NULL,
        _links ? _links_local_nonprim : NULL,
        duration_in_millis ? duration_in_millis->valuedouble : 0,
        en_queue_time ? strdup(en_queue_time->valuestring) : NULL,
        end_time ? strdup(end_time->valuestring) : NULL,
        estimated_duration_in_millis ? estimated_duration_in_millis->valuedouble : 0,
        id ? strdup(id->valuestring) : NULL,
        organization ? strdup(organization->valuestring) : NULL,
        pipeline ? strdup(pipeline->valuestring) : NULL,
        result ? strdup(result->valuestring) : NULL,
        run_summary ? strdup(run_summary->valuestring) : NULL,
        start_time ? strdup(start_time->valuestring) : NULL,
        state ? strdup(state->valuestring) : NULL,
        type ? strdup(type->valuestring) : NULL,
        commit_id ? strdup(commit_id->valuestring) : NULL
        );

    return pipeline_run_impl_local_var;
end:
    if (_links_local_nonprim) {
        pipeline_run_impllinks_free(_links_local_nonprim);
        _links_local_nonprim = NULL;
    }
    return NULL;

}
