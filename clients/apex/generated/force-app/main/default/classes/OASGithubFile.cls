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
 * OASGithubFile
 */
public class OASGithubFile implements OAS.MappedProperties {
    /**
     * Get content
     * @return content
     */
    public OASGithubContent content { get; set; }

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

    public static OASGithubFile getExample() {
        OASGithubFile githubFile = new OASGithubFile();
          githubFile.content = OASGithubContent.getExample();
          githubFile.propertyClass = '';
        return githubFile;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASGithubFile) {           
            OASGithubFile githubFile = (OASGithubFile) obj;
            return this.content == githubFile.content
                && this.propertyClass == githubFile.propertyClass;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (content == null ? 0 : System.hashCode(content));
        hashCode = (17 * hashCode) + (propertyClass == null ? 0 : System.hashCode(propertyClass));
        return hashCode;
    }
}

