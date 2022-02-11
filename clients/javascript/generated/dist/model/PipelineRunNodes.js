"use strict";

function _typeof(obj) { "@babel/helpers - typeof"; return _typeof = "function" == typeof Symbol && "symbol" == typeof Symbol.iterator ? function (obj) { return typeof obj; } : function (obj) { return obj && "function" == typeof Symbol && obj.constructor === Symbol && obj !== Symbol.prototype ? "symbol" : typeof obj; }, _typeof(obj); }

/**
 * Swaggy Jenkins
 * Jenkins API clients generated from Swagger / Open API specification
 *
 * OpenAPI spec version: 1.1.1
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 *
 * OpenAPI Generator version: 3.2.1-SNAPSHOT
 *
 * Do not edit the class manually.
 *
 */
(function (root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/PipelineRunNode'], factory);
  } else if ((typeof module === "undefined" ? "undefined" : _typeof(module)) === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./PipelineRunNode'));
  } else {
    // Browser globals (root is window)
    if (!root.SwaggyJenkins) {
      root.SwaggyJenkins = {};
    }

    root.SwaggyJenkins.PipelineRunNodes = factory(root.SwaggyJenkins.ApiClient, root.SwaggyJenkins.PipelineRunNode);
  }
})(void 0, function (ApiClient, PipelineRunNode) {
  'use strict';
  /**
   * The PipelineRunNodes model module.
   * @module model/PipelineRunNodes
   * @version 1.1.1
   */

  /**
   * Constructs a new <code>PipelineRunNodes</code>.
   * @alias module:model/PipelineRunNodes
   * @class
   * @extends Array
   */

  var exports = function exports() {
    var _this = this;

    _this = new Array();
    Object.setPrototypeOf(_this, exports);
    return _this;
  };
  /**
   * Constructs a <code>PipelineRunNodes</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PipelineRunNodes} obj Optional instance to populate.
   * @return {module:model/PipelineRunNodes} The populated <code>PipelineRunNodes</code> instance.
   */


  exports.constructFromObject = function (data, obj) {
    if (data) {
      obj = obj || new exports();
      ApiClient.constructFromObject(data, obj, 'PipelineRunNode');
    }

    return obj;
  };

  return exports;
});