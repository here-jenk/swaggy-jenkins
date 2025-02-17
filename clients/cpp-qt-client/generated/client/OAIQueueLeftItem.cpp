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

#include "OAIQueueLeftItem.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIQueueLeftItem::OAIQueueLeftItem(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIQueueLeftItem::OAIQueueLeftItem() {
    this->initializeModel();
}

OAIQueueLeftItem::~OAIQueueLeftItem() {}

void OAIQueueLeftItem::initializeModel() {

    m__class_isSet = false;
    m__class_isValid = false;

    m_actions_isSet = false;
    m_actions_isValid = false;

    m_blocked_isSet = false;
    m_blocked_isValid = false;

    m_buildable_isSet = false;
    m_buildable_isValid = false;

    m_id_isSet = false;
    m_id_isValid = false;

    m_in_queue_since_isSet = false;
    m_in_queue_since_isValid = false;

    m_params_isSet = false;
    m_params_isValid = false;

    m_stuck_isSet = false;
    m_stuck_isValid = false;

    m_task_isSet = false;
    m_task_isValid = false;

    m_url_isSet = false;
    m_url_isValid = false;

    m_why_isSet = false;
    m_why_isValid = false;

    m_cancelled_isSet = false;
    m_cancelled_isValid = false;

    m_executable_isSet = false;
    m_executable_isValid = false;
}

void OAIQueueLeftItem::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIQueueLeftItem::fromJsonObject(QJsonObject json) {

    m__class_isValid = ::OpenAPI::fromJsonValue(_class, json[QString("_class")]);
    m__class_isSet = !json[QString("_class")].isNull() && m__class_isValid;

    m_actions_isValid = ::OpenAPI::fromJsonValue(actions, json[QString("actions")]);
    m_actions_isSet = !json[QString("actions")].isNull() && m_actions_isValid;

    m_blocked_isValid = ::OpenAPI::fromJsonValue(blocked, json[QString("blocked")]);
    m_blocked_isSet = !json[QString("blocked")].isNull() && m_blocked_isValid;

    m_buildable_isValid = ::OpenAPI::fromJsonValue(buildable, json[QString("buildable")]);
    m_buildable_isSet = !json[QString("buildable")].isNull() && m_buildable_isValid;

    m_id_isValid = ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_in_queue_since_isValid = ::OpenAPI::fromJsonValue(in_queue_since, json[QString("inQueueSince")]);
    m_in_queue_since_isSet = !json[QString("inQueueSince")].isNull() && m_in_queue_since_isValid;

    m_params_isValid = ::OpenAPI::fromJsonValue(params, json[QString("params")]);
    m_params_isSet = !json[QString("params")].isNull() && m_params_isValid;

    m_stuck_isValid = ::OpenAPI::fromJsonValue(stuck, json[QString("stuck")]);
    m_stuck_isSet = !json[QString("stuck")].isNull() && m_stuck_isValid;

    m_task_isValid = ::OpenAPI::fromJsonValue(task, json[QString("task")]);
    m_task_isSet = !json[QString("task")].isNull() && m_task_isValid;

    m_url_isValid = ::OpenAPI::fromJsonValue(url, json[QString("url")]);
    m_url_isSet = !json[QString("url")].isNull() && m_url_isValid;

    m_why_isValid = ::OpenAPI::fromJsonValue(why, json[QString("why")]);
    m_why_isSet = !json[QString("why")].isNull() && m_why_isValid;

    m_cancelled_isValid = ::OpenAPI::fromJsonValue(cancelled, json[QString("cancelled")]);
    m_cancelled_isSet = !json[QString("cancelled")].isNull() && m_cancelled_isValid;

    m_executable_isValid = ::OpenAPI::fromJsonValue(executable, json[QString("executable")]);
    m_executable_isSet = !json[QString("executable")].isNull() && m_executable_isValid;
}

QString OAIQueueLeftItem::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIQueueLeftItem::asJsonObject() const {
    QJsonObject obj;
    if (m__class_isSet) {
        obj.insert(QString("_class"), ::OpenAPI::toJsonValue(_class));
    }
    if (actions.size() > 0) {
        obj.insert(QString("actions"), ::OpenAPI::toJsonValue(actions));
    }
    if (m_blocked_isSet) {
        obj.insert(QString("blocked"), ::OpenAPI::toJsonValue(blocked));
    }
    if (m_buildable_isSet) {
        obj.insert(QString("buildable"), ::OpenAPI::toJsonValue(buildable));
    }
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(id));
    }
    if (m_in_queue_since_isSet) {
        obj.insert(QString("inQueueSince"), ::OpenAPI::toJsonValue(in_queue_since));
    }
    if (m_params_isSet) {
        obj.insert(QString("params"), ::OpenAPI::toJsonValue(params));
    }
    if (m_stuck_isSet) {
        obj.insert(QString("stuck"), ::OpenAPI::toJsonValue(stuck));
    }
    if (task.isSet()) {
        obj.insert(QString("task"), ::OpenAPI::toJsonValue(task));
    }
    if (m_url_isSet) {
        obj.insert(QString("url"), ::OpenAPI::toJsonValue(url));
    }
    if (m_why_isSet) {
        obj.insert(QString("why"), ::OpenAPI::toJsonValue(why));
    }
    if (m_cancelled_isSet) {
        obj.insert(QString("cancelled"), ::OpenAPI::toJsonValue(cancelled));
    }
    if (executable.isSet()) {
        obj.insert(QString("executable"), ::OpenAPI::toJsonValue(executable));
    }
    return obj;
}

QString OAIQueueLeftItem::getClass() const {
    return _class;
}
void OAIQueueLeftItem::setClass(const QString &_class) {
    this->_class = _class;
    this->m__class_isSet = true;
}

