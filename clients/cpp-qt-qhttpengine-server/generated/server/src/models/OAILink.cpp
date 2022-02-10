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

#include "OAILink.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAILink::OAILink(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAILink::OAILink() {
    this->initializeModel();
}

OAILink::~OAILink() {}

void OAILink::initializeModel() {

    m__class_isSet = false;
    m__class_isValid = false;

    m_href_isSet = false;
    m_href_isValid = false;
}

void OAILink::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAILink::fromJsonObject(QJsonObject json) {

    m__class_isValid = ::OpenAPI::fromJsonValue(_class, json[QString("_class")]);
    m__class_isSet = !json[QString("_class")].isNull() && m__class_isValid;

    m_href_isValid = ::OpenAPI::fromJsonValue(href, json[QString("href")]);
    m_href_isSet = !json[QString("href")].isNull() && m_href_isValid;
}

QString OAILink::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAILink::asJsonObject() const {
    QJsonObject obj;
    if (m__class_isSet) {
        obj.insert(QString("_class"), ::OpenAPI::toJsonValue(_class));
    }
    if (m_href_isSet) {
        obj.insert(QString("href"), ::OpenAPI::toJsonValue(href));
    }
    return obj;
}

QString OAILink::getClass() const {
    return _class;
}
void OAILink::setClass(const QString &_class) {
    this->_class = _class;
    this->m__class_isSet = true;
}

bool OAILink::is__class_Set() const{
    return m__class_isSet;
}

bool OAILink::is__class_Valid() const{
    return m__class_isValid;
}

QString OAILink::getHref() const {
    return href;
}
void OAILink::setHref(const QString &href) {
    this->href = href;
    this->m_href_isSet = true;
}

bool OAILink::is_href_Set() const{
    return m_href_isSet;
}

bool OAILink::is_href_Valid() const{
    return m_href_isValid;
}

bool OAILink::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m__class_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_href_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAILink::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
