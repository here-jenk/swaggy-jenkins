--[[
  Swaggy Jenkins

  Jenkins API clients generated from Swagger / Open API specification

  The version of the OpenAPI document: 1.5.1-pre.0
  Contact: blah@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- input_step_impl class
local input_step_impl = {}
local input_step_impl_mt = {
	__name = "input_step_impl";
	__index = input_step_impl;
}

local function cast_input_step_impl(t)
	return setmetatable(t, input_step_impl_mt)
end

local function new_input_step_impl(_class, _links, id, message, ok, parameters, submitter)
	return cast_input_step_impl({
		["_class"] = _class;
		["_links"] = _links;
		["id"] = id;
		["message"] = message;
		["ok"] = ok;
		["parameters"] = parameters;
		["submitter"] = submitter;
	})
end

return {
	cast = cast_input_step_impl;
	new = new_input_step_impl;
}
