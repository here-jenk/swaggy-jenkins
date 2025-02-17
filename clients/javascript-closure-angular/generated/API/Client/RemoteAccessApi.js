/**
 * @fileoverview AUTOMATICALLY GENERATED service for API.Client.RemoteAccessApi.
 * Do not edit this file by hand or your changes will be lost next time it is
 * generated.
 *
 * Jenkins API clients generated from Swagger / Open API specification
 * Version: 1.5.1-pre.0
 * Generated by: org.openapitools.codegen.languages.JavascriptClosureAngularClientCodegen
 */
goog.provide('API.Client.RemoteAccessApi');

goog.require('API.Client.ComputerSet');
goog.require('API.Client.FreeStyleBuild');
goog.require('API.Client.FreeStyleProject');
goog.require('API.Client.Hudson');
goog.require('API.Client.ListView');
goog.require('API.Client.Queue');

/**
 * @constructor
 * @param {!angular.$http} $http
 * @param {!Object} $httpParamSerializer
 * @param {!angular.$injector} $injector
 * @struct
 */
API.Client.RemoteAccessApi = function($http, $httpParamSerializer, $injector) {
  /** @private {!string} */
  this.basePath_ = $injector.has('RemoteAccessApiBasePath') ?
                   /** @type {!string} */ ($injector.get('RemoteAccessApiBasePath')) :
                   'http://localhost';

  /** @private {!Object<string, string>} */
  this.defaultHeaders_ = $injector.has('RemoteAccessApiDefaultHeaders') ?
                   /** @type {!Object<string, string>} */ (
                       $injector.get('RemoteAccessApiDefaultHeaders')) :
                   {};

  /** @private {!angular.$http} */
  this.http_ = $http;

  /** @package {!Object} */
  this.httpParamSerializer = $injector.get('$httpParamSerializer');
}
API.Client.RemoteAccessApi.$inject = ['$http', '$httpParamSerializer', '$injector'];

/**
 * 
 * Retrieve computer details
 * @param {!number} depth Recursion depth in response model
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.ComputerSet>}
 */
API.Client.RemoteAccessApi.prototype.getComputer = function(depth, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/computer/api/json';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'depth' is set
  if (!depth) {
    throw new Error('Missing required parameter depth when calling getComputer');
  }
  if (depth !== undefined) {
    queryParameters['depth'] = depth;
  }

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'GET',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * 
 * Retrieve Jenkins details
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.Hudson>}
 */
API.Client.RemoteAccessApi.prototype.getJenkins = function(opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/api/json';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'GET',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * 
 * Retrieve job details
 * @param {!string} name Name of the job
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.FreeStyleProject>}
 */
API.Client.RemoteAccessApi.prototype.getJob = function(name, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/job/{name}/api/json'
      .replace('{' + 'name' + '}', String(name));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'name' is set
  if (!name) {
    throw new Error('Missing required parameter name when calling getJob');
  }
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'GET',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * 
 * Retrieve job configuration
 * @param {!string} name Name of the job
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!string>}
 */
API.Client.RemoteAccessApi.prototype.getJobConfig = function(name, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/job/{name}/config.xml'
      .replace('{' + 'name' + '}', String(name));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'name' is set
  if (!name) {
    throw new Error('Missing required parameter name when calling getJobConfig');
  }
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'GET',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * 
 * Retrieve job&#39;s last build details
 * @param {!string} name Name of the job
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.FreeStyleBuild>}
 */
