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

import org.openapitools.client.model.ExtensionClassContainerImpl1links;
import org.openapitools.client.model.ExtensionClassContainerImpl1map;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ExtensionClassContainerImpl1 {
  
  @SerializedName("_class")
  private String _class = null;
  @SerializedName("_links")
  private ExtensionClassContainerImpl1links links = null;
  @SerializedName("map")
  private ExtensionClassContainerImpl1map map = null;

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
  public ExtensionClassContainerImpl1links getLinks() {
    return links;
  }
  public void setLinks(ExtensionClassContainerImpl1links links) {
    this.links = links;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ExtensionClassContainerImpl1map getMap() {
    return map;
  }
  public void setMap(ExtensionClassContainerImpl1map map) {
    this.map = map;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtensionClassContainerImpl1 extensionClassContainerImpl1 = (ExtensionClassContainerImpl1) o;
    return (this._class == null ? extensionClassContainerImpl1._class == null : this._class.equals(extensionClassContainerImpl1._class)) &&
        (this.links == null ? extensionClassContainerImpl1.links == null : this.links.equals(extensionClassContainerImpl1.links)) &&
        (this.map == null ? extensionClassContainerImpl1.map == null : this.map.equals(extensionClassContainerImpl1.map));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this._class == null ? 0: this._class.hashCode());
    result = 31 * result + (this.links == null ? 0: this.links.hashCode());
    result = 31 * result + (this.map == null ? 0: this.map.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtensionClassContainerImpl1 {\n");
    
    sb.append("  _class: ").append(_class).append("\n");
    sb.append("  links: ").append(links).append("\n");
    sb.append("  map: ").append(map).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
