package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.FreeStyleBuild;
import org.openapitools.model.FreeStyleProject;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-06-04T08:09:04.819692Z[Etc/UTC]")
public interface JobApiService {
      Response getJob(String name,SecurityContext securityContext)
      throws NotFoundException;
      Response getJobConfig(String name,SecurityContext securityContext)
      throws NotFoundException;
      Response getJobLastBuild(String name,SecurityContext securityContext)
      throws NotFoundException;
      Response getJobProgressiveText(String name,String number,String start,SecurityContext securityContext)
      throws NotFoundException;
      Response postJobBuild(String name,String json,String token,String jenkinsCrumb,SecurityContext securityContext)
      throws NotFoundException;
      Response postJobConfig(String name,String body,String jenkinsCrumb,SecurityContext securityContext)
      throws NotFoundException;
      Response postJobDelete(String name,String jenkinsCrumb,SecurityContext securityContext)
      throws NotFoundException;
      Response postJobDisable(String name,String jenkinsCrumb,SecurityContext securityContext)
      throws NotFoundException;
      Response postJobEnable(String name,String jenkinsCrumb,SecurityContext securityContext)
      throws NotFoundException;
      Response postJobLastBuildStop(String name,String jenkinsCrumb,SecurityContext securityContext)
      throws NotFoundException;
}
