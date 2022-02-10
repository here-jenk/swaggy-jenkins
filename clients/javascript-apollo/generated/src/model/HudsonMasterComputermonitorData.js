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
import ClockDifference from './ClockDifference';
import DiskSpaceMonitorDescriptorDiskSpace from './DiskSpaceMonitorDescriptorDiskSpace';
import ResponseTimeMonitorData from './ResponseTimeMonitorData';
import SwapSpaceMonitorMemoryUsage2 from './SwapSpaceMonitorMemoryUsage2';

/**
 * The HudsonMasterComputermonitorData model module.
 * @module model/HudsonMasterComputermonitorData
 * @version 1.1.2-pre.0
 */
class HudsonMasterComputermonitorData {
    /**
     * @member {SwapSpaceMonitorMemoryUsage2} hudson.node_monitors.SwapSpaceMonitor
     * @type {SwapSpaceMonitorMemoryUsage2}
     */
    hudson.node_monitors.SwapSpaceMonitor;
    /**
     * @member {DiskSpaceMonitorDescriptorDiskSpace} hudson.node_monitors.TemporarySpaceMonitor
     * @type {DiskSpaceMonitorDescriptorDiskSpace}
     */
    hudson.node_monitors.TemporarySpaceMonitor;
    /**
     * @member {DiskSpaceMonitorDescriptorDiskSpace} hudson.node_monitors.DiskSpaceMonitor
     * @type {DiskSpaceMonitorDescriptorDiskSpace}
     */
    hudson.node_monitors.DiskSpaceMonitor;
    /**
     * @member {String} hudson.node_monitors.ArchitectureMonitor
     * @type {String}
     */
    hudson.node_monitors.ArchitectureMonitor;
    /**
     * @member {ResponseTimeMonitorData} hudson.node_monitors.ResponseTimeMonitor
     * @type {ResponseTimeMonitorData}
     */
    hudson.node_monitors.ResponseTimeMonitor;
    /**
     * @member {ClockDifference} hudson.node_monitors.ClockMonitor
     * @type {ClockDifference}
     */
    hudson.node_monitors.ClockMonitor;
    /**
     * @member {String} _class
     * @type {String}
     */
    _class;

    

    /**
     * Constructs a new <code>HudsonMasterComputermonitorData</code>.
     * @alias module:model/HudsonMasterComputermonitorData
     */
    constructor() { 
        
        HudsonMasterComputermonitorData.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>HudsonMasterComputermonitorData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/HudsonMasterComputermonitorData} obj Optional instance to populate.
     * @return {module:model/HudsonMasterComputermonitorData} The populated <code>HudsonMasterComputermonitorData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new HudsonMasterComputermonitorData();

            if (data.hasOwnProperty('hudson.node_monitors.SwapSpaceMonitor')) {
                obj['hudson.node_monitors.SwapSpaceMonitor'] = SwapSpaceMonitorMemoryUsage2.constructFromObject(data['hudson.node_monitors.SwapSpaceMonitor']);
            }
            if (data.hasOwnProperty('hudson.node_monitors.TemporarySpaceMonitor')) {
                obj['hudson.node_monitors.TemporarySpaceMonitor'] = DiskSpaceMonitorDescriptorDiskSpace.constructFromObject(data['hudson.node_monitors.TemporarySpaceMonitor']);
            }
            if (data.hasOwnProperty('hudson.node_monitors.DiskSpaceMonitor')) {
                obj['hudson.node_monitors.DiskSpaceMonitor'] = DiskSpaceMonitorDescriptorDiskSpace.constructFromObject(data['hudson.node_monitors.DiskSpaceMonitor']);
            }
            if (data.hasOwnProperty('hudson.node_monitors.ArchitectureMonitor')) {
                obj['hudson.node_monitors.ArchitectureMonitor'] = ApiClient.convertToType(data['hudson.node_monitors.ArchitectureMonitor'], 'String');
            }
            if (data.hasOwnProperty('hudson.node_monitors.ResponseTimeMonitor')) {
                obj['hudson.node_monitors.ResponseTimeMonitor'] = ResponseTimeMonitorData.constructFromObject(data['hudson.node_monitors.ResponseTimeMonitor']);
            }
            if (data.hasOwnProperty('hudson.node_monitors.ClockMonitor')) {
                obj['hudson.node_monitors.ClockMonitor'] = ClockDifference.constructFromObject(data['hudson.node_monitors.ClockMonitor']);
            }
            if (data.hasOwnProperty('_class')) {
                obj['_class'] = ApiClient.convertToType(data['_class'], 'String');
            }
        }
        return obj;
    }
}



export default HudsonMasterComputermonitorData;

