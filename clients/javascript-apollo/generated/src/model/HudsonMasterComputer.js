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
import HudsonMasterComputerexecutors from './HudsonMasterComputerexecutors';
import HudsonMasterComputermonitorData from './HudsonMasterComputermonitorData';
import Label1 from './Label1';

/**
 * The HudsonMasterComputer model module.
 * @module model/HudsonMasterComputer
 * @version 1.1.2-pre.0
 */
class HudsonMasterComputer {
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
     * @member {Array.<CodegenProperty{openApiType='HudsonMasterComputerexecutors', baseName='executors', complexType='HudsonMasterComputerexecutors', getter='getExecutors', setter='setExecutors', description='null', dataType='HudsonMasterComputerexecutors', datatypeWithEnum='HudsonMasterComputerexecutors', dataFormat='null', name='executors', min='null', max='null', defaultValue='null', defaultValueWithParam=' = HudsonMasterComputerexecutors.constructFromObject(data['executors']);', baseType='HudsonMasterComputerexecutors', containerType='null', title='null', unescapedDescription='null', maxLength=null, minLength=null, pattern='null', example='null', jsonSchema='{
  "$ref" : "#/components/schemas/HudsonMasterComputerexecutors"
}', minimum='null', maximum='null', exclusiveMinimum=false, exclusiveMaximum=false, required=false, deprecated=false, hasMoreNonReadOnly=false, isPrimitiveType=false, isModel=true, isContainer=false, isString=false, isNumeric=false, isInteger=false, isShort=false, isLong=false, isUnboundedInteger=false, isNumber=false, isFloat=false, isDouble=false, isDecimal=false, isByteArray=false, isBinary=false, isFile=false, isBoolean=false, isDate=false, isDateTime=false, isUuid=false, isUri=false, isEmail=false, isFreeFormObject=false, isArray=false, isMap=false, isEnum=false, isReadOnly=false, isWriteOnly=false, isNullable=false, isSelfReference=false, isCircularReference=false, isDiscriminator=false, _enum=null, allowableValues=null, items=null, additionalProperties=null, vars=[], requiredVars=[], mostInnerItems=null, vendorExtensions={}, hasValidation=false, isInherited=false, discriminatorValue='null', nameInCamelCase='Executors', nameInSnakeCase='EXECUTORS', enumName='null', maxItems=null, minItems=null, maxProperties=null, minProperties=null, uniqueItems=false, multipleOf=null, isXmlAttribute=false, xmlPrefix='null', xmlName='null', xmlNamespace='null', isXmlWrapped=false, isNull=false, getAdditionalPropertiesIsAnyType=false, getHasVars=false, getHasRequired=false, getHasDiscriminatorWithNonEmptyMapping=false, composedSchemas=null, hasMultipleTypes=false}>} executors
     * @type {Array.<CodegenProperty{openApiType='HudsonMasterComputerexecutors', baseName='executors', complexType='HudsonMasterComputerexecutors', getter='getExecutors', setter='setExecutors', description='null', dataType='HudsonMasterComputerexecutors', datatypeWithEnum='HudsonMasterComputerexecutors', dataFormat='null', name='executors', min='null', max='null', defaultValue='null', defaultValueWithParam=' = HudsonMasterComputerexecutors.constructFromObject(data['executors']);', baseType='HudsonMasterComputerexecutors', containerType='null', title='null', unescapedDescription='null', maxLength=null, minLength=null, pattern='null', example='null', jsonSchema='{
  "$ref" : "#/components/schemas/HudsonMasterComputerexecutors"
}', minimum='null', maximum='null', exclusiveMinimum=false, exclusiveMaximum=false, required=false, deprecated=false, hasMoreNonReadOnly=false, isPrimitiveType=false, isModel=true, isContainer=false, isString=false, isNumeric=false, isInteger=false, isShort=false, isLong=false, isUnboundedInteger=false, isNumber=false, isFloat=false, isDouble=false, isDecimal=false, isByteArray=false, isBinary=false, isFile=false, isBoolean=false, isDate=false, isDateTime=false, isUuid=false, isUri=false, isEmail=false, isFreeFormObject=false, isArray=false, isMap=false, isEnum=false, isReadOnly=false, isWriteOnly=false, isNullable=false, isSelfReference=false, isCircularReference=false, isDiscriminator=false, _enum=null, allowableValues=null, items=null, additionalProperties=null, vars=[], requiredVars=[], mostInnerItems=null, vendorExtensions={}, hasValidation=false, isInherited=false, discriminatorValue='null', nameInCamelCase='Executors', nameInSnakeCase='EXECUTORS', enumName='null', maxItems=null, minItems=null, maxProperties=null, minProperties=null, uniqueItems=false, multipleOf=null, isXmlAttribute=false, xmlPrefix='null', xmlName='null', xmlNamespace='null', isXmlWrapped=false, isNull=false, getAdditionalPropertiesIsAnyType=false, getHasVars=false, getHasRequired=false, getHasDiscriminatorWithNonEmptyMapping=false, composedSchemas=null, hasMultipleTypes=false}>}
     */
    executors;
    /**
     * @member {String} icon
     * @type {String}
     */
    icon;
    /**
     * @member {String} iconClassName
     * @type {String}
     */
    iconClassName;
    /**
     * @member {Boolean} idle
     * @type {Boolean}
     */
    idle;
    /**
     * @member {Boolean} jnlpAgent
     * @type {Boolean}
     */
    jnlpAgent;
    /**
     * @member {Boolean} launchSupported
     * @type {Boolean}
     */
    launchSupported;
    /**
     * @member {Label1} loadStatistics
     * @type {Label1}
     */
    loadStatistics;
    /**
     * @member {Boolean} manualLaunchAllowed
     * @type {Boolean}
     */
    manualLaunchAllowed;
    /**
     * @member {HudsonMasterComputermonitorData} monitorData
     * @type {HudsonMasterComputermonitorData}
     */
    monitorData;
    /**
     * @member {Number} numExecutors
     * @type {Number}
     */
    numExecutors;
    /**
     * @member {Boolean} offline
     * @type {Boolean}
     */
    offline;
    /**
     * @member {String} offlineCause
     * @type {String}
     */
    offlineCause;
    /**
     * @member {String} offlineCauseReason
     * @type {String}
     */
    offlineCauseReason;
    /**
     * @member {Boolean} temporarilyOffline
     * @type {Boolean}
     */
    temporarilyOffline;

    

    /**
     * Constructs a new <code>HudsonMasterComputer</code>.
     * @alias module:model/HudsonMasterComputer
     */
    constructor() { 
        
        HudsonMasterComputer.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>HudsonMasterComputer</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/HudsonMasterComputer} obj Optional instance to populate.
     * @return {module:model/HudsonMasterComputer} The populated <code>HudsonMasterComputer</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new HudsonMasterComputer();

            if (data.hasOwnProperty('_class')) {
                obj['_class'] = ApiClient.convertToType(data['_class'], 'String');
            }
            if (data.hasOwnProperty('displayName')) {
                obj['displayName'] = ApiClient.convertToType(data['displayName'], 'String');
            }
            if (data.hasOwnProperty('executors')) {
                obj['executors'] = ApiClient.convertToType(data['executors'], [HudsonMasterComputerexecutors]);
            }
            if (data.hasOwnProperty('icon')) {
                obj['icon'] = ApiClient.convertToType(data['icon'], 'String');
            }
            if (data.hasOwnProperty('iconClassName')) {
                obj['iconClassName'] = ApiClient.convertToType(data['iconClassName'], 'String');
            }
            if (data.hasOwnProperty('idle')) {
                obj['idle'] = ApiClient.convertToType(data['idle'], 'Boolean');
            }
            if (data.hasOwnProperty('jnlpAgent')) {
                obj['jnlpAgent'] = ApiClient.convertToType(data['jnlpAgent'], 'Boolean');
            }
            if (data.hasOwnProperty('launchSupported')) {
                obj['launchSupported'] = ApiClient.convertToType(data['launchSupported'], 'Boolean');
            }
            if (data.hasOwnProperty('loadStatistics')) {
                obj['loadStatistics'] = Label1.constructFromObject(data['loadStatistics']);
            }
            if (data.hasOwnProperty('manualLaunchAllowed')) {
                obj['manualLaunchAllowed'] = ApiClient.convertToType(data['manualLaunchAllowed'], 'Boolean');
            }
            if (data.hasOwnProperty('monitorData')) {
                obj['monitorData'] = HudsonMasterComputermonitorData.constructFromObject(data['monitorData']);
            }
            if (data.hasOwnProperty('numExecutors')) {
                obj['numExecutors'] = ApiClient.convertToType(data['numExecutors'], 'Number');
            }
            if (data.hasOwnProperty('offline')) {
                obj['offline'] = ApiClient.convertToType(data['offline'], 'Boolean');
            }
            if (data.hasOwnProperty('offlineCause')) {
                obj['offlineCause'] = ApiClient.convertToType(data['offlineCause'], 'String');
            }
            if (data.hasOwnProperty('offlineCauseReason')) {
                obj['offlineCauseReason'] = ApiClient.convertToType(data['offlineCauseReason'], 'String');
            }
            if (data.hasOwnProperty('temporarilyOffline')) {
                obj['temporarilyOffline'] = ApiClient.convertToType(data['temporarilyOffline'], 'Boolean');
            }
        }
        return obj;
    }
}



export default HudsonMasterComputer;

