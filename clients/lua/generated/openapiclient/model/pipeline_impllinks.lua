--[[
  Swaggy Jenkins

  Jenkins API clients generated from Swagger / Open API specification

  The version of the OpenAPI document: 1.5.1-pre.0
  Contact: blah@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- pipeline_impllinks class
local pipeline_impllinks = {}
local pipeline_impllinks_mt = {
	__name = "pipeline_impllinks";
	__index = pipeline_impllinks;
}

local function cast_pipeline_impllinks(t)
	return setmetatable(t, pipeline_impllinks_mt)
end

local function new_pipeline_impllinks(runs, self, queue, actions, _class)
	return cast_pipeline_impllinks({
		["runs"] = runs;
		["self"] = self;
		["queue"] = queue;
		["actions"] = actions;
		["_class"] = _class;
	})
end

return {
	cast = cast_pipeline_impllinks;
	new = new_pipeline_impllinks;
}
