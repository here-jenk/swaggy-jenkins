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
import GithubRepositorieslinks from './GithubRepositorieslinks';
import GithubRepository from './GithubRepository';

/**
 * The GithubRepositories model module.
 * @module model/GithubRepositories
 * @version 1.5.1-pre.0
 */
class GithubRepositories {
    /**
     * @member {String} _class
     * @type {String}
     */
    _class;
    /**
     * @member {GithubRepositorieslinks} _links
     * @type {GithubRepositorieslinks}
     */
    _links;
    /**
     * @member {Array.<CodegenProperty{openApiType='GithubRepository', baseName='items', complexType='GithubRepository', getter='getItems', setter='setItems', description='null', dataType='GithubRepository', datatypeWithEnum='GithubRepository', dataFormat='null', name='items', min='null', max='null', defaultValue='null', defaultValueWithParam=' = GithubRepository.constructFromObject(data['items']);', baseType='GithubRepository', containerType='null', title='null', unescapedDescription='null', maxLength=null, minLength=null, pattern='null', example='null', jsonSchema='{
  "$ref" : "#/components/schemas/GithubRepository"
}', minimum='null', maximum='null', exclusiveMinimum=false, exclusiveMaximum=false, required=false, deprecated=false, hasMoreNonReadOnly=false, isPrimitiveType=false, isModel=true, isContainer=false, isString=false, isNumeric=false, isInteger=false, isShort=false, isLong=false, isUnboundedInteger=false, isNumber=false, isFloat=false, isDouble=false, isDecimal=false, isByteArray=false, isBinary=false, isFile=false, isBoolean=false, isDate=false, isDateTime=false, isUuid=false, isUri=false, isEmail=false, isFreeFormObject=false, isArray=false, isMap=false, isEnum=false, isAnyType=false, isReadOnly=false, isWriteOnly=false, isNullable=false, isSelfReference=false, isCircularReference=false, isDiscriminator=false, _enum=null, allowableValues=null, items=null, additionalProperties=null, vars=[], requiredVars=[], mostInnerItems=null, vendorExtensions={}, hasValidation=false, isInherited=false, discriminatorValue='null', nameInCamelCase='Items', nameInSnakeCase='ITEMS', enumName='null', maxItems=null, minItems=null, maxProperties=null, minProperties=null, uniqueItems=false, multipleOf=null, isXmlAttribute=false, xmlPrefix='null', xmlName='null', xmlNamespace='null', isXmlWrapped=false, isNull=false, getAdditionalPropertiesIsAnyType=false, getHasVars=false, getHasRequired=false, getHasDiscriminatorWithNonEmptyMapping=false, composedSchemas=null, hasMultipleTypes=false}>} items
     * @type {Array.<CodegenProperty{openApiType='GithubRepository', baseName='items', complexType='GithubRepository', getter='getItems', setter='setItems', description='null', dataType='GithubRepository', datatypeWithEnum='GithubRepository', dataFormat='null', name='items', min='null', max='null', defaultValue='null', defaultValueWithParam=' = GithubRepository.constructFromObject(data['items']);', baseType='GithubRepository', containerType='null', title='null', unescapedDescription='null', maxLength=null, minLength=null, pattern='null', example='null', jsonSchema='{
  "$ref" : "#/components/schemas/GithubRepository"
}', minimum='null', maximum='null', exclusiveMinimum=false, exclusiveMaximum=false, required=false, deprecated=false, hasMoreNonReadOnly=false, isPrimitiveType=false, isModel=true, isContainer=false, isString=false, isNumeric=false, isInteger=false, isShort=false, isLong=false, isUnboundedInteger=false, isNumber=false, isFloat=false, isDouble=false, isDecimal=false, isByteArray=false, isBinary=false, isFile=false, isBoolean=false, isDate=false, isDateTime=false, isUuid=false, isUri=false, isEmail=false, isFreeFormObject=false, isArray=false, isMap=false, isEnum=false, isAnyType=false, isReadOnly=false, isWriteOnly=false, isNullable=false, isSelfReference=false, isCircularReference=false, isDiscriminator=false, _enum=null, allowableValues=null, items=null, additionalProperties=null, vars=[], requiredVars=[], mostInnerItems=null, vendorExtensions={}, hasValidation=false, isInherited=false, discriminatorValue='null', nameInCamelCase='Items', nameInSnakeCase='ITEMS', enumName='null', maxItems=null, minItems=null, maxProperties=null, minProperties=null, uniqueItems=false, multipleOf=null, isXmlAttribute=false, xmlPrefix='null', xmlName='null', xmlNamespace='null', isXmlWrapped=false, isNull=false, getAdditionalPropertiesIsAnyType=false, getHasVars=false, getHasRequired=false, getHasDiscriminatorWithNonEmptyMapping=false, composedSchemas=null, hasMultipleTypes=false}>}
     */
    items;
    /**
     * @member {Number} lastPage
     * @type {Number}
     */
    lastPage;
    /**
     * @member {Number} nextPage
     * @type {Number}
     */
    nextPage;
    /**
     * @member {Number} pageSize
     * @type {Number}
     */
    pageSize;

    

    /**
     * Constructs a new <code>GithubRepositories</code>.
     * @alias module:model/GithubRepositories
     */
    constructor() { 
        
        GithubRepositories.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>GithubRepositories</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GithubRepositories} obj Optional instance to populate.
     * @return {module:model/GithubRepositories} The populated <code>GithubRepositories</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GithubRepositories();

            if (data.hasOwnProperty('_class')) {
                obj['_class'] = ApiClient.convertToType(data['_class'], 'String');
            }
            if (data.hasOwnProperty('_links')) {
                obj['_links'] = GithubRepositorieslinks.constructFromObject(data['_links']);
            }
            if (data.hasOwnProperty('items')) {
                obj['items'] = ApiClient.convertToType(data['items'], [GithubRepository]);
            }
            if (data.hasOwnProperty('lastPage')) {
                obj['lastPage'] = ApiClient.convertToType(data['lastPage'], 'Number');
            }
            if (data.hasOwnProperty('nextPage')) {
                obj['nextPage'] = ApiClient.convertToType(data['nextPage'], 'Number');
            }
            if (data.hasOwnProperty('pageSize')) {
                obj['pageSize'] = ApiClient.convertToType(data['pageSize'], 'Number');
            }
        }
        return obj;
    }
}



export default GithubRepositories;

