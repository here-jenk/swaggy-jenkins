--[[
  Swaggy Jenkins

  Jenkins API clients generated from Swagger / Open API specification

  The version of the OpenAPI document: 1.5.1-pre.0
  Contact: blah@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- favorite_impl class
local favorite_impl = {}
local favorite_impl_mt = {
	__name = "favorite_impl";
	__index = favorite_impl;
}

local function cast_favorite_impl(t)
	return setmetatable(t, favorite_impl_mt)
end

local function new_favorite_impl(_class, _links, item)
	return cast_favorite_impl({
		["_class"] = _class;
		["_links"] = _links;
		["item"] = item;
	})
end

return {
	cast = cast_favorite_impl;
	new = new_favorite_impl;
}
