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

#include "OAIExtensionClassContainerImpl1map.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIExtensionClassContainerImpl1map::OAIExtensionClassContainerImpl1map(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIExtensionClassContainerImpl1map::OAIExtensionClassContainerImpl1map() {
    this->initializeModel();
}

OAIExtensionClassContainerImpl1map::~OAIExtensionClassContainerImpl1map() {}

void OAIExtensionClassContainerImpl1map::initializeModel() {

    m_io_jenkins_blueocean_service_embedded_rest_pipeline_impl_isSet = false;
    m_io_jenkins_blueocean_service_embedded_rest_pipeline_impl_isValid = false;

    m_io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl_isSet = false;
    m_io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl_isValid = false;

    m__class_isSet = false;
    m__class_isValid = false;
}

void OAIExtensionClassContainerImpl1map::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIExtensionClassContainerImpl1map::fromJsonObject(QJsonObject json) {

    m_io_jenkins_blueocean_service_embedded_rest_pipeline_impl_isValid = ::OpenAPI::fromJsonValue(io_jenkins_blueocean_service_embedded_rest_pipeline_impl, json[QString("io.jenkins.blueocean.service.embedded.rest.PipelineImpl")]);
    m_io_jenkins_blueocean_service_embedded_rest_pipeline_impl_isSet = !json[QString("io.jenkins.blueocean.service.embedded.rest.PipelineImpl")].isNull() && m_io_jenkins_blueocean_service_embedded_rest_pipeline_impl_isValid;

    m_io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl_isValid = ::OpenAPI::fromJsonValue(io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl, json[QString("io.jenkins.blueocean.service.embedded.rest.MultiBranchPipelineImpl")]);
    m_io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl_isSet = !json[QString("io.jenkins.blueocean.service.embedded.rest.MultiBranchPipelineImpl")].isNull() && m_io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl_isValid;

    m__class_isValid = ::OpenAPI::fromJsonValue(_class, json[QString("_class")]);
    m__class_isSet = !json[QString("_class")].isNull() && m__class_isValid;
}

QString OAIExtensionClassContainerImpl1map::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIExtensionClassContainerImpl1map::asJsonObject() const {
    QJsonObject obj;
    if (io_jenkins_blueocean_service_embedded_rest_pipeline_impl.isSet()) {
        obj.insert(QString("io.jenkins.blueocean.service.embedded.rest.PipelineImpl"), ::OpenAPI::toJsonValue(io_jenkins_blueocean_service_embedded_rest_pipeline_impl));
    }
    if (io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl.isSet()) {
        obj.insert(QString("io.jenkins.blueocean.service.embedded.rest.MultiBranchPipelineImpl"), ::OpenAPI::toJsonValue(io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl));
    }
    if (m__class_isSet) {
        obj.insert(QString("_class"), ::OpenAPI::toJsonValue(_class));
    }
    return obj;
}

OAIExtensionClassImpl OAIExtensionClassContainerImpl1map::getIoJenkinsBlueoceanServiceEmbeddedRestPipelineImpl() const {
    return io_jenkins_blueocean_service_embedded_rest_pipeline_impl;
}
void OAIExtensionClassContainerImpl1map::setIoJenkinsBlueoceanServiceEmbeddedRestPipelineImpl(const OAIExtensionClassImpl &io_jenkins_blueocean_service_embedded_rest_pipeline_impl) {
    this->io_jenkins_blueocean_service_embedded_rest_pipeline_impl = io_jenkins_blueocean_service_embedded_rest_pipeline_impl;
    this->m_io_jenkins_blueocean_service_embedded_rest_pipeline_impl_isSet = true;
}

bool OAIExtensionClassContainerImpl1map::is_io_jenkins_blueocean_service_embedded_rest_pipeline_impl_Set() const{
    return m_io_jenkins_blueocean_service_embedded_rest_pipeline_impl_isSet;
}

bool OAIExtensionClassContainerImpl1map::is_io_jenkins_blueocean_service_embedded_rest_pipeline_impl_Valid() const{
    return m_io_jenkins_blueocean_service_embedded_rest_pipeline_impl_isValid;
}

OAIExtensionClassImpl OAIExtensionClassContainerImpl1map::getIoJenkinsBlueoceanServiceEmbeddedRestMultiBranchPipelineImpl() const {
    return io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl;
}
void OAIExtensionClassContainerImpl1map::setIoJenkinsBlueoceanServiceEmbeddedRestMultiBranchPipelineImpl(const OAIExtensionClassImpl &io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl) {
    this->io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl = io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl;
    this->m_io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl_isSet = true;
}

bool OAIExtensionClassContainerImpl1map::is_io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl_Set() const{
    return m_io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl_isSet;
}

bool OAIExtensionClassContainerImpl1map::is_io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl_Valid() const{
    return m_io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl_isValid;
}

QString OAIExtensionClassContainerImpl1map::getClass() const {
    return _class;
}
void OAIExtensionClassContainerImpl1map::setClass(const QString &_class) {
    this->_class = _class;
    this->m__class_isSet = true;
}

bool OAIExtensionClassContainerImpl1map::is__class_Set() const{
    return m__class_isSet;
}

bool OAIExtensionClassContainerImpl1map::is__class_Valid() const{
    return m__class_isValid;
}

bool OAIExtensionClassContainerImpl1map::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (io_jenkins_blueocean_service_embedded_rest_pipeline_impl.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (io_jenkins_blueocean_service_embedded_rest_multi_branch_pipeline_impl.isSet()) {
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

bool OAIExtensionClassContainerImpl1map::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
