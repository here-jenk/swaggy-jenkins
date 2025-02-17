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
 * SwapSpaceMonitorMemoryUsage2
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-04T08:16:08.847436Z[Etc/UTC]")
public class SwapSpaceMonitorMemoryUsage2 {
  public static final String SERIALIZED_NAME_PROPERTY_CLASS = "_class";
  @SerializedName(SERIALIZED_NAME_PROPERTY_CLASS)
  private String propertyClass;

  public static final String SERIALIZED_NAME_AVAILABLE_PHYSICAL_MEMORY = "availablePhysicalMemory";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_PHYSICAL_MEMORY)
  private Integer availablePhysicalMemory;

  public static final String SERIALIZED_NAME_AVAILABLE_SWAP_SPACE = "availableSwapSpace";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_SWAP_SPACE)
  private Integer availableSwapSpace;

  public static final String SERIALIZED_NAME_TOTAL_PHYSICAL_MEMORY = "totalPhysicalMemory";
  @SerializedName(SERIALIZED_NAME_TOTAL_PHYSICAL_MEMORY)
  private Integer totalPhysicalMemory;

  public static final String SERIALIZED_NAME_TOTAL_SWAP_SPACE = "totalSwapSpace";
  @SerializedName(SERIALIZED_NAME_TOTAL_SWAP_SPACE)
  private Integer totalSwapSpace;

  public SwapSpaceMonitorMemoryUsage2() { 
  }

  public SwapSpaceMonitorMemoryUsage2 propertyClass(String propertyClass) {
    
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


  public SwapSpaceMonitorMemoryUsage2 availablePhysicalMemory(Integer availablePhysicalMemory) {
    
    this.availablePhysicalMemory = availablePhysicalMemory;
    return this;
  }

   /**
   * Get availablePhysicalMemory
   * @return availablePhysicalMemory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAvailablePhysicalMemory() {
    return availablePhysicalMemory;
  }


  public void setAvailablePhysicalMemory(Integer availablePhysicalMemory) {
    this.availablePhysicalMemory = availablePhysicalMemory;
  }


  public SwapSpaceMonitorMemoryUsage2 availableSwapSpace(Integer availableSwapSpace) {
    
    this.availableSwapSpace = availableSwapSpace;
    return this;
  }

   /**
   * Get availableSwapSpace
   * @return availableSwapSpace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAvailableSwapSpace() {
    return availableSwapSpace;
  }


  public void setAvailableSwapSpace(Integer availableSwapSpace) {
    this.availableSwapSpace = availableSwapSpace;
  }


  public SwapSpaceMonitorMemoryUsage2 totalPhysicalMemory(Integer totalPhysicalMemory) {
    
    this.totalPhysicalMemory = totalPhysicalMemory;
    return this;
  }

   /**
   * Get totalPhysicalMemory
   * @return totalPhysicalMemory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalPhysicalMemory() {
    return totalPhysicalMemory;
  }


  public void setTotalPhysicalMemory(Integer totalPhysicalMemory) {
    this.totalPhysicalMemory = totalPhysicalMemory;
  }


  public SwapSpaceMonitorMemoryUsage2 totalSwapSpace(Integer totalSwapSpace) {
    
    this.totalSwapSpace = totalSwapSpace;
    return this;
  }

   /**
   * Get totalSwapSpace
   * @return totalSwapSpace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalSwapSpace() {
    return totalSwapSpace;
  }


  public void setTotalSwapSpace(Integer totalSwapSpace) {
    this.totalSwapSpace = totalSwapSpace;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwapSpaceMonitorMemoryUsage2 swapSpaceMonitorMemoryUsage2 = (SwapSpaceMonitorMemoryUsage2) o;
    return Objects.equals(this.propertyClass, swapSpaceMonitorMemoryUsage2.propertyClass) &&
        Objects.equals(this.availablePhysicalMemory, swapSpaceMonitorMemoryUsage2.availablePhysicalMemory) &&
        Objects.equals(this.availableSwapSpace, swapSpaceMonitorMemoryUsage2.availableSwapSpace) &&
        Objects.equals(this.totalPhysicalMemory, swapSpaceMonitorMemoryUsage2.totalPhysicalMemory) &&
        Objects.equals(this.totalSwapSpace, swapSpaceMonitorMemoryUsage2.totalSwapSpace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyClass, availablePhysicalMemory, availableSwapSpace, totalPhysicalMemory, totalSwapSpace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwapSpaceMonitorMemoryUsage2 {\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    availablePhysicalMemory: ").append(toIndentedString(availablePhysicalMemory)).append("\n");
    sb.append("    availableSwapSpace: ").append(toIndentedString(availableSwapSpace)).append("\n");
    sb.append("    totalPhysicalMemory: ").append(toIndentedString(totalPhysicalMemory)).append("\n");
    sb.append("    totalSwapSpace: ").append(toIndentedString(totalSwapSpace)).append("\n");
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
    openapiFields.add("availablePhysicalMemory");
    openapiFields.add("availableSwapSpace");
    openapiFields.add("totalPhysicalMemory");
    openapiFields.add("totalSwapSpace");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SwapSpaceMonitorMemoryUsage2
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SwapSpaceMonitorMemoryUsage2.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SwapSpaceMonitorMemoryUsage2 is not found in the empty JSON string", SwapSpaceMonitorMemoryUsage2.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SwapSpaceMonitorMemoryUsage2.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SwapSpaceMonitorMemoryUsage2` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("_class") != null && !jsonObj.get("_class").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `_class` to be a primitive type in the JSON string but got `%s`", jsonObj.get("_class").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SwapSpaceMonitorMemoryUsage2.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SwapSpaceMonitorMemoryUsage2' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SwapSpaceMonitorMemoryUsage2> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SwapSpaceMonitorMemoryUsage2.class));

       return (TypeAdapter<T>) new TypeAdapter<SwapSpaceMonitorMemoryUsage2>() {
           @Override
           public void write(JsonWriter out, SwapSpaceMonitorMemoryUsage2 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SwapSpaceMonitorMemoryUsage2 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SwapSpaceMonitorMemoryUsage2 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SwapSpaceMonitorMemoryUsage2
  * @throws IOException if the JSON string is invalid with respect to SwapSpaceMonitorMemoryUsage2
  */
  public static SwapSpaceMonitorMemoryUsage2 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SwapSpaceMonitorMemoryUsage2.class);
  }

 /**
  * Convert an instance of SwapSpaceMonitorMemoryUsage2 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

