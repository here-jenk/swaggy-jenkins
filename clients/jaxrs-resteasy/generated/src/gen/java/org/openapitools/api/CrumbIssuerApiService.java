package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.DefaultCrumbIssuer;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-02-10T09:47:16.018972Z[Etc/UTC]")
public interface CrumbIssuerApiService {
      Response getCrumb(SecurityContext securityContext)
      throws NotFoundException;
}
