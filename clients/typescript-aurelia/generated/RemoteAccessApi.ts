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
 */

import { autoinject } from 'aurelia-framework';
import { HttpClient } from 'aurelia-http-client';
import { Api } from './Api';
import { AuthStorage } from './AuthStorage';
import {
  ListView,
  Hudson,
  FreeStyleBuild,
  FreeStyleProject,
  Queue,
  ComputerSet,
} from './models';

/**
 * getComputer - parameters interface
 */
export interface IGetComputerParams {
  depth: number;
}

/**
 * getJenkins - parameters interface
 */
export interface IGetJenkinsParams {
}

/**
 * getJob - parameters interface
 */
export interface IGetJobParams {
  name: string;
}

/**
 * getJobConfig - parameters interface
 */
export interface IGetJobConfigParams {
  name: string;
}

/**
 * getJobLastBuild - parameters interface
 */
export interface IGetJobLastBuildParams {
  name: string;
}

/**
 * getJobProgressiveText - parameters interface
 */
export interface IGetJobProgressiveTextParams {
  name: string;
  number: string;
  start: string;
}

/**
 * getQueue - parameters interface
 */
export interface IGetQueueParams {
}

/**
 * getQueueItem - parameters interface
 */
export interface IGetQueueItemParams {
  number: string;
}

/**
 * getView - parameters interface
 */
export interface IGetViewParams {
  name: string;
}

/**
 * getViewConfig - parameters interface
 */
export interface IGetViewConfigParams {
  name: string;
}

/**
 * headJenkins - parameters interface
 */
export interface IHeadJenkinsParams {
}

/**
 * postCreateItem - parameters interface
 */
export interface IPostCreateItemParams {
  name: string;
  from?: string;
  mode?: string;
  jenkinsCrumb?: string;
  contentType?: string;
  body?: string;
}

/**
 * postCreateView - parameters interface
 */
export interface IPostCreateViewParams {
  name: string;
  jenkinsCrumb?: string;
  contentType?: string;
  body?: string;
}

/**
 * postJobBuild - parameters interface
 */
export interface IPostJobBuildParams {
  name: string;
  json: string;
  token?: string;
  jenkinsCrumb?: string;
}

/**
 * postJobConfig - parameters interface
 */
export interface IPostJobConfigParams {
  name: string;
  body: string;
  jenkinsCrumb?: string;
}

/**
 * postJobDelete - parameters interface
 */
export interface IPostJobDeleteParams {
  name: string;
  jenkinsCrumb?: string;
}

/**
 * postJobDisable - parameters interface
 */
export interface IPostJobDisableParams {
  name: string;
  jenkinsCrumb?: string;
}

/**
 * postJobEnable - parameters interface
 */
export interface IPostJobEnableParams {
  name: string;
  jenkinsCrumb?: string;
}

/**
 * postJobLastBuildStop - parameters interface
 */
export interface IPostJobLastBuildStopParams {
  name: string;
  jenkinsCrumb?: string;
}

/**
 * postViewConfig - parameters interface
 */
export interface IPostViewConfigParams {
  name: string;
  body: string;
  jenkinsCrumb?: string;
}

/**
 * RemoteAccessApi - API class
 */
@autoinject()
export class RemoteAccessApi extends Api {

  /**
   * Creates a new RemoteAccessApi class.
   *
   * @param httpClient The Aurelia HTTP client to be injected.
   * @param authStorage A storage for authentication data.
   */
  constructor(httpClient: HttpClient, authStorage: AuthStorage) {
    super(httpClient, authStorage);
  }

