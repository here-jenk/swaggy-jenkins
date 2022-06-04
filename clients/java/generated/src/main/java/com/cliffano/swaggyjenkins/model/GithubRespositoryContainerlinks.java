/*
 * Swaggy Jenkins
 * Jenkins API clients generated from Swagger / Open API specification
 *
 * The version of the OpenAPI document: 1.5.1-pre.0
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cliffano.swaggyjenkins.model;

import java.util.Objects;
import java.util.Arrays;
import com.cliffano.swaggyjenkins.model.Link;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.cliffano.swaggyjenkins.JSON;

/**
 * GithubRespositoryContainerlinks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-04T08:16:08.847436Z[Etc/UTC]")
public class GithubRespositoryContainerlinks {
  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private Link self;

  public static final String SERIALIZED_NAME_PROPERTY_CLASS = "_class";
  @SerializedName(SERIALIZED_NAME_PROPERTY_CLASS)
  private String propertyClass;

  public GithubRespositoryContainerlinks() { 
  }

  public GithubRespositoryContainerlinks self(Link self) {
    
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Link getSelf() {
    return self;
  }


  public void setSelf(Link self) {
    this.self = self;
  }


  public GithubRespositoryContainerlinks propertyClass(String propertyClass) {
    
    this.propertyClass = propertyClass;
    return this;
  }

   /**
   * Get propertyClass
   * @return propertyClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPropertyClass() {
    return propertyClass;
  }


  public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GithubRespositoryContainerlinks githubRespositoryContainerlinks = (GithubRespositoryContainerlinks) o;
    return Objects.equals(this.self, githubRespositoryContainerlinks.self) &&
        Objects.equals(this.propertyClass, githubRespositoryContainerlinks.propertyClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, propertyClass);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GithubRespositoryContainerlinks {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("self");
    openapiFields.add("_class");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GithubRespositoryContainerlinks
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GithubRespositoryContainerlinks.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GithubRespositoryContainerlinks is not found in the empty JSON string", GithubRespositoryContainerlinks.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GithubRespositoryContainerlinks.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GithubRespositoryContainerlinks` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `self`
      if (jsonObj.getAsJsonObject("self") != null) {
        Link.validateJsonObject(jsonObj.getAsJsonObject("self"));
      }
      if (jsonObj.get("_class") != null && !jsonObj.get("_class").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `_class` to be a primitive type in the JSON string but got `%s`", jsonObj.get("_class").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GithubRespositoryContainerlinks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GithubRespositoryContainerlinks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GithubRespositoryContainerlinks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GithubRespositoryContainerlinks.class));

       return (TypeAdapter<T>) new TypeAdapter<GithubRespositoryContainerlinks>() {
           @Override
           public void write(JsonWriter out, GithubRespositoryContainerlinks value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GithubRespositoryContainerlinks read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GithubRespositoryContainerlinks given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GithubRespositoryContainerlinks
  * @throws IOException if the JSON string is invalid with respect to GithubRespositoryContainerlinks
  */
  public static GithubRespositoryContainerlinks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GithubRespositoryContainerlinks.class);
  }

 /**
  * Convert an instance of GithubRespositoryContainerlinks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

