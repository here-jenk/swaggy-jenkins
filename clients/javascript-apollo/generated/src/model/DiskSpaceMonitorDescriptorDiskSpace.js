/**
 * Swaggy Jenkins
 * Jenkins API clients generated from Swagger / Open API specification
 *
 * The version of the OpenAPI document: 1.1.2-pre.0
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The DiskSpaceMonitorDescriptorDiskSpace model module.
 * @module model/DiskSpaceMonitorDescriptorDiskSpace
 * @version 1.1.2-pre.0
 */
class DiskSpaceMonitorDescriptorDiskSpace {
    /**
     * @member {String} _class
     * @type {String}
     */
    _class;
    /**
     * @member {Number} timestamp
     * @type {Number}
     */
    timestamp;
    /**
     * @member {String} path
     * @type {String}
     */
    path;
    /**
     * @member {Number} size
     * @type {Number}
     */
    size;

    

    /**
     * Constructs a new <code>DiskSpaceMonitorDescriptorDiskSpace</code>.
     * @alias module:model/DiskSpaceMonitorDescriptorDiskSpace
     */
    constructor() { 
        
        DiskSpaceMonitorDescriptorDiskSpace.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>DiskSpaceMonitorDescriptorDiskSpace</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/DiskSpaceMonitorDescriptorDiskSpace} obj Optional instance to populate.
     * @return {module:model/DiskSpaceMonitorDescriptorDiskSpace} The populated <code>DiskSpaceMonitorDescriptorDiskSpace</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DiskSpaceMonitorDescriptorDiskSpace();

            if (data.hasOwnProperty('_class')) {
                obj['_class'] = ApiClient.convertToType(data['_class'], 'String');
            }
            if (data.hasOwnProperty('timestamp')) {
                obj['timestamp'] = ApiClient.convertToType(data['timestamp'], 'Number');
            }
            if (data.hasOwnProperty('path')) {
                obj['path'] = ApiClient.convertToType(data['path'], 'String');
            }
            if (data.hasOwnProperty('size')) {
                obj['size'] = ApiClient.convertToType(data['size'], 'Number');
            }
        }
        return obj;
    }
}



export default DiskSpaceMonitorDescriptorDiskSpace;

