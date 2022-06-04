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
import FreeStyleProject from './FreeStyleProject';

/**
 * The ListView model module.
 * @module model/ListView
 * @version 1.5.1-pre.0
 */
class ListView {
    /**
     * Constructs a new <code>ListView</code>.
     * @alias module:model/ListView
     */
    constructor() { 
        
        ListView.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ListView</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ListView} obj Optional instance to populate.
     * @return {module:model/ListView} The populated <code>ListView</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ListView();

            if (data.hasOwnProperty('_class')) {
                obj['_class'] = ApiClient.convertToType(data['_class'], 'String');
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('jobs')) {
                obj['jobs'] = ApiClient.convertToType(data['jobs'], [FreeStyleProject]);
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('url')) {
                obj['url'] = ApiClient.convertToType(data['url'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} _class
 */
ListView.prototype['_class'] = undefined;

/**
 * @member {String} description
 */
ListView.prototype['description'] = undefined;

/**
 * @member {Array.<module:model/FreeStyleProject>} jobs
 */
ListView.prototype['jobs'] = undefined;

/**
 * @member {String} name
 */
ListView.prototype['name'] = undefined;

/**
 * @member {String} url
 */
ListView.prototype['url'] = undefined;






export default ListView;

