--[[
  Swaggy Jenkins

  Jenkins API clients generated from Swagger / Open API specification

  The version of the OpenAPI document: 1.1.1
  Contact: blah@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- github_scm class
local github_scm = {}
local github_scm_mt = {
	__name = "github_scm";
	__index = github_scm;
}

local function cast_github_scm(t)
	return setmetatable(t, github_scm_mt)
end

local function new_github_scm(_class, _links, credential_id, id, uri)
	return cast_github_scm({
		["_class"] = _class;
		["_links"] = _links;
		["credentialId"] = credential_id;
		["id"] = id;
		["uri"] = uri;
	})
end

return {
	cast = cast_github_scm;
	new = new_github_scm;
}
