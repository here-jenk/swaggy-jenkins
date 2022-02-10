# #Swaggy Jenkins
#
##Jenkins API clients generated from Swagger / Open API specification
#
#The version of the OpenAPI document: 1.1.2-pre.0
#Contact: blah@cliffano.com
#Generated by: https://openapi-generator.tech
#OpenAPI Generator version: 5.4.0
#

require "json"
require "time"

module 
  class HudsonMasterComputer
    include JSON::Serializable

    # Optional properties
    @[JSON::Field(key: "_class", type: String?, nillable: true, emit_null: false)]
    property _class : String?

    @[JSON::Field(key: "displayName", type: String?, nillable: true, emit_null: false)]
    property display_name : String?

    @[JSON::Field(key: "executors", type: Array(HudsonMasterComputerexecutors)?, nillable: true, emit_null: false)]
    property executors : Array(HudsonMasterComputerexecutors)?

    @[JSON::Field(key: "icon", type: String?, nillable: true, emit_null: false)]
    property icon : String?

    @[JSON::Field(key: "iconClassName", type: String?, nillable: true, emit_null: false)]
    property icon_class_name : String?

    @[JSON::Field(key: "idle", type: Bool?, nillable: true, emit_null: false)]
    property idle : Bool?

    @[JSON::Field(key: "jnlpAgent", type: Bool?, nillable: true, emit_null: false)]
    property jnlp_agent : Bool?

    @[JSON::Field(key: "launchSupported", type: Bool?, nillable: true, emit_null: false)]
    property launch_supported : Bool?

    @[JSON::Field(key: "loadStatistics", type: Label1?, nillable: true, emit_null: false)]
    property load_statistics : Label1?

    @[JSON::Field(key: "manualLaunchAllowed", type: Bool?, nillable: true, emit_null: false)]
    property manual_launch_allowed : Bool?

    @[JSON::Field(key: "monitorData", type: HudsonMasterComputermonitorData?, nillable: true, emit_null: false)]
    property monitor_data : HudsonMasterComputermonitorData?

    @[JSON::Field(key: "numExecutors", type: Int32?, nillable: true, emit_null: false)]
    property num_executors : Int32?

    @[JSON::Field(key: "offline", type: Bool?, nillable: true, emit_null: false)]
    property offline : Bool?

    @[JSON::Field(key: "offlineCause", type: String?, nillable: true, emit_null: false)]
    property offline_cause : String?

    @[JSON::Field(key: "offlineCauseReason", type: String?, nillable: true, emit_null: false)]
    property offline_cause_reason : String?

    @[JSON::Field(key: "temporarilyOffline", type: Bool?, nillable: true, emit_null: false)]
    property temporarily_offline : Bool?

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(@_class : String?, @display_name : String?, @executors : Array(HudsonMasterComputerexecutors)?, @icon : String?, @icon_class_name : String?, @idle : Bool?, @jnlp_agent : Bool?, @launch_supported : Bool?, @load_statistics : Label1?, @manual_launch_allowed : Bool?, @monitor_data : HudsonMasterComputermonitorData?, @num_executors : Int32?, @offline : Bool?, @offline_cause : String?, @offline_cause_reason : String?, @temporarily_offline : Bool?)
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array(String).new
      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.same?(o)
      self.class == o.class &&
          _class == o._class &&
          display_name == o.display_name &&
          executors == o.executors &&
          icon == o.icon &&
          icon_class_name == o.icon_class_name &&
          idle == o.idle &&
          jnlp_agent == o.jnlp_agent &&
          launch_supported == o.launch_supported &&
          load_statistics == o.load_statistics &&
          manual_launch_allowed == o.manual_launch_allowed &&
          monitor_data == o.monitor_data &&
          num_executors == o.num_executors &&
          offline == o.offline &&
          offline_cause == o.offline_cause &&
          offline_cause_reason == o.offline_cause_reason &&
          temporarily_offline == o.temporarily_offline
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [_class, display_name, executors, icon, icon_class_name, idle, jnlp_agent, launch_supported, load_statistics, manual_launch_allowed, monitor_data, num_executors, offline, offline_cause, offline_cause_reason, temporarily_offline].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def self.build_from_hash(attributes)
      new.build_from_hash(attributes)
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      self.class.openapi_types.each_pair do |key, type|
        if !attributes[self.class.attribute_map[key]]? && self.class.openapi_nullable.includes?(key)
          self.send("#{key}=", nil)
        elsif type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map { |v| _deserialize($1, v) })
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        end
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
      case type.to_sym
      when :Time
        Time.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :Boolean
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        ({} of Symbol => String).tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        # models (e.g. Pet) or oneOf
        klass = .const_get(type)
        klass.respond_to?(:openapi_one_of) ? klass.build(value) : klass.build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {} of Symbol => String
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        if value.nil?
          is_nullable = self.class.openapi_nullable.includes?(attr)
          next if !is_nullable || (is_nullable && !instance_variable_defined?(:"@#{attr}"))
        end

        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map { |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        ({} of Symbol => String).tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end

  end

end
