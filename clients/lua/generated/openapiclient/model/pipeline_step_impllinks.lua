--[[
  Swaggy Jenkins

  Jenkins API clients generated from Swagger / Open API specification

  The version of the OpenAPI document: 1.1.1
  Contact: blah@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- pipeline_step_impllinks class
local pipeline_step_impllinks = {}
local pipeline_step_impllinks_mt = {
	__name = "pipeline_step_impllinks";
	__index = pipeline_step_impllinks;
}

local function cast_pipeline_step_impllinks(t)
	return setmetatable(t, pipeline_step_impllinks_mt)
end

local function new_pipeline_step_impllinks(self, actions, _class)
	return cast_pipeline_step_impllinks({
		["self"] = self;
		["actions"] = actions;
		["_class"] = _class;
	})
end

return {
	cast = cast_pipeline_step_impllinks;
	new = new_pipeline_step_impllinks;
}
