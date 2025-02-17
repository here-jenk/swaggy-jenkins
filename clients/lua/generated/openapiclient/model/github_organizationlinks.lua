--[[
  Swaggy Jenkins

  Jenkins API clients generated from Swagger / Open API specification

  The version of the OpenAPI document: 1.5.1-pre.0
  Contact: blah@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- github_organizationlinks class
local github_organizationlinks = {}
local github_organizationlinks_mt = {
	__name = "github_organizationlinks";
	__index = github_organizationlinks;
}

local function cast_github_organizationlinks(t)
	return setmetatable(t, github_organizationlinks_mt)
end

local function new_github_organizationlinks(repositories, self, _class)
	return cast_github_organizationlinks({
		["repositories"] = repositories;
		["self"] = self;
		["_class"] = _class;
	})
end

return {
	cast = cast_github_organizationlinks;
	new = new_github_organizationlinks;
}
