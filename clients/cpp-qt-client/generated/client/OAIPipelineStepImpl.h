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
 * OAIPipelineStepImpl.h
 *
 * 
 */

#ifndef OAIPipelineStepImpl_H
#define OAIPipelineStepImpl_H

#include <QJsonObject>

#include "OAIInputStepImpl.h"
#include "OAIPipelineStepImpllinks.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAIPipelineStepImpllinks;
class OAIInputStepImpl;

class OAIPipelineStepImpl : public OAIObject {
public:
    OAIPipelineStepImpl();
    OAIPipelineStepImpl(QString json);
    ~OAIPipelineStepImpl() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getClass() const;
    void setClass(const QString &_class);
    bool is__class_Set() const;
    bool is__class_Valid() const;

    OAIPipelineStepImpllinks getLinks() const;
    void setLinks(const OAIPipelineStepImpllinks &_links);
    bool is__links_Set() const;
    bool is__links_Valid() const;

    QString getDisplayName() const;
    void setDisplayName(const QString &display_name);
    bool is_display_name_Set() const;
    bool is_display_name_Valid() const;

    qint32 getDurationInMillis() const;
    void setDurationInMillis(const qint32 &duration_in_millis);
    bool is_duration_in_millis_Set() const;
    bool is_duration_in_millis_Valid() const;

    QString getId() const;
    void setId(const QString &id);
    bool is_id_Set() const;
    bool is_id_Valid() const;

    OAIInputStepImpl getInput() const;
    void setInput(const OAIInputStepImpl &input);
    bool is_input_Set() const;
    bool is_input_Valid() const;

    QString getResult() const;
    void setResult(const QString &result);
    bool is_result_Set() const;
    bool is_result_Valid() const;

    QString getStartTime() const;
    void setStartTime(const QString &start_time);
    bool is_start_time_Set() const;
    bool is_start_time_Valid() const;

    QString getState() const;
    void setState(const QString &state);
    bool is_state_Set() const;
    bool is_state_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString _class;
    bool m__class_isSet;
    bool m__class_isValid;

    OAIPipelineStepImpllinks _links;
    bool m__links_isSet;
    bool m__links_isValid;

    QString display_name;
    bool m_display_name_isSet;
    bool m_display_name_isValid;

    qint32 duration_in_millis;
    bool m_duration_in_millis_isSet;
    bool m_duration_in_millis_isValid;

    QString id;
    bool m_id_isSet;
    bool m_id_isValid;

    OAIInputStepImpl input;
    bool m_input_isSet;
    bool m_input_isValid;

    QString result;
    bool m_result_isSet;
    bool m_result_isValid;

    QString start_time;
    bool m_start_time_isSet;
    bool m_start_time_isValid;

    QString state;
    bool m_state_isSet;
    bool m_state_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIPipelineStepImpl)

#endif // OAIPipelineStepImpl_H
