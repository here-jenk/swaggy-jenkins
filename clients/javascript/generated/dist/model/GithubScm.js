"use strict";

Object.defineProperty(exports, "__esModule", {
  value: true
});
exports["default"] = void 0;

var _ApiClient = _interopRequireDefault(require("../ApiClient"));

var _GithubScmlinks = _interopRequireDefault(require("./GithubScmlinks"));

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { "default": obj }; }

function _classCallCheck(instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError("Cannot call a class as a function"); } }

function _defineProperties(target, props) { for (var i = 0; i < props.length; i++) { var descriptor = props[i]; descriptor.enumerable = descriptor.enumerable || false; descriptor.configurable = true; if ("value" in descriptor) descriptor.writable = true; Object.defineProperty(target, descriptor.key, descriptor); } }

function _createClass(Constructor, protoProps, staticProps) { if (protoProps) _defineProperties(Constructor.prototype, protoProps); if (staticProps) _defineProperties(Constructor, staticProps); Object.defineProperty(Constructor, "prototype", { writable: false }); return Constructor; }

/**
 * The GithubScm model module.
 * @module model/GithubScm
 * @version 1.1.2-pre.0
 */
var GithubScm = /*#__PURE__*/function () {
  /**
   * Constructs a new <code>GithubScm</code>.
   * @alias module:model/GithubScm
   */
  function GithubScm() {
    _classCallCheck(this, GithubScm);

    GithubScm.initialize(this);
  }
  /**
   * Initializes the fields of this object.
   * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
   * Only for internal use.
   */


  _createClass(GithubScm, null, [{
    key: "initialize",
    value: function initialize(obj) {}
    /**
     * Constructs a <code>GithubScm</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GithubScm} obj Optional instance to populate.
     * @return {module:model/GithubScm} The populated <code>GithubScm</code> instance.
     */

  }, {
    key: "constructFromObject",
    value: function constructFromObject(data, obj) {
      if (data) {
        obj = obj || new GithubScm();

        if (data.hasOwnProperty('_class')) {
          obj['_class'] = _ApiClient["default"].convertToType(data['_class'], 'String');
        }

        if (data.hasOwnProperty('_links')) {
          obj['_links'] = _GithubScmlinks["default"].constructFromObject(data['_links']);
        }

        if (data.hasOwnProperty('credentialId')) {
          obj['credentialId'] = _ApiClient["default"].convertToType(data['credentialId'], 'String');
        }

        if (data.hasOwnProperty('id')) {
          obj['id'] = _ApiClient["default"].convertToType(data['id'], 'String');
        }

        if (data.hasOwnProperty('uri')) {
          obj['uri'] = _ApiClient["default"].convertToType(data['uri'], 'String');
        }
      }

      return obj;
    }
  }]);

  return GithubScm;
}();
/**
 * @member {String} _class
 */


GithubScm.prototype['_class'] = undefined;
/**
 * @member {module:model/GithubScmlinks} _links
 */

GithubScm.prototype['_links'] = undefined;
/**
 * @member {String} credentialId
 */

GithubScm.prototype['credentialId'] = undefined;
/**
 * @member {String} id
 */

GithubScm.prototype['id'] = undefined;
/**
 * @member {String} uri
 */

GithubScm.prototype['uri'] = undefined;
var _default = GithubScm;
exports["default"] = _default;