package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.GithubOrganizationlinks;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GithubOrganization
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2022-06-04T08:08:47.143870Z[Etc/UTC]")
public class GithubOrganization {

  @JsonProperty("_class")
  private String propertyClass;

  @JsonProperty("_links")
  private GithubOrganizationlinks links;

  @JsonProperty("jenkinsOrganizationPipeline")
  private Boolean jenkinsOrganizationPipeline;

  @JsonProperty("name")
  private String name;

  public GithubOrganization propertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

  /**
   * Get propertyClass
   * @return propertyClass
  */
  
  @Schema(name = "_class", required = false)
  public String getPropertyClass() {
    return propertyClass;
  }

  public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }

  public GithubOrganization links(GithubOrganizationlinks links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @Valid 
  @Schema(name = "_links", required = false)
  public GithubOrganizationlinks getLinks() {
    return links;
  }

  public void setLinks(GithubOrganizationlinks links) {
    this.links = links;
  }

  public GithubOrganization jenkinsOrganizationPipeline(Boolean jenkinsOrganizationPipeline) {
    this.jenkinsOrganizationPipeline = jenkinsOrganizationPipeline;
    return this;
  }

  /**
   * Get jenkinsOrganizationPipeline
   * @return jenkinsOrganizationPipeline
  */
  
  @Schema(name = "jenkinsOrganizationPipeline", required = false)
  public Boolean getJenkinsOrganizationPipeline() {
    return jenkinsOrganizationPipeline;
  }

  public void setJenkinsOrganizationPipeline(Boolean jenkinsOrganizationPipeline) {
    this.jenkinsOrganizationPipeline = jenkinsOrganizationPipeline;
  }

  public GithubOrganization name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", required = false)
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
    return Objects.equals(this.propertyClass, githubOrganization.propertyClass) &&
        Objects.equals(this.links, githubOrganization.links) &&
        Objects.equals(this.jenkinsOrganizationPipeline, githubOrganization.jenkinsOrganizationPipeline) &&
        Objects.equals(this.name, githubOrganization.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyClass, links, jenkinsOrganizationPipeline, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GithubOrganization {\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    jenkinsOrganizationPipeline: ").append(toIndentedString(jenkinsOrganizationPipeline)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
}

