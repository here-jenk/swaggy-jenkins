/**
* Swaggy Jenkins
* Jenkins API clients generated from Swagger / Open API specification
*
* The version of the OpenAPI document: 1.5.1-pre.0
* Contact: blah@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * PipelineBranchesitempullRequest.h
 *
 * 
 */

#ifndef PipelineBranchesitempullRequest_H_
#define PipelineBranchesitempullRequest_H_


#include <string>
#include "PipelineBranchesitempullRequestlinks.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  PipelineBranchesitempullRequest
{
public:
    PipelineBranchesitempullRequest();
    virtual ~PipelineBranchesitempullRequest() = default;


    /// <summary>
    /// Validate the current data in the model. Throws a ValidationException on failure.
    /// </summary>
    void validate() const;

    /// <summary>
    /// Validate the current data in the model. Returns false on error and writes an error
    /// message into the given stringstream.
    /// </summary>
    bool validate(std::stringstream& msg) const;

    /// <summary>
    /// Helper overload for validate. Used when one model stores another model and calls it's validate.
    /// Not meant to be called outside that case.
    /// </summary>
    bool validate(std::stringstream& msg, const std::string& pathPrefix) const;

    bool operator==(const PipelineBranchesitempullRequest& rhs) const;
    bool operator!=(const PipelineBranchesitempullRequest& rhs) const;

    /////////////////////////////////////////////
    /// PipelineBranchesitempullRequest members

    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::PipelineBranchesitempullRequestlinks getLinks() const;
    void setLinks(org::openapitools::server::model::PipelineBranchesitempullRequestlinks const& value);
    bool linksIsSet() const;
    void unset_links();
    /// <summary>
    /// 
    /// </summary>
    std::string getAuthor() const;
    void setAuthor(std::string const& value);
    bool authorIsSet() const;
    void unsetAuthor();
    /// <summary>
    /// 
    /// </summary>
    std::string getId() const;
    void setId(std::string const& value);
    bool idIsSet() const;
    void unsetId();
    /// <summary>
    /// 
    /// </summary>
    std::string getTitle() const;
    void setTitle(std::string const& value);
    bool titleIsSet() const;
    void unsetTitle();
    /// <summary>
    /// 
    /// </summary>
    std::string getUrl() const;
    void setUrl(std::string const& value);
    bool urlIsSet() const;
    void unsetUrl();
    /// <summary>
    /// 
    /// </summary>
    std::string getClass() const;
    void setClass(std::string const& value);
    bool r_classIsSet() const;
    void unset_class();

    friend void to_json(nlohmann::json& j, const PipelineBranchesitempullRequest& o);
    friend void from_json(const nlohmann::json& j, PipelineBranchesitempullRequest& o);
protected:
    org::openapitools::server::model::PipelineBranchesitempullRequestlinks m__links;
    bool m__linksIsSet;
    std::string m_Author;
    bool m_AuthorIsSet;
    std::string m_Id;
    bool m_IdIsSet;
    std::string m_Title;
    bool m_TitleIsSet;
    std::string m_Url;
    bool m_UrlIsSet;
    std::string m__class;
    bool m__classIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* PipelineBranchesitempullRequest_H_ */
