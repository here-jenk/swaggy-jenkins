package org.openapitools.api.factories;

import org.openapitools.api.CreateViewApiService;
import org.openapitools.api.impl.CreateViewApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2022-02-10T09:47:07.448540Z[Etc/UTC]")
public class CreateViewApiServiceFactory {
    private static final CreateViewApiService service = new CreateViewApiServiceImpl();

    public static CreateViewApiService getCreateViewApi() {
        return service;
    }
}
