package apimodels;

import apimodels.FreeStyleProject;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ListView
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2022-06-04T08:08:33.694891Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ListView   {
  @JsonProperty("_class")
  
  private String propertyClass;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("jobs")
  @Valid

  private List<FreeStyleProject> jobs = null;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("url")
  
  private String url;

  public ListView propertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

   /**
   * Get propertyClass
   * @return propertyClass
  **/
  public String getPropertyClass() {
    return propertyClass;
  }

  public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }

  public ListView description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ListView jobs(List<FreeStyleProject> jobs) {
    this.jobs = jobs;
    return this;
  }

  public ListView addJobsItem(FreeStyleProject jobsItem) {
    if (jobs == null) {
      jobs = new ArrayList<>();
    }
    jobs.add(jobsItem);
    return this;
  }

   /**
   * Get jobs
   * @return jobs
  **/
  public List<FreeStyleProject> getJobs() {
    return jobs;
  }

  public void setJobs(List<FreeStyleProject> jobs) {
    this.jobs = jobs;
  }

  public ListView name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ListView url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListView listView = (ListView) o;
    return Objects.equals(propertyClass, listView.propertyClass) &&
        Objects.equals(description, listView.description) &&
        Objects.equals(jobs, listView.jobs) &&
        Objects.equals(name, listView.name) &&
        Objects.equals(url, listView.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyClass, description, jobs, name, url);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListView {\n");
    
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

