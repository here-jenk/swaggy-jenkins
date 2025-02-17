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
    instance = new SwaggyJenkins.BlueOceanApi();
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

  describe('BlueOceanApi', function() {
    describe('deletePipelineQueueItem', function() {
      it('should call deletePipelineQueueItem successfully', function(done) {
        //uncomment below and update the code to test deletePipelineQueueItem
        //instance.deletePipelineQueueItem(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getAuthenticatedUser', function() {
      it('should call getAuthenticatedUser successfully', function(done) {
        //uncomment below and update the code to test getAuthenticatedUser
        //instance.getAuthenticatedUser(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getClasses', function() {
      it('should call getClasses successfully', function(done) {
        //uncomment below and update the code to test getClasses
        //instance.getClasses(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getJsonWebKey', function() {
      it('should call getJsonWebKey successfully', function(done) {
        //uncomment below and update the code to test getJsonWebKey
        //instance.getJsonWebKey(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getJsonWebToken', function() {
      it('should call getJsonWebToken successfully', function(done) {
        //uncomment below and update the code to test getJsonWebToken
        //instance.getJsonWebToken(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getOrganisation', function() {
      it('should call getOrganisation successfully', function(done) {
        //uncomment below and update the code to test getOrganisation
        //instance.getOrganisation(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getOrganisations', function() {
      it('should call getOrganisations successfully', function(done) {
        //uncomment below and update the code to test getOrganisations
        //instance.getOrganisations(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getPipeline', function() {
      it('should call getPipeline successfully', function(done) {
        //uncomment below and update the code to test getPipeline
        //instance.getPipeline(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getPipelineActivities', function() {
      it('should call getPipelineActivities successfully', function(done) {
        //uncomment below and update the code to test getPipelineActivities
        //instance.getPipelineActivities(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getPipelineBranch', function() {
      it('should call getPipelineBranch successfully', function(done) {
        //uncomment below and update the code to test getPipelineBranch
        //instance.getPipelineBranch(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getPipelineBranchRun', function() {
      it('should call getPipelineBranchRun successfully', function(done) {
        //uncomment below and update the code to test getPipelineBranchRun
        //instance.getPipelineBranchRun(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getPipelineBranches', function() {
      it('should call getPipelineBranches successfully', function(done) {
        //uncomment below and update the code to test getPipelineBranches
        //instance.getPipelineBranches(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getPipelineFolder', function() {
      it('should call getPipelineFolder successfully', function(done) {
        //uncomment below and update the code to test getPipelineFolder
        //instance.getPipelineFolder(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getPipelineFolderPipeline', function() {
      it('should call getPipelineFolderPipeline successfully', function(done) {
        //uncomment below and update the code to test getPipelineFolderPipeline
        //instance.getPipelineFolderPipeline(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getPipelineQueue', function() {
      it('should call getPipelineQueue successfully', function(done) {
        //uncomment below and update the code to test getPipelineQueue
        //instance.getPipelineQueue(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getPipelineRun', function() {
      it('should call getPipelineRun successfully', function(done) {
        //uncomment below and update the code to test getPipelineRun
        //instance.getPipelineRun(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getPipelineRunLog', function() {
      it('should call getPipelineRunLog successfully', function(done) {
        //uncomment below and update the code to test getPipelineRunLog
        //instance.getPipelineRunLog(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getPipelineRunNode', function() {
      it('should call getPipelineRunNode successfully', function(done) {
        //uncomment below and update the code to test getPipelineRunNode
        //instance.getPipelineRunNode(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getPipelineRunNodeStep', function() {
      it('should call getPipelineRunNodeStep successfully', function(done) {
        //uncomment below and update the code to test getPipelineRunNodeStep
        //instance.getPipelineRunNodeStep(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getPipelineRunNodeStepLog', function() {
      it('should call getPipelineRunNodeStepLog successfully', function(done) {
        //uncomment below and update the code to test getPipelineRunNodeStepLog
        //instance.getPipelineRunNodeStepLog(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getPipelineRunNodeSteps', function() {
      it('should call getPipelineRunNodeSteps successfully', function(done) {
        //uncomment below and update the code to test getPipelineRunNodeSteps
        //instance.getPipelineRunNodeSteps(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getPipelineRunNodes', function() {
      it('should call getPipelineRunNodes successfully', function(done) {
        //uncomment below and update the code to test getPipelineRunNodes
        //instance.getPipelineRunNodes(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getPipelineRuns', function() {
      it('should call getPipelineRuns successfully', function(done) {
        //uncomment below and update the code to test getPipelineRuns
        //instance.getPipelineRuns(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getPipelines', function() {
      it('should call getPipelines successfully', function(done) {
        //uncomment below and update the code to test getPipelines
        //instance.getPipelines(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getSCM', function() {
      it('should call getSCM successfully', function(done) {
        //uncomment below and update the code to test getSCM
        //instance.getSCM(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getSCMOrganisationRepositories', function() {
      it('should call getSCMOrganisationRepositories successfully', function(done) {
        //uncomment below and update the code to test getSCMOrganisationRepositories
        //instance.getSCMOrganisationRepositories(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getSCMOrganisationRepository', function() {
      it('should call getSCMOrganisationRepository successfully', function(done) {
        //uncomment below and update the code to test getSCMOrganisationRepository
        //instance.getSCMOrganisationRepository(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getSCMOrganisations', function() {
      it('should call getSCMOrganisations successfully', function(done) {
        //uncomment below and update the code to test getSCMOrganisations
        //instance.getSCMOrganisations(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getUser', function() {
      it('should call getUser successfully', function(done) {
        //uncomment below and update the code to test getUser
        //instance.getUser(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getUserFavorites', function() {
      it('should call getUserFavorites successfully', function(done) {
        //uncomment below and update the code to test getUserFavorites
        //instance.getUserFavorites(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getUsers', function() {
      it('should call getUsers successfully', function(done) {
        //uncomment below and update the code to test getUsers
        //instance.getUsers(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('postPipelineRun', function() {
      it('should call postPipelineRun successfully', function(done) {
        //uncomment below and update the code to test postPipelineRun
        //instance.postPipelineRun(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('postPipelineRuns', function() {
      it('should call postPipelineRuns successfully', function(done) {
        //uncomment below and update the code to test postPipelineRuns
        //instance.postPipelineRuns(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('putPipelineFavorite', function() {
      it('should call putPipelineFavorite successfully', function(done) {
        //uncomment below and update the code to test putPipelineFavorite
        //instance.putPipelineFavorite(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('putPipelineRun', function() {
      it('should call putPipelineRun successfully', function(done) {
        //uncomment below and update the code to test putPipelineRun
        //instance.putPipelineRun(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('search', function() {
      it('should call search successfully', function(done) {
        //uncomment below and update the code to test search
        //instance.search(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('searchClasses', function() {
      it('should call searchClasses successfully', function(done) {
        //uncomment below and update the code to test searchClasses
        //instance.searchClasses(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
