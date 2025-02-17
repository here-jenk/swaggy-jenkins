--[[
  Swaggy Jenkins

  Jenkins API clients generated from Swagger / Open API specification

  The version of the OpenAPI document: 1.5.1-pre.0
  Contact: blah@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- multibranch_pipeline class
local multibranch_pipeline = {}
local multibranch_pipeline_mt = {
	__name = "multibranch_pipeline";
	__index = multibranch_pipeline;
}

local function cast_multibranch_pipeline(t)
	return setmetatable(t, multibranch_pipeline_mt)
end

local function new_multibranch_pipeline(display_name, estimated_duration_in_millis, latest_run, name, organization, weather_score, branch_names, number_of_failing_branches, number_of_failing_pull_requests, number_of_successful_branches, number_of_successful_pull_requests, total_number_of_branches, total_number_of_pull_requests, _class)
	return cast_multibranch_pipeline({
		["displayName"] = display_name;
		["estimatedDurationInMillis"] = estimated_duration_in_millis;
		["latestRun"] = latest_run;
		["name"] = name;
		["organization"] = organization;
		["weatherScore"] = weather_score;
		["branchNames"] = branch_names;
		["numberOfFailingBranches"] = number_of_failing_branches;
		["numberOfFailingPullRequests"] = number_of_failing_pull_requests;
		["numberOfSuccessfulBranches"] = number_of_successful_branches;
		["numberOfSuccessfulPullRequests"] = number_of_successful_pull_requests;
		["totalNumberOfBranches"] = total_number_of_branches;
		["totalNumberOfPullRequests"] = total_number_of_pull_requests;
		["_class"] = _class;
	})
end

return {
	cast = cast_multibranch_pipeline;
	new = new_multibranch_pipeline;
}
