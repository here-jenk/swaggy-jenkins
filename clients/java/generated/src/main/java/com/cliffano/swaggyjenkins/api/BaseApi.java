/*
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


package com.cliffano.swaggyjenkins.api;

import com.cliffano.swaggyjenkins.ApiCallback;
import com.cliffano.swaggyjenkins.ApiClient;
import com.cliffano.swaggyjenkins.ApiException;
import com.cliffano.swaggyjenkins.ApiResponse;
import com.cliffano.swaggyjenkins.Configuration;
import com.cliffano.swaggyjenkins.Pair;
import com.cliffano.swaggyjenkins.ProgressRequestBody;
import com.cliffano.swaggyjenkins.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.cliffano.swaggyjenkins.model.DefaultCrumbIssuer;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class BaseApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public BaseApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BaseApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getCrumb
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved CSRF protection token </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed - incorrect username and/or password </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Jenkins requires authentication - please set username and password </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCrumbCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crumbIssuer/api/json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "jenkins_auth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCrumbValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getCrumbCall(_callback);
        return localVarCall;

    }

    /**
     * 
     * Retrieve CSRF protection token
     * @return DefaultCrumbIssuer
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved CSRF protection token </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed - incorrect username and/or password </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Jenkins requires authentication - please set username and password </td><td>  -  </td></tr>
     </table>
     */
    public DefaultCrumbIssuer getCrumb() throws ApiException {
        ApiResponse<DefaultCrumbIssuer> localVarResp = getCrumbWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * 
     * Retrieve CSRF protection token
     * @return ApiResponse&lt;DefaultCrumbIssuer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved CSRF protection token </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed - incorrect username and/or password </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Jenkins requires authentication - please set username and password </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DefaultCrumbIssuer> getCrumbWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getCrumbValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<DefaultCrumbIssuer>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Retrieve CSRF protection token
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved CSRF protection token </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed - incorrect username and/or password </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Jenkins requires authentication - please set username and password </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCrumbAsync(final ApiCallback<DefaultCrumbIssuer> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCrumbValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<DefaultCrumbIssuer>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
