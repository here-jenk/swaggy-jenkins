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
 * OASDiskSpaceMonitorDescriptorDiskSpa
 */
public class OASDiskSpaceMonitorDescriptorDiskSpa implements OAS.MappedProperties {
    /**
     * Get propertyClass
     * @return propertyClass
     */
    public String propertyClass { get; set; }

    /**
     * Get timestamp
     * @return timestamp
     */
    public Integer timestamp { get; set; }

    /**
     * Get path
     * @return path
     */
    public String path { get; set; }

    /**
     * Get size
     * @return size
     */
    public Integer size { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        '_class' => 'propertyClass'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASDiskSpaceMonitorDescriptorDiskSpa getExample() {
        OASDiskSpaceMonitorDescriptorDiskSpa diskSpaceMonitorDescriptorDiskSpace = new OASDiskSpaceMonitorDescriptorDiskSpa();
          diskSpaceMonitorDescriptorDiskSpace.propertyClass = '';
          diskSpaceMonitorDescriptorDiskSpace.timestamp = 0;
          diskSpaceMonitorDescriptorDiskSpace.path = '';
          diskSpaceMonitorDescriptorDiskSpace.size = 0;
        return diskSpaceMonitorDescriptorDiskSpace;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASDiskSpaceMonitorDescriptorDiskSpa) {           
            OASDiskSpaceMonitorDescriptorDiskSpa diskSpaceMonitorDescriptorDiskSpace = (OASDiskSpaceMonitorDescriptorDiskSpa) obj;
            return this.propertyClass == diskSpaceMonitorDescriptorDiskSpace.propertyClass
                && this.timestamp == diskSpaceMonitorDescriptorDiskSpace.timestamp
                && this.path == diskSpaceMonitorDescriptorDiskSpace.path
                && this.size == diskSpaceMonitorDescriptorDiskSpace.size;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (propertyClass == null ? 0 : System.hashCode(propertyClass));
        hashCode = (17 * hashCode) + (timestamp == null ? 0 : System.hashCode(timestamp));
        hashCode = (17 * hashCode) + (path == null ? 0 : System.hashCode(path));
        hashCode = (17 * hashCode) + (size == null ? 0 : System.hashCode(size));
        return hashCode;
    }
}

