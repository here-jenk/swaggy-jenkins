/**
 * Swaggy Jenkins
 * Jenkins API clients generated from Swagger / Open API specification
 *
 * The version of the OpenAPI document: 1.5.1-pre.0
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The HudsonassignedLabels model module.
 * @module model/HudsonassignedLabels
 * @version 1.5.1-pre.0
 */
class HudsonassignedLabels {
    /**
     * @member {String} _class
     * @type {String}
     */
    _class;

    

    /**
     * Constructs a new <code>HudsonassignedLabels</code>.
     * @alias module:model/HudsonassignedLabels
     */
    constructor() { 
        
        HudsonassignedLabels.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>HudsonassignedLabels</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/HudsonassignedLabels} obj Optional instance to populate.
     * @return {module:model/HudsonassignedLabels} The populated <code>HudsonassignedLabels</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new HudsonassignedLabels();

            if (data.hasOwnProperty('_class')) {
                obj['_class'] = ApiClient.convertToType(data['_class'], 'String');
            }
        }
        return obj;
    }
}



export default HudsonassignedLabels;

