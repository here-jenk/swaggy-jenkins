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
import Link from './Link';

/**
 * The PipelineRunImpllinks model module.
 * @module model/PipelineRunImpllinks
 * @version 1.5.1-pre.0
 */
class PipelineRunImpllinks {
    /**
     * Constructs a new <code>PipelineRunImpllinks</code>.
     * @alias module:model/PipelineRunImpllinks
     */
    constructor() { 
        
        PipelineRunImpllinks.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PipelineRunImpllinks</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PipelineRunImpllinks} obj Optional instance to populate.
     * @return {module:model/PipelineRunImpllinks} The populated <code>PipelineRunImpllinks</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PipelineRunImpllinks();

            if (data.hasOwnProperty('nodes')) {
                obj['nodes'] = Link.constructFromObject(data['nodes']);
            }
            if (data.hasOwnProperty('log')) {
                obj['log'] = Link.constructFromObject(data['log']);
            }
            if (data.hasOwnProperty('self')) {
                obj['self'] = Link.constructFromObject(data['self']);
            }
            if (data.hasOwnProperty('actions')) {
                obj['actions'] = Link.constructFromObject(data['actions']);
            }
            if (data.hasOwnProperty('steps')) {
                obj['steps'] = Link.constructFromObject(data['steps']);
            }
            if (data.hasOwnProperty('_class')) {
                obj['_class'] = ApiClient.convertToType(data['_class'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/Link} nodes
 */
PipelineRunImpllinks.prototype['nodes'] = undefined;

/**
 * @member {module:model/Link} log
 */
PipelineRunImpllinks.prototype['log'] = undefined;

/**
 * @member {module:model/Link} self
 */
PipelineRunImpllinks.prototype['self'] = undefined;

/**
 * @member {module:model/Link} actions
 */
PipelineRunImpllinks.prototype['actions'] = undefined;

/**
 * @member {module:model/Link} steps
 */
PipelineRunImpllinks.prototype['steps'] = undefined;

/**
 * @member {String} _class
 */
PipelineRunImpllinks.prototype['_class'] = undefined;






export default PipelineRunImpllinks;

