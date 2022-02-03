--[[
  Swaggy Jenkins

  Jenkins API clients generated from Swagger / Open API specification

  The version of the OpenAPI document: 1.1.1
  Contact: blah@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- branch_impl class
local branch_impl = {}
local branch_impl_mt = {
	__name = "branch_impl";
	__index = branch_impl;
}

local function cast_branch_impl(t)
	return setmetatable(t, branch_impl_mt)
end

local function new_branch_impl(_class, display_name, estimated_duration_in_millis, full_display_name, full_name, name, organization, parameters, permissions, weather_score, pull_request, _links, latest_run)
	return cast_branch_impl({
		["_class"] = _class;
		["displayName"] = display_name;
		["estimatedDurationInMillis"] = estimated_duration_in_millis;
		["fullDisplayName"] = full_display_name;
		["fullName"] = full_name;
		["name"] = name;
		["organization"] = organization;
		["parameters"] = parameters;
		["permissions"] = permissions;
		["weatherScore"] = weather_score;
		["pullRequest"] = pull_request;
		["_links"] = _links;
		["latestRun"] = latest_run;
	})
end

return {
	cast = cast_branch_impl;
	new = new_branch_impl;
}
