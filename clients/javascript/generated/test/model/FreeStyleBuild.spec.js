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
    instance = new SwaggyJenkins.FreeStyleBuild();
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

  describe('FreeStyleBuild', function() {
    it('should create an instance of FreeStyleBuild', function() {
      // uncomment below and update the code to test FreeStyleBuild
      //var instance = new SwaggyJenkins.FreeStyleBuild();
      //expect(instance).to.be.a(SwaggyJenkins.FreeStyleBuild);
    });

    it('should have the property _class (base name: "_class")', function() {
      // uncomment below and update the code to test the property _class
      //var instance = new SwaggyJenkins.FreeStyleBuild();
      //expect(instance).to.be();
    });

    it('should have the property number (base name: "number")', function() {
      // uncomment below and update the code to test the property number
      //var instance = new SwaggyJenkins.FreeStyleBuild();
      //expect(instance).to.be();
    });

    it('should have the property url (base name: "url")', function() {
      // uncomment below and update the code to test the property url
      //var instance = new SwaggyJenkins.FreeStyleBuild();
      //expect(instance).to.be();
    });

    it('should have the property actions (base name: "actions")', function() {
      // uncomment below and update the code to test the property actions
      //var instance = new SwaggyJenkins.FreeStyleBuild();
      //expect(instance).to.be();
    });

    it('should have the property building (base name: "building")', function() {
      // uncomment below and update the code to test the property building
      //var instance = new SwaggyJenkins.FreeStyleBuild();
      //expect(instance).to.be();
    });

    it('should have the property description (base name: "description")', function() {
      // uncomment below and update the code to test the property description
      //var instance = new SwaggyJenkins.FreeStyleBuild();
      //expect(instance).to.be();
    });

    it('should have the property displayName (base name: "displayName")', function() {
      // uncomment below and update the code to test the property displayName
      //var instance = new SwaggyJenkins.FreeStyleBuild();
      //expect(instance).to.be();
    });

    it('should have the property duration (base name: "duration")', function() {
      // uncomment below and update the code to test the property duration
      //var instance = new SwaggyJenkins.FreeStyleBuild();
      //expect(instance).to.be();
    });

    it('should have the property estimatedDuration (base name: "estimatedDuration")', function() {
      // uncomment below and update the code to test the property estimatedDuration
      //var instance = new SwaggyJenkins.FreeStyleBuild();
      //expect(instance).to.be();
    });

    it('should have the property executor (base name: "executor")', function() {
      // uncomment below and update the code to test the property executor
      //var instance = new SwaggyJenkins.FreeStyleBuild();
      //expect(instance).to.be();
    });

    it('should have the property fullDisplayName (base name: "fullDisplayName")', function() {
      // uncomment below and update the code to test the property fullDisplayName
      //var instance = new SwaggyJenkins.FreeStyleBuild();
      //expect(instance).to.be();
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instance = new SwaggyJenkins.FreeStyleBuild();
      //expect(instance).to.be();
    });

    it('should have the property keepLog (base name: "keepLog")', function() {
      // uncomment below and update the code to test the property keepLog
      //var instance = new SwaggyJenkins.FreeStyleBuild();
      //expect(instance).to.be();
    });

    it('should have the property queueId (base name: "queueId")', function() {
      // uncomment below and update the code to test the property queueId
      //var instance = new SwaggyJenkins.FreeStyleBuild();
      //expect(instance).to.be();
    });

    it('should have the property result (base name: "result")', function() {
      // uncomment below and update the code to test the property result
      //var instance = new SwaggyJenkins.FreeStyleBuild();
      //expect(instance).to.be();
    });

    it('should have the property timestamp (base name: "timestamp")', function() {
      // uncomment below and update the code to test the property timestamp
      //var instance = new SwaggyJenkins.FreeStyleBuild();
      //expect(instance).to.be();
    });

    it('should have the property builtOn (base name: "builtOn")', function() {
      // uncomment below and update the code to test the property builtOn
      //var instance = new SwaggyJenkins.FreeStyleBuild();
      //expect(instance).to.be();
    });

    it('should have the property changeSet (base name: "changeSet")', function() {
      // uncomment below and update the code to test the property changeSet
      //var instance = new SwaggyJenkins.FreeStyleBuild();
      //expect(instance).to.be();
    });

  });

}));
