# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SwaggyJenkins.Model.GithubRepositorypermissions do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"admin",
    :"push",
    :"pull",
    :"_class"
  ]

  @type t :: %__MODULE__{
    :"admin" => boolean() | nil,
    :"push" => boolean() | nil,
    :"pull" => boolean() | nil,
    :"_class" => String.t | nil
  }
end

defimpl Poison.Decoder, for: SwaggyJenkins.Model.GithubRepositorypermissions do
  def decode(value, _options) do
    value
  end
end

