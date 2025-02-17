# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SwaggyJenkins.Model.QueueLeftItem do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"_class",
    :"actions",
    :"blocked",
    :"buildable",
    :"id",
    :"inQueueSince",
    :"params",
    :"stuck",
    :"task",
    :"url",
    :"why",
    :"cancelled",
    :"executable"
  ]

  @type t :: %__MODULE__{
    :"_class" => String.t | nil,
    :"actions" => [SwaggyJenkins.Model.CauseAction.t] | nil,
    :"blocked" => boolean() | nil,
    :"buildable" => boolean() | nil,
    :"id" => integer() | nil,
    :"inQueueSince" => integer() | nil,
    :"params" => String.t | nil,
    :"stuck" => boolean() | nil,
    :"task" => SwaggyJenkins.Model.FreeStyleProject.t | nil,
    :"url" => String.t | nil,
    :"why" => String.t | nil,
    :"cancelled" => boolean() | nil,
    :"executable" => SwaggyJenkins.Model.FreeStyleBuild.t | nil
  }
end

defimpl Poison.Decoder, for: SwaggyJenkins.Model.QueueLeftItem do
  import SwaggyJenkins.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"actions", :list, SwaggyJenkins.Model.CauseAction, options)
    |> deserialize(:"task", :struct, SwaggyJenkins.Model.FreeStyleProject, options)
    |> deserialize(:"executable", :struct, SwaggyJenkins.Model.FreeStyleBuild, options)
  end
end

