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
 * The PipelineRunNodeedges model module.
 * @module model/PipelineRunNodeedges
 * @version 1.5.1-pre.0
 */
class PipelineRunNodeedges {
    /**
     * Constructs a new <code>PipelineRunNodeedges</code>.
     * @alias module:model/PipelineRunNodeedges
     */
    constructor() { 
        
        PipelineRunNodeedges.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PipelineRunNodeedges</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PipelineRunNodeedges} obj Optional instance to populate.
     * @return {module:model/PipelineRunNodeedges} The populated <code>PipelineRunNodeedges</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PipelineRunNodeedges();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('_class')) {
                obj['_class'] = ApiClient.convertToType(data['_class'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} id
 */
PipelineRunNodeedges.prototype['id'] = undefined;

/**
 * @member {String} _class
 */
PipelineRunNodeedges.prototype['_class'] = undefined;






export default PipelineRunNodeedges;

