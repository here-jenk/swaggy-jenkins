--[[
  Swaggy Jenkins

  Jenkins API clients generated from Swagger / Open API specification

  The version of the OpenAPI document: 1.5.1-pre.0
  Contact: blah@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- pipeline_activityartifacts class
local pipeline_activityartifacts = {}
local pipeline_activityartifacts_mt = {
	__name = "pipeline_activityartifacts";
	__index = pipeline_activityartifacts;
}

local function cast_pipeline_activityartifacts(t)
	return setmetatable(t, pipeline_activityartifacts_mt)
end

local function new_pipeline_activityartifacts(name, size, url, _class)
	return cast_pipeline_activityartifacts({
		["name"] = name;
		["size"] = size;
		["url"] = url;
		["_class"] = _class;
	})
end

return {
	cast = cast_pipeline_activityartifacts;
	new = new_pipeline_activityartifacts;
}
