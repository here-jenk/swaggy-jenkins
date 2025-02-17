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
import com.cliffano.swaggyjenkins.model.CauseAction;
import com.cliffano.swaggyjenkins.model.FreeStyleProject;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * QueueBlockedItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-04T08:16:08.847436Z[Etc/UTC]")
public class QueueBlockedItem {
  public static final String SERIALIZED_NAME_PROPERTY_CLASS = "_class";
  @SerializedName(SERIALIZED_NAME_PROPERTY_CLASS)
  private String propertyClass;

  public static final String SERIALIZED_NAME_ACTIONS = "actions";
  @SerializedName(SERIALIZED_NAME_ACTIONS)
  private List<CauseAction> actions = null;

  public static final String SERIALIZED_NAME_BLOCKED = "blocked";
  @SerializedName(SERIALIZED_NAME_BLOCKED)
  private Boolean blocked;

  public static final String SERIALIZED_NAME_BUILDABLE = "buildable";
  @SerializedName(SERIALIZED_NAME_BUILDABLE)
  private Boolean buildable;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_IN_QUEUE_SINCE = "inQueueSince";
  @SerializedName(SERIALIZED_NAME_IN_QUEUE_SINCE)
  private Integer inQueueSince;

  public static final String SERIALIZED_NAME_PARAMS = "params";
  @SerializedName(SERIALIZED_NAME_PARAMS)
  private String params;

  public static final String SERIALIZED_NAME_STUCK = "stuck";
  @SerializedName(SERIALIZED_NAME_STUCK)
  private Boolean stuck;

  public static final String SERIALIZED_NAME_TASK = "task";
  @SerializedName(SERIALIZED_NAME_TASK)
  private FreeStyleProject task;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_WHY = "why";
  @SerializedName(SERIALIZED_NAME_WHY)
  private String why;

  public static final String SERIALIZED_NAME_BUILDABLE_START_MILLISECONDS = "buildableStartMilliseconds";
  @SerializedName(SERIALIZED_NAME_BUILDABLE_START_MILLISECONDS)
  private Integer buildableStartMilliseconds;

  public QueueBlockedItem() { 
  }

