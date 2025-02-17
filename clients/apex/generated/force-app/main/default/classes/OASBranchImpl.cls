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
 * OASBranchImpl
 */
public class OASBranchImpl implements OAS.MappedProperties {
    /**
     * Get propertyClass
     * @return propertyClass
     */
    public String propertyClass { get; set; }

    /**
     * Get displayName
     * @return displayName
     */
    public String displayName { get; set; }

    /**
     * Get estimatedDurationInMillis
     * @return estimatedDurationInMillis
     */
    public Integer estimatedDurationInMillis { get; set; }

    /**
     * Get fullDisplayName
     * @return fullDisplayName
     */
    public String fullDisplayName { get; set; }

    /**
     * Get fullName
     * @return fullName
     */
    public String fullName { get; set; }

    /**
     * Get name
     * @return name
     */
    public String name { get; set; }

    /**
     * Get organization
     * @return organization
     */
    public String organization { get; set; }

    /**
     * Get parameters
     * @return parameters
     */
    public List<OASStringParameterDefinition> parameters { get; set; }

    /**
     * Get permissions
     * @return permissions
     */
    public OASBranchImplpermissions permissions { get; set; }

    /**
     * Get weatherScore
     * @return weatherScore
     */
    public Integer weatherScore { get; set; }

    /**
     * Get pullRequest
     * @return pullRequest
     */
    public String pullRequest { get; set; }

    /**
     * Get links
     * @return links
     */
    public OASBranchImpllinks links { get; set; }

    /**
     * Get latestRun
     * @return latestRun
     */
    public OASPipelineRunImpl latestRun { get; set; }

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

    public OASBranchImpl() {
        parameters = new List<OASStringParameterDefinition>();
    }

    public static OASBranchImpl getExample() {
        OASBranchImpl branchImpl = new OASBranchImpl();
          branchImpl.propertyClass = '';
          branchImpl.displayName = '';
          branchImpl.estimatedDurationInMillis = 0;
          branchImpl.fullDisplayName = '';
          branchImpl.fullName = '';
          branchImpl.name = '';
          branchImpl.organization = '';
          branchImpl.parameters = new List<OASStringParameterDefinition>{OASStringParameterDefinition.getExample()};
          branchImpl.permissions = OASBranchImplpermissions.getExample();
          branchImpl.weatherScore = 0;
          branchImpl.pullRequest = '';
          branchImpl.links = OASBranchImpllinks.getExample();
          branchImpl.latestRun = OASPipelineRunImpl.getExample();
        return branchImpl;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASBranchImpl) {           
            OASBranchImpl branchImpl = (OASBranchImpl) obj;
            return this.propertyClass == branchImpl.propertyClass
                && this.displayName == branchImpl.displayName
                && this.estimatedDurationInMillis == branchImpl.estimatedDurationInMillis
                && this.fullDisplayName == branchImpl.fullDisplayName
                && this.fullName == branchImpl.fullName
                && this.name == branchImpl.name
                && this.organization == branchImpl.organization
                && this.parameters == branchImpl.parameters
                && this.permissions == branchImpl.permissions
                && this.weatherScore == branchImpl.weatherScore
                && this.pullRequest == branchImpl.pullRequest
                && this.links == branchImpl.links
                && this.latestRun == branchImpl.latestRun;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (propertyClass == null ? 0 : System.hashCode(propertyClass));
        hashCode = (17 * hashCode) + (displayName == null ? 0 : System.hashCode(displayName));
        hashCode = (17 * hashCode) + (estimatedDurationInMillis == null ? 0 : System.hashCode(estimatedDurationInMillis));
        hashCode = (17 * hashCode) + (fullDisplayName == null ? 0 : System.hashCode(fullDisplayName));
        hashCode = (17 * hashCode) + (fullName == null ? 0 : System.hashCode(fullName));
        hashCode = (17 * hashCode) + (name == null ? 0 : System.hashCode(name));
        hashCode = (17 * hashCode) + (organization == null ? 0 : System.hashCode(organization));
        hashCode = (17 * hashCode) + (parameters == null ? 0 : System.hashCode(parameters));
        hashCode = (17 * hashCode) + (permissions == null ? 0 : System.hashCode(permissions));
        hashCode = (17 * hashCode) + (weatherScore == null ? 0 : System.hashCode(weatherScore));
        hashCode = (17 * hashCode) + (pullRequest == null ? 0 : System.hashCode(pullRequest));
        hashCode = (17 * hashCode) + (links == null ? 0 : System.hashCode(links));
        hashCode = (17 * hashCode) + (latestRun == null ? 0 : System.hashCode(latestRun));
        return hashCode;
    }
}

