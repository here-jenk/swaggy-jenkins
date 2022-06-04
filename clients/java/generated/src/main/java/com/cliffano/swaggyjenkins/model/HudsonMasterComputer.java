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
import com.cliffano.swaggyjenkins.model.HudsonMasterComputerexecutors;
import com.cliffano.swaggyjenkins.model.HudsonMasterComputermonitorData;
import com.cliffano.swaggyjenkins.model.Label1;
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
 * HudsonMasterComputer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-04T08:16:08.847436Z[Etc/UTC]")
public class HudsonMasterComputer {
  public static final String SERIALIZED_NAME_PROPERTY_CLASS = "_class";
  @SerializedName(SERIALIZED_NAME_PROPERTY_CLASS)
  private String propertyClass;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_EXECUTORS = "executors";
  @SerializedName(SERIALIZED_NAME_EXECUTORS)
  private List<HudsonMasterComputerexecutors> executors = null;

  public static final String SERIALIZED_NAME_ICON = "icon";
  @SerializedName(SERIALIZED_NAME_ICON)
  private String icon;

  public static final String SERIALIZED_NAME_ICON_CLASS_NAME = "iconClassName";
  @SerializedName(SERIALIZED_NAME_ICON_CLASS_NAME)
  private String iconClassName;

  public static final String SERIALIZED_NAME_IDLE = "idle";
  @SerializedName(SERIALIZED_NAME_IDLE)
  private Boolean idle;

  public static final String SERIALIZED_NAME_JNLP_AGENT = "jnlpAgent";
  @SerializedName(SERIALIZED_NAME_JNLP_AGENT)
  private Boolean jnlpAgent;

  public static final String SERIALIZED_NAME_LAUNCH_SUPPORTED = "launchSupported";
  @SerializedName(SERIALIZED_NAME_LAUNCH_SUPPORTED)
  private Boolean launchSupported;

  public static final String SERIALIZED_NAME_LOAD_STATISTICS = "loadStatistics";
  @SerializedName(SERIALIZED_NAME_LOAD_STATISTICS)
  private Label1 loadStatistics;

  public static final String SERIALIZED_NAME_MANUAL_LAUNCH_ALLOWED = "manualLaunchAllowed";
  @SerializedName(SERIALIZED_NAME_MANUAL_LAUNCH_ALLOWED)
  private Boolean manualLaunchAllowed;

  public static final String SERIALIZED_NAME_MONITOR_DATA = "monitorData";
  @SerializedName(SERIALIZED_NAME_MONITOR_DATA)
  private HudsonMasterComputermonitorData monitorData;

  public static final String SERIALIZED_NAME_NUM_EXECUTORS = "numExecutors";
  @SerializedName(SERIALIZED_NAME_NUM_EXECUTORS)
  private Integer numExecutors;

  public static final String SERIALIZED_NAME_OFFLINE = "offline";
  @SerializedName(SERIALIZED_NAME_OFFLINE)
  private Boolean offline;

  public static final String SERIALIZED_NAME_OFFLINE_CAUSE = "offlineCause";
  @SerializedName(SERIALIZED_NAME_OFFLINE_CAUSE)
  private String offlineCause;

  public static final String SERIALIZED_NAME_OFFLINE_CAUSE_REASON = "offlineCauseReason";
  @SerializedName(SERIALIZED_NAME_OFFLINE_CAUSE_REASON)
  private String offlineCauseReason;

  public static final String SERIALIZED_NAME_TEMPORARILY_OFFLINE = "temporarilyOffline";
  @SerializedName(SERIALIZED_NAME_TEMPORARILY_OFFLINE)
  private Boolean temporarilyOffline;

  public HudsonMasterComputer() { 
  }

