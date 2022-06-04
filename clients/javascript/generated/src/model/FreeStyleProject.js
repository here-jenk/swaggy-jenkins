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
import FreeStyleProjectactions from './FreeStyleProjectactions';
import FreeStyleProjecthealthReport from './FreeStyleProjecthealthReport';
import NullSCM from './NullSCM';

/**
 * The FreeStyleProject model module.
 * @module model/FreeStyleProject
 * @version 1.5.1-pre.0
 */
class FreeStyleProject {
    /**
     * Constructs a new <code>FreeStyleProject</code>.
     * @alias module:model/FreeStyleProject
     */
    constructor() { 
        
        FreeStyleProject.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FreeStyleProject</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FreeStyleProject} obj Optional instance to populate.
     * @return {module:model/FreeStyleProject} The populated <code>FreeStyleProject</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FreeStyleProject();

            if (data.hasOwnProperty('_class')) {
                obj['_class'] = ApiClient.convertToType(data['_class'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('url')) {
                obj['url'] = ApiClient.convertToType(data['url'], 'String');
            }
            if (data.hasOwnProperty('color')) {
                obj['color'] = ApiClient.convertToType(data['color'], 'String');
            }
            if (data.hasOwnProperty('actions')) {
                obj['actions'] = ApiClient.convertToType(data['actions'], [FreeStyleProjectactions]);
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('displayName')) {
                obj['displayName'] = ApiClient.convertToType(data['displayName'], 'String');
            }
            if (data.hasOwnProperty('displayNameOrNull')) {
                obj['displayNameOrNull'] = ApiClient.convertToType(data['displayNameOrNull'], 'String');
            }
            if (data.hasOwnProperty('fullDisplayName')) {
                obj['fullDisplayName'] = ApiClient.convertToType(data['fullDisplayName'], 'String');
            }
            if (data.hasOwnProperty('fullName')) {
                obj['fullName'] = ApiClient.convertToType(data['fullName'], 'String');
            }
            if (data.hasOwnProperty('buildable')) {
                obj['buildable'] = ApiClient.convertToType(data['buildable'], 'Boolean');
            }
            if (data.hasOwnProperty('builds')) {
                obj['builds'] = ApiClient.convertToType(data['builds'], [FreeStyleBuild]);
            }
            if (data.hasOwnProperty('firstBuild')) {
                obj['firstBuild'] = FreeStyleBuild.constructFromObject(data['firstBuild']);
            }
            if (data.hasOwnProperty('healthReport')) {
                obj['healthReport'] = ApiClient.convertToType(data['healthReport'], [FreeStyleProjecthealthReport]);
            }
            if (data.hasOwnProperty('inQueue')) {
                obj['inQueue'] = ApiClient.convertToType(data['inQueue'], 'Boolean');
            }
            if (data.hasOwnProperty('keepDependencies')) {
                obj['keepDependencies'] = ApiClient.convertToType(data['keepDependencies'], 'Boolean');
            }
            if (data.hasOwnProperty('lastBuild')) {
                obj['lastBuild'] = FreeStyleBuild.constructFromObject(data['lastBuild']);
            }
            if (data.hasOwnProperty('lastCompletedBuild')) {
                obj['lastCompletedBuild'] = FreeStyleBuild.constructFromObject(data['lastCompletedBuild']);
            }
            if (data.hasOwnProperty('lastFailedBuild')) {
                obj['lastFailedBuild'] = ApiClient.convertToType(data['lastFailedBuild'], 'String');
            }
            if (data.hasOwnProperty('lastStableBuild')) {
                obj['lastStableBuild'] = FreeStyleBuild.constructFromObject(data['lastStableBuild']);
            }
            if (data.hasOwnProperty('lastSuccessfulBuild')) {
                obj['lastSuccessfulBuild'] = FreeStyleBuild.constructFromObject(data['lastSuccessfulBuild']);
            }
            if (data.hasOwnProperty('lastUnstableBuild')) {
                obj['lastUnstableBuild'] = ApiClient.convertToType(data['lastUnstableBuild'], 'String');
            }
            if (data.hasOwnProperty('lastUnsuccessfulBuild')) {
                obj['lastUnsuccessfulBuild'] = ApiClient.convertToType(data['lastUnsuccessfulBuild'], 'String');
            }
            if (data.hasOwnProperty('nextBuildNumber')) {
                obj['nextBuildNumber'] = ApiClient.convertToType(data['nextBuildNumber'], 'Number');
            }
            if (data.hasOwnProperty('queueItem')) {
                obj['queueItem'] = ApiClient.convertToType(data['queueItem'], 'String');
            }
            if (data.hasOwnProperty('concurrentBuild')) {
                obj['concurrentBuild'] = ApiClient.convertToType(data['concurrentBuild'], 'Boolean');
            }
            if (data.hasOwnProperty('scm')) {
                obj['scm'] = NullSCM.constructFromObject(data['scm']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} _class
 */
FreeStyleProject.prototype['_class'] = undefined;

/**
 * @member {String} name
 */
FreeStyleProject.prototype['name'] = undefined;

/**
 * @member {String} url
 */
FreeStyleProject.prototype['url'] = undefined;

/**
 * @member {String} color
 */
FreeStyleProject.prototype['color'] = undefined;

/**
 * @member {Array.<module:model/FreeStyleProjectactions>} actions
 */
FreeStyleProject.prototype['actions'] = undefined;

/**
 * @member {String} description
 */
FreeStyleProject.prototype['description'] = undefined;

/**
 * @member {String} displayName
 */
FreeStyleProject.prototype['displayName'] = undefined;

/**
 * @member {String} displayNameOrNull
 */
FreeStyleProject.prototype['displayNameOrNull'] = undefined;

/**
 * @member {String} fullDisplayName
 */
FreeStyleProject.prototype['fullDisplayName'] = undefined;

/**
 * @member {String} fullName
 */
FreeStyleProject.prototype['fullName'] = undefined;

/**
 * @member {Boolean} buildable
 */
FreeStyleProject.prototype['buildable'] = undefined;

/**
 * @member {Array.<module:model/FreeStyleBuild>} builds
 */
FreeStyleProject.prototype['builds'] = undefined;

/**
 * @member {module:model/FreeStyleBuild} firstBuild
 */
FreeStyleProject.prototype['firstBuild'] = undefined;

/**
 * @member {Array.<module:model/FreeStyleProjecthealthReport>} healthReport
 */
FreeStyleProject.prototype['healthReport'] = undefined;

/**
 * @member {Boolean} inQueue
 */
FreeStyleProject.prototype['inQueue'] = undefined;

/**
 * @member {Boolean} keepDependencies
 */
FreeStyleProject.prototype['keepDependencies'] = undefined;

/**
 * @member {module:model/FreeStyleBuild} lastBuild
 */
FreeStyleProject.prototype['lastBuild'] = undefined;

/**
 * @member {module:model/FreeStyleBuild} lastCompletedBuild
 */
FreeStyleProject.prototype['lastCompletedBuild'] = undefined;

/**
 * @member {String} lastFailedBuild
 */
FreeStyleProject.prototype['lastFailedBuild'] = undefined;

/**
 * @member {module:model/FreeStyleBuild} lastStableBuild
 */
FreeStyleProject.prototype['lastStableBuild'] = undefined;

/**
 * @member {module:model/FreeStyleBuild} lastSuccessfulBuild
 */
FreeStyleProject.prototype['lastSuccessfulBuild'] = undefined;

/**
 * @member {String} lastUnstableBuild
 */
FreeStyleProject.prototype['lastUnstableBuild'] = undefined;

/**
 * @member {String} lastUnsuccessfulBuild
 */
FreeStyleProject.prototype['lastUnsuccessfulBuild'] = undefined;

/**
 * @member {Number} nextBuildNumber
 */
FreeStyleProject.prototype['nextBuildNumber'] = undefined;

/**
 * @member {String} queueItem
 */
FreeStyleProject.prototype['queueItem'] = undefined;

/**
 * @member {Boolean} concurrentBuild
 */
FreeStyleProject.prototype['concurrentBuild'] = undefined;

/**
 * @member {module:model/NullSCM} scm
 */
FreeStyleProject.prototype['scm'] = undefined;






export default FreeStyleProject;

