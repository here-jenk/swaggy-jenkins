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
class GITHUB_ORGANIZATION




feature --Access

    var_class: detachable STRING_32
      
    var_links: detachable GITHUB_ORGANIZATIONLINKS
      
 	jenkins_organization_pipeline: BOOLEAN
    	 
    name: detachable STRING_32
      

feature -- Change Element

    set_var_class (a_name: like var_class)
        -- Set 'var_class' with 'a_name'.
      do
        var_class := a_name
      ensure
        var_class_set: var_class = a_name
      end

    set_var_links (a_name: like var_links)
        -- Set 'var_links' with 'a_name'.
      do
        var_links := a_name
      ensure
        var_links_set: var_links = a_name
      end

    set_jenkins_organization_pipeline (a_name: like jenkins_organization_pipeline)
        -- Set 'jenkins_organization_pipeline' with 'a_name'.
      do
        jenkins_organization_pipeline := a_name
      ensure
        jenkins_organization_pipeline_set: jenkins_organization_pipeline = a_name
      end

    set_name (a_name: like name)
        -- Set 'name' with 'a_name'.
      do
        name := a_name
      ensure
        name_set: name = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass GITHUB_ORGANIZATION%N")
        if attached var_class as l_var_class then
          Result.append ("%Nvar_class:")
          Result.append (l_var_class.out)
          Result.append ("%N")
        end
        if attached var_links as l_var_links then
          Result.append ("%Nvar_links:")
          Result.append (l_var_links.out)
          Result.append ("%N")
        end
        if attached jenkins_organization_pipeline as l_jenkins_organization_pipeline then
          Result.append ("%Njenkins_organization_pipeline:")
          Result.append (l_jenkins_organization_pipeline.out)
          Result.append ("%N")
        end
        if attached name as l_name then
          Result.append ("%Nname:")
          Result.append (l_name.out)
          Result.append ("%N")
        end
      end
end