  public HudsonMasterComputer propertyClass(String propertyClass) {
    
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


  public HudsonMasterComputer displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public HudsonMasterComputer executors(List<HudsonMasterComputerexecutors> executors) {
    
    this.executors = executors;
    return this;
  }

  public HudsonMasterComputer addExecutorsItem(HudsonMasterComputerexecutors executorsItem) {
    if (this.executors == null) {
      this.executors = new ArrayList<>();
    }
    this.executors.add(executorsItem);
    return this;
  }

   /**
   * Get executors
   * @return executors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<HudsonMasterComputerexecutors> getExecutors() {
    return executors;
  }


  public void setExecutors(List<HudsonMasterComputerexecutors> executors) {
    this.executors = executors;
  }


  public HudsonMasterComputer icon(String icon) {
    
    this.icon = icon;
    return this;
  }

   /**
   * Get icon
   * @return icon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIcon() {
    return icon;
  }


  public void setIcon(String icon) {
    this.icon = icon;
  }


  public HudsonMasterComputer iconClassName(String iconClassName) {
    
    this.iconClassName = iconClassName;
    return this;
  }

   /**
   * Get iconClassName
   * @return iconClassName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIconClassName() {
    return iconClassName;
  }


  public void setIconClassName(String iconClassName) {
    this.iconClassName = iconClassName;
  }


  public HudsonMasterComputer idle(Boolean idle) {
    
    this.idle = idle;
    return this;
  }

   /**
   * Get idle
   * @return idle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIdle() {
    return idle;
  }


  public void setIdle(Boolean idle) {
    this.idle = idle;
  }


  public HudsonMasterComputer jnlpAgent(Boolean jnlpAgent) {
    
    this.jnlpAgent = jnlpAgent;
    return this;
  }

   /**
   * Get jnlpAgent
   * @return jnlpAgent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getJnlpAgent() {
    return jnlpAgent;
  }


  public void setJnlpAgent(Boolean jnlpAgent) {
    this.jnlpAgent = jnlpAgent;
  }


  public HudsonMasterComputer launchSupported(Boolean launchSupported) {
    
    this.launchSupported = launchSupported;
    return this;
  }

   /**
   * Get launchSupported
   * @return launchSupported
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getLaunchSupported() {
    return launchSupported;
  }


  public void setLaunchSupported(Boolean launchSupported) {
    this.launchSupported = launchSupported;
  }


  public HudsonMasterComputer loadStatistics(Label1 loadStatistics) {
    
    this.loadStatistics = loadStatistics;
    return this;
  }

   /**
   * Get loadStatistics
   * @return loadStatistics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Label1 getLoadStatistics() {
    return loadStatistics;
  }


  public void setLoadStatistics(Label1 loadStatistics) {
    this.loadStatistics = loadStatistics;
  }


  public HudsonMasterComputer manualLaunchAllowed(Boolean manualLaunchAllowed) {
    
    this.manualLaunchAllowed = manualLaunchAllowed;
    return this;
  }

   /**
   * Get manualLaunchAllowed
   * @return manualLaunchAllowed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getManualLaunchAllowed() {
    return manualLaunchAllowed;
  }


  public void setManualLaunchAllowed(Boolean manualLaunchAllowed) {
    this.manualLaunchAllowed = manualLaunchAllowed;
  }


  public HudsonMasterComputer monitorData(HudsonMasterComputermonitorData monitorData) {
    
    this.monitorData = monitorData;
    return this;
  }

   /**
   * Get monitorData
   * @return monitorData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HudsonMasterComputermonitorData getMonitorData() {
    return monitorData;
  }


  public void setMonitorData(HudsonMasterComputermonitorData monitorData) {
    this.monitorData = monitorData;
  }


  public HudsonMasterComputer numExecutors(Integer numExecutors) {
    
    this.numExecutors = numExecutors;
    return this;
  }

   /**
   * Get numExecutors
   * @return numExecutors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNumExecutors() {
    return numExecutors;
  }


  public void setNumExecutors(Integer numExecutors) {
    this.numExecutors = numExecutors;
  }


  public HudsonMasterComputer offline(Boolean offline) {
    
    this.offline = offline;
    return this;
  }

   /**
   * Get offline
   * @return offline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getOffline() {
    return offline;
  }


  public void setOffline(Boolean offline) {
    this.offline = offline;
  }


  public HudsonMasterComputer offlineCause(String offlineCause) {
    
    this.offlineCause = offlineCause;
    return this;
  }

   /**
   * Get offlineCause
   * @return offlineCause
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOfflineCause() {
    return offlineCause;
  }


  public void setOfflineCause(String offlineCause) {
    this.offlineCause = offlineCause;
  }


  public HudsonMasterComputer offlineCauseReason(String offlineCauseReason) {
    
    this.offlineCauseReason = offlineCauseReason;
    return this;
  }

   /**
   * Get offlineCauseReason
   * @return offlineCauseReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOfflineCauseReason() {
    return offlineCauseReason;
  }


  public void setOfflineCauseReason(String offlineCauseReason) {
    this.offlineCauseReason = offlineCauseReason;
  }


  public HudsonMasterComputer temporarilyOffline(Boolean temporarilyOffline) {
    
    this.temporarilyOffline = temporarilyOffline;
    return this;
  }

   /**
   * Get temporarilyOffline
   * @return temporarilyOffline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getTemporarilyOffline() {
    return temporarilyOffline;
  }


  public void setTemporarilyOffline(Boolean temporarilyOffline) {
    this.temporarilyOffline = temporarilyOffline;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HudsonMasterComputer hudsonMasterComputer = (HudsonMasterComputer) o;
    return Objects.equals(this.propertyClass, hudsonMasterComputer.propertyClass) &&
        Objects.equals(this.displayName, hudsonMasterComputer.displayName) &&
        Objects.equals(this.executors, hudsonMasterComputer.executors) &&
        Objects.equals(this.icon, hudsonMasterComputer.icon) &&
        Objects.equals(this.iconClassName, hudsonMasterComputer.iconClassName) &&
        Objects.equals(this.idle, hudsonMasterComputer.idle) &&
        Objects.equals(this.jnlpAgent, hudsonMasterComputer.jnlpAgent) &&
        Objects.equals(this.launchSupported, hudsonMasterComputer.launchSupported) &&
        Objects.equals(this.loadStatistics, hudsonMasterComputer.loadStatistics) &&
        Objects.equals(this.manualLaunchAllowed, hudsonMasterComputer.manualLaunchAllowed) &&
        Objects.equals(this.monitorData, hudsonMasterComputer.monitorData) &&
        Objects.equals(this.numExecutors, hudsonMasterComputer.numExecutors) &&
        Objects.equals(this.offline, hudsonMasterComputer.offline) &&
        Objects.equals(this.offlineCause, hudsonMasterComputer.offlineCause) &&
        Objects.equals(this.offlineCauseReason, hudsonMasterComputer.offlineCauseReason) &&
        Objects.equals(this.temporarilyOffline, hudsonMasterComputer.temporarilyOffline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyClass, displayName, executors, icon, iconClassName, idle, jnlpAgent, launchSupported, loadStatistics, manualLaunchAllowed, monitorData, numExecutors, offline, offlineCause, offlineCauseReason, temporarilyOffline);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HudsonMasterComputer {\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    executors: ").append(toIndentedString(executors)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    iconClassName: ").append(toIndentedString(iconClassName)).append("\n");
    sb.append("    idle: ").append(toIndentedString(idle)).append("\n");
    sb.append("    jnlpAgent: ").append(toIndentedString(jnlpAgent)).append("\n");
    sb.append("    launchSupported: ").append(toIndentedString(launchSupported)).append("\n");
    sb.append("    loadStatistics: ").append(toIndentedString(loadStatistics)).append("\n");
    sb.append("    manualLaunchAllowed: ").append(toIndentedString(manualLaunchAllowed)).append("\n");
    sb.append("    monitorData: ").append(toIndentedString(monitorData)).append("\n");
    sb.append("    numExecutors: ").append(toIndentedString(numExecutors)).append("\n");
    sb.append("    offline: ").append(toIndentedString(offline)).append("\n");
    sb.append("    offlineCause: ").append(toIndentedString(offlineCause)).append("\n");
    sb.append("    offlineCauseReason: ").append(toIndentedString(offlineCauseReason)).append("\n");
    sb.append("    temporarilyOffline: ").append(toIndentedString(temporarilyOffline)).append("\n");
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
    openapiFields.add("displayName");
    openapiFields.add("executors");
    openapiFields.add("icon");
    openapiFields.add("iconClassName");
    openapiFields.add("idle");
    openapiFields.add("jnlpAgent");
    openapiFields.add("launchSupported");
    openapiFields.add("loadStatistics");
    openapiFields.add("manualLaunchAllowed");
    openapiFields.add("monitorData");
    openapiFields.add("numExecutors");
    openapiFields.add("offline");
    openapiFields.add("offlineCause");
    openapiFields.add("offlineCauseReason");
    openapiFields.add("temporarilyOffline");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to HudsonMasterComputer
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (HudsonMasterComputer.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in HudsonMasterComputer is not found in the empty JSON string", HudsonMasterComputer.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!HudsonMasterComputer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HudsonMasterComputer` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("_class") != null && !jsonObj.get("_class").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `_class` to be a primitive type in the JSON string but got `%s`", jsonObj.get("_class").toString()));
      }
      if (jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      JsonArray jsonArrayexecutors = jsonObj.getAsJsonArray("executors");
      if (jsonArrayexecutors != null) {
        // ensure the json data is an array
        if (!jsonObj.get("executors").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `executors` to be an array in the JSON string but got `%s`", jsonObj.get("executors").toString()));
        }

        // validate the optional field `executors` (array)
        for (int i = 0; i < jsonArrayexecutors.size(); i++) {
          HudsonMasterComputerexecutors.validateJsonObject(jsonArrayexecutors.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("icon") != null && !jsonObj.get("icon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `icon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("icon").toString()));
      }
      if (jsonObj.get("iconClassName") != null && !jsonObj.get("iconClassName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iconClassName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iconClassName").toString()));
      }
      // validate the optional field `loadStatistics`
      if (jsonObj.getAsJsonObject("loadStatistics") != null) {
        Label1.validateJsonObject(jsonObj.getAsJsonObject("loadStatistics"));
      }
      // validate the optional field `monitorData`
      if (jsonObj.getAsJsonObject("monitorData") != null) {
        HudsonMasterComputermonitorData.validateJsonObject(jsonObj.getAsJsonObject("monitorData"));
      }
      if (jsonObj.get("offlineCause") != null && !jsonObj.get("offlineCause").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `offlineCause` to be a primitive type in the JSON string but got `%s`", jsonObj.get("offlineCause").toString()));
      }
      if (jsonObj.get("offlineCauseReason") != null && !jsonObj.get("offlineCauseReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `offlineCauseReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("offlineCauseReason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HudsonMasterComputer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HudsonMasterComputer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HudsonMasterComputer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HudsonMasterComputer.class));

       return (TypeAdapter<T>) new TypeAdapter<HudsonMasterComputer>() {
           @Override
           public void write(JsonWriter out, HudsonMasterComputer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HudsonMasterComputer read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of HudsonMasterComputer given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of HudsonMasterComputer
  * @throws IOException if the JSON string is invalid with respect to HudsonMasterComputer
  */
  public static HudsonMasterComputer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HudsonMasterComputer.class);
  }

 /**
  * Convert an instance of HudsonMasterComputer to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

