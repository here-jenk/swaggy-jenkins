/*
 * Swaggy Jenkins
 * Jenkins API clients generated from Swagger / Open API specification
 *
 * The version of the OpenAPI document: 1.1.1
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cliffano.swaggyjenkins.api;

import com.cliffano.swaggyjenkins.ApiException;
import com.cliffano.swaggyjenkins.model.DefaultCrumbIssuer;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BaseApi
 */
@Ignore
public class BaseApiTest {

    private final BaseApi api = new BaseApi();

    
    /**
     * 
     *
     * Retrieve CSRF protection token
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCrumbTest() throws ApiException {
                DefaultCrumbIssuer response = api.getCrumb();
        // TODO: test validations
    }
    
}
