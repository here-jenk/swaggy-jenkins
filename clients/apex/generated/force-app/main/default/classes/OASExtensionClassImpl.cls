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
 * OASExtensionClassImpl
 */
public class OASExtensionClassImpl implements OAS.MappedProperties {
    /**
     * Get propertyClass
     * @return propertyClass
     */
    public String propertyClass { get; set; }

    /**
     * Get links
     * @return links
     */
    public OASExtensionClassImpllinks links { get; set; }

    /**
     * Get classes
     * @return classes
     */
    public List<String> classes { get; set; }

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

    public OASExtensionClassImpl() {
        classes = new List<String>();
    }

    public static OASExtensionClassImpl getExample() {
        OASExtensionClassImpl extensionClassImpl = new OASExtensionClassImpl();
          extensionClassImpl.propertyClass = '';
          extensionClassImpl.links = OASExtensionClassImpllinks.getExample();
          extensionClassImpl.classes = new List<String>{''};
        return extensionClassImpl;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASExtensionClassImpl) {           
            OASExtensionClassImpl extensionClassImpl = (OASExtensionClassImpl) obj;
            return this.propertyClass == extensionClassImpl.propertyClass
                && this.links == extensionClassImpl.links
                && this.classes == extensionClassImpl.classes;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (propertyClass == null ? 0 : System.hashCode(propertyClass));
        hashCode = (17 * hashCode) + (links == null ? 0 : System.hashCode(links));
        hashCode = (17 * hashCode) + (classes == null ? 0 : System.hashCode(classes));
        return hashCode;
    }
}