  public QueueBlockedItem propertyClass(String propertyClass) {
    
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


  public QueueBlockedItem actions(List<CauseAction> actions) {
    
    this.actions = actions;
    return this;
  }

  public QueueBlockedItem addActionsItem(CauseAction actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CauseAction> getActions() {
    return actions;
  }


  public void setActions(List<CauseAction> actions) {
    this.actions = actions;
  }


  public QueueBlockedItem blocked(Boolean blocked) {
    
    this.blocked = blocked;
    return this;
  }

   /**
   * Get blocked
   * @return blocked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getBlocked() {
    return blocked;
  }


  public void setBlocked(Boolean blocked) {
    this.blocked = blocked;
  }


  public QueueBlockedItem buildable(Boolean buildable) {
    
    this.buildable = buildable;
    return this;
  }

   /**
   * Get buildable
   * @return buildable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getBuildable() {
    return buildable;
  }


  public void setBuildable(Boolean buildable) {
    this.buildable = buildable;
  }


  public QueueBlockedItem id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public QueueBlockedItem inQueueSince(Integer inQueueSince) {
    
    this.inQueueSince = inQueueSince;
    return this;
  }

   /**
   * Get inQueueSince
   * @return inQueueSince
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getInQueueSince() {
    return inQueueSince;
  }


  public void setInQueueSince(Integer inQueueSince) {
    this.inQueueSince = inQueueSince;
  }


  public QueueBlockedItem params(String params) {
    
    this.params = params;
    return this;
  }

   /**
   * Get params
   * @return params
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getParams() {
    return params;
  }


  public void setParams(String params) {
    this.params = params;
  }


  public QueueBlockedItem stuck(Boolean stuck) {
    
    this.stuck = stuck;
    return this;
  }

   /**
   * Get stuck
   * @return stuck
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getStuck() {
    return stuck;
  }


  public void setStuck(Boolean stuck) {
    this.stuck = stuck;
  }


  public QueueBlockedItem task(FreeStyleProject task) {
    
    this.task = task;
    return this;
  }

   /**
   * Get task
   * @return task
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FreeStyleProject getTask() {
    return task;
  }


  public void setTask(FreeStyleProject task) {
    this.task = task;
  }


  public QueueBlockedItem url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public QueueBlockedItem why(String why) {
    
    this.why = why;
    return this;
  }

   /**
   * Get why
   * @return why
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWhy() {
    return why;
  }


  public void setWhy(String why) {
    this.why = why;
  }


  public QueueBlockedItem buildableStartMilliseconds(Integer buildableStartMilliseconds) {
    
    this.buildableStartMilliseconds = buildableStartMilliseconds;
    return this;
  }

   /**
   * Get buildableStartMilliseconds
   * @return buildableStartMilliseconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getBuildableStartMilliseconds() {
    return buildableStartMilliseconds;
  }


  public void setBuildableStartMilliseconds(Integer buildableStartMilliseconds) {
    this.buildableStartMilliseconds = buildableStartMilliseconds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueBlockedItem queueBlockedItem = (QueueBlockedItem) o;
    return Objects.equals(this.propertyClass, queueBlockedItem.propertyClass) &&
        Objects.equals(this.actions, queueBlockedItem.actions) &&
        Objects.equals(this.blocked, queueBlockedItem.blocked) &&
        Objects.equals(this.buildable, queueBlockedItem.buildable) &&
        Objects.equals(this.id, queueBlockedItem.id) &&
        Objects.equals(this.inQueueSince, queueBlockedItem.inQueueSince) &&
        Objects.equals(this.params, queueBlockedItem.params) &&
        Objects.equals(this.stuck, queueBlockedItem.stuck) &&
        Objects.equals(this.task, queueBlockedItem.task) &&
        Objects.equals(this.url, queueBlockedItem.url) &&
        Objects.equals(this.why, queueBlockedItem.why) &&
        Objects.equals(this.buildableStartMilliseconds, queueBlockedItem.buildableStartMilliseconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyClass, actions, blocked, buildable, id, inQueueSince, params, stuck, task, url, why, buildableStartMilliseconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueBlockedItem {\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
    sb.append("    buildable: ").append(toIndentedString(buildable)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inQueueSince: ").append(toIndentedString(inQueueSince)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    stuck: ").append(toIndentedString(stuck)).append("\n");
    sb.append("    task: ").append(toIndentedString(task)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    why: ").append(toIndentedString(why)).append("\n");
    sb.append("    buildableStartMilliseconds: ").append(toIndentedString(buildableStartMilliseconds)).append("\n");
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
    openapiFields.add("_class");
    openapiFields.add("actions");
    openapiFields.add("blocked");
    openapiFields.add("buildable");
    openapiFields.add("id");
    openapiFields.add("inQueueSince");
    openapiFields.add("params");
    openapiFields.add("stuck");
    openapiFields.add("task");
    openapiFields.add("url");
    openapiFields.add("why");
    openapiFields.add("buildableStartMilliseconds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to QueueBlockedItem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (QueueBlockedItem.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in QueueBlockedItem is not found in the empty JSON string", QueueBlockedItem.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!QueueBlockedItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QueueBlockedItem` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("_class") != null && !jsonObj.get("_class").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `_class` to be a primitive type in the JSON string but got `%s`", jsonObj.get("_class").toString()));
      }
      JsonArray jsonArrayactions = jsonObj.getAsJsonArray("actions");
      if (jsonArrayactions != null) {
        // ensure the json data is an array
        if (!jsonObj.get("actions").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `actions` to be an array in the JSON string but got `%s`", jsonObj.get("actions").toString()));
        }

        // validate the optional field `actions` (array)
        for (int i = 0; i < jsonArrayactions.size(); i++) {
          CauseAction.validateJsonObject(jsonArrayactions.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("params") != null && !jsonObj.get("params").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `params` to be a primitive type in the JSON string but got `%s`", jsonObj.get("params").toString()));
      }
      // validate the optional field `task`
      if (jsonObj.getAsJsonObject("task") != null) {
        FreeStyleProject.validateJsonObject(jsonObj.getAsJsonObject("task"));
      }
      if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (jsonObj.get("why") != null && !jsonObj.get("why").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `why` to be a primitive type in the JSON string but got `%s`", jsonObj.get("why").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueueBlockedItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueueBlockedItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueueBlockedItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueueBlockedItem.class));

       return (TypeAdapter<T>) new TypeAdapter<QueueBlockedItem>() {
           @Override
           public void write(JsonWriter out, QueueBlockedItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueueBlockedItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QueueBlockedItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueueBlockedItem
  * @throws IOException if the JSON string is invalid with respect to QueueBlockedItem
  */
  public static QueueBlockedItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueueBlockedItem.class);
  }

 /**
  * Convert an instance of QueueBlockedItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

