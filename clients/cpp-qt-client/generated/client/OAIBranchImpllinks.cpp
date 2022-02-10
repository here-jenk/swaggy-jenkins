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

#include "OAIBranchImpllinks.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIBranchImpllinks::OAIBranchImpllinks(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIBranchImpllinks::OAIBranchImpllinks() {
    this->initializeModel();
}

OAIBranchImpllinks::~OAIBranchImpllinks() {}

void OAIBranchImpllinks::initializeModel() {

    m_self_isSet = false;
    m_self_isValid = false;

    m_actions_isSet = false;
    m_actions_isValid = false;

    m_runs_isSet = false;
    m_runs_isValid = false;

    m_queue_isSet = false;
    m_queue_isValid = false;

    m__class_isSet = false;
    m__class_isValid = false;
}

void OAIBranchImpllinks::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIBranchImpllinks::fromJsonObject(QJsonObject json) {

    m_self_isValid = ::OpenAPI::fromJsonValue(self, json[QString("self")]);
    m_self_isSet = !json[QString("self")].isNull() && m_self_isValid;

    m_actions_isValid = ::OpenAPI::fromJsonValue(actions, json[QString("actions")]);
    m_actions_isSet = !json[QString("actions")].isNull() && m_actions_isValid;

    m_runs_isValid = ::OpenAPI::fromJsonValue(runs, json[QString("runs")]);
    m_runs_isSet = !json[QString("runs")].isNull() && m_runs_isValid;

    m_queue_isValid = ::OpenAPI::fromJsonValue(queue, json[QString("queue")]);
    m_queue_isSet = !json[QString("queue")].isNull() && m_queue_isValid;

    m__class_isValid = ::OpenAPI::fromJsonValue(_class, json[QString("_class")]);
    m__class_isSet = !json[QString("_class")].isNull() && m__class_isValid;
}

QString OAIBranchImpllinks::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIBranchImpllinks::asJsonObject() const {
    QJsonObject obj;
    if (self.isSet()) {
        obj.insert(QString("self"), ::OpenAPI::toJsonValue(self));
    }
    if (actions.isSet()) {
        obj.insert(QString("actions"), ::OpenAPI::toJsonValue(actions));
    }
    if (runs.isSet()) {
        obj.insert(QString("runs"), ::OpenAPI::toJsonValue(runs));
    }
    if (queue.isSet()) {
        obj.insert(QString("queue"), ::OpenAPI::toJsonValue(queue));
    }
    if (m__class_isSet) {
        obj.insert(QString("_class"), ::OpenAPI::toJsonValue(_class));
    }
    return obj;
}

OAILink OAIBranchImpllinks::getSelf() const {
    return self;
}
void OAIBranchImpllinks::setSelf(const OAILink &self) {
    this->self = self;
    this->m_self_isSet = true;
}

bool OAIBranchImpllinks::is_self_Set() const{
    return m_self_isSet;
}

bool OAIBranchImpllinks::is_self_Valid() const{
    return m_self_isValid;
}

OAILink OAIBranchImpllinks::getActions() const {
    return actions;
}
void OAIBranchImpllinks::setActions(const OAILink &actions) {
    this->actions = actions;
    this->m_actions_isSet = true;
}

bool OAIBranchImpllinks::is_actions_Set() const{
    return m_actions_isSet;
}

bool OAIBranchImpllinks::is_actions_Valid() const{
    return m_actions_isValid;
}

OAILink OAIBranchImpllinks::getRuns() const {
    return runs;
}
void OAIBranchImpllinks::setRuns(const OAILink &runs) {
    this->runs = runs;
    this->m_runs_isSet = true;
}

bool OAIBranchImpllinks::is_runs_Set() const{
    return m_runs_isSet;
}

bool OAIBranchImpllinks::is_runs_Valid() const{
    return m_runs_isValid;
}

OAILink OAIBranchImpllinks::getQueue() const {
    return queue;
}
void OAIBranchImpllinks::setQueue(const OAILink &queue) {
    this->queue = queue;
    this->m_queue_isSet = true;
}

bool OAIBranchImpllinks::is_queue_Set() const{
    return m_queue_isSet;
}

bool OAIBranchImpllinks::is_queue_Valid() const{
    return m_queue_isValid;
}

QString OAIBranchImpllinks::getClass() const {
    return _class;
}
void OAIBranchImpllinks::setClass(const QString &_class) {
    this->_class = _class;
    this->m__class_isSet = true;
}

bool OAIBranchImpllinks::is__class_Set() const{
    return m__class_isSet;
}

bool OAIBranchImpllinks::is__class_Valid() const{
    return m__class_isValid;
}

bool OAIBranchImpllinks::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (self.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (actions.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (runs.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (queue.isSet()) {
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

bool OAIBranchImpllinks::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
