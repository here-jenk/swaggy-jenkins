/*
 * Swaggy Jenkins
 * Jenkins API clients generated from Swagger / Open API specification
 *
 * The version of the OpenAPI document: 1.5.1-pre.0
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

/**
 * OASListView
 */
public class OASListView implements OAS.MappedProperties {
    /**
     * Get propertyClass
     * @return propertyClass
     */
    public String propertyClass { get; set; }

    /**
     * Get description
     * @return description
     */
    public String description { get; set; }

    /**
     * Get jobs
     * @return jobs
     */
    public List<OASFreeStyleProject> jobs { get; set; }

    /**
     * Get name
     * @return name
     */
    public String name { get; set; }

    /**
     * Get url
     * @return url
     */
    public String url { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        '_class' => 'propertyClass'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public OASListView() {
        jobs = new List<OASFreeStyleProject>();
    }

    public static OASListView getExample() {
        OASListView listView = new OASListView();
          listView.propertyClass = '';
          listView.description = '';
          listView.jobs = new List<OASFreeStyleProject>{OASFreeStyleProject.getExample()};
          listView.name = '';
          listView.url = '';
        return listView;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASListView) {           
            OASListView listView = (OASListView) obj;
            return this.propertyClass == listView.propertyClass
                && this.description == listView.description
                && this.jobs == listView.jobs
                && this.name == listView.name
                && this.url == listView.url;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (propertyClass == null ? 0 : System.hashCode(propertyClass));
        hashCode = (17 * hashCode) + (description == null ? 0 : System.hashCode(description));
        hashCode = (17 * hashCode) + (jobs == null ? 0 : System.hashCode(jobs));
        hashCode = (17 * hashCode) + (name == null ? 0 : System.hashCode(name));
        hashCode = (17 * hashCode) + (url == null ? 0 : System.hashCode(url));
        return hashCode;
    }
}

