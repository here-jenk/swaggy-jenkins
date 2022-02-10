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
 * The FreeStyleProjecthealthReport model module.
 * @module model/FreeStyleProjecthealthReport
 * @version 1.1.2-pre.0
 */
class FreeStyleProjecthealthReport {
    /**
     * @member {String} description
     * @type {String}
     */
    description;
    /**
     * @member {String} iconClassName
     * @type {String}
     */
    iconClassName;
    /**
     * @member {String} iconUrl
     * @type {String}
     */
    iconUrl;
    /**
     * @member {Number} score
     * @type {Number}
     */
    score;
    /**
     * @member {String} _class
     * @type {String}
     */
    _class;

    

    /**
     * Constructs a new <code>FreeStyleProjecthealthReport</code>.
     * @alias module:model/FreeStyleProjecthealthReport
     */
    constructor() { 
        
        FreeStyleProjecthealthReport.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FreeStyleProjecthealthReport</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FreeStyleProjecthealthReport} obj Optional instance to populate.
     * @return {module:model/FreeStyleProjecthealthReport} The populated <code>FreeStyleProjecthealthReport</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FreeStyleProjecthealthReport();

            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('iconClassName')) {
                obj['iconClassName'] = ApiClient.convertToType(data['iconClassName'], 'String');
            }
            if (data.hasOwnProperty('iconUrl')) {
                obj['iconUrl'] = ApiClient.convertToType(data['iconUrl'], 'String');
            }
            if (data.hasOwnProperty('score')) {
                obj['score'] = ApiClient.convertToType(data['score'], 'Number');
            }
            if (data.hasOwnProperty('_class')) {
                obj['_class'] = ApiClient.convertToType(data['_class'], 'String');
            }
        }
        return obj;
    }
}



export default FreeStyleProjecthealthReport;

