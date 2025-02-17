package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GithubContent  {
  
  @ApiModelProperty(value = "")
  private String name;

  @ApiModelProperty(value = "")
  private String sha;

  @ApiModelProperty(value = "")
  private String propertyClass;

  @ApiModelProperty(value = "")
  private String repo;

  @ApiModelProperty(value = "")
  private Integer size;

  @ApiModelProperty(value = "")
  private String owner;

  @ApiModelProperty(value = "")
  private String path;

  @ApiModelProperty(value = "")
  private String base64Data;
 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GithubContent name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get sha
   * @return sha
  **/
  @JsonProperty("sha")
  public String getSha() {
    return sha;
  }

  public void setSha(String sha) {
    this.sha = sha;
  }

  public GithubContent sha(String sha) {
    this.sha = sha;
    return this;
  }

 /**
   * Get propertyClass
   * @return propertyClass
  **/
  @JsonProperty("_class")
  public String getPropertyClass() {
    return propertyClass;
  }

  public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }

  public GithubContent propertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

 /**
   * Get repo
   * @return repo
  **/
  @JsonProperty("repo")
  public String getRepo() {
    return repo;
  }

  public void setRepo(String repo) {
    this.repo = repo;
  }

  public GithubContent repo(String repo) {
    this.repo = repo;
    return this;
  }

 /**
   * Get size
   * @return size
  **/
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public GithubContent size(Integer size) {
    this.size = size;
    return this;
  }

 /**
   * Get owner
   * @return owner
  **/
  @JsonProperty("owner")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public GithubContent owner(String owner) {
    this.owner = owner;
    return this;
  }

 /**
   * Get path
   * @return path
  **/
  @JsonProperty("path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public GithubContent path(String path) {
    this.path = path;
    return this;
  }

 /**
   * Get base64Data
   * @return base64Data
  **/
  @JsonProperty("base64Data")
  public String getBase64Data() {
    return base64Data;
  }

  public void setBase64Data(String base64Data) {
    this.base64Data = base64Data;
  }

  public GithubContent base64Data(String base64Data) {
    this.base64Data = base64Data;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GithubContent {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    repo: ").append(toIndentedString(repo)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    base64Data: ").append(toIndentedString(base64Data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

