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
 * OASBranchImpllinks
 */
public class OASBranchImpllinks implements OAS.MappedProperties {
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
     * Get runs
     * @return runs
     */
    public OASLink runs { get; set; }

    /**
     * Get queue
     * @return queue
     */
    public OASLink queue { get; set; }

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

    public static OASBranchImpllinks getExample() {
        OASBranchImpllinks branchImpllinks = new OASBranchImpllinks();
          branchImpllinks.self = OASLink.getExample();
          branchImpllinks.actions = OASLink.getExample();
          branchImpllinks.runs = OASLink.getExample();
          branchImpllinks.queue = OASLink.getExample();
          branchImpllinks.propertyClass = '';
        return branchImpllinks;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASBranchImpllinks) {           
            OASBranchImpllinks branchImpllinks = (OASBranchImpllinks) obj;
            return this.self == branchImpllinks.self
                && this.actions == branchImpllinks.actions
                && this.runs == branchImpllinks.runs
                && this.queue == branchImpllinks.queue
                && this.propertyClass == branchImpllinks.propertyClass;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (self == null ? 0 : System.hashCode(self));
        hashCode = (17 * hashCode) + (actions == null ? 0 : System.hashCode(actions));
        hashCode = (17 * hashCode) + (runs == null ? 0 : System.hashCode(runs));
        hashCode = (17 * hashCode) + (queue == null ? 0 : System.hashCode(queue));
        hashCode = (17 * hashCode) + (propertyClass == null ? 0 : System.hashCode(propertyClass));
        return hashCode;
    }
}

