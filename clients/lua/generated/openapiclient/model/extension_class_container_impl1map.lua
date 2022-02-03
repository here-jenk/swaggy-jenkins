--[[
  Swaggy Jenkins

  Jenkins API clients generated from Swagger / Open API specification

  The version of the OpenAPI document: 1.1.1
  Contact: blah@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- extension_class_container_impl1map class
local extension_class_container_impl1map = {}
local extension_class_container_impl1map_mt = {
	__name = "extension_class_container_impl1map";
	__index = extension_class_container_impl1map;
}

local function cast_extension_class_container_impl1map(t)
	return setmetatable(t, extension_class_container_impl1map_mt)
end

local function new_extension_class_container_impl1map(io_jenkins_blueocean_service_embedded_rest_pipeline_impl, io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl, _class)
	return cast_extension_class_container_impl1map({
		["io.jenkins.blueocean.service.embedded.rest.PipelineImpl"] = io_jenkins_blueocean_service_embedded_rest_pipeline_impl;
		["io.jenkins.blueocean.service.embedded.rest.MultiBranchPipelineImpl"] = io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl;
		["_class"] = _class;
	})
end

return {
	cast = cast_extension_class_container_impl1map;
	new = new_extension_class_container_impl1map;
}
