# #Swaggy Jenkins
#
##Jenkins API clients generated from Swagger / Open API specification
#
#The version of the OpenAPI document: 1.1.2-pre.0
#Contact: blah@cliffano.com
#Generated by: https://openapi-generator.tech
#OpenAPI Generator version: 5.4.0
#

# load modules
require "spec"
require "json"
require "../src/"

def assert_compilation_error(path : String, message : String) : Nil
  buffer = IO::Memory.new
  result = Process.run("crystal", ["run", "--no-color", "--no-codegen", path], error: buffer)
  result.success?.should be_false
  buffer.to_s.should contain message
  buffer.close
end