  /**
   * Retrieve computer details
   * @param params.depth Recursion depth in response model
   */
  async getComputer(params: IGetComputerParams): Promise<ComputerSet> {
    // Verify required parameters are set
    this.ensureParamIsSet('getComputer', params, 'depth');

    // Create URL to call
    const url = `${this.basePath}/computer/api/json`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'depth': params['depth'],
      })

      // Authentication 'jenkins_auth' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Retrieve Jenkins details
   */
  async getJenkins(): Promise<Hudson> {
    // Verify required parameters are set

    // Create URL to call
    const url = `${this.basePath}/api/json`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()

      // Authentication 'jenkins_auth' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Retrieve job details
   * @param params.name Name of the job
   */
  async getJob(params: IGetJobParams): Promise<FreeStyleProject> {
    // Verify required parameters are set
    this.ensureParamIsSet('getJob', params, 'name');

    // Create URL to call
    const url = `${this.basePath}/job/{name}/api/json`
      .replace(`{${'name'}}`, encodeURIComponent(`${params['name']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()

      // Authentication 'jenkins_auth' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Retrieve job configuration
   * @param params.name Name of the job
   */
  async getJobConfig(params: IGetJobConfigParams): Promise<string> {
    // Verify required parameters are set
    this.ensureParamIsSet('getJobConfig', params, 'name');

    // Create URL to call
    const url = `${this.basePath}/job/{name}/config.xml`
      .replace(`{${'name'}}`, encodeURIComponent(`${params['name']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()

      // Authentication 'jenkins_auth' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Retrieve job\&#39;s last build details
   * @param params.name Name of the job
   */
  async getJobLastBuild(params: IGetJobLastBuildParams): Promise<FreeStyleBuild> {
    // Verify required parameters are set
    this.ensureParamIsSet('getJobLastBuild', params, 'name');

    // Create URL to call
    const url = `${this.basePath}/job/{name}/lastBuild/api/json`
      .replace(`{${'name'}}`, encodeURIComponent(`${params['name']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()

      // Authentication 'jenkins_auth' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Retrieve job\&#39;s build progressive text output
   * @param params.name Name of the job
   * @param params.number Build number
   * @param params.start Starting point of progressive text output
   */
  async getJobProgressiveText(params: IGetJobProgressiveTextParams): Promise<any> {
    // Verify required parameters are set
    this.ensureParamIsSet('getJobProgressiveText', params, 'name');
    this.ensureParamIsSet('getJobProgressiveText', params, 'number');
    this.ensureParamIsSet('getJobProgressiveText', params, 'start');

    // Create URL to call
    const url = `${this.basePath}/job/{name}/{number}/logText/progressiveText`
      .replace(`{${'name'}}`, encodeURIComponent(`${params['name']}`))
      .replace(`{${'number'}}`, encodeURIComponent(`${params['number']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'start': params['start'],
      })

      // Authentication 'jenkins_auth' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Retrieve queue details
   */
  async getQueue(): Promise<Queue> {
    // Verify required parameters are set

    // Create URL to call
    const url = `${this.basePath}/queue/api/json`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()

      // Authentication 'jenkins_auth' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Retrieve queued item details
   * @param params.number Queue number
   */
  async getQueueItem(params: IGetQueueItemParams): Promise<Queue> {
    // Verify required parameters are set
    this.ensureParamIsSet('getQueueItem', params, 'number');

    // Create URL to call
    const url = `${this.basePath}/queue/item/{number}/api/json`
      .replace(`{${'number'}}`, encodeURIComponent(`${params['number']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()

      // Authentication 'jenkins_auth' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Retrieve view details
   * @param params.name Name of the view
   */
  async getView(params: IGetViewParams): Promise<ListView> {
    // Verify required parameters are set
    this.ensureParamIsSet('getView', params, 'name');

    // Create URL to call
    const url = `${this.basePath}/view/{name}/api/json`
      .replace(`{${'name'}}`, encodeURIComponent(`${params['name']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()

      // Authentication 'jenkins_auth' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Retrieve view configuration
   * @param params.name Name of the view
   */
  async getViewConfig(params: IGetViewConfigParams): Promise<string> {
    // Verify required parameters are set
    this.ensureParamIsSet('getViewConfig', params, 'name');

    // Create URL to call
    const url = `${this.basePath}/view/{name}/config.xml`
      .replace(`{${'name'}}`, encodeURIComponent(`${params['name']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()

      // Authentication 'jenkins_auth' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Retrieve Jenkins headers
   */
  async headJenkins(): Promise<any> {
    // Verify required parameters are set

    // Create URL to call
    const url = `${this.basePath}/api/json`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asHead()

      // Authentication 'jenkins_auth' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Create a new job using job configuration, or copied from an existing job
   * @param params.name Name of the new job
   * @param params.from Existing job to copy from
   * @param params.mode Set to \&#39;copy\&#39; for copying an existing job
   * @param params.jenkinsCrumb CSRF protection token
   * @param params.contentType Content type header application/xml
   * @param params.body Job configuration in config.xml format
   */
  async postCreateItem(params: IPostCreateItemParams): Promise<any> {
    // Verify required parameters are set
    this.ensureParamIsSet('postCreateItem', params, 'name');

    // Create URL to call
    const url = `${this.basePath}/createItem`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Set query parameters
      .withParams({ 
        'name': params['name'],
        'from': params['from'],
        'mode': params['mode'],
      })
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['body'] || {}))
      .withHeader('Jenkins-Crumb', params['jenkinsCrumb'])      .withHeader('Content-Type', params['contentType'])
      // Authentication 'jenkins_auth' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Create a new view using view configuration
   * @param params.name Name of the new view
   * @param params.jenkinsCrumb CSRF protection token
   * @param params.contentType Content type header application/xml
   * @param params.body View configuration in config.xml format
   */
  async postCreateView(params: IPostCreateViewParams): Promise<any> {
    // Verify required parameters are set
    this.ensureParamIsSet('postCreateView', params, 'name');

    // Create URL to call
    const url = `${this.basePath}/createView`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Set query parameters
      .withParams({ 
        'name': params['name'],
      })
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['body'] || {}))
      .withHeader('Jenkins-Crumb', params['jenkinsCrumb'])      .withHeader('Content-Type', params['contentType'])
      // Authentication 'jenkins_auth' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Build a job
   * @param params.name Name of the job
   * @param params.json 
   * @param params.token 
   * @param params.jenkinsCrumb CSRF protection token
   */
  async postJobBuild(params: IPostJobBuildParams): Promise<any> {
    // Verify required parameters are set
    this.ensureParamIsSet('postJobBuild', params, 'name');
    this.ensureParamIsSet('postJobBuild', params, 'json');

    // Create URL to call
    const url = `${this.basePath}/job/{name}/build`
      .replace(`{${'name'}}`, encodeURIComponent(`${params['name']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Set query parameters
      .withParams({ 
        'json': params['json'],
        'token': params['token'],
      })
      .withHeader('Jenkins-Crumb', params['jenkinsCrumb'])
      // Authentication 'jenkins_auth' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Update job configuration
   * @param params.name Name of the job
   * @param params.body Job configuration in config.xml format
   * @param params.jenkinsCrumb CSRF protection token
   */
  async postJobConfig(params: IPostJobConfigParams): Promise<any> {
    // Verify required parameters are set
    this.ensureParamIsSet('postJobConfig', params, 'name');
    this.ensureParamIsSet('postJobConfig', params, 'body');

    // Create URL to call
    const url = `${this.basePath}/job/{name}/config.xml`
      .replace(`{${'name'}}`, encodeURIComponent(`${params['name']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['body'] || {}))
      .withHeader('Jenkins-Crumb', params['jenkinsCrumb'])
      // Authentication 'jenkins_auth' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Delete a job
   * @param params.name Name of the job
   * @param params.jenkinsCrumb CSRF protection token
   */
  async postJobDelete(params: IPostJobDeleteParams): Promise<any> {
    // Verify required parameters are set
    this.ensureParamIsSet('postJobDelete', params, 'name');

    // Create URL to call
    const url = `${this.basePath}/job/{name}/doDelete`
      .replace(`{${'name'}}`, encodeURIComponent(`${params['name']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      .withHeader('Jenkins-Crumb', params['jenkinsCrumb'])
      // Authentication 'jenkins_auth' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Disable a job
   * @param params.name Name of the job
   * @param params.jenkinsCrumb CSRF protection token
   */
  async postJobDisable(params: IPostJobDisableParams): Promise<any> {
    // Verify required parameters are set
    this.ensureParamIsSet('postJobDisable', params, 'name');

    // Create URL to call
    const url = `${this.basePath}/job/{name}/disable`
      .replace(`{${'name'}}`, encodeURIComponent(`${params['name']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      .withHeader('Jenkins-Crumb', params['jenkinsCrumb'])
      // Authentication 'jenkins_auth' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Enable a job
   * @param params.name Name of the job
   * @param params.jenkinsCrumb CSRF protection token
   */
  async postJobEnable(params: IPostJobEnableParams): Promise<any> {
    // Verify required parameters are set
    this.ensureParamIsSet('postJobEnable', params, 'name');

    // Create URL to call
    const url = `${this.basePath}/job/{name}/enable`
      .replace(`{${'name'}}`, encodeURIComponent(`${params['name']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      .withHeader('Jenkins-Crumb', params['jenkinsCrumb'])
      // Authentication 'jenkins_auth' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Stop a job
   * @param params.name Name of the job
   * @param params.jenkinsCrumb CSRF protection token
   */
  async postJobLastBuildStop(params: IPostJobLastBuildStopParams): Promise<any> {
    // Verify required parameters are set
    this.ensureParamIsSet('postJobLastBuildStop', params, 'name');

    // Create URL to call
    const url = `${this.basePath}/job/{name}/lastBuild/stop`
      .replace(`{${'name'}}`, encodeURIComponent(`${params['name']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      .withHeader('Jenkins-Crumb', params['jenkinsCrumb'])
      // Authentication 'jenkins_auth' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Update view configuration
   * @param params.name Name of the view
   * @param params.body View configuration in config.xml format
   * @param params.jenkinsCrumb CSRF protection token
   */
  async postViewConfig(params: IPostViewConfigParams): Promise<any> {
    // Verify required parameters are set
    this.ensureParamIsSet('postViewConfig', params, 'name');
    this.ensureParamIsSet('postViewConfig', params, 'body');

    // Create URL to call
    const url = `${this.basePath}/view/{name}/config.xml`
      .replace(`{${'name'}}`, encodeURIComponent(`${params['name']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['body'] || {}))
      .withHeader('Jenkins-Crumb', params['jenkinsCrumb'])
      // Authentication 'jenkins_auth' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

}

