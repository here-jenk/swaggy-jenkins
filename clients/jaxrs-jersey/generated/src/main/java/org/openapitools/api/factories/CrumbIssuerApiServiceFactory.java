package org.openapitools.api.factories;

import org.openapitools.api.CrumbIssuerApiService;
import org.openapitools.api.impl.CrumbIssuerApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2022-02-11T12:43:14.884276Z[Etc/UTC]")
public class CrumbIssuerApiServiceFactory {
    private static final CrumbIssuerApiService service = new CrumbIssuerApiServiceImpl();

    public static CrumbIssuerApiService getCrumbIssuerApi() {
        return service;
    }
}
