--[[
  Swaggy Jenkins

  Jenkins API clients generated from Swagger / Open API specification

  The version of the OpenAPI document: 1.5.1-pre.0
  Contact: blah@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- pipeline_runartifacts class
local pipeline_runartifacts = {}
local pipeline_runartifacts_mt = {
	__name = "pipeline_runartifacts";
	__index = pipeline_runartifacts;
}

local function cast_pipeline_runartifacts(t)
	return setmetatable(t, pipeline_runartifacts_mt)
end

local function new_pipeline_runartifacts(name, size, url, _class)
	return cast_pipeline_runartifacts({
		["name"] = name;
		["size"] = size;
		["url"] = url;
		["_class"] = _class;
	})
end

return {
	cast = cast_pipeline_runartifacts;
	new = new_pipeline_runartifacts;
}
