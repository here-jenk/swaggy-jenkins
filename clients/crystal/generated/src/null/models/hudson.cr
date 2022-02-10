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
  class Hudson
    include JSON::Serializable

    # Optional properties
    @[JSON::Field(key: "_class", type: String?, nillable: true, emit_null: false)]
    property _class : String?

    @[JSON::Field(key: "assignedLabels", type: Array(HudsonassignedLabels)?, nillable: true, emit_null: false)]
    property assigned_labels : Array(HudsonassignedLabels)?

    @[JSON::Field(key: "mode", type: String?, nillable: true, emit_null: false)]
    property mode : String?

    @[JSON::Field(key: "nodeDescription", type: String?, nillable: true, emit_null: false)]
    property node_description : String?

    @[JSON::Field(key: "nodeName", type: String?, nillable: true, emit_null: false)]
    property node_name : String?

    @[JSON::Field(key: "numExecutors", type: Int32?, nillable: true, emit_null: false)]
    property num_executors : Int32?

    @[JSON::Field(key: "description", type: String?, nillable: true, emit_null: false)]
    property description : String?

    @[JSON::Field(key: "jobs", type: Array(FreeStyleProject)?, nillable: true, emit_null: false)]
    property jobs : Array(FreeStyleProject)?

    @[JSON::Field(key: "primaryView", type: AllView?, nillable: true, emit_null: false)]
    property primary_view : AllView?

    @[JSON::Field(key: "quietingDown", type: Bool?, nillable: true, emit_null: false)]
    property quieting_down : Bool?

    @[JSON::Field(key: "slaveAgentPort", type: Int32?, nillable: true, emit_null: false)]
    property slave_agent_port : Int32?

    @[JSON::Field(key: "unlabeledLoad", type: UnlabeledLoadStatistics?, nillable: true, emit_null: false)]
    property unlabeled_load : UnlabeledLoadStatistics?

    @[JSON::Field(key: "useCrumbs", type: Bool?, nillable: true, emit_null: false)]
    property use_crumbs : Bool?

    @[JSON::Field(key: "useSecurity", type: Bool?, nillable: true, emit_null: false)]
    property use_security : Bool?

    @[JSON::Field(key: "views", type: Array(AllView)?, nillable: true, emit_null: false)]
    property views : Array(AllView)?

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(@_class : String?, @assigned_labels : Array(HudsonassignedLabels)?, @mode : String?, @node_description : String?, @node_name : String?, @num_executors : Int32?, @description : String?, @jobs : Array(FreeStyleProject)?, @primary_view : AllView?, @quieting_down : Bool?, @slave_agent_port : Int32?, @unlabeled_load : UnlabeledLoadStatistics?, @use_crumbs : Bool?, @use_security : Bool?, @views : Array(AllView)?)
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
          assigned_labels == o.assigned_labels &&
          mode == o.mode &&
          node_description == o.node_description &&
          node_name == o.node_name &&
          num_executors == o.num_executors &&
          description == o.description &&
          jobs == o.jobs &&
          primary_view == o.primary_view &&
          quieting_down == o.quieting_down &&
          slave_agent_port == o.slave_agent_port &&
          unlabeled_load == o.unlabeled_load &&
          use_crumbs == o.use_crumbs &&
          use_security == o.use_security &&
          views == o.views
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [_class, assigned_labels, mode, node_description, node_name, num_executors, description, jobs, primary_view, quieting_down, slave_agent_port, unlabeled_load, use_crumbs, use_security, views].hash
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
