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

#ifndef OAI_OAIRemoteAccessApiHandler_H
#define OAI_OAIRemoteAccessApiHandler_H

#include <QObject>

#include "OAIComputerSet.h"
#include "OAIFreeStyleBuild.h"
#include "OAIFreeStyleProject.h"
#include "OAIHudson.h"
#include "OAIListView.h"
#include "OAIQueue.h"
#include <QString>

namespace OpenAPI {

class OAIRemoteAccessApiHandler : public QObject
{
    Q_OBJECT

public:
    OAIRemoteAccessApiHandler();
    virtual ~OAIRemoteAccessApiHandler();


public slots:
    virtual void getComputer(qint32 depth);
    virtual void getJenkins();
    virtual void getJob(QString name);
    virtual void getJobConfig(QString name);
    virtual void getJobLastBuild(QString name);
    virtual void getJobProgressiveText(QString name, QString number, QString start);
    virtual void getQueue();
    virtual void getQueueItem(QString number);
    virtual void getView(QString name);
    virtual void getViewConfig(QString name);
    virtual void headJenkins();
    virtual void postCreateItem(QString name, QString from, QString mode, QString jenkins_crumb, QString content_type, QString body);
    virtual void postCreateView(QString name, QString jenkins_crumb, QString content_type, QString body);
    virtual void postJobBuild(QString name, QString json, QString token, QString jenkins_crumb);
    virtual void postJobConfig(QString name, QString body, QString jenkins_crumb);
    virtual void postJobDelete(QString name, QString jenkins_crumb);
    virtual void postJobDisable(QString name, QString jenkins_crumb);
    virtual void postJobEnable(QString name, QString jenkins_crumb);
    virtual void postJobLastBuildStop(QString name, QString jenkins_crumb);
    virtual void postViewConfig(QString name, QString body, QString jenkins_crumb);
    

};

}

#endif // OAI_OAIRemoteAccessApiHandler_H
