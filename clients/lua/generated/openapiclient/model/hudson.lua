--[[
  Swaggy Jenkins

  Jenkins API clients generated from Swagger / Open API specification

  The version of the OpenAPI document: 1.1.1
  Contact: blah@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- hudson class
local hudson = {}
local hudson_mt = {
	__name = "hudson";
	__index = hudson;
}

local function cast_hudson(t)
	return setmetatable(t, hudson_mt)
end

local function new_hudson(_class, assigned_labels, mode, node_description, node_name, num_executors, description, jobs, primary_view, quieting_down, slave_agent_port, unlabeled_load, use_crumbs, use_security, views)
	return cast_hudson({
		["_class"] = _class;
		["assignedLabels"] = assigned_labels;
		["mode"] = mode;
		["nodeDescription"] = node_description;
		["nodeName"] = node_name;
		["numExecutors"] = num_executors;
		["description"] = description;
		["jobs"] = jobs;
		["primaryView"] = primary_view;
		["quietingDown"] = quieting_down;
		["slaveAgentPort"] = slave_agent_port;
		["unlabeledLoad"] = unlabeled_load;
		["useCrumbs"] = use_crumbs;
		["useSecurity"] = use_security;
		["views"] = views;
	})
end

return {
	cast = cast_hudson;
	new = new_hudson;
}
