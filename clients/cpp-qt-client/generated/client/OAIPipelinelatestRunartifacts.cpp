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

#include "OAIPipelinelatestRunartifacts.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIPipelinelatestRunartifacts::OAIPipelinelatestRunartifacts(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIPipelinelatestRunartifacts::OAIPipelinelatestRunartifacts() {
    this->initializeModel();
}

OAIPipelinelatestRunartifacts::~OAIPipelinelatestRunartifacts() {}

void OAIPipelinelatestRunartifacts::initializeModel() {

    m_name_isSet = false;
    m_name_isValid = false;

    m_size_isSet = false;
    m_size_isValid = false;

    m_url_isSet = false;
    m_url_isValid = false;

    m__class_isSet = false;
    m__class_isValid = false;
}

void OAIPipelinelatestRunartifacts::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIPipelinelatestRunartifacts::fromJsonObject(QJsonObject json) {

    m_name_isValid = ::OpenAPI::fromJsonValue(name, json[QString("name")]);
    m_name_isSet = !json[QString("name")].isNull() && m_name_isValid;

    m_size_isValid = ::OpenAPI::fromJsonValue(size, json[QString("size")]);
    m_size_isSet = !json[QString("size")].isNull() && m_size_isValid;

    m_url_isValid = ::OpenAPI::fromJsonValue(url, json[QString("url")]);
    m_url_isSet = !json[QString("url")].isNull() && m_url_isValid;

    m__class_isValid = ::OpenAPI::fromJsonValue(_class, json[QString("_class")]);
    m__class_isSet = !json[QString("_class")].isNull() && m__class_isValid;
}

QString OAIPipelinelatestRunartifacts::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIPipelinelatestRunartifacts::asJsonObject() const {
    QJsonObject obj;
    if (m_name_isSet) {
        obj.insert(QString("name"), ::OpenAPI::toJsonValue(name));
    }
    if (m_size_isSet) {
        obj.insert(QString("size"), ::OpenAPI::toJsonValue(size));
    }
    if (m_url_isSet) {
        obj.insert(QString("url"), ::OpenAPI::toJsonValue(url));
    }
    if (m__class_isSet) {
        obj.insert(QString("_class"), ::OpenAPI::toJsonValue(_class));
    }
    return obj;
}

QString OAIPipelinelatestRunartifacts::getName() const {
    return name;
}
void OAIPipelinelatestRunartifacts::setName(const QString &name) {
    this->name = name;
    this->m_name_isSet = true;
}

bool OAIPipelinelatestRunartifacts::is_name_Set() const{
    return m_name_isSet;
}

bool OAIPipelinelatestRunartifacts::is_name_Valid() const{
    return m_name_isValid;
}

qint32 OAIPipelinelatestRunartifacts::getSize() const {
    return size;
}
void OAIPipelinelatestRunartifacts::setSize(const qint32 &size) {
    this->size = size;
    this->m_size_isSet = true;
}

bool OAIPipelinelatestRunartifacts::is_size_Set() const{
    return m_size_isSet;
}

bool OAIPipelinelatestRunartifacts::is_size_Valid() const{
    return m_size_isValid;
}

QString OAIPipelinelatestRunartifacts::getUrl() const {
    return url;
}
void OAIPipelinelatestRunartifacts::setUrl(const QString &url) {
    this->url = url;
    this->m_url_isSet = true;
}

bool OAIPipelinelatestRunartifacts::is_url_Set() const{
    return m_url_isSet;
}

bool OAIPipelinelatestRunartifacts::is_url_Valid() const{
    return m_url_isValid;
}

QString OAIPipelinelatestRunartifacts::getClass() const {
    return _class;
}
void OAIPipelinelatestRunartifacts::setClass(const QString &_class) {
    this->_class = _class;
    this->m__class_isSet = true;
}

bool OAIPipelinelatestRunartifacts::is__class_Set() const{
    return m__class_isSet;
}

bool OAIPipelinelatestRunartifacts::is__class_Valid() const{
    return m__class_isValid;
}

bool OAIPipelinelatestRunartifacts::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_name_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_size_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_url_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m__class_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIPipelinelatestRunartifacts::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
