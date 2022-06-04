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
import com.cliffano.swaggyjenkins.model.PipelineRunartifacts;
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
 * PipelineRun
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-04T08:16:08.847436Z[Etc/UTC]")
public class PipelineRun {
  public static final String SERIALIZED_NAME_PROPERTY_CLASS = "_class";
  @SerializedName(SERIALIZED_NAME_PROPERTY_CLASS)
  private String propertyClass;

  public static final String SERIALIZED_NAME_ARTIFACTS = "artifacts";
  @SerializedName(SERIALIZED_NAME_ARTIFACTS)
  private List<PipelineRunartifacts> artifacts = null;

  public static final String SERIALIZED_NAME_DURATION_IN_MILLIS = "durationInMillis";
  @SerializedName(SERIALIZED_NAME_DURATION_IN_MILLIS)
  private Integer durationInMillis;

  public static final String SERIALIZED_NAME_ESTIMATED_DURATION_IN_MILLIS = "estimatedDurationInMillis";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_DURATION_IN_MILLIS)
  private Integer estimatedDurationInMillis;

  public static final String SERIALIZED_NAME_EN_QUEUE_TIME = "enQueueTime";
  @SerializedName(SERIALIZED_NAME_EN_QUEUE_TIME)
  private String enQueueTime;

  public static final String SERIALIZED_NAME_END_TIME = "endTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ORGANIZATION = "organization";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  private String organization;

  public static final String SERIALIZED_NAME_PIPELINE = "pipeline";
  @SerializedName(SERIALIZED_NAME_PIPELINE)
  private String pipeline;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private String result;

  public static final String SERIALIZED_NAME_RUN_SUMMARY = "runSummary";
  @SerializedName(SERIALIZED_NAME_RUN_SUMMARY)
  private String runSummary;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_COMMIT_ID = "commitId";
  @SerializedName(SERIALIZED_NAME_COMMIT_ID)
  private String commitId;

  public PipelineRun() { 
  }

  public PipelineRun propertyClass(String propertyClass) {
    
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


  public PipelineRun artifacts(List<PipelineRunartifacts> artifacts) {
    
    this.artifacts = artifacts;
    return this;
  }

  public PipelineRun addArtifactsItem(PipelineRunartifacts artifactsItem) {
    if (this.artifacts == null) {
      this.artifacts = new ArrayList<>();
    }
    this.artifacts.add(artifactsItem);
    return this;
  }

   /**
   * Get artifacts
   * @return artifacts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PipelineRunartifacts> getArtifacts() {
    return artifacts;
  }


  public void setArtifacts(List<PipelineRunartifacts> artifacts) {
    this.artifacts = artifacts;
  }


  public PipelineRun durationInMillis(Integer durationInMillis) {
    
    this.durationInMillis = durationInMillis;
    return this;
  }

   /**
   * Get durationInMillis
   * @return durationInMillis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDurationInMillis() {
    return durationInMillis;
  }


  public void setDurationInMillis(Integer durationInMillis) {
    this.durationInMillis = durationInMillis;
  }


  public PipelineRun estimatedDurationInMillis(Integer estimatedDurationInMillis) {
    
    this.estimatedDurationInMillis = estimatedDurationInMillis;
    return this;
  }

   /**
   * Get estimatedDurationInMillis
   * @return estimatedDurationInMillis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getEstimatedDurationInMillis() {
    return estimatedDurationInMillis;
  }


  public void setEstimatedDurationInMillis(Integer estimatedDurationInMillis) {
    this.estimatedDurationInMillis = estimatedDurationInMillis;
  }


  public PipelineRun enQueueTime(String enQueueTime) {
    
    this.enQueueTime = enQueueTime;
    return this;
  }

   /**
   * Get enQueueTime
   * @return enQueueTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEnQueueTime() {
    return enQueueTime;
  }


  public void setEnQueueTime(String enQueueTime) {
    this.enQueueTime = enQueueTime;
  }


  public PipelineRun endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public PipelineRun id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public PipelineRun organization(String organization) {
    
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrganization() {
    return organization;
  }


  public void setOrganization(String organization) {
    this.organization = organization;
  }


  public PipelineRun pipeline(String pipeline) {
    
    this.pipeline = pipeline;
    return this;
  }

   /**
   * Get pipeline
   * @return pipeline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPipeline() {
    return pipeline;
  }


  public void setPipeline(String pipeline) {
    this.pipeline = pipeline;
  }


  public PipelineRun result(String result) {
    
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResult() {
    return result;
  }


  public void setResult(String result) {
    this.result = result;
  }


  public PipelineRun runSummary(String runSummary) {
    
    this.runSummary = runSummary;
    return this;
  }

   /**
   * Get runSummary
   * @return runSummary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRunSummary() {
    return runSummary;
  }


  public void setRunSummary(String runSummary) {
    this.runSummary = runSummary;
  }


  public PipelineRun startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public PipelineRun state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public PipelineRun type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public PipelineRun commitId(String commitId) {
    
    this.commitId = commitId;
    return this;
  }

   /**
   * Get commitId
   * @return commitId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCommitId() {
    return commitId;
  }


  public void setCommitId(String commitId) {
    this.commitId = commitId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelineRun pipelineRun = (PipelineRun) o;
    return Objects.equals(this.propertyClass, pipelineRun.propertyClass) &&
        Objects.equals(this.artifacts, pipelineRun.artifacts) &&
        Objects.equals(this.durationInMillis, pipelineRun.durationInMillis) &&
        Objects.equals(this.estimatedDurationInMillis, pipelineRun.estimatedDurationInMillis) &&
        Objects.equals(this.enQueueTime, pipelineRun.enQueueTime) &&
        Objects.equals(this.endTime, pipelineRun.endTime) &&
        Objects.equals(this.id, pipelineRun.id) &&
        Objects.equals(this.organization, pipelineRun.organization) &&
        Objects.equals(this.pipeline, pipelineRun.pipeline) &&
        Objects.equals(this.result, pipelineRun.result) &&
        Objects.equals(this.runSummary, pipelineRun.runSummary) &&
        Objects.equals(this.startTime, pipelineRun.startTime) &&
        Objects.equals(this.state, pipelineRun.state) &&
        Objects.equals(this.type, pipelineRun.type) &&
        Objects.equals(this.commitId, pipelineRun.commitId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyClass, artifacts, durationInMillis, estimatedDurationInMillis, enQueueTime, endTime, id, organization, pipeline, result, runSummary, startTime, state, type, commitId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineRun {\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    artifacts: ").append(toIndentedString(artifacts)).append("\n");
    sb.append("    durationInMillis: ").append(toIndentedString(durationInMillis)).append("\n");
    sb.append("    estimatedDurationInMillis: ").append(toIndentedString(estimatedDurationInMillis)).append("\n");
    sb.append("    enQueueTime: ").append(toIndentedString(enQueueTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    pipeline: ").append(toIndentedString(pipeline)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    runSummary: ").append(toIndentedString(runSummary)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
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
    openapiFields.add("artifacts");
    openapiFields.add("durationInMillis");
    openapiFields.add("estimatedDurationInMillis");
    openapiFields.add("enQueueTime");
    openapiFields.add("endTime");
    openapiFields.add("id");
    openapiFields.add("organization");
    openapiFields.add("pipeline");
    openapiFields.add("result");
    openapiFields.add("runSummary");
    openapiFields.add("startTime");
    openapiFields.add("state");
    openapiFields.add("type");
    openapiFields.add("commitId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PipelineRun
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PipelineRun.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PipelineRun is not found in the empty JSON string", PipelineRun.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PipelineRun.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PipelineRun` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("_class") != null && !jsonObj.get("_class").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `_class` to be a primitive type in the JSON string but got `%s`", jsonObj.get("_class").toString()));
      }
      JsonArray jsonArrayartifacts = jsonObj.getAsJsonArray("artifacts");
      if (jsonArrayartifacts != null) {
        // ensure the json data is an array
        if (!jsonObj.get("artifacts").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `artifacts` to be an array in the JSON string but got `%s`", jsonObj.get("artifacts").toString()));
        }

        // validate the optional field `artifacts` (array)
        for (int i = 0; i < jsonArrayartifacts.size(); i++) {
          PipelineRunartifacts.validateJsonObject(jsonArrayartifacts.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("enQueueTime") != null && !jsonObj.get("enQueueTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enQueueTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enQueueTime").toString()));
      }
      if (jsonObj.get("endTime") != null && !jsonObj.get("endTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endTime").toString()));
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("organization") != null && !jsonObj.get("organization").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organization` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organization").toString()));
      }
      if (jsonObj.get("pipeline") != null && !jsonObj.get("pipeline").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pipeline` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pipeline").toString()));
      }
      if (jsonObj.get("result") != null && !jsonObj.get("result").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `result` to be a primitive type in the JSON string but got `%s`", jsonObj.get("result").toString()));
      }
      if (jsonObj.get("runSummary") != null && !jsonObj.get("runSummary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `runSummary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("runSummary").toString()));
      }
      if (jsonObj.get("startTime") != null && !jsonObj.get("startTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startTime").toString()));
      }
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (jsonObj.get("commitId") != null && !jsonObj.get("commitId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commitId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commitId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PipelineRun.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PipelineRun' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PipelineRun> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PipelineRun.class));

       return (TypeAdapter<T>) new TypeAdapter<PipelineRun>() {
           @Override
           public void write(JsonWriter out, PipelineRun value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PipelineRun read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PipelineRun given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PipelineRun
  * @throws IOException if the JSON string is invalid with respect to PipelineRun
  */
  public static PipelineRun fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PipelineRun.class);
  }

 /**
  * Convert an instance of PipelineRun to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

