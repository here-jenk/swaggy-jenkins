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
 * OASPipelineActivityartifacts
 */
public class OASPipelineActivityartifacts implements OAS.MappedProperties {
    /**
     * Get name
     * @return name
     */
    public String name { get; set; }

    /**
     * Get size
     * @return size
     */
    public Integer size { get; set; }

    /**
     * Get url
     * @return url
     */
    public String url { get; set; }

    /**
     * Get propertyClass
     * @return propertyClass
     */
    public String propertyClass { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        '_class' => 'propertyClass'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASPipelineActivityartifacts getExample() {
        OASPipelineActivityartifacts pipelineActivityartifacts = new OASPipelineActivityartifacts();
          pipelineActivityartifacts.name = '';
          pipelineActivityartifacts.size = 0;
          pipelineActivityartifacts.url = '';
          pipelineActivityartifacts.propertyClass = '';
        return pipelineActivityartifacts;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASPipelineActivityartifacts) {           
            OASPipelineActivityartifacts pipelineActivityartifacts = (OASPipelineActivityartifacts) obj;
            return this.name == pipelineActivityartifacts.name
                && this.size == pipelineActivityartifacts.size
                && this.url == pipelineActivityartifacts.url
                && this.propertyClass == pipelineActivityartifacts.propertyClass;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (name == null ? 0 : System.hashCode(name));
        hashCode = (17 * hashCode) + (size == null ? 0 : System.hashCode(size));
        hashCode = (17 * hashCode) + (url == null ? 0 : System.hashCode(url));
        hashCode = (17 * hashCode) + (propertyClass == null ? 0 : System.hashCode(propertyClass));
        return hashCode;
    }
}

