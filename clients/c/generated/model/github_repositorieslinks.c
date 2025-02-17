#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "github_repositorieslinks.h"



github_repositorieslinks_t *github_repositorieslinks_create(
    link_t *self,
    char *_class
    ) {
    github_repositorieslinks_t *github_repositorieslinks_local_var = malloc(sizeof(github_repositorieslinks_t));
    if (!github_repositorieslinks_local_var) {
        return NULL;
    }
    github_repositorieslinks_local_var->self = self;
    github_repositorieslinks_local_var->_class = _class;

    return github_repositorieslinks_local_var;
}


void github_repositorieslinks_free(github_repositorieslinks_t *github_repositorieslinks) {
    if(NULL == github_repositorieslinks){
        return ;
    }
    listEntry_t *listEntry;
    if (github_repositorieslinks->self) {
        link_free(github_repositorieslinks->self);
        github_repositorieslinks->self = NULL;
    }
    if (github_repositorieslinks->_class) {
        free(github_repositorieslinks->_class);
        github_repositorieslinks->_class = NULL;
    }
    free(github_repositorieslinks);
}

cJSON *github_repositorieslinks_convertToJSON(github_repositorieslinks_t *github_repositorieslinks) {
    cJSON *item = cJSON_CreateObject();

    // github_repositorieslinks->self
    if(github_repositorieslinks->self) {
    cJSON *self_local_JSON = link_convertToJSON(github_repositorieslinks->self);
    if(self_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "self", self_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // github_repositorieslinks->_class
    if(github_repositorieslinks->_class) {
    if(cJSON_AddStringToObject(item, "_class", github_repositorieslinks->_class) == NULL) {
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

github_repositorieslinks_t *github_repositorieslinks_parseFromJSON(cJSON *github_repositorieslinksJSON){

    github_repositorieslinks_t *github_repositorieslinks_local_var = NULL;

    // define the local variable for github_repositorieslinks->self
    link_t *self_local_nonprim = NULL;

    // github_repositorieslinks->self
    cJSON *self = cJSON_GetObjectItemCaseSensitive(github_repositorieslinksJSON, "self");
    if (self) { 
    self_local_nonprim = link_parseFromJSON(self); //nonprimitive
    }

    // github_repositorieslinks->_class
    cJSON *_class = cJSON_GetObjectItemCaseSensitive(github_repositorieslinksJSON, "_class");
    if (_class) { 
    if(!cJSON_IsString(_class))
    {
    goto end; //String
    }
    }


    github_repositorieslinks_local_var = github_repositorieslinks_create (
        self ? self_local_nonprim : NULL,
        _class ? strdup(_class->valuestring) : NULL
        );

    return github_repositorieslinks_local_var;
end:
    if (self_local_nonprim) {
        link_free(self_local_nonprim);
        self_local_nonprim = NULL;
    }
    return NULL;

}