API.Client.RemoteAccessApi.prototype.getJobLastBuild = function(name, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/job/{name}/lastBuild/api/json'
      .replace('{' + 'name' + '}', String(name));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'name' is set
  if (!name) {
    throw new Error('Missing required parameter name when calling getJobLastBuild');
  }
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'GET',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * 
 * Retrieve job&#39;s build progressive text output
 * @param {!string} name Name of the job
 * @param {!string} number Build number
 * @param {!string} start Starting point of progressive text output
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.RemoteAccessApi.prototype.getJobProgressiveText = function(name, number, start, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/job/{name}/{number}/logText/progressiveText'
      .replace('{' + 'name' + '}', String(name))
      .replace('{' + 'number' + '}', String(number));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'name' is set
  if (!name) {
    throw new Error('Missing required parameter name when calling getJobProgressiveText');
  }
  // verify required parameter 'number' is set
  if (!number) {
    throw new Error('Missing required parameter number when calling getJobProgressiveText');
  }
  // verify required parameter 'start' is set
  if (!start) {
    throw new Error('Missing required parameter start when calling getJobProgressiveText');
  }
  if (start !== undefined) {
    queryParameters['start'] = start;
  }

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'GET',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * 
 * Retrieve queue details
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.Queue>}
 */
API.Client.RemoteAccessApi.prototype.getQueue = function(opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/queue/api/json';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'GET',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * 
 * Retrieve queued item details
 * @param {!string} number Queue number
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.Queue>}
 */
API.Client.RemoteAccessApi.prototype.getQueueItem = function(number, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/queue/item/{number}/api/json'
      .replace('{' + 'number' + '}', String(number));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'number' is set
  if (!number) {
    throw new Error('Missing required parameter number when calling getQueueItem');
  }
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'GET',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * 
 * Retrieve view details
 * @param {!string} name Name of the view
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.ListView>}
 */
API.Client.RemoteAccessApi.prototype.getView = function(name, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/view/{name}/api/json'
      .replace('{' + 'name' + '}', String(name));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'name' is set
  if (!name) {
    throw new Error('Missing required parameter name when calling getView');
  }
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'GET',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * 
 * Retrieve view configuration
 * @param {!string} name Name of the view
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!string>}
 */
API.Client.RemoteAccessApi.prototype.getViewConfig = function(name, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/view/{name}/config.xml'
      .replace('{' + 'name' + '}', String(name));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'name' is set
  if (!name) {
    throw new Error('Missing required parameter name when calling getViewConfig');
  }
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'GET',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * 
 * Retrieve Jenkins headers
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.RemoteAccessApi.prototype.headJenkins = function(opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/api/json';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'HEAD',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * 
 * Create a new job using job configuration, or copied from an existing job
 * @param {!string} name Name of the new job
 * @param {!string=} opt_from Existing job to copy from
 * @param {!string=} opt_mode Set to &#39;copy&#39; for copying an existing job
 * @param {!string=} opt_jenkinsCrumb CSRF protection token
 * @param {!string=} opt_contentType Content type header application/xml
 * @param {!string=} opt_body Job configuration in config.xml format
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.RemoteAccessApi.prototype.postCreateItem = function(name, opt_from, opt_mode, opt_jenkinsCrumb, opt_contentType, opt_body, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/createItem';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'name' is set
  if (!name) {
    throw new Error('Missing required parameter name when calling postCreateItem');
  }
  if (name !== undefined) {
    queryParameters['name'] = name;
  }

  if (opt_from !== undefined) {
    queryParameters['from'] = opt_from;
  }

  if (opt_mode !== undefined) {
    queryParameters['mode'] = opt_mode;
  }

  headerParams['Jenkins-Crumb'] = opt_jenkinsCrumb;

  headerParams['Content-Type'] = opt_contentType;

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: true,
    data: opt_body,
        params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * 
 * Create a new view using view configuration
 * @param {!string} name Name of the new view
 * @param {!string=} opt_jenkinsCrumb CSRF protection token
 * @param {!string=} opt_contentType Content type header application/xml
 * @param {!string=} opt_body View configuration in config.xml format
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.RemoteAccessApi.prototype.postCreateView = function(name, opt_jenkinsCrumb, opt_contentType, opt_body, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/createView';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'name' is set
  if (!name) {
    throw new Error('Missing required parameter name when calling postCreateView');
  }
  if (name !== undefined) {
    queryParameters['name'] = name;
  }

  headerParams['Jenkins-Crumb'] = opt_jenkinsCrumb;

  headerParams['Content-Type'] = opt_contentType;

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: true,
    data: opt_body,
        params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * 
 * Build a job
 * @param {!string} name Name of the job
 * @param {!string} json 
 * @param {!string=} opt_token 
 * @param {!string=} opt_jenkinsCrumb CSRF protection token
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.RemoteAccessApi.prototype.postJobBuild = function(name, json, opt_token, opt_jenkinsCrumb, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/job/{name}/build'
      .replace('{' + 'name' + '}', String(name));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'name' is set
  if (!name) {
    throw new Error('Missing required parameter name when calling postJobBuild');
  }
  // verify required parameter 'json' is set
  if (!json) {
    throw new Error('Missing required parameter json when calling postJobBuild');
  }
  if (json !== undefined) {
    queryParameters['json'] = json;
  }

  if (opt_token !== undefined) {
    queryParameters['token'] = opt_token;
  }

  headerParams['Jenkins-Crumb'] = opt_jenkinsCrumb;

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * 
 * Update job configuration
 * @param {!string} name Name of the job
 * @param {!string} body Job configuration in config.xml format
 * @param {!string=} opt_jenkinsCrumb CSRF protection token
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.RemoteAccessApi.prototype.postJobConfig = function(name, body, opt_jenkinsCrumb, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/job/{name}/config.xml'
      .replace('{' + 'name' + '}', String(name));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'name' is set
  if (!name) {
    throw new Error('Missing required parameter name when calling postJobConfig');
  }
  // verify required parameter 'body' is set
  if (!body) {
    throw new Error('Missing required parameter body when calling postJobConfig');
  }
  headerParams['Jenkins-Crumb'] = opt_jenkinsCrumb;

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: true,
    data: body,
        params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * 
 * Delete a job
 * @param {!string} name Name of the job
 * @param {!string=} opt_jenkinsCrumb CSRF protection token
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.RemoteAccessApi.prototype.postJobDelete = function(name, opt_jenkinsCrumb, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/job/{name}/doDelete'
      .replace('{' + 'name' + '}', String(name));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'name' is set
  if (!name) {
    throw new Error('Missing required parameter name when calling postJobDelete');
  }
  headerParams['Jenkins-Crumb'] = opt_jenkinsCrumb;

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * 
 * Disable a job
 * @param {!string} name Name of the job
 * @param {!string=} opt_jenkinsCrumb CSRF protection token
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.RemoteAccessApi.prototype.postJobDisable = function(name, opt_jenkinsCrumb, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/job/{name}/disable'
      .replace('{' + 'name' + '}', String(name));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'name' is set
  if (!name) {
    throw new Error('Missing required parameter name when calling postJobDisable');
  }
  headerParams['Jenkins-Crumb'] = opt_jenkinsCrumb;

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * 
 * Enable a job
 * @param {!string} name Name of the job
 * @param {!string=} opt_jenkinsCrumb CSRF protection token
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.RemoteAccessApi.prototype.postJobEnable = function(name, opt_jenkinsCrumb, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/job/{name}/enable'
      .replace('{' + 'name' + '}', String(name));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'name' is set
  if (!name) {
    throw new Error('Missing required parameter name when calling postJobEnable');
  }
  headerParams['Jenkins-Crumb'] = opt_jenkinsCrumb;

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * 
 * Stop a job
 * @param {!string} name Name of the job
 * @param {!string=} opt_jenkinsCrumb CSRF protection token
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.RemoteAccessApi.prototype.postJobLastBuildStop = function(name, opt_jenkinsCrumb, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/job/{name}/lastBuild/stop'
      .replace('{' + 'name' + '}', String(name));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'name' is set
  if (!name) {
    throw new Error('Missing required parameter name when calling postJobLastBuildStop');
  }
  headerParams['Jenkins-Crumb'] = opt_jenkinsCrumb;

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * 
 * Update view configuration
 * @param {!string} name Name of the view
 * @param {!string} body View configuration in config.xml format
 * @param {!string=} opt_jenkinsCrumb CSRF protection token
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.RemoteAccessApi.prototype.postViewConfig = function(name, body, opt_jenkinsCrumb, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/view/{name}/config.xml'
      .replace('{' + 'name' + '}', String(name));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'name' is set
  if (!name) {
    throw new Error('Missing required parameter name when calling postViewConfig');
  }
  // verify required parameter 'body' is set
  if (!body) {
    throw new Error('Missing required parameter body when calling postViewConfig');
  }
  headerParams['Jenkins-Crumb'] = opt_jenkinsCrumb;

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: true,
    data: body,
        params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}
