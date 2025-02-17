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
import PipelinelatestRunartifacts from './PipelinelatestRunartifacts';

/**
 * The PipelinelatestRun model module.
 * @module model/PipelinelatestRun
 * @version 1.5.1-pre.0
 */
class PipelinelatestRun {
    /**
     * Constructs a new <code>PipelinelatestRun</code>.
     * @alias module:model/PipelinelatestRun
     */
    constructor() { 
        
        PipelinelatestRun.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PipelinelatestRun</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PipelinelatestRun} obj Optional instance to populate.
     * @return {module:model/PipelinelatestRun} The populated <code>PipelinelatestRun</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PipelinelatestRun();

            if (data.hasOwnProperty('artifacts')) {
                obj['artifacts'] = ApiClient.convertToType(data['artifacts'], [PipelinelatestRunartifacts]);
            }
            if (data.hasOwnProperty('durationInMillis')) {
                obj['durationInMillis'] = ApiClient.convertToType(data['durationInMillis'], 'Number');
            }
            if (data.hasOwnProperty('estimatedDurationInMillis')) {
                obj['estimatedDurationInMillis'] = ApiClient.convertToType(data['estimatedDurationInMillis'], 'Number');
            }
            if (data.hasOwnProperty('enQueueTime')) {
                obj['enQueueTime'] = ApiClient.convertToType(data['enQueueTime'], 'String');
            }
            if (data.hasOwnProperty('endTime')) {
                obj['endTime'] = ApiClient.convertToType(data['endTime'], 'String');
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('organization')) {
                obj['organization'] = ApiClient.convertToType(data['organization'], 'String');
            }
            if (data.hasOwnProperty('pipeline')) {
                obj['pipeline'] = ApiClient.convertToType(data['pipeline'], 'String');
            }
            if (data.hasOwnProperty('result')) {
                obj['result'] = ApiClient.convertToType(data['result'], 'String');
            }
            if (data.hasOwnProperty('runSummary')) {
                obj['runSummary'] = ApiClient.convertToType(data['runSummary'], 'String');
            }
            if (data.hasOwnProperty('startTime')) {
                obj['startTime'] = ApiClient.convertToType(data['startTime'], 'String');
            }
            if (data.hasOwnProperty('state')) {
                obj['state'] = ApiClient.convertToType(data['state'], 'String');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('commitId')) {
                obj['commitId'] = ApiClient.convertToType(data['commitId'], 'String');
            }
            if (data.hasOwnProperty('_class')) {
                obj['_class'] = ApiClient.convertToType(data['_class'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<module:model/PipelinelatestRunartifacts>} artifacts
 */
PipelinelatestRun.prototype['artifacts'] = undefined;

/**
 * @member {Number} durationInMillis
 */
PipelinelatestRun.prototype['durationInMillis'] = undefined;

/**
 * @member {Number} estimatedDurationInMillis
 */
PipelinelatestRun.prototype['estimatedDurationInMillis'] = undefined;

/**
 * @member {String} enQueueTime
 */
PipelinelatestRun.prototype['enQueueTime'] = undefined;

/**
 * @member {String} endTime
 */
PipelinelatestRun.prototype['endTime'] = undefined;

/**
 * @member {String} id
 */
PipelinelatestRun.prototype['id'] = undefined;

/**
 * @member {String} organization
 */
PipelinelatestRun.prototype['organization'] = undefined;

/**
 * @member {String} pipeline
 */
PipelinelatestRun.prototype['pipeline'] = undefined;

/**
 * @member {String} result
 */
PipelinelatestRun.prototype['result'] = undefined;

/**
 * @member {String} runSummary
 */
PipelinelatestRun.prototype['runSummary'] = undefined;

/**
 * @member {String} startTime
 */
PipelinelatestRun.prototype['startTime'] = undefined;

/**
 * @member {String} state
 */
PipelinelatestRun.prototype['state'] = undefined;

/**
 * @member {String} type
 */
PipelinelatestRun.prototype['type'] = undefined;

/**
 * @member {String} commitId
 */
PipelinelatestRun.prototype['commitId'] = undefined;

/**
 * @member {String} _class
 */
PipelinelatestRun.prototype['_class'] = undefined;






export default PipelinelatestRun;

