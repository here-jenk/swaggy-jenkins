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
import FreeStyleBuild from './FreeStyleBuild';

/**
 * The HudsonMasterComputerexecutors model module.
 * @module model/HudsonMasterComputerexecutors
 * @version 1.5.1-pre.0
 */
class HudsonMasterComputerexecutors {
    /**
     * Constructs a new <code>HudsonMasterComputerexecutors</code>.
     * @alias module:model/HudsonMasterComputerexecutors
     */
    constructor() { 
        
        HudsonMasterComputerexecutors.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>HudsonMasterComputerexecutors</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/HudsonMasterComputerexecutors} obj Optional instance to populate.
     * @return {module:model/HudsonMasterComputerexecutors} The populated <code>HudsonMasterComputerexecutors</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new HudsonMasterComputerexecutors();

            if (data.hasOwnProperty('currentExecutable')) {
                obj['currentExecutable'] = FreeStyleBuild.constructFromObject(data['currentExecutable']);
            }
            if (data.hasOwnProperty('idle')) {
                obj['idle'] = ApiClient.convertToType(data['idle'], 'Boolean');
            }
            if (data.hasOwnProperty('likelyStuck')) {
                obj['likelyStuck'] = ApiClient.convertToType(data['likelyStuck'], 'Boolean');
            }
            if (data.hasOwnProperty('number')) {
                obj['number'] = ApiClient.convertToType(data['number'], 'Number');
            }
            if (data.hasOwnProperty('progress')) {
                obj['progress'] = ApiClient.convertToType(data['progress'], 'Number');
            }
            if (data.hasOwnProperty('_class')) {
                obj['_class'] = ApiClient.convertToType(data['_class'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/FreeStyleBuild} currentExecutable
 */
HudsonMasterComputerexecutors.prototype['currentExecutable'] = undefined;

/**
 * @member {Boolean} idle
 */
HudsonMasterComputerexecutors.prototype['idle'] = undefined;

/**
 * @member {Boolean} likelyStuck
 */
HudsonMasterComputerexecutors.prototype['likelyStuck'] = undefined;

/**
 * @member {Number} number
 */
HudsonMasterComputerexecutors.prototype['number'] = undefined;

/**
 * @member {Number} progress
 */
HudsonMasterComputerexecutors.prototype['progress'] = undefined;

/**
 * @member {String} _class
 */
HudsonMasterComputerexecutors.prototype['_class'] = undefined;






export default HudsonMasterComputerexecutors;

