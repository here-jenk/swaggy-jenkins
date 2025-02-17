#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "github_scmlinks.h"



github_scmlinks_t *github_scmlinks_create(
    link_t *self,
    char *_class
    ) {
    github_scmlinks_t *github_scmlinks_local_var = malloc(sizeof(github_scmlinks_t));
    if (!github_scmlinks_local_var) {
        return NULL;
    }
    github_scmlinks_local_var->self = self;
    github_scmlinks_local_var->_class = _class;

    return github_scmlinks_local_var;
}


void github_scmlinks_free(github_scmlinks_t *github_scmlinks) {
    if(NULL == github_scmlinks){
        return ;
    }
    listEntry_t *listEntry;
    if (github_scmlinks->self) {
        link_free(github_scmlinks->self);
        github_scmlinks->self = NULL;
    }
    if (github_scmlinks->_class) {
        free(github_scmlinks->_class);
        github_scmlinks->_class = NULL;
    }
    free(github_scmlinks);
}

cJSON *github_scmlinks_convertToJSON(github_scmlinks_t *github_scmlinks) {
    cJSON *item = cJSON_CreateObject();

    // github_scmlinks->self
    if(github_scmlinks->self) {
    cJSON *self_local_JSON = link_convertToJSON(github_scmlinks->self);
    if(self_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "self", self_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // github_scmlinks->_class
    if(github_scmlinks->_class) {
    if(cJSON_AddStringToObject(item, "_class", github_scmlinks->_class) == NULL) {
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

github_scmlinks_t *github_scmlinks_parseFromJSON(cJSON *github_scmlinksJSON){

    github_scmlinks_t *github_scmlinks_local_var = NULL;

    // define the local variable for github_scmlinks->self
    link_t *self_local_nonprim = NULL;

    // github_scmlinks->self
    cJSON *self = cJSON_GetObjectItemCaseSensitive(github_scmlinksJSON, "self");
    if (self) { 
    self_local_nonprim = link_parseFromJSON(self); //nonprimitive
    }

    // github_scmlinks->_class
    cJSON *_class = cJSON_GetObjectItemCaseSensitive(github_scmlinksJSON, "_class");
    if (_class) { 
    if(!cJSON_IsString(_class))
    {
    goto end; //String
    }
    }


    github_scmlinks_local_var = github_scmlinks_create (
        self ? self_local_nonprim : NULL,
        _class ? strdup(_class->valuestring) : NULL
        );

    return github_scmlinks_local_var;
end:
    if (self_local_nonprim) {
        link_free(self_local_nonprim);
        self_local_nonprim = NULL;
    }
    return NULL;

}
