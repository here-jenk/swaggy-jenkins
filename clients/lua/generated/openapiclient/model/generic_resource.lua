--[[
  Swaggy Jenkins

  Jenkins API clients generated from Swagger / Open API specification

  The version of the OpenAPI document: 1.5.1-pre.0
  Contact: blah@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- generic_resource class
local generic_resource = {}
local generic_resource_mt = {
	__name = "generic_resource";
	__index = generic_resource;
}

local function cast_generic_resource(t)
	return setmetatable(t, generic_resource_mt)
end

local function new_generic_resource(_class, display_name, duration_in_millis, id, result, start_time)
	return cast_generic_resource({
		["_class"] = _class;
		["displayName"] = display_name;
		["durationInMillis"] = duration_in_millis;
		["id"] = id;
		["result"] = result;
		["startTime"] = start_time;
	})
end

return {
	cast = cast_generic_resource;
	new = new_generic_resource;
}
