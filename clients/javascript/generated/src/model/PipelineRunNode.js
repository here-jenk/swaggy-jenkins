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
import PipelineRunNodeedges from './PipelineRunNodeedges';

/**
 * The PipelineRunNode model module.
 * @module model/PipelineRunNode
 * @version 1.5.1-pre.0
 */
class PipelineRunNode {
    /**
     * Constructs a new <code>PipelineRunNode</code>.
     * @alias module:model/PipelineRunNode
     */
    constructor() { 
        
        PipelineRunNode.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PipelineRunNode</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PipelineRunNode} obj Optional instance to populate.
     * @return {module:model/PipelineRunNode} The populated <code>PipelineRunNode</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PipelineRunNode();

            if (data.hasOwnProperty('_class')) {
                obj['_class'] = ApiClient.convertToType(data['_class'], 'String');
            }
            if (data.hasOwnProperty('displayName')) {
                obj['displayName'] = ApiClient.convertToType(data['displayName'], 'String');
            }
            if (data.hasOwnProperty('durationInMillis')) {
                obj['durationInMillis'] = ApiClient.convertToType(data['durationInMillis'], 'Number');
            }
            if (data.hasOwnProperty('edges')) {
                obj['edges'] = ApiClient.convertToType(data['edges'], [PipelineRunNodeedges]);
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
            if (data.hasOwnProperty('state')) {
                obj['state'] = ApiClient.convertToType(data['state'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} _class
 */
PipelineRunNode.prototype['_class'] = undefined;

/**
 * @member {String} displayName
 */
PipelineRunNode.prototype['displayName'] = undefined;

/**
 * @member {Number} durationInMillis
 */
PipelineRunNode.prototype['durationInMillis'] = undefined;

/**
 * @member {Array.<module:model/PipelineRunNodeedges>} edges
 */
PipelineRunNode.prototype['edges'] = undefined;

/**
 * @member {String} id
 */
PipelineRunNode.prototype['id'] = undefined;

/**
 * @member {String} result
 */
PipelineRunNode.prototype['result'] = undefined;

/**
 * @member {String} startTime
 */
PipelineRunNode.prototype['startTime'] = undefined;

/**
 * @member {String} state
 */
PipelineRunNode.prototype['state'] = undefined;






export default PipelineRunNode;

