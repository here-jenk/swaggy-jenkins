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

import org.openapitools.client.model.GithubOrganizationlinks;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class GithubOrganization {
  
  @SerializedName("_class")
  private String _class = null;
  @SerializedName("_links")
  private GithubOrganizationlinks links = null;
  @SerializedName("jenkinsOrganizationPipeline")
  private Boolean jenkinsOrganizationPipeline = null;
  @SerializedName("name")
  private String name = null;

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
  public GithubOrganizationlinks getLinks() {
    return links;
  }
  public void setLinks(GithubOrganizationlinks links) {
    this.links = links;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getJenkinsOrganizationPipeline() {
    return jenkinsOrganizationPipeline;
  }
  public void setJenkinsOrganizationPipeline(Boolean jenkinsOrganizationPipeline) {
    this.jenkinsOrganizationPipeline = jenkinsOrganizationPipeline;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GithubOrganization githubOrganization = (GithubOrganization) o;
    return (this._class == null ? githubOrganization._class == null : this._class.equals(githubOrganization._class)) &&
        (this.links == null ? githubOrganization.links == null : this.links.equals(githubOrganization.links)) &&
        (this.jenkinsOrganizationPipeline == null ? githubOrganization.jenkinsOrganizationPipeline == null : this.jenkinsOrganizationPipeline.equals(githubOrganization.jenkinsOrganizationPipeline)) &&
        (this.name == null ? githubOrganization.name == null : this.name.equals(githubOrganization.name));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this._class == null ? 0: this._class.hashCode());
    result = 31 * result + (this.links == null ? 0: this.links.hashCode());
    result = 31 * result + (this.jenkinsOrganizationPipeline == null ? 0: this.jenkinsOrganizationPipeline.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GithubOrganization {\n");
    
    sb.append("  _class: ").append(_class).append("\n");
    sb.append("  links: ").append(links).append("\n");
    sb.append("  jenkinsOrganizationPipeline: ").append(jenkinsOrganizationPipeline).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
