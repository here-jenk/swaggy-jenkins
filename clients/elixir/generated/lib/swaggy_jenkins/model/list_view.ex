# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SwaggyJenkins.Model.ListView do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"_class",
    :"description",
    :"jobs",
    :"name",
    :"url"
  ]

  @type t :: %__MODULE__{
    :"_class" => String.t | nil,
    :"description" => String.t | nil,
    :"jobs" => [SwaggyJenkins.Model.FreeStyleProject.t] | nil,
    :"name" => String.t | nil,
    :"url" => String.t | nil
  }
end

defimpl Poison.Decoder, for: SwaggyJenkins.Model.ListView do
  import SwaggyJenkins.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"jobs", :list, SwaggyJenkins.Model.FreeStyleProject, options)
  end
end

