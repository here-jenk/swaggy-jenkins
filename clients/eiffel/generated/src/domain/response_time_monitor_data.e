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
class RESPONSE_TIME_MONITOR_DATA




feature --Access

    var_class: detachable STRING_32
      
 	timestamp: INTEGER_32
    	 
 	average: INTEGER_32
    	 

feature -- Change Element

    set_var_class (a_name: like var_class)
        -- Set 'var_class' with 'a_name'.
      do
        var_class := a_name
      ensure
        var_class_set: var_class = a_name
      end

    set_timestamp (a_name: like timestamp)
        -- Set 'timestamp' with 'a_name'.
      do
        timestamp := a_name
      ensure
        timestamp_set: timestamp = a_name
      end

    set_average (a_name: like average)
        -- Set 'average' with 'a_name'.
      do
        average := a_name
      ensure
        average_set: average = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass RESPONSE_TIME_MONITOR_DATA%N")
        if attached var_class as l_var_class then
          Result.append ("%Nvar_class:")
          Result.append (l_var_class.out)
          Result.append ("%N")
        end
        if attached timestamp as l_timestamp then
          Result.append ("%Ntimestamp:")
          Result.append (l_timestamp.out)
          Result.append ("%N")
        end
        if attached average as l_average then
          Result.append ("%Naverage:")
          Result.append (l_average.out)
          Result.append ("%N")
        end
      end
end

