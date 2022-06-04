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
 * The PipelineRunartifacts model module.
 * @module model/PipelineRunartifacts
 * @version 1.5.1-pre.0
 */
class PipelineRunartifacts {
    /**
     * Constructs a new <code>PipelineRunartifacts</code>.
     * @alias module:model/PipelineRunartifacts
     */
    constructor() { 
        
        PipelineRunartifacts.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PipelineRunartifacts</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PipelineRunartifacts} obj Optional instance to populate.
     * @return {module:model/PipelineRunartifacts} The populated <code>PipelineRunartifacts</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PipelineRunartifacts();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('size')) {
                obj['size'] = ApiClient.convertToType(data['size'], 'Number');
            }
            if (data.hasOwnProperty('url')) {
                obj['url'] = ApiClient.convertToType(data['url'], 'String');
            }
            if (data.hasOwnProperty('_class')) {
                obj['_class'] = ApiClient.convertToType(data['_class'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} name
 */
PipelineRunartifacts.prototype['name'] = undefined;

/**
 * @member {Number} size
 */
PipelineRunartifacts.prototype['size'] = undefined;

/**
 * @member {String} url
 */
PipelineRunartifacts.prototype['url'] = undefined;

/**
 * @member {String} _class
 */
PipelineRunartifacts.prototype['_class'] = undefined;






export default PipelineRunartifacts;