bool OAIQueueLeftItem::is__class_Set() const{
    return m__class_isSet;
}

bool OAIQueueLeftItem::is__class_Valid() const{
    return m__class_isValid;
}

QList<OAICauseAction> OAIQueueLeftItem::getActions() const {
    return actions;
}
void OAIQueueLeftItem::setActions(const QList<OAICauseAction> &actions) {
    this->actions = actions;
    this->m_actions_isSet = true;
}

bool OAIQueueLeftItem::is_actions_Set() const{
    return m_actions_isSet;
}

bool OAIQueueLeftItem::is_actions_Valid() const{
    return m_actions_isValid;
}

bool OAIQueueLeftItem::isBlocked() const {
    return blocked;
}
void OAIQueueLeftItem::setBlocked(const bool &blocked) {
    this->blocked = blocked;
    this->m_blocked_isSet = true;
}

bool OAIQueueLeftItem::is_blocked_Set() const{
    return m_blocked_isSet;
}

bool OAIQueueLeftItem::is_blocked_Valid() const{
    return m_blocked_isValid;
}

bool OAIQueueLeftItem::isBuildable() const {
    return buildable;
}
void OAIQueueLeftItem::setBuildable(const bool &buildable) {
    this->buildable = buildable;
    this->m_buildable_isSet = true;
}

bool OAIQueueLeftItem::is_buildable_Set() const{
    return m_buildable_isSet;
}

bool OAIQueueLeftItem::is_buildable_Valid() const{
    return m_buildable_isValid;
}

qint32 OAIQueueLeftItem::getId() const {
    return id;
}
void OAIQueueLeftItem::setId(const qint32 &id) {
    this->id = id;
    this->m_id_isSet = true;
}

bool OAIQueueLeftItem::is_id_Set() const{
    return m_id_isSet;
}

bool OAIQueueLeftItem::is_id_Valid() const{
    return m_id_isValid;
}

qint32 OAIQueueLeftItem::getInQueueSince() const {
    return in_queue_since;
}
void OAIQueueLeftItem::setInQueueSince(const qint32 &in_queue_since) {
    this->in_queue_since = in_queue_since;
    this->m_in_queue_since_isSet = true;
}

bool OAIQueueLeftItem::is_in_queue_since_Set() const{
    return m_in_queue_since_isSet;
}

bool OAIQueueLeftItem::is_in_queue_since_Valid() const{
    return m_in_queue_since_isValid;
}

QString OAIQueueLeftItem::getParams() const {
    return params;
}
void OAIQueueLeftItem::setParams(const QString &params) {
    this->params = params;
    this->m_params_isSet = true;
}

bool OAIQueueLeftItem::is_params_Set() const{
    return m_params_isSet;
}

bool OAIQueueLeftItem::is_params_Valid() const{
    return m_params_isValid;
}

bool OAIQueueLeftItem::isStuck() const {
    return stuck;
}
void OAIQueueLeftItem::setStuck(const bool &stuck) {
    this->stuck = stuck;
    this->m_stuck_isSet = true;
}

bool OAIQueueLeftItem::is_stuck_Set() const{
    return m_stuck_isSet;
}

bool OAIQueueLeftItem::is_stuck_Valid() const{
    return m_stuck_isValid;
}

OAIFreeStyleProject OAIQueueLeftItem::getTask() const {
    return task;
}
void OAIQueueLeftItem::setTask(const OAIFreeStyleProject &task) {
    this->task = task;
    this->m_task_isSet = true;
}

bool OAIQueueLeftItem::is_task_Set() const{
    return m_task_isSet;
}

bool OAIQueueLeftItem::is_task_Valid() const{
    return m_task_isValid;
}

QString OAIQueueLeftItem::getUrl() const {
    return url;
}
void OAIQueueLeftItem::setUrl(const QString &url) {
    this->url = url;
    this->m_url_isSet = true;
}

bool OAIQueueLeftItem::is_url_Set() const{
    return m_url_isSet;
}

bool OAIQueueLeftItem::is_url_Valid() const{
    return m_url_isValid;
}

QString OAIQueueLeftItem::getWhy() const {
    return why;
}
void OAIQueueLeftItem::setWhy(const QString &why) {
    this->why = why;
    this->m_why_isSet = true;
}

bool OAIQueueLeftItem::is_why_Set() const{
    return m_why_isSet;
}

bool OAIQueueLeftItem::is_why_Valid() const{
    return m_why_isValid;
}

bool OAIQueueLeftItem::isCancelled() const {
    return cancelled;
}
void OAIQueueLeftItem::setCancelled(const bool &cancelled) {
    this->cancelled = cancelled;
    this->m_cancelled_isSet = true;
}

bool OAIQueueLeftItem::is_cancelled_Set() const{
    return m_cancelled_isSet;
}

bool OAIQueueLeftItem::is_cancelled_Valid() const{
    return m_cancelled_isValid;
}

OAIFreeStyleBuild OAIQueueLeftItem::getExecutable() const {
    return executable;
}
void OAIQueueLeftItem::setExecutable(const OAIFreeStyleBuild &executable) {
    this->executable = executable;
    this->m_executable_isSet = true;
}

bool OAIQueueLeftItem::is_executable_Set() const{
    return m_executable_isSet;
}

bool OAIQueueLeftItem::is_executable_Valid() const{
    return m_executable_isValid;
}

bool OAIQueueLeftItem::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m__class_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (actions.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_blocked_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_buildable_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_in_queue_since_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_params_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_stuck_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (task.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_url_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_why_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_cancelled_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (executable.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIQueueLeftItem::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
