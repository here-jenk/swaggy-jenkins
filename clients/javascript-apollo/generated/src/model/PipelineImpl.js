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
import PipelineImpllinks from './PipelineImpllinks';

/**
 * The PipelineImpl model module.
 * @module model/PipelineImpl
 * @version 1.5.1-pre.0
 */
class PipelineImpl {
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
     * @member {Number} estimatedDurationInMillis
     * @type {Number}
     */
    estimatedDurationInMillis;
    /**
     * @member {String} fullName
     * @type {String}
     */
    fullName;
    /**
     * @member {String} latestRun
     * @type {String}
     */
    latestRun;
    /**
     * @member {String} name
     * @type {String}
     */
    name;
    /**
     * @member {String} organization
     * @type {String}
     */
    organization;
    /**
     * @member {Number} weatherScore
     * @type {Number}
     */
    weatherScore;
    /**
     * @member {PipelineImpllinks} _links
     * @type {PipelineImpllinks}
     */
    _links;

    

    /**
     * Constructs a new <code>PipelineImpl</code>.
     * @alias module:model/PipelineImpl
     */
    constructor() { 
        
        PipelineImpl.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PipelineImpl</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PipelineImpl} obj Optional instance to populate.
     * @return {module:model/PipelineImpl} The populated <code>PipelineImpl</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PipelineImpl();

            if (data.hasOwnProperty('_class')) {
                obj['_class'] = ApiClient.convertToType(data['_class'], 'String');
            }
            if (data.hasOwnProperty('displayName')) {
                obj['displayName'] = ApiClient.convertToType(data['displayName'], 'String');
            }
            if (data.hasOwnProperty('estimatedDurationInMillis')) {
                obj['estimatedDurationInMillis'] = ApiClient.convertToType(data['estimatedDurationInMillis'], 'Number');
            }
            if (data.hasOwnProperty('fullName')) {
                obj['fullName'] = ApiClient.convertToType(data['fullName'], 'String');
            }
            if (data.hasOwnProperty('latestRun')) {
                obj['latestRun'] = ApiClient.convertToType(data['latestRun'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('organization')) {
                obj['organization'] = ApiClient.convertToType(data['organization'], 'String');
            }
            if (data.hasOwnProperty('weatherScore')) {
                obj['weatherScore'] = ApiClient.convertToType(data['weatherScore'], 'Number');
            }
            if (data.hasOwnProperty('_links')) {
                obj['_links'] = PipelineImpllinks.constructFromObject(data['_links']);
            }
        }
        return obj;
    }
}



export default PipelineImpl;

