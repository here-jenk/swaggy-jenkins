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

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.SwaggyJenkins);
  }
}(this, function(expect, SwaggyJenkins) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new SwaggyJenkins.PipelineRunImpllinks();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('PipelineRunImpllinks', function() {
    it('should create an instance of PipelineRunImpllinks', function() {
      // uncomment below and update the code to test PipelineRunImpllinks
      //var instance = new SwaggyJenkins.PipelineRunImpllinks();
      //expect(instance).to.be.a(SwaggyJenkins.PipelineRunImpllinks);
    });

    it('should have the property nodes (base name: "nodes")', function() {
      // uncomment below and update the code to test the property nodes
      //var instance = new SwaggyJenkins.PipelineRunImpllinks();
      //expect(instance).to.be();
    });

    it('should have the property log (base name: "log")', function() {
      // uncomment below and update the code to test the property log
      //var instance = new SwaggyJenkins.PipelineRunImpllinks();
      //expect(instance).to.be();
    });

    it('should have the property self (base name: "self")', function() {
      // uncomment below and update the code to test the property self
      //var instance = new SwaggyJenkins.PipelineRunImpllinks();
      //expect(instance).to.be();
    });

    it('should have the property actions (base name: "actions")', function() {
      // uncomment below and update the code to test the property actions
      //var instance = new SwaggyJenkins.PipelineRunImpllinks();
      //expect(instance).to.be();
    });

    it('should have the property steps (base name: "steps")', function() {
      // uncomment below and update the code to test the property steps
      //var instance = new SwaggyJenkins.PipelineRunImpllinks();
      //expect(instance).to.be();
    });

    it('should have the property _class (base name: "_class")', function() {
      // uncomment below and update the code to test the property _class
      //var instance = new SwaggyJenkins.PipelineRunImpllinks();
      //expect(instance).to.be();
    });

  });

}));
