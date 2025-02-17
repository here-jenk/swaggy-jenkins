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
 * OASPipelineStepImpl
 */
public class OASPipelineStepImpl implements OAS.MappedProperties {
    /**
     * Get propertyClass
     * @return propertyClass
     */
    public String propertyClass { get; set; }

    /**
     * Get links
     * @return links
     */
    public OASPipelineStepImpllinks links { get; set; }

    /**
     * Get displayName
     * @return displayName
     */
    public String displayName { get; set; }

    /**
     * Get durationInMillis
     * @return durationInMillis
     */
    public Integer durationInMillis { get; set; }

    /**
     * Get id
     * @return id
     */
    public String id { get; set; }

    /**
     * Get input
     * @return input
     */
    public OASInputStepImpl input { get; set; }

    /**
     * Get result
     * @return result
     */
    public String result { get; set; }

    /**
     * Get startTime
     * @return startTime
     */
    public String startTime { get; set; }

    /**
     * Get state
     * @return state
     */
    public String state { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        '_class' => 'propertyClass',
        '_links' => 'links'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        '_class' => 'propertyClass',
        '_links' => 'links'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASPipelineStepImpl getExample() {
        OASPipelineStepImpl pipelineStepImpl = new OASPipelineStepImpl();
          pipelineStepImpl.propertyClass = '';
          pipelineStepImpl.links = OASPipelineStepImpllinks.getExample();
          pipelineStepImpl.displayName = '';
          pipelineStepImpl.durationInMillis = 0;
          pipelineStepImpl.id = '';
          pipelineStepImpl.input = OASInputStepImpl.getExample();
          pipelineStepImpl.result = '';
          pipelineStepImpl.startTime = '';
          pipelineStepImpl.state = '';
        return pipelineStepImpl;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASPipelineStepImpl) {           
            OASPipelineStepImpl pipelineStepImpl = (OASPipelineStepImpl) obj;
            return this.propertyClass == pipelineStepImpl.propertyClass
                && this.links == pipelineStepImpl.links
                && this.displayName == pipelineStepImpl.displayName
                && this.durationInMillis == pipelineStepImpl.durationInMillis
                && this.id == pipelineStepImpl.id
                && this.input == pipelineStepImpl.input
                && this.result == pipelineStepImpl.result
                && this.startTime == pipelineStepImpl.startTime
                && this.state == pipelineStepImpl.state;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (propertyClass == null ? 0 : System.hashCode(propertyClass));
        hashCode = (17 * hashCode) + (links == null ? 0 : System.hashCode(links));
        hashCode = (17 * hashCode) + (displayName == null ? 0 : System.hashCode(displayName));
        hashCode = (17 * hashCode) + (durationInMillis == null ? 0 : System.hashCode(durationInMillis));
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        hashCode = (17 * hashCode) + (input == null ? 0 : System.hashCode(input));
        hashCode = (17 * hashCode) + (result == null ? 0 : System.hashCode(result));
        hashCode = (17 * hashCode) + (startTime == null ? 0 : System.hashCode(startTime));
        hashCode = (17 * hashCode) + (state == null ? 0 : System.hashCode(state));
        return hashCode;
    }
}

