--[[
  Swaggy Jenkins

  Jenkins API clients generated from Swagger / Open API specification

  The version of the OpenAPI document: 1.1.1
  Contact: blah@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- pipeline_step_impl class
local pipeline_step_impl = {}
local pipeline_step_impl_mt = {
	__name = "pipeline_step_impl";
	__index = pipeline_step_impl;
}

local function cast_pipeline_step_impl(t)
	return setmetatable(t, pipeline_step_impl_mt)
end

local function new_pipeline_step_impl(_class, _links, display_name, duration_in_millis, id, input, result, start_time, state)
	return cast_pipeline_step_impl({
		["_class"] = _class;
		["_links"] = _links;
		["displayName"] = display_name;
		["durationInMillis"] = duration_in_millis;
		["id"] = id;
		["input"] = input;
		["result"] = result;
		["startTime"] = start_time;
		["state"] = state;
	})
end

return {
	cast = cast_pipeline_step_impl;
	new = new_pipeline_step_impl;
}
