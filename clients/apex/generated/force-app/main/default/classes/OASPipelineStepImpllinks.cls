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
 * OASPipelineStepImpllinks
 */
public class OASPipelineStepImpllinks implements OAS.MappedProperties {
    /**
     * Get self
     * @return self
     */
    public OASLink self { get; set; }

    /**
     * Get actions
     * @return actions
     */
    public OASLink actions { get; set; }

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

    public static OASPipelineStepImpllinks getExample() {
        OASPipelineStepImpllinks pipelineStepImpllinks = new OASPipelineStepImpllinks();
          pipelineStepImpllinks.self = OASLink.getExample();
          pipelineStepImpllinks.actions = OASLink.getExample();
          pipelineStepImpllinks.propertyClass = '';
        return pipelineStepImpllinks;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASPipelineStepImpllinks) {           
            OASPipelineStepImpllinks pipelineStepImpllinks = (OASPipelineStepImpllinks) obj;
            return this.self == pipelineStepImpllinks.self
                && this.actions == pipelineStepImpllinks.actions
                && this.propertyClass == pipelineStepImpllinks.propertyClass;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (self == null ? 0 : System.hashCode(self));
        hashCode = (17 * hashCode) + (actions == null ? 0 : System.hashCode(actions));
        hashCode = (17 * hashCode) + (propertyClass == null ? 0 : System.hashCode(propertyClass));
        return hashCode;
    }
}

