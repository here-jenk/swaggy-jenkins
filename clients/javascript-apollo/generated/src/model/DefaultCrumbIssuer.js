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
 * The DefaultCrumbIssuer model module.
 * @module model/DefaultCrumbIssuer
 * @version 1.5.1-pre.0
 */
class DefaultCrumbIssuer {
    /**
     * @member {String} _class
     * @type {String}
     */
    _class;
    /**
     * @member {String} crumb
     * @type {String}
     */
    crumb;
    /**
     * @member {String} crumbRequestField
     * @type {String}
     */
    crumbRequestField;

    

    /**
     * Constructs a new <code>DefaultCrumbIssuer</code>.
     * @alias module:model/DefaultCrumbIssuer
     */
    constructor() { 
        
        DefaultCrumbIssuer.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>DefaultCrumbIssuer</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/DefaultCrumbIssuer} obj Optional instance to populate.
     * @return {module:model/DefaultCrumbIssuer} The populated <code>DefaultCrumbIssuer</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DefaultCrumbIssuer();

            if (data.hasOwnProperty('_class')) {
                obj['_class'] = ApiClient.convertToType(data['_class'], 'String');
            }
            if (data.hasOwnProperty('crumb')) {
                obj['crumb'] = ApiClient.convertToType(data['crumb'], 'String');
            }
            if (data.hasOwnProperty('crumbRequestField')) {
                obj['crumbRequestField'] = ApiClient.convertToType(data['crumbRequestField'], 'String');
            }
        }
        return obj;
    }
}



export default DefaultCrumbIssuer;

