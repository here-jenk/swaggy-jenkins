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
class HUDSON_MASTER_COMPUTER




feature --Access

    var_class: detachable STRING_32
      
    display_name: detachable STRING_32
      
    executors: detachable LIST [HUDSON_MASTER_COMPUTEREXECUTORS]
      
    icon: detachable STRING_32
      
    icon_class_name: detachable STRING_32
      
 	idle: BOOLEAN
    	 
 	jnlp_agent: BOOLEAN
    	 
 	launch_supported: BOOLEAN
    	 
    load_statistics: detachable LABEL1
      
 	manual_launch_allowed: BOOLEAN
    	 
    monitor_data: detachable HUDSON_MASTER_COMPUTERMONITOR_DATA
      
 	num_executors: INTEGER_32
    	 
 	offline: BOOLEAN
    	 
    offline_cause: detachable STRING_32
      
    offline_cause_reason: detachable STRING_32
      
 	temporarily_offline: BOOLEAN
    	 

feature -- Change Element

    set_var_class (a_name: like var_class)
        -- Set 'var_class' with 'a_name'.
      do
        var_class := a_name
      ensure
        var_class_set: var_class = a_name
      end

    set_display_name (a_name: like display_name)
        -- Set 'display_name' with 'a_name'.
      do
        display_name := a_name
      ensure
        display_name_set: display_name = a_name
      end

    set_executors (a_name: like executors)
        -- Set 'executors' with 'a_name'.
      do
        executors := a_name
      ensure
        executors_set: executors = a_name
      end

    set_icon (a_name: like icon)
        -- Set 'icon' with 'a_name'.
      do
        icon := a_name
      ensure
        icon_set: icon = a_name
      end

    set_icon_class_name (a_name: like icon_class_name)
        -- Set 'icon_class_name' with 'a_name'.
      do
        icon_class_name := a_name
      ensure
        icon_class_name_set: icon_class_name = a_name
      end

    set_idle (a_name: like idle)
        -- Set 'idle' with 'a_name'.
      do
        idle := a_name
      ensure
        idle_set: idle = a_name
      end

    set_jnlp_agent (a_name: like jnlp_agent)
        -- Set 'jnlp_agent' with 'a_name'.
      do
        jnlp_agent := a_name
      ensure
        jnlp_agent_set: jnlp_agent = a_name
      end

    set_launch_supported (a_name: like launch_supported)
        -- Set 'launch_supported' with 'a_name'.
      do
        launch_supported := a_name
      ensure
        launch_supported_set: launch_supported = a_name
      end

    set_load_statistics (a_name: like load_statistics)
        -- Set 'load_statistics' with 'a_name'.
      do
        load_statistics := a_name
      ensure
        load_statistics_set: load_statistics = a_name
      end

    set_manual_launch_allowed (a_name: like manual_launch_allowed)
        -- Set 'manual_launch_allowed' with 'a_name'.
      do
        manual_launch_allowed := a_name
      ensure
        manual_launch_allowed_set: manual_launch_allowed = a_name
      end

    set_monitor_data (a_name: like monitor_data)
        -- Set 'monitor_data' with 'a_name'.
      do
        monitor_data := a_name
      ensure
        monitor_data_set: monitor_data = a_name
      end

    set_num_executors (a_name: like num_executors)
        -- Set 'num_executors' with 'a_name'.
      do
        num_executors := a_name
      ensure
        num_executors_set: num_executors = a_name
      end

    set_offline (a_name: like offline)
        -- Set 'offline' with 'a_name'.
      do
        offline := a_name
      ensure
        offline_set: offline = a_name
      end

    set_offline_cause (a_name: like offline_cause)
        -- Set 'offline_cause' with 'a_name'.
      do
        offline_cause := a_name
      ensure
        offline_cause_set: offline_cause = a_name
      end

    set_offline_cause_reason (a_name: like offline_cause_reason)
        -- Set 'offline_cause_reason' with 'a_name'.
      do
        offline_cause_reason := a_name
      ensure
        offline_cause_reason_set: offline_cause_reason = a_name
      end

    set_temporarily_offline (a_name: like temporarily_offline)
        -- Set 'temporarily_offline' with 'a_name'.
      do
        temporarily_offline := a_name
      ensure
        temporarily_offline_set: temporarily_offline = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass HUDSON_MASTER_COMPUTER%N")
        if attached var_class as l_var_class then
          Result.append ("%Nvar_class:")
          Result.append (l_var_class.out)
          Result.append ("%N")
        end
        if attached display_name as l_display_name then
          Result.append ("%Ndisplay_name:")
          Result.append (l_display_name.out)
          Result.append ("%N")
        end
        if attached executors as l_executors then
          across l_executors as ic loop
            Result.append ("%N executors:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
        if attached icon as l_icon then
          Result.append ("%Nicon:")
          Result.append (l_icon.out)
          Result.append ("%N")
        end
        if attached icon_class_name as l_icon_class_name then
          Result.append ("%Nicon_class_name:")
          Result.append (l_icon_class_name.out)
          Result.append ("%N")
        end
        if attached idle as l_idle then
          Result.append ("%Nidle:")
          Result.append (l_idle.out)
          Result.append ("%N")
        end
        if attached jnlp_agent as l_jnlp_agent then
          Result.append ("%Njnlp_agent:")
          Result.append (l_jnlp_agent.out)
          Result.append ("%N")
        end
        if attached launch_supported as l_launch_supported then
          Result.append ("%Nlaunch_supported:")
          Result.append (l_launch_supported.out)
          Result.append ("%N")
        end
        if attached load_statistics as l_load_statistics then
          Result.append ("%Nload_statistics:")
          Result.append (l_load_statistics.out)
          Result.append ("%N")
        end
        if attached manual_launch_allowed as l_manual_launch_allowed then
          Result.append ("%Nmanual_launch_allowed:")
          Result.append (l_manual_launch_allowed.out)
          Result.append ("%N")
        end
        if attached monitor_data as l_monitor_data then
          Result.append ("%Nmonitor_data:")
          Result.append (l_monitor_data.out)
          Result.append ("%N")
        end
        if attached num_executors as l_num_executors then
          Result.append ("%Nnum_executors:")
          Result.append (l_num_executors.out)
          Result.append ("%N")
        end
        if attached offline as l_offline then
          Result.append ("%Noffline:")
          Result.append (l_offline.out)
          Result.append ("%N")
        end
        if attached offline_cause as l_offline_cause then
          Result.append ("%Noffline_cause:")
          Result.append (l_offline_cause.out)
          Result.append ("%N")
        end
        if attached offline_cause_reason as l_offline_cause_reason then
          Result.append ("%Noffline_cause_reason:")
          Result.append (l_offline_cause_reason.out)
          Result.append ("%N")
        end
        if attached temporarily_offline as l_temporarily_offline then
          Result.append ("%Ntemporarily_offline:")
          Result.append (l_temporarily_offline.out)
          Result.append ("%N")
        end
      end
end

