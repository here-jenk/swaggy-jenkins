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
 * OASPipelineRunImpllinks
 */
public class OASPipelineRunImpllinks implements OAS.MappedProperties {
    /**
     * Get nodes
     * @return nodes
     */
    public OASLink nodes { get; set; }

    /**
     * Get log
     * @return log
     */
    public OASLink log { get; set; }

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
     * Get steps
     * @return steps
     */
    public OASLink steps { get; set; }

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

    public static OASPipelineRunImpllinks getExample() {
        OASPipelineRunImpllinks pipelineRunImpllinks = new OASPipelineRunImpllinks();
          pipelineRunImpllinks.nodes = OASLink.getExample();
          pipelineRunImpllinks.log = OASLink.getExample();
          pipelineRunImpllinks.self = OASLink.getExample();
          pipelineRunImpllinks.actions = OASLink.getExample();
          pipelineRunImpllinks.steps = OASLink.getExample();
          pipelineRunImpllinks.propertyClass = '';
        return pipelineRunImpllinks;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASPipelineRunImpllinks) {           
            OASPipelineRunImpllinks pipelineRunImpllinks = (OASPipelineRunImpllinks) obj;
            return this.nodes == pipelineRunImpllinks.nodes
                && this.log == pipelineRunImpllinks.log
                && this.self == pipelineRunImpllinks.self
                && this.actions == pipelineRunImpllinks.actions
                && this.steps == pipelineRunImpllinks.steps
                && this.propertyClass == pipelineRunImpllinks.propertyClass;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (nodes == null ? 0 : System.hashCode(nodes));
        hashCode = (17 * hashCode) + (log == null ? 0 : System.hashCode(log));
        hashCode = (17 * hashCode) + (self == null ? 0 : System.hashCode(self));
        hashCode = (17 * hashCode) + (actions == null ? 0 : System.hashCode(actions));
        hashCode = (17 * hashCode) + (steps == null ? 0 : System.hashCode(steps));
        hashCode = (17 * hashCode) + (propertyClass == null ? 0 : System.hashCode(propertyClass));
        return hashCode;
    }
}

