--[[
  Swaggy Jenkins

  Jenkins API clients generated from Swagger / Open API specification

  The version of the OpenAPI document: 1.1.1
  Contact: blah@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- pipeline_activity class
local pipeline_activity = {}
local pipeline_activity_mt = {
	__name = "pipeline_activity";
	__index = pipeline_activity;
}

local function cast_pipeline_activity(t)
	return setmetatable(t, pipeline_activity_mt)
end

local function new_pipeline_activity(_class, artifacts, duration_in_millis, estimated_duration_in_millis, en_queue_time, end_time, id, organization, pipeline, result, run_summary, start_time, state, type, commit_id)
	return cast_pipeline_activity({
		["_class"] = _class;
		["artifacts"] = artifacts;
		["durationInMillis"] = duration_in_millis;
		["estimatedDurationInMillis"] = estimated_duration_in_millis;
		["enQueueTime"] = en_queue_time;
		["endTime"] = end_time;
		["id"] = id;
		["organization"] = organization;
		["pipeline"] = pipeline;
		["result"] = result;
		["runSummary"] = run_summary;
		["startTime"] = start_time;
		["state"] = state;
		["type"] = type;
		["commitId"] = commit_id;
	})
end

return {
	cast = cast_pipeline_activity;
	new = new_pipeline_activity;
}
