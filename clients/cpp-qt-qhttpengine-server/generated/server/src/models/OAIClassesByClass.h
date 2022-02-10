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
 * OAIClassesByClass.h
 *
 * 
 */

#ifndef OAIClassesByClass_H
#define OAIClassesByClass_H

#include <QJsonObject>

#include <QList>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIClassesByClass : public OAIObject {
public:
    OAIClassesByClass();
    OAIClassesByClass(QString json);
    ~OAIClassesByClass() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QList<QString> getClasses() const;
    void setClasses(const QList<QString> &classes);
    bool is_classes_Set() const;
    bool is_classes_Valid() const;

    QString getClass() const;
    void setClass(const QString &_class);
    bool is__class_Set() const;
    bool is__class_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QList<QString> classes;
    bool m_classes_isSet;
    bool m_classes_isValid;

    QString _class;
    bool m__class_isSet;
    bool m__class_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIClassesByClass)

#endif // OAIClassesByClass_H
