# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule SwaggyJenkins.Model.Organisation do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"_class",
    :"name"
  ]

  @type t :: %__MODULE__{
    :"_class" => String.t | nil,
    :"name" => String.t | nil
  }
end

defimpl Poison.Decoder, for: SwaggyJenkins.Model.Organisation do
  def decode(value, _options) do
    value
  end
end

