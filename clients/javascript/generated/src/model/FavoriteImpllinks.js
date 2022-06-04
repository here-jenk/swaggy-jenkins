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
 * The FavoriteImpllinks model module.
 * @module model/FavoriteImpllinks
 * @version 1.5.1-pre.0
 */
class FavoriteImpllinks {
    /**
     * Constructs a new <code>FavoriteImpllinks</code>.
     * @alias module:model/FavoriteImpllinks
     */
    constructor() { 
        
        FavoriteImpllinks.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FavoriteImpllinks</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FavoriteImpllinks} obj Optional instance to populate.
     * @return {module:model/FavoriteImpllinks} The populated <code>FavoriteImpllinks</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FavoriteImpllinks();

            if (data.hasOwnProperty('self')) {
                obj['self'] = Link.constructFromObject(data['self']);
            }
            if (data.hasOwnProperty('_class')) {
                obj['_class'] = ApiClient.convertToType(data['_class'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/Link} self
 */
FavoriteImpllinks.prototype['self'] = undefined;

/**
 * @member {String} _class
 */
FavoriteImpllinks.prototype['_class'] = undefined;






export default FavoriteImpllinks;

