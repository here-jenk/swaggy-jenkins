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
import CauseAction from './CauseAction';
import EmptyChangeLogSet from './EmptyChangeLogSet';

/**
 * The FreeStyleBuild model module.
 * @module model/FreeStyleBuild
 * @version 1.5.1-pre.0
 */
class FreeStyleBuild {
    /**
     * Constructs a new <code>FreeStyleBuild</code>.
     * @alias module:model/FreeStyleBuild
     */
    constructor() { 
        
        FreeStyleBuild.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FreeStyleBuild</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FreeStyleBuild} obj Optional instance to populate.
     * @return {module:model/FreeStyleBuild} The populated <code>FreeStyleBuild</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FreeStyleBuild();

            if (data.hasOwnProperty('_class')) {
                obj['_class'] = ApiClient.convertToType(data['_class'], 'String');
            }
            if (data.hasOwnProperty('number')) {
                obj['number'] = ApiClient.convertToType(data['number'], 'Number');
            }
            if (data.hasOwnProperty('url')) {
                obj['url'] = ApiClient.convertToType(data['url'], 'String');
            }
            if (data.hasOwnProperty('actions')) {
                obj['actions'] = ApiClient.convertToType(data['actions'], [CauseAction]);
            }
            if (data.hasOwnProperty('building')) {
                obj['building'] = ApiClient.convertToType(data['building'], 'Boolean');
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('displayName')) {
                obj['displayName'] = ApiClient.convertToType(data['displayName'], 'String');
            }
            if (data.hasOwnProperty('duration')) {
                obj['duration'] = ApiClient.convertToType(data['duration'], 'Number');
            }
            if (data.hasOwnProperty('estimatedDuration')) {
                obj['estimatedDuration'] = ApiClient.convertToType(data['estimatedDuration'], 'Number');
            }
            if (data.hasOwnProperty('executor')) {
                obj['executor'] = ApiClient.convertToType(data['executor'], 'String');
            }
            if (data.hasOwnProperty('fullDisplayName')) {
                obj['fullDisplayName'] = ApiClient.convertToType(data['fullDisplayName'], 'String');
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('keepLog')) {
                obj['keepLog'] = ApiClient.convertToType(data['keepLog'], 'Boolean');
            }
            if (data.hasOwnProperty('queueId')) {
                obj['queueId'] = ApiClient.convertToType(data['queueId'], 'Number');
            }
            if (data.hasOwnProperty('result')) {
                obj['result'] = ApiClient.convertToType(data['result'], 'String');
            }
            if (data.hasOwnProperty('timestamp')) {
                obj['timestamp'] = ApiClient.convertToType(data['timestamp'], 'Number');
            }
            if (data.hasOwnProperty('builtOn')) {
                obj['builtOn'] = ApiClient.convertToType(data['builtOn'], 'String');
            }
            if (data.hasOwnProperty('changeSet')) {
                obj['changeSet'] = EmptyChangeLogSet.constructFromObject(data['changeSet']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} _class
 */
FreeStyleBuild.prototype['_class'] = undefined;

/**
 * @member {Number} number
 */
FreeStyleBuild.prototype['number'] = undefined;

/**
 * @member {String} url
 */
FreeStyleBuild.prototype['url'] = undefined;

/**
 * @member {Array.<module:model/CauseAction>} actions
 */
FreeStyleBuild.prototype['actions'] = undefined;

/**
 * @member {Boolean} building
 */
FreeStyleBuild.prototype['building'] = undefined;

/**
 * @member {String} description
 */
FreeStyleBuild.prototype['description'] = undefined;

/**
 * @member {String} displayName
 */
FreeStyleBuild.prototype['displayName'] = undefined;

/**
 * @member {Number} duration
 */
FreeStyleBuild.prototype['duration'] = undefined;

/**
 * @member {Number} estimatedDuration
 */
FreeStyleBuild.prototype['estimatedDuration'] = undefined;

/**
 * @member {String} executor
 */
FreeStyleBuild.prototype['executor'] = undefined;

/**
 * @member {String} fullDisplayName
 */
FreeStyleBuild.prototype['fullDisplayName'] = undefined;

/**
 * @member {String} id
 */
FreeStyleBuild.prototype['id'] = undefined;

/**
 * @member {Boolean} keepLog
 */
FreeStyleBuild.prototype['keepLog'] = undefined;

/**
 * @member {Number} queueId
 */
FreeStyleBuild.prototype['queueId'] = undefined;

/**
 * @member {String} result
 */
FreeStyleBuild.prototype['result'] = undefined;

/**
 * @member {Number} timestamp
 */
FreeStyleBuild.prototype['timestamp'] = undefined;

/**
 * @member {String} builtOn
 */
FreeStyleBuild.prototype['builtOn'] = undefined;

/**
 * @member {module:model/EmptyChangeLogSet} changeSet
 */
FreeStyleBuild.prototype['changeSet'] = undefined;






export default FreeStyleBuild;

