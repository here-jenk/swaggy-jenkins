--[[
  Swaggy Jenkins

  Jenkins API clients generated from Swagger / Open API specification

  The version of the OpenAPI document: 1.5.1-pre.0
  Contact: blah@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- github_repositorieslinks class
local github_repositorieslinks = {}
local github_repositorieslinks_mt = {
	__name = "github_repositorieslinks";
	__index = github_repositorieslinks;
}

local function cast_github_repositorieslinks(t)
	return setmetatable(t, github_repositorieslinks_mt)
end

local function new_github_repositorieslinks(self, _class)
	return cast_github_repositorieslinks({
		["self"] = self;
		["_class"] = _class;
	})
end

return {
	cast = cast_github_repositorieslinks;
	new = new_github_repositorieslinks;
}
