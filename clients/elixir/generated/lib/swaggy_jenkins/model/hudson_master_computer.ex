# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SwaggyJenkins.Model.HudsonMasterComputer do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"_class",
    :"displayName",
    :"executors",
    :"icon",
    :"iconClassName",
    :"idle",
    :"jnlpAgent",
    :"launchSupported",
    :"loadStatistics",
    :"manualLaunchAllowed",
    :"monitorData",
    :"numExecutors",
    :"offline",
    :"offlineCause",
    :"offlineCauseReason",
    :"temporarilyOffline"
  ]

  @type t :: %__MODULE__{
    :"_class" => String.t | nil,
    :"displayName" => String.t | nil,
    :"executors" => [SwaggyJenkins.Model.HudsonMasterComputerexecutors.t] | nil,
    :"icon" => String.t | nil,
    :"iconClassName" => String.t | nil,
    :"idle" => boolean() | nil,
    :"jnlpAgent" => boolean() | nil,
    :"launchSupported" => boolean() | nil,
    :"loadStatistics" => SwaggyJenkins.Model.Label1.t | nil,
    :"manualLaunchAllowed" => boolean() | nil,
    :"monitorData" => SwaggyJenkins.Model.HudsonMasterComputermonitorData.t | nil,
    :"numExecutors" => integer() | nil,
    :"offline" => boolean() | nil,
    :"offlineCause" => String.t | nil,
    :"offlineCauseReason" => String.t | nil,
    :"temporarilyOffline" => boolean() | nil
  }
end

defimpl Poison.Decoder, for: SwaggyJenkins.Model.HudsonMasterComputer do
  import SwaggyJenkins.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"executors", :list, SwaggyJenkins.Model.HudsonMasterComputerexecutors, options)
    |> deserialize(:"loadStatistics", :struct, SwaggyJenkins.Model.Label1, options)
    |> deserialize(:"monitorData", :struct, SwaggyJenkins.Model.HudsonMasterComputermonitorData, options)
  end
end

