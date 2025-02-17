--[[
  Swaggy Jenkins

  Jenkins API clients generated from Swagger / Open API specification

  The version of the OpenAPI document: 1.5.1-pre.0
  Contact: blah@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- string_parameter_definition class
local string_parameter_definition = {}
local string_parameter_definition_mt = {
	__name = "string_parameter_definition";
	__index = string_parameter_definition;
}

local function cast_string_parameter_definition(t)
	return setmetatable(t, string_parameter_definition_mt)
end

local function new_string_parameter_definition(_class, default_parameter_value, description, name, type)
	return cast_string_parameter_definition({
		["_class"] = _class;
		["defaultParameterValue"] = default_parameter_value;
		["description"] = description;
		["name"] = name;
		["type"] = type;
	})
end

return {
	cast = cast_string_parameter_definition;
	new = new_string_parameter_definition;
}
