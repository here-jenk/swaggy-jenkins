#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "github_scm.h"



github_scm_t *github_scm_create(
    char *_class,
    github_scmlinks_t *_links,
    char *credential_id,
    char *id,
    char *uri
    ) {
    github_scm_t *github_scm_local_var = malloc(sizeof(github_scm_t));
    if (!github_scm_local_var) {
        return NULL;
    }
    github_scm_local_var->_class = _class;
    github_scm_local_var->_links = _links;
    github_scm_local_var->credential_id = credential_id;
    github_scm_local_var->id = id;
    github_scm_local_var->uri = uri;

    return github_scm_local_var;
}


void github_scm_free(github_scm_t *github_scm) {
    if(NULL == github_scm){
        return ;
    }
    listEntry_t *listEntry;
    if (github_scm->_class) {
        free(github_scm->_class);
        github_scm->_class = NULL;
    }
    if (github_scm->_links) {
        github_scmlinks_free(github_scm->_links);
        github_scm->_links = NULL;
    }
    if (github_scm->credential_id) {
        free(github_scm->credential_id);
        github_scm->credential_id = NULL;
    }
    if (github_scm->id) {
        free(github_scm->id);
        github_scm->id = NULL;
    }
    if (github_scm->uri) {
        free(github_scm->uri);
        github_scm->uri = NULL;
    }
    free(github_scm);
}

cJSON *github_scm_convertToJSON(github_scm_t *github_scm) {
    cJSON *item = cJSON_CreateObject();

    // github_scm->_class
    if(github_scm->_class) {
    if(cJSON_AddStringToObject(item, "_class", github_scm->_class) == NULL) {
    goto fail; //String
    }
    }


    // github_scm->_links
    if(github_scm->_links) {
    cJSON *_links_local_JSON = github_scmlinks_convertToJSON(github_scm->_links);
    if(_links_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "_links", _links_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // github_scm->credential_id
    if(github_scm->credential_id) {
    if(cJSON_AddStringToObject(item, "credentialId", github_scm->credential_id) == NULL) {
    goto fail; //String
    }
    }


    // github_scm->id
    if(github_scm->id) {
    if(cJSON_AddStringToObject(item, "id", github_scm->id) == NULL) {
    goto fail; //String
    }
    }


    // github_scm->uri
    if(github_scm->uri) {
    if(cJSON_AddStringToObject(item, "uri", github_scm->uri) == NULL) {
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

github_scm_t *github_scm_parseFromJSON(cJSON *github_scmJSON){

    github_scm_t *github_scm_local_var = NULL;

    // define the local variable for github_scm->_links
    github_scmlinks_t *_links_local_nonprim = NULL;

    // github_scm->_class
    cJSON *_class = cJSON_GetObjectItemCaseSensitive(github_scmJSON, "_class");
    if (_class) { 
    if(!cJSON_IsString(_class))
    {
    goto end; //String
    }
    }

    // github_scm->_links
    cJSON *_links = cJSON_GetObjectItemCaseSensitive(github_scmJSON, "_links");
    if (_links) { 
    _links_local_nonprim = github_scmlinks_parseFromJSON(_links); //nonprimitive
    }

    // github_scm->credential_id
    cJSON *credential_id = cJSON_GetObjectItemCaseSensitive(github_scmJSON, "credentialId");
    if (credential_id) { 
    if(!cJSON_IsString(credential_id))
    {
    goto end; //String
    }
    }

    // github_scm->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(github_scmJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }
    }

    // github_scm->uri
    cJSON *uri = cJSON_GetObjectItemCaseSensitive(github_scmJSON, "uri");
    if (uri) { 
    if(!cJSON_IsString(uri))
    {
    goto end; //String
    }
    }


    github_scm_local_var = github_scm_create (
        _class ? strdup(_class->valuestring) : NULL,
        _links ? _links_local_nonprim : NULL,
        credential_id ? strdup(credential_id->valuestring) : NULL,
        id ? strdup(id->valuestring) : NULL,
        uri ? strdup(uri->valuestring) : NULL
        );

    return github_scm_local_var;
end:
    if (_links_local_nonprim) {
        github_scmlinks_free(_links_local_nonprim);
        _links_local_nonprim = NULL;
    }
    return NULL;

}
