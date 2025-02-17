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
 * OASPipeline
 */
public class OASPipeline implements OAS.MappedProperties {
    /**
     * Get propertyClass
     * @return propertyClass
     */
    public String propertyClass { get; set; }

    /**
     * Get organization
     * @return organization
     */
    public String organization { get; set; }

    /**
     * Get name
     * @return name
     */
    public String name { get; set; }

    /**
     * Get displayName
     * @return displayName
     */
    public String displayName { get; set; }

    /**
     * Get fullName
     * @return fullName
     */
    public String fullName { get; set; }

    /**
     * Get weatherScore
     * @return weatherScore
     */
    public Integer weatherScore { get; set; }

    /**
     * Get estimatedDurationInMillis
     * @return estimatedDurationInMillis
     */
    public Integer estimatedDurationInMillis { get; set; }

    /**
     * Get latestRun
     * @return latestRun
     */
    public OASPipelinelatestRun latestRun { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        '_class' => 'propertyClass'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASPipeline getExample() {
        OASPipeline pipeline = new OASPipeline();
          pipeline.propertyClass = '';
          pipeline.organization = '';
          pipeline.name = '';
          pipeline.displayName = '';
          pipeline.fullName = '';
          pipeline.weatherScore = 0;
          pipeline.estimatedDurationInMillis = 0;
          pipeline.latestRun = OASPipelinelatestRun.getExample();
        return pipeline;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASPipeline) {           
            OASPipeline pipeline = (OASPipeline) obj;
            return this.propertyClass == pipeline.propertyClass
                && this.organization == pipeline.organization
                && this.name == pipeline.name
                && this.displayName == pipeline.displayName
                && this.fullName == pipeline.fullName
                && this.weatherScore == pipeline.weatherScore
                && this.estimatedDurationInMillis == pipeline.estimatedDurationInMillis
                && this.latestRun == pipeline.latestRun;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (propertyClass == null ? 0 : System.hashCode(propertyClass));
        hashCode = (17 * hashCode) + (organization == null ? 0 : System.hashCode(organization));
        hashCode = (17 * hashCode) + (name == null ? 0 : System.hashCode(name));
        hashCode = (17 * hashCode) + (displayName == null ? 0 : System.hashCode(displayName));
        hashCode = (17 * hashCode) + (fullName == null ? 0 : System.hashCode(fullName));
        hashCode = (17 * hashCode) + (weatherScore == null ? 0 : System.hashCode(weatherScore));
        hashCode = (17 * hashCode) + (estimatedDurationInMillis == null ? 0 : System.hashCode(estimatedDurationInMillis));
        hashCode = (17 * hashCode) + (latestRun == null ? 0 : System.hashCode(latestRun));
        return hashCode;
    }
}

