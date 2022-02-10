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

#include "OAIInputStepImpl.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIInputStepImpl::OAIInputStepImpl(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIInputStepImpl::OAIInputStepImpl() {
    this->initializeModel();
}

OAIInputStepImpl::~OAIInputStepImpl() {}

void OAIInputStepImpl::initializeModel() {

    m__class_isSet = false;
    m__class_isValid = false;

    m__links_isSet = false;
    m__links_isValid = false;

    m_id_isSet = false;
    m_id_isValid = false;

    m_message_isSet = false;
    m_message_isValid = false;

    m_ok_isSet = false;
    m_ok_isValid = false;

    m_parameters_isSet = false;
    m_parameters_isValid = false;

    m_submitter_isSet = false;
    m_submitter_isValid = false;
}

void OAIInputStepImpl::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIInputStepImpl::fromJsonObject(QJsonObject json) {

    m__class_isValid = ::OpenAPI::fromJsonValue(_class, json[QString("_class")]);
    m__class_isSet = !json[QString("_class")].isNull() && m__class_isValid;

    m__links_isValid = ::OpenAPI::fromJsonValue(_links, json[QString("_links")]);
    m__links_isSet = !json[QString("_links")].isNull() && m__links_isValid;

    m_id_isValid = ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_message_isValid = ::OpenAPI::fromJsonValue(message, json[QString("message")]);
    m_message_isSet = !json[QString("message")].isNull() && m_message_isValid;

    m_ok_isValid = ::OpenAPI::fromJsonValue(ok, json[QString("ok")]);
    m_ok_isSet = !json[QString("ok")].isNull() && m_ok_isValid;

    m_parameters_isValid = ::OpenAPI::fromJsonValue(parameters, json[QString("parameters")]);
    m_parameters_isSet = !json[QString("parameters")].isNull() && m_parameters_isValid;

    m_submitter_isValid = ::OpenAPI::fromJsonValue(submitter, json[QString("submitter")]);
    m_submitter_isSet = !json[QString("submitter")].isNull() && m_submitter_isValid;
}

QString OAIInputStepImpl::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIInputStepImpl::asJsonObject() const {
    QJsonObject obj;
    if (m__class_isSet) {
        obj.insert(QString("_class"), ::OpenAPI::toJsonValue(_class));
    }
    if (_links.isSet()) {
        obj.insert(QString("_links"), ::OpenAPI::toJsonValue(_links));
    }
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(id));
    }
    if (m_message_isSet) {
        obj.insert(QString("message"), ::OpenAPI::toJsonValue(message));
    }
    if (m_ok_isSet) {
        obj.insert(QString("ok"), ::OpenAPI::toJsonValue(ok));
    }
    if (parameters.size() > 0) {
        obj.insert(QString("parameters"), ::OpenAPI::toJsonValue(parameters));
    }
    if (m_submitter_isSet) {
        obj.insert(QString("submitter"), ::OpenAPI::toJsonValue(submitter));
    }
    return obj;
}

QString OAIInputStepImpl::getClass() const {
    return _class;
}
void OAIInputStepImpl::setClass(const QString &_class) {
    this->_class = _class;
    this->m__class_isSet = true;
}

bool OAIInputStepImpl::is__class_Set() const{
    return m__class_isSet;
}

bool OAIInputStepImpl::is__class_Valid() const{
    return m__class_isValid;
}

OAIInputStepImpllinks OAIInputStepImpl::getLinks() const {
    return _links;
}
void OAIInputStepImpl::setLinks(const OAIInputStepImpllinks &_links) {
    this->_links = _links;
    this->m__links_isSet = true;
}

bool OAIInputStepImpl::is__links_Set() const{
    return m__links_isSet;
}

bool OAIInputStepImpl::is__links_Valid() const{
    return m__links_isValid;
}

QString OAIInputStepImpl::getId() const {
    return id;
}
void OAIInputStepImpl::setId(const QString &id) {
    this->id = id;
    this->m_id_isSet = true;
}

bool OAIInputStepImpl::is_id_Set() const{
    return m_id_isSet;
}

bool OAIInputStepImpl::is_id_Valid() const{
    return m_id_isValid;
}

QString OAIInputStepImpl::getMessage() const {
    return message;
}
void OAIInputStepImpl::setMessage(const QString &message) {
    this->message = message;
    this->m_message_isSet = true;
}

bool OAIInputStepImpl::is_message_Set() const{
    return m_message_isSet;
}

bool OAIInputStepImpl::is_message_Valid() const{
    return m_message_isValid;
}

QString OAIInputStepImpl::getOk() const {
    return ok;
}
void OAIInputStepImpl::setOk(const QString &ok) {
    this->ok = ok;
    this->m_ok_isSet = true;
}

bool OAIInputStepImpl::is_ok_Set() const{
    return m_ok_isSet;
}

bool OAIInputStepImpl::is_ok_Valid() const{
    return m_ok_isValid;
}

QList<OAIStringParameterDefinition> OAIInputStepImpl::getParameters() const {
    return parameters;
}
void OAIInputStepImpl::setParameters(const QList<OAIStringParameterDefinition> &parameters) {
    this->parameters = parameters;
    this->m_parameters_isSet = true;
}

bool OAIInputStepImpl::is_parameters_Set() const{
    return m_parameters_isSet;
}

bool OAIInputStepImpl::is_parameters_Valid() const{
    return m_parameters_isValid;
}

QString OAIInputStepImpl::getSubmitter() const {
    return submitter;
}
void OAIInputStepImpl::setSubmitter(const QString &submitter) {
    this->submitter = submitter;
    this->m_submitter_isSet = true;
}

bool OAIInputStepImpl::is_submitter_Set() const{
    return m_submitter_isSet;
}

bool OAIInputStepImpl::is_submitter_Valid() const{
    return m_submitter_isValid;
}

bool OAIInputStepImpl::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m__class_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (_links.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_message_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_ok_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (parameters.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_submitter_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIInputStepImpl::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
