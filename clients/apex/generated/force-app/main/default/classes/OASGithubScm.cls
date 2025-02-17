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
 * OASGithubScm
 */
public class OASGithubScm implements OAS.MappedProperties {
    /**
     * Get propertyClass
     * @return propertyClass
     */
    public String propertyClass { get; set; }

    /**
     * Get links
     * @return links
     */
    public OASGithubScmlinks links { get; set; }

    /**
     * Get credentialId
     * @return credentialId
     */
    public String credentialId { get; set; }

    /**
     * Get id
     * @return id
     */
    public String id { get; set; }

    /**
     * Get uri
     * @return uri
     */
    public String uri { get; set; }

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

    public static OASGithubScm getExample() {
        OASGithubScm githubScm = new OASGithubScm();
          githubScm.propertyClass = '';
          githubScm.links = OASGithubScmlinks.getExample();
          githubScm.credentialId = '';
          githubScm.id = '';
          githubScm.uri = '';
        return githubScm;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASGithubScm) {           
            OASGithubScm githubScm = (OASGithubScm) obj;
            return this.propertyClass == githubScm.propertyClass
                && this.links == githubScm.links
                && this.credentialId == githubScm.credentialId
                && this.id == githubScm.id
                && this.uri == githubScm.uri;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (propertyClass == null ? 0 : System.hashCode(propertyClass));
        hashCode = (17 * hashCode) + (links == null ? 0 : System.hashCode(links));
        hashCode = (17 * hashCode) + (credentialId == null ? 0 : System.hashCode(credentialId));
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        hashCode = (17 * hashCode) + (uri == null ? 0 : System.hashCode(uri));
        return hashCode;
    }
}

