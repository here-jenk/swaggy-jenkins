/**
 * Swaggy Jenkins
 * Jenkins API clients generated from Swagger / Open API specification
 *
 * The version of the OpenAPI document: 1.1.2-pre.0
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import FavoriteImpllinks from './FavoriteImpllinks';
import PipelineImpl from './PipelineImpl';

/**
 * The FavoriteImpl model module.
 * @module model/FavoriteImpl
 * @version 1.1.2-pre.0
 */
class FavoriteImpl {
    /**
     * @member {String} _class
     * @type {String}
     */
    _class;
    /**
     * @member {FavoriteImpllinks} _links
     * @type {FavoriteImpllinks}
     */
    _links;
    /**
     * @member {PipelineImpl} item
     * @type {PipelineImpl}
     */
    item;

    

    /**
     * Constructs a new <code>FavoriteImpl</code>.
     * @alias module:model/FavoriteImpl
     */
    constructor() { 
        
        FavoriteImpl.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FavoriteImpl</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FavoriteImpl} obj Optional instance to populate.
     * @return {module:model/FavoriteImpl} The populated <code>FavoriteImpl</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FavoriteImpl();

            if (data.hasOwnProperty('_class')) {
                obj['_class'] = ApiClient.convertToType(data['_class'], 'String');
            }
            if (data.hasOwnProperty('_links')) {
                obj['_links'] = FavoriteImpllinks.constructFromObject(data['_links']);
            }
            if (data.hasOwnProperty('item')) {
                obj['item'] = PipelineImpl.constructFromObject(data['item']);
            }
        }
        return obj;
    }
}



export default FavoriteImpl;

