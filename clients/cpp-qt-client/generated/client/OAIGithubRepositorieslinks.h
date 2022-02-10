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
 * OAIGithubRepositorieslinks.h
 *
 * 
 */

#ifndef OAIGithubRepositorieslinks_H
#define OAIGithubRepositorieslinks_H

#include <QJsonObject>

#include "OAILink.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIGithubRepositorieslinks : public OAIObject {
public:
    OAIGithubRepositorieslinks();
    OAIGithubRepositorieslinks(QString json);
    ~OAIGithubRepositorieslinks() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAILink getSelf() const;
    void setSelf(const OAILink &self);
    bool is_self_Set() const;
    bool is_self_Valid() const;

    QString getClass() const;
    void setClass(const QString &_class);
    bool is__class_Set() const;
    bool is__class_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAILink self;
    bool m_self_isSet;
    bool m_self_isValid;

    QString _class;
    bool m__class_isSet;
    bool m__class_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIGithubRepositorieslinks)

#endif // OAIGithubRepositorieslinks_H
