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
 * OAIMultibranchPipeline.h
 *
 * 
 */

#ifndef OAIMultibranchPipeline_H
#define OAIMultibranchPipeline_H

#include <QJsonObject>

#include <QList>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIMultibranchPipeline : public OAIObject {
public:
    OAIMultibranchPipeline();
    OAIMultibranchPipeline(QString json);
    ~OAIMultibranchPipeline() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getDisplayName() const;
    void setDisplayName(const QString &display_name);
    bool is_display_name_Set() const;
    bool is_display_name_Valid() const;

    qint32 getEstimatedDurationInMillis() const;
    void setEstimatedDurationInMillis(const qint32 &estimated_duration_in_millis);
    bool is_estimated_duration_in_millis_Set() const;
    bool is_estimated_duration_in_millis_Valid() const;

    QString getLatestRun() const;
    void setLatestRun(const QString &latest_run);
    bool is_latest_run_Set() const;
    bool is_latest_run_Valid() const;

    QString getName() const;
    void setName(const QString &name);
    bool is_name_Set() const;
    bool is_name_Valid() const;

    QString getOrganization() const;
    void setOrganization(const QString &organization);
    bool is_organization_Set() const;
    bool is_organization_Valid() const;

    qint32 getWeatherScore() const;
    void setWeatherScore(const qint32 &weather_score);
    bool is_weather_score_Set() const;
    bool is_weather_score_Valid() const;

    QList<QString> getBranchNames() const;
    void setBranchNames(const QList<QString> &branch_names);
    bool is_branch_names_Set() const;
    bool is_branch_names_Valid() const;

    qint32 getNumberOfFailingBranches() const;
    void setNumberOfFailingBranches(const qint32 &number_of_failing_branches);
    bool is_number_of_failing_branches_Set() const;
    bool is_number_of_failing_branches_Valid() const;

    qint32 getNumberOfFailingPullRequests() const;
    void setNumberOfFailingPullRequests(const qint32 &number_of_failing_pull_requests);
    bool is_number_of_failing_pull_requests_Set() const;
    bool is_number_of_failing_pull_requests_Valid() const;

    qint32 getNumberOfSuccessfulBranches() const;
    void setNumberOfSuccessfulBranches(const qint32 &number_of_successful_branches);
    bool is_number_of_successful_branches_Set() const;
    bool is_number_of_successful_branches_Valid() const;

    qint32 getNumberOfSuccessfulPullRequests() const;
    void setNumberOfSuccessfulPullRequests(const qint32 &number_of_successful_pull_requests);
    bool is_number_of_successful_pull_requests_Set() const;
    bool is_number_of_successful_pull_requests_Valid() const;

    qint32 getTotalNumberOfBranches() const;
    void setTotalNumberOfBranches(const qint32 &total_number_of_branches);
    bool is_total_number_of_branches_Set() const;
    bool is_total_number_of_branches_Valid() const;

    qint32 getTotalNumberOfPullRequests() const;
    void setTotalNumberOfPullRequests(const qint32 &total_number_of_pull_requests);
    bool is_total_number_of_pull_requests_Set() const;
    bool is_total_number_of_pull_requests_Valid() const;

    QString getClass() const;
    void setClass(const QString &_class);
    bool is__class_Set() const;
    bool is__class_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString display_name;
    bool m_display_name_isSet;
    bool m_display_name_isValid;

    qint32 estimated_duration_in_millis;
    bool m_estimated_duration_in_millis_isSet;
    bool m_estimated_duration_in_millis_isValid;

    QString latest_run;
    bool m_latest_run_isSet;
    bool m_latest_run_isValid;

    QString name;
    bool m_name_isSet;
    bool m_name_isValid;

    QString organization;
    bool m_organization_isSet;
    bool m_organization_isValid;

    qint32 weather_score;
    bool m_weather_score_isSet;
    bool m_weather_score_isValid;

    QList<QString> branch_names;
    bool m_branch_names_isSet;
    bool m_branch_names_isValid;

    qint32 number_of_failing_branches;
    bool m_number_of_failing_branches_isSet;
    bool m_number_of_failing_branches_isValid;

    qint32 number_of_failing_pull_requests;
    bool m_number_of_failing_pull_requests_isSet;
    bool m_number_of_failing_pull_requests_isValid;

    qint32 number_of_successful_branches;
    bool m_number_of_successful_branches_isSet;
    bool m_number_of_successful_branches_isValid;

    qint32 number_of_successful_pull_requests;
    bool m_number_of_successful_pull_requests_isSet;
    bool m_number_of_successful_pull_requests_isValid;

    qint32 total_number_of_branches;
    bool m_total_number_of_branches_isSet;
    bool m_total_number_of_branches_isValid;

    qint32 total_number_of_pull_requests;
    bool m_total_number_of_pull_requests_isSet;
    bool m_total_number_of_pull_requests_isValid;

    QString _class;
    bool m__class_isSet;
    bool m__class_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIMultibranchPipeline)

#endif // OAIMultibranchPipeline_H
