note
 description:"[
		Swaggy Jenkins
 		Jenkins API clients generated from Swagger / Open API specification
  		The version of the OpenAPI document: 1.5.1-pre.0
 	    Contact: blah@cliffano.com

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"
class DEFAULT_CRUMB_ISSUER




feature --Access

    var_class: detachable STRING_32
      
    crumb: detachable STRING_32
      
    crumb_request_field: detachable STRING_32
      

feature -- Change Element

    set_var_class (a_name: like var_class)
        -- Set 'var_class' with 'a_name'.
      do
        var_class := a_name
      ensure
        var_class_set: var_class = a_name
      end

    set_crumb (a_name: like crumb)
        -- Set 'crumb' with 'a_name'.
      do
        crumb := a_name
      ensure
        crumb_set: crumb = a_name
      end

    set_crumb_request_field (a_name: like crumb_request_field)
        -- Set 'crumb_request_field' with 'a_name'.
      do
        crumb_request_field := a_name
      ensure
        crumb_request_field_set: crumb_request_field = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass DEFAULT_CRUMB_ISSUER%N")
        if attached var_class as l_var_class then
          Result.append ("%Nvar_class:")
          Result.append (l_var_class.out)
          Result.append ("%N")
        end
        if attached crumb as l_crumb then
          Result.append ("%Ncrumb:")
          Result.append (l_crumb.out)
          Result.append ("%N")
        end
        if attached crumb_request_field as l_crumb_request_field then
          Result.append ("%Ncrumb_request_field:")
          Result.append (l_crumb_request_field.out)
          Result.append ("%N")
        end
      end
end

