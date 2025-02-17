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

#include <QJsonArray>
#include <QJsonDocument>
#include <QJsonObject>
#include <QVariantMap>
#include <QDebug>

#include "OAIRemoteAccessApiHandler.h"
#include "OAIRemoteAccessApiRequest.h"

namespace OpenAPI {

OAIRemoteAccessApiHandler::OAIRemoteAccessApiHandler(){

}

OAIRemoteAccessApiHandler::~OAIRemoteAccessApiHandler(){

}

void OAIRemoteAccessApiHandler::getComputer(qint32 depth) {
    Q_UNUSED(depth);
    auto reqObj = qobject_cast<OAIRemoteAccessApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIComputerSet res;
        reqObj->getComputerResponse(res);
    }
}
void OAIRemoteAccessApiHandler::getJenkins() {
    auto reqObj = qobject_cast<OAIRemoteAccessApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIHudson res;
        reqObj->getJenkinsResponse(res);
    }
}
void OAIRemoteAccessApiHandler::getJob(QString name) {
    Q_UNUSED(name);
    auto reqObj = qobject_cast<OAIRemoteAccessApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIFreeStyleProject res;
        reqObj->getJobResponse(res);
    }
}
void OAIRemoteAccessApiHandler::getJobConfig(QString name) {
    Q_UNUSED(name);
    auto reqObj = qobject_cast<OAIRemoteAccessApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        QString res;
        reqObj->getJobConfigResponse(res);
    }
}
void OAIRemoteAccessApiHandler::getJobLastBuild(QString name) {
    Q_UNUSED(name);
    auto reqObj = qobject_cast<OAIRemoteAccessApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIFreeStyleBuild res;
        reqObj->getJobLastBuildResponse(res);
    }
}
void OAIRemoteAccessApiHandler::getJobProgressiveText(QString name, QString number, QString start) {
    Q_UNUSED(name);
    Q_UNUSED(number);
    Q_UNUSED(start);
    auto reqObj = qobject_cast<OAIRemoteAccessApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        
        reqObj->getJobProgressiveTextResponse();
    }
}
void OAIRemoteAccessApiHandler::getQueue() {
    auto reqObj = qobject_cast<OAIRemoteAccessApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIQueue res;
        reqObj->getQueueResponse(res);
    }
}
void OAIRemoteAccessApiHandler::getQueueItem(QString number) {
    Q_UNUSED(number);
    auto reqObj = qobject_cast<OAIRemoteAccessApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIQueue res;
        reqObj->getQueueItemResponse(res);
    }
}
void OAIRemoteAccessApiHandler::getView(QString name) {
    Q_UNUSED(name);
    auto reqObj = qobject_cast<OAIRemoteAccessApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        OAIListView res;
        reqObj->getViewResponse(res);
    }
}
void OAIRemoteAccessApiHandler::getViewConfig(QString name) {
    Q_UNUSED(name);
    auto reqObj = qobject_cast<OAIRemoteAccessApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        QString res;
        reqObj->getViewConfigResponse(res);
    }
}
void OAIRemoteAccessApiHandler::headJenkins() {
    auto reqObj = qobject_cast<OAIRemoteAccessApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        
        reqObj->headJenkinsResponse();
    }
}
void OAIRemoteAccessApiHandler::postCreateItem(QString name, QString from, QString mode, QString jenkins_crumb, QString content_type, QString body) {
    Q_UNUSED(name);
    Q_UNUSED(from);
    Q_UNUSED(mode);
    Q_UNUSED(jenkins_crumb);
    Q_UNUSED(content_type);
    Q_UNUSED(body);
    auto reqObj = qobject_cast<OAIRemoteAccessApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        
        reqObj->postCreateItemResponse();
    }
}
void OAIRemoteAccessApiHandler::postCreateView(QString name, QString jenkins_crumb, QString content_type, QString body) {
    Q_UNUSED(name);
    Q_UNUSED(jenkins_crumb);
    Q_UNUSED(content_type);
    Q_UNUSED(body);
    auto reqObj = qobject_cast<OAIRemoteAccessApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        
        reqObj->postCreateViewResponse();
    }
}
void OAIRemoteAccessApiHandler::postJobBuild(QString name, QString json, QString token, QString jenkins_crumb) {
    Q_UNUSED(name);
    Q_UNUSED(json);
    Q_UNUSED(token);
    Q_UNUSED(jenkins_crumb);
    auto reqObj = qobject_cast<OAIRemoteAccessApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        
        reqObj->postJobBuildResponse();
    }
}
void OAIRemoteAccessApiHandler::postJobConfig(QString name, QString body, QString jenkins_crumb) {
    Q_UNUSED(name);
    Q_UNUSED(body);
    Q_UNUSED(jenkins_crumb);
    auto reqObj = qobject_cast<OAIRemoteAccessApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        
        reqObj->postJobConfigResponse();
    }
}
void OAIRemoteAccessApiHandler::postJobDelete(QString name, QString jenkins_crumb) {
    Q_UNUSED(name);
    Q_UNUSED(jenkins_crumb);
    auto reqObj = qobject_cast<OAIRemoteAccessApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        
        reqObj->postJobDeleteResponse();
    }
}
void OAIRemoteAccessApiHandler::postJobDisable(QString name, QString jenkins_crumb) {
    Q_UNUSED(name);
    Q_UNUSED(jenkins_crumb);
    auto reqObj = qobject_cast<OAIRemoteAccessApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        
        reqObj->postJobDisableResponse();
    }
}
void OAIRemoteAccessApiHandler::postJobEnable(QString name, QString jenkins_crumb) {
    Q_UNUSED(name);
    Q_UNUSED(jenkins_crumb);
    auto reqObj = qobject_cast<OAIRemoteAccessApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        
        reqObj->postJobEnableResponse();
    }
}
void OAIRemoteAccessApiHandler::postJobLastBuildStop(QString name, QString jenkins_crumb) {
    Q_UNUSED(name);
    Q_UNUSED(jenkins_crumb);
    auto reqObj = qobject_cast<OAIRemoteAccessApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        
        reqObj->postJobLastBuildStopResponse();
    }
}
void OAIRemoteAccessApiHandler::postViewConfig(QString name, QString body, QString jenkins_crumb) {
    Q_UNUSED(name);
    Q_UNUSED(body);
    Q_UNUSED(jenkins_crumb);
    auto reqObj = qobject_cast<OAIRemoteAccessApiRequest*>(sender());
    if( reqObj != nullptr )
    {
        
        reqObj->postViewConfigResponse();
    }
}


}
