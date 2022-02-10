# #Swaggy Jenkins
#
##Jenkins API clients generated from Swagger / Open API specification
#
#The version of the OpenAPI document: 1.1.2-pre.0
#Contact: blah@cliffano.com
#Generated by: https://openapi-generator.tech
#OpenAPI Generator version: 5.4.0
#

require "uri"

module 
  class BaseApi
    property api_client : ApiClient

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Retrieve CSRF protection token
    # @return [DefaultCrumbIssuer]
    def get_crumb()
      data, _status_code, _headers = get_crumb_with_http_info()
      data
    end

    # Retrieve CSRF protection token
    # @return [Array<(DefaultCrumbIssuer, Integer, Hash)>] DefaultCrumbIssuer data, response status code and response headers
    def get_crumb_with_http_info()
      if @api_client.config.debugging
        Log.debug {"Calling API: BaseApi.get_crumb ..."}
      end
      # resource path
      local_var_path = "/crumbIssuer/api/json"

      # query parameters
      query_params = Hash(String, String).new

      # header parameters
      header_params = Hash(String, String).new
      # HTTP header "Accept" (if needed)
      header_params["Accept"] = @api_client.select_header_accept(["application/json"])

      # form parameters
      form_params = Hash(Symbol, (String | ::File)).new

      # http body (model)
      post_body = nil

      # return_type
      return_type = "DefaultCrumbIssuer"

      # auth_names
      auth_names = ["jenkins_auth"]

      data, status_code, headers = @api_client.call_api(:GET,
                                                        local_var_path,
                                                        :"BaseApi.get_crumb",
                                                        return_type,
                                                        post_body,
                                                        auth_names,
                                                        header_params,
                                                        query_params,
                                                        form_params)
      if @api_client.config.debugging
        Log.debug {"API called: BaseApi#get_crumb\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"}
      end
      return DefaultCrumbIssuer.from_json(data), status_code, headers
    end
  end
end
