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
 * The GenericResource model module.
 * @module model/GenericResource
 * @version 1.1.2-pre.0
 */
class GenericResource {
    /**
     * @member {String} _class
     * @type {String}
     */
    _class;
    /**
     * @member {String} displayName
     * @type {String}
     */
    displayName;
    /**
     * @member {Number} durationInMillis
     * @type {Number}
     */
    durationInMillis;
    /**
     * @member {String} id
     * @type {String}
     */
    id;
    /**
     * @member {String} result
     * @type {String}
     */
    result;
    /**
     * @member {String} startTime
     * @type {String}
     */
    startTime;

    

    /**
     * Constructs a new <code>GenericResource</code>.
     * @alias module:model/GenericResource
     */
    constructor() { 
        
        GenericResource.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>GenericResource</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GenericResource} obj Optional instance to populate.
     * @return {module:model/GenericResource} The populated <code>GenericResource</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GenericResource();

            if (data.hasOwnProperty('_class')) {
                obj['_class'] = ApiClient.convertToType(data['_class'], 'String');
            }
            if (data.hasOwnProperty('displayName')) {
                obj['displayName'] = ApiClient.convertToType(data['displayName'], 'String');
            }
            if (data.hasOwnProperty('durationInMillis')) {
                obj['durationInMillis'] = ApiClient.convertToType(data['durationInMillis'], 'Number');
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('result')) {
                obj['result'] = ApiClient.convertToType(data['result'], 'String');
            }
            if (data.hasOwnProperty('startTime')) {
                obj['startTime'] = ApiClient.convertToType(data['startTime'], 'String');
            }
        }
        return obj;
    }
}



export default GenericResource;

