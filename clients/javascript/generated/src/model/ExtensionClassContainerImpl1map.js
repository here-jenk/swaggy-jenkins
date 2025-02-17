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
import ExtensionClassImpl from './ExtensionClassImpl';

/**
 * The ExtensionClassContainerImpl1map model module.
 * @module model/ExtensionClassContainerImpl1map
 * @version 1.5.1-pre.0
 */
class ExtensionClassContainerImpl1map {
    /**
     * Constructs a new <code>ExtensionClassContainerImpl1map</code>.
     * @alias module:model/ExtensionClassContainerImpl1map
     */
    constructor() { 
        
        ExtensionClassContainerImpl1map.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ExtensionClassContainerImpl1map</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ExtensionClassContainerImpl1map} obj Optional instance to populate.
     * @return {module:model/ExtensionClassContainerImpl1map} The populated <code>ExtensionClassContainerImpl1map</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ExtensionClassContainerImpl1map();

            if (data.hasOwnProperty('io.jenkins.blueocean.service.embedded.rest.PipelineImpl')) {
                obj['io.jenkins.blueocean.service.embedded.rest.PipelineImpl'] = ExtensionClassImpl.constructFromObject(data['io.jenkins.blueocean.service.embedded.rest.PipelineImpl']);
            }
            if (data.hasOwnProperty('io.jenkins.blueocean.service.embedded.rest.MultiBranchPipelineImpl')) {
                obj['io.jenkins.blueocean.service.embedded.rest.MultiBranchPipelineImpl'] = ExtensionClassImpl.constructFromObject(data['io.jenkins.blueocean.service.embedded.rest.MultiBranchPipelineImpl']);
            }
            if (data.hasOwnProperty('_class')) {
                obj['_class'] = ApiClient.convertToType(data['_class'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ExtensionClassImpl} io.jenkins.blueocean.service.embedded.rest.PipelineImpl
 */
ExtensionClassContainerImpl1map.prototype['io.jenkins.blueocean.service.embedded.rest.PipelineImpl'] = undefined;

/**
 * @member {module:model/ExtensionClassImpl} io.jenkins.blueocean.service.embedded.rest.MultiBranchPipelineImpl
 */
ExtensionClassContainerImpl1map.prototype['io.jenkins.blueocean.service.embedded.rest.MultiBranchPipelineImpl'] = undefined;

/**
 * @member {String} _class
 */
ExtensionClassContainerImpl1map.prototype['_class'] = undefined;






export default ExtensionClassContainerImpl1map;

