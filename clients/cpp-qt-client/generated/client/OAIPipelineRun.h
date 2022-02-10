/**
 * Swaggy Jenkins
 * Jenkins API clients generated from Swagger / Open API specification
 *
 * The version of the OpenAPI document: 1.1.2-pre.0
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * OAIPipelineRun.h
 *
 * 
 */

#ifndef OAIPipelineRun_H
#define OAIPipelineRun_H

#include <QJsonObject>

#include "OAIPipelineRunartifacts.h"
#include <QList>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIPipelineRun : public OAIObject {
public:
    OAIPipelineRun();
    OAIPipelineRun(QString json);
    ~OAIPipelineRun() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getClass() const;
    void setClass(const QString &_class);
    bool is__class_Set() const;
    bool is__class_Valid() const;

    QList<OAIPipelineRunartifacts> getArtifacts() const;
    void setArtifacts(const QList<OAIPipelineRunartifacts> &artifacts);
    bool is_artifacts_Set() const;
    bool is_artifacts_Valid() const;

    qint32 getDurationInMillis() const;
    void setDurationInMillis(const qint32 &duration_in_millis);
    bool is_duration_in_millis_Set() const;
    bool is_duration_in_millis_Valid() const;

    qint32 getEstimatedDurationInMillis() const;
    void setEstimatedDurationInMillis(const qint32 &estimated_duration_in_millis);
    bool is_estimated_duration_in_millis_Set() const;
    bool is_estimated_duration_in_millis_Valid() const;

    QString getEnQueueTime() const;
    void setEnQueueTime(const QString &en_queue_time);
    bool is_en_queue_time_Set() const;
    bool is_en_queue_time_Valid() const;

    QString getEndTime() const;
    void setEndTime(const QString &end_time);
    bool is_end_time_Set() const;
    bool is_end_time_Valid() const;

    QString getId() const;
    void setId(const QString &id);
    bool is_id_Set() const;
    bool is_id_Valid() const;

    QString getOrganization() const;
    void setOrganization(const QString &organization);
    bool is_organization_Set() const;
    bool is_organization_Valid() const;

    QString getPipeline() const;
    void setPipeline(const QString &pipeline);
    bool is_pipeline_Set() const;
    bool is_pipeline_Valid() const;

    QString getResult() const;
    void setResult(const QString &result);
    bool is_result_Set() const;
    bool is_result_Valid() const;

    QString getRunSummary() const;
    void setRunSummary(const QString &run_summary);
    bool is_run_summary_Set() const;
    bool is_run_summary_Valid() const;

    QString getStartTime() const;
    void setStartTime(const QString &start_time);
    bool is_start_time_Set() const;
    bool is_start_time_Valid() const;

    QString getState() const;
    void setState(const QString &state);
    bool is_state_Set() const;
    bool is_state_Valid() const;

    QString getType() const;
    void setType(const QString &type);
    bool is_type_Set() const;
    bool is_type_Valid() const;

    QString getCommitId() const;
    void setCommitId(const QString &commit_id);
    bool is_commit_id_Set() const;
    bool is_commit_id_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString _class;
    bool m__class_isSet;
    bool m__class_isValid;

    QList<OAIPipelineRunartifacts> artifacts;
    bool m_artifacts_isSet;
    bool m_artifacts_isValid;

    qint32 duration_in_millis;
    bool m_duration_in_millis_isSet;
    bool m_duration_in_millis_isValid;

    qint32 estimated_duration_in_millis;
    bool m_estimated_duration_in_millis_isSet;
    bool m_estimated_duration_in_millis_isValid;

    QString en_queue_time;
    bool m_en_queue_time_isSet;
    bool m_en_queue_time_isValid;

    QString end_time;
    bool m_end_time_isSet;
    bool m_end_time_isValid;

    QString id;
    bool m_id_isSet;
    bool m_id_isValid;

    QString organization;
    bool m_organization_isSet;
    bool m_organization_isValid;

    QString pipeline;
    bool m_pipeline_isSet;
    bool m_pipeline_isValid;

    QString result;
    bool m_result_isSet;
    bool m_result_isValid;

    QString run_summary;
    bool m_run_summary_isSet;
    bool m_run_summary_isValid;

    QString start_time;
    bool m_start_time_isSet;
    bool m_start_time_isValid;

    QString state;
    bool m_state_isSet;
    bool m_state_isValid;

    QString type;
    bool m_type_isSet;
    bool m_type_isValid;

    QString commit_id;
    bool m_commit_id_isSet;
    bool m_commit_id_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIPipelineRun)

#endif // OAIPipelineRun_H
