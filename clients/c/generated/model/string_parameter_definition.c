#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "string_parameter_definition.h"



string_parameter_definition_t *string_parameter_definition_create(
    char *_class,
    string_parameter_value_t *default_parameter_value,
    char *description,
    char *name,
    char *type
    ) {
    string_parameter_definition_t *string_parameter_definition_local_var = malloc(sizeof(string_parameter_definition_t));
    if (!string_parameter_definition_local_var) {
        return NULL;
    }
    string_parameter_definition_local_var->_class = _class;
    string_parameter_definition_local_var->default_parameter_value = default_parameter_value;
    string_parameter_definition_local_var->description = description;
    string_parameter_definition_local_var->name = name;
    string_parameter_definition_local_var->type = type;

    return string_parameter_definition_local_var;
}


void string_parameter_definition_free(string_parameter_definition_t *string_parameter_definition) {
    if(NULL == string_parameter_definition){
        return ;
    }
    listEntry_t *listEntry;
    if (string_parameter_definition->_class) {
        free(string_parameter_definition->_class);
        string_parameter_definition->_class = NULL;
    }
    if (string_parameter_definition->default_parameter_value) {
        string_parameter_value_free(string_parameter_definition->default_parameter_value);
        string_parameter_definition->default_parameter_value = NULL;
    }
    if (string_parameter_definition->description) {
        free(string_parameter_definition->description);
        string_parameter_definition->description = NULL;
    }
    if (string_parameter_definition->name) {
        free(string_parameter_definition->name);
        string_parameter_definition->name = NULL;
    }
    if (string_parameter_definition->type) {
        free(string_parameter_definition->type);
        string_parameter_definition->type = NULL;
    }
    free(string_parameter_definition);
}

cJSON *string_parameter_definition_convertToJSON(string_parameter_definition_t *string_parameter_definition) {
    cJSON *item = cJSON_CreateObject();

    // string_parameter_definition->_class
    if(string_parameter_definition->_class) {
    if(cJSON_AddStringToObject(item, "_class", string_parameter_definition->_class) == NULL) {
    goto fail; //String
    }
    }


    // string_parameter_definition->default_parameter_value
    if(string_parameter_definition->default_parameter_value) {
    cJSON *default_parameter_value_local_JSON = string_parameter_value_convertToJSON(string_parameter_definition->default_parameter_value);
    if(default_parameter_value_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "defaultParameterValue", default_parameter_value_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // string_parameter_definition->description
    if(string_parameter_definition->description) {
    if(cJSON_AddStringToObject(item, "description", string_parameter_definition->description) == NULL) {
    goto fail; //String
    }
    }


    // string_parameter_definition->name
    if(string_parameter_definition->name) {
    if(cJSON_AddStringToObject(item, "name", string_parameter_definition->name) == NULL) {
    goto fail; //String
    }
    }


    // string_parameter_definition->type
    if(string_parameter_definition->type) {
    if(cJSON_AddStringToObject(item, "type", string_parameter_definition->type) == NULL) {
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

string_parameter_definition_t *string_parameter_definition_parseFromJSON(cJSON *string_parameter_definitionJSON){

    string_parameter_definition_t *string_parameter_definition_local_var = NULL;

    // define the local variable for string_parameter_definition->default_parameter_value
    string_parameter_value_t *default_parameter_value_local_nonprim = NULL;

    // string_parameter_definition->_class
    cJSON *_class = cJSON_GetObjectItemCaseSensitive(string_parameter_definitionJSON, "_class");
    if (_class) { 
    if(!cJSON_IsString(_class))
    {
    goto end; //String
    }
    }

    // string_parameter_definition->default_parameter_value
    cJSON *default_parameter_value = cJSON_GetObjectItemCaseSensitive(string_parameter_definitionJSON, "defaultParameterValue");
    if (default_parameter_value) { 
    default_parameter_value_local_nonprim = string_parameter_value_parseFromJSON(default_parameter_value); //nonprimitive
    }

    // string_parameter_definition->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(string_parameter_definitionJSON, "description");
    if (description) { 
    if(!cJSON_IsString(description))
    {
    goto end; //String
    }
    }

    // string_parameter_definition->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(string_parameter_definitionJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }
    }

    // string_parameter_definition->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(string_parameter_definitionJSON, "type");
    if (type) { 
    if(!cJSON_IsString(type))
    {
    goto end; //String
    }
    }


    string_parameter_definition_local_var = string_parameter_definition_create (
        _class ? strdup(_class->valuestring) : NULL,
        default_parameter_value ? default_parameter_value_local_nonprim : NULL,
        description ? strdup(description->valuestring) : NULL,
        name ? strdup(name->valuestring) : NULL,
        type ? strdup(type->valuestring) : NULL
        );

    return string_parameter_definition_local_var;
end:
    if (default_parameter_value_local_nonprim) {
        string_parameter_value_free(default_parameter_value_local_nonprim);
        default_parameter_value_local_nonprim = NULL;
    }
    return NULL;

}
