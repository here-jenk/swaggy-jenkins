--[[
  Swaggy Jenkins

  Jenkins API clients generated from Swagger / Open API specification

  The version of the OpenAPI document: 1.5.1-pre.0
  Contact: blah@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- pipeline_folder_impl class
local pipeline_folder_impl = {}
local pipeline_folder_impl_mt = {
	__name = "pipeline_folder_impl";
	__index = pipeline_folder_impl;
}

local function cast_pipeline_folder_impl(t)
	return setmetatable(t, pipeline_folder_impl_mt)
end

local function new_pipeline_folder_impl(_class, display_name, full_name, name, organization, number_of_folders, number_of_pipelines)
	return cast_pipeline_folder_impl({
		["_class"] = _class;
		["displayName"] = display_name;
		["fullName"] = full_name;
		["name"] = name;
		["organization"] = organization;
		["numberOfFolders"] = number_of_folders;
		["numberOfPipelines"] = number_of_pipelines;
	})
end

return {
	cast = cast_pipeline_folder_impl;
	new = new_pipeline_folder_impl;
}
