/**
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

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class EmptyChangeLogSet {
  
  @SerializedName("_class")
  private String _class = null;
  @SerializedName("kind")
  private String kind = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getClass() {
    return _class;
  }
  public void setClass(String _class) {
    this._class = _class;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getKind() {
    return kind;
  }
  public void setKind(String kind) {
    this.kind = kind;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmptyChangeLogSet emptyChangeLogSet = (EmptyChangeLogSet) o;
    return (this._class == null ? emptyChangeLogSet._class == null : this._class.equals(emptyChangeLogSet._class)) &&
        (this.kind == null ? emptyChangeLogSet.kind == null : this.kind.equals(emptyChangeLogSet.kind));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this._class == null ? 0: this._class.hashCode());
    result = 31 * result + (this.kind == null ? 0: this.kind.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmptyChangeLogSet {\n");
    
    sb.append("  _class: ").append(_class).append("\n");
    sb.append("  kind: ").append(kind).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
