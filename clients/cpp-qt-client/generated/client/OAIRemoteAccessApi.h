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

#ifndef OAI_OAIRemoteAccessApi_H
#define OAI_OAIRemoteAccessApi_H

#include "OAIHelpers.h"
#include "OAIHttpRequest.h"
#include "OAIServerConfiguration.h"
#include "OAIOauth.h"

#include "OAIComputerSet.h"
#include "OAIFreeStyleBuild.h"
#include "OAIFreeStyleProject.h"
#include "OAIHudson.h"
#include "OAIListView.h"
#include "OAIQueue.h"
#include <QString>

#include <QObject>
#include <QByteArray>
#include <QStringList>
#include <QList>
#include <QNetworkAccessManager>

namespace OpenAPI {

class OAIRemoteAccessApi : public QObject {
    Q_OBJECT

public:
    OAIRemoteAccessApi(const int timeOut = 0);
    ~OAIRemoteAccessApi();

    void initializeServerConfigs();
    int setDefaultServerValue(int serverIndex,const QString &operation, const QString &variable,const QString &val);
    void setServerIndex(const QString &operation, int serverIndex);
    void setApiKey(const QString &apiKeyName, const QString &apiKey);
    void setBearerToken(const QString &token);
    void setUsername(const QString &username);
    void setPassword(const QString &password);
    void setTimeOut(const int timeOut);
    void setWorkingDirectory(const QString &path);
    void setNetworkAccessManager(QNetworkAccessManager* manager);
    int addServerConfiguration(const QString &operation, const QUrl &url, const QString &description = "", const QMap<QString, OAIServerVariable> &variables = QMap<QString, OAIServerVariable>());
    void setNewServerForAllOperations(const QUrl &url, const QString &description = "", const QMap<QString, OAIServerVariable> &variables =  QMap<QString, OAIServerVariable>());
    void setNewServer(const QString &operation, const QUrl &url, const QString &description = "", const QMap<QString, OAIServerVariable> &variables =  QMap<QString, OAIServerVariable>());
    void addHeaders(const QString &key, const QString &value);
    void enableRequestCompression();
    void enableResponseCompression();
    void abortRequests();
    QString getParamStylePrefix(const QString &style);
    QString getParamStyleSuffix(const QString &style);
    QString getParamStyleDelimiter(const QString &style, const QString &name, bool isExplode);

    /**
    * @param[in]  depth qint32 [required]
    */
    void getComputer(const qint32 &depth);


    void getJenkins();

    /**
    * @param[in]  name QString [required]
    */
    void getJob(const QString &name);

    /**
    * @param[in]  name QString [required]
    */
    void getJobConfig(const QString &name);

    /**
    * @param[in]  name QString [required]
    */
    void getJobLastBuild(const QString &name);

    /**
    * @param[in]  name QString [required]
    * @param[in]  number QString [required]
    * @param[in]  start QString [required]
    */
    void getJobProgressiveText(const QString &name, const QString &number, const QString &start);


    void getQueue();

    /**
    * @param[in]  number QString [required]
    */
    void getQueueItem(const QString &number);

    /**
    * @param[in]  name QString [required]
    */
    void getView(const QString &name);

    /**
    * @param[in]  name QString [required]
    */
    void getViewConfig(const QString &name);


    void headJenkins();

    /**
    * @param[in]  name QString [required]
    * @param[in]  from QString [optional]
    * @param[in]  mode QString [optional]
    * @param[in]  jenkins_crumb QString [optional]
    * @param[in]  content_type QString [optional]
    * @param[in]  body QString [optional]
    */
    void postCreateItem(const QString &name, const ::OpenAPI::OptionalParam<QString> &from = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<QString> &mode = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<QString> &jenkins_crumb = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<QString> &content_type = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<QString> &body = ::OpenAPI::OptionalParam<QString>());

    /**
    * @param[in]  name QString [required]
    * @param[in]  jenkins_crumb QString [optional]
    * @param[in]  content_type QString [optional]
    * @param[in]  body QString [optional]
    */
    void postCreateView(const QString &name, const ::OpenAPI::OptionalParam<QString> &jenkins_crumb = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<QString> &content_type = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<QString> &body = ::OpenAPI::OptionalParam<QString>());

    /**
    * @param[in]  name QString [required]
    * @param[in]  json QString [required]
    * @param[in]  token QString [optional]
    * @param[in]  jenkins_crumb QString [optional]
    */
    void postJobBuild(const QString &name, const QString &json, const ::OpenAPI::OptionalParam<QString> &token = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<QString> &jenkins_crumb = ::OpenAPI::OptionalParam<QString>());

    /**
    * @param[in]  name QString [required]
    * @param[in]  body QString [required]
    * @param[in]  jenkins_crumb QString [optional]
    */
    void postJobConfig(const QString &name, const QString &body, const ::OpenAPI::OptionalParam<QString> &jenkins_crumb = ::OpenAPI::OptionalParam<QString>());

    /**
    * @param[in]  name QString [required]
    * @param[in]  jenkins_crumb QString [optional]
    */
    void postJobDelete(const QString &name, const ::OpenAPI::OptionalParam<QString> &jenkins_crumb = ::OpenAPI::OptionalParam<QString>());

    /**
    * @param[in]  name QString [required]
    * @param[in]  jenkins_crumb QString [optional]
    */
    void postJobDisable(const QString &name, const ::OpenAPI::OptionalParam<QString> &jenkins_crumb = ::OpenAPI::OptionalParam<QString>());

    /**
    * @param[in]  name QString [required]
    * @param[in]  jenkins_crumb QString [optional]
    */
    void postJobEnable(const QString &name, const ::OpenAPI::OptionalParam<QString> &jenkins_crumb = ::OpenAPI::OptionalParam<QString>());

    /**
    * @param[in]  name QString [required]
    * @param[in]  jenkins_crumb QString [optional]
    */
    void postJobLastBuildStop(const QString &name, const ::OpenAPI::OptionalParam<QString> &jenkins_crumb = ::OpenAPI::OptionalParam<QString>());

    /**
    * @param[in]  name QString [required]
    * @param[in]  body QString [required]
    * @param[in]  jenkins_crumb QString [optional]
    */
    void postViewConfig(const QString &name, const QString &body, const ::OpenAPI::OptionalParam<QString> &jenkins_crumb = ::OpenAPI::OptionalParam<QString>());


private:
    QMap<QString,int> _serverIndices;
    QMap<QString,QList<OAIServerConfiguration>> _serverConfigs;
    QMap<QString, QString> _apiKeys;
    QString _bearerToken;
    QString _username;
    QString _password;
    int _timeOut;
    QString _workingDirectory;
    QNetworkAccessManager* _manager;
    QMap<QString, QString> _defaultHeaders;
    bool _isResponseCompressionEnabled;
    bool _isRequestCompressionEnabled;
    OAIHttpRequestInput _latestInput;
    OAIHttpRequestWorker *_latestWorker;
    QStringList _latestScope;
    OauthCode _authFlow;
    OauthImplicit _implicitFlow;
    OauthCredentials _credentialFlow;
    OauthPassword _passwordFlow;
    int _OauthMethod = 0;

    void getComputerCallback(OAIHttpRequestWorker *worker);
    void getJenkinsCallback(OAIHttpRequestWorker *worker);
    void getJobCallback(OAIHttpRequestWorker *worker);
    void getJobConfigCallback(OAIHttpRequestWorker *worker);
    void getJobLastBuildCallback(OAIHttpRequestWorker *worker);
    void getJobProgressiveTextCallback(OAIHttpRequestWorker *worker);
    void getQueueCallback(OAIHttpRequestWorker *worker);
    void getQueueItemCallback(OAIHttpRequestWorker *worker);
    void getViewCallback(OAIHttpRequestWorker *worker);
    void getViewConfigCallback(OAIHttpRequestWorker *worker);
    void headJenkinsCallback(OAIHttpRequestWorker *worker);
    void postCreateItemCallback(OAIHttpRequestWorker *worker);
    void postCreateViewCallback(OAIHttpRequestWorker *worker);
    void postJobBuildCallback(OAIHttpRequestWorker *worker);
    void postJobConfigCallback(OAIHttpRequestWorker *worker);
    void postJobDeleteCallback(OAIHttpRequestWorker *worker);
    void postJobDisableCallback(OAIHttpRequestWorker *worker);
    void postJobEnableCallback(OAIHttpRequestWorker *worker);
    void postJobLastBuildStopCallback(OAIHttpRequestWorker *worker);
    void postViewConfigCallback(OAIHttpRequestWorker *worker);

signals:

    void getComputerSignal(OAIComputerSet summary);
    void getJenkinsSignal(OAIHudson summary);
    void getJobSignal(OAIFreeStyleProject summary);
    void getJobConfigSignal(QString summary);
    void getJobLastBuildSignal(OAIFreeStyleBuild summary);
    void getJobProgressiveTextSignal();
    void getQueueSignal(OAIQueue summary);
    void getQueueItemSignal(OAIQueue summary);
    void getViewSignal(OAIListView summary);
    void getViewConfigSignal(QString summary);
    void headJenkinsSignal();
    void postCreateItemSignal();
    void postCreateViewSignal();
    void postJobBuildSignal();
    void postJobConfigSignal();
    void postJobDeleteSignal();
    void postJobDisableSignal();
    void postJobEnableSignal();
    void postJobLastBuildStopSignal();
    void postViewConfigSignal();

    void getComputerSignalFull(OAIHttpRequestWorker *worker, OAIComputerSet summary);
    void getJenkinsSignalFull(OAIHttpRequestWorker *worker, OAIHudson summary);
    void getJobSignalFull(OAIHttpRequestWorker *worker, OAIFreeStyleProject summary);
    void getJobConfigSignalFull(OAIHttpRequestWorker *worker, QString summary);
    void getJobLastBuildSignalFull(OAIHttpRequestWorker *worker, OAIFreeStyleBuild summary);
    void getJobProgressiveTextSignalFull(OAIHttpRequestWorker *worker);
    void getQueueSignalFull(OAIHttpRequestWorker *worker, OAIQueue summary);
    void getQueueItemSignalFull(OAIHttpRequestWorker *worker, OAIQueue summary);
    void getViewSignalFull(OAIHttpRequestWorker *worker, OAIListView summary);
    void getViewConfigSignalFull(OAIHttpRequestWorker *worker, QString summary);
    void headJenkinsSignalFull(OAIHttpRequestWorker *worker);
    void postCreateItemSignalFull(OAIHttpRequestWorker *worker);
    void postCreateViewSignalFull(OAIHttpRequestWorker *worker);
    void postJobBuildSignalFull(OAIHttpRequestWorker *worker);
    void postJobConfigSignalFull(OAIHttpRequestWorker *worker);
    void postJobDeleteSignalFull(OAIHttpRequestWorker *worker);
    void postJobDisableSignalFull(OAIHttpRequestWorker *worker);
    void postJobEnableSignalFull(OAIHttpRequestWorker *worker);
    void postJobLastBuildStopSignalFull(OAIHttpRequestWorker *worker);
    void postViewConfigSignalFull(OAIHttpRequestWorker *worker);

    void getComputerSignalE(OAIComputerSet summary, QNetworkReply::NetworkError error_type, QString error_str);
    void getJenkinsSignalE(OAIHudson summary, QNetworkReply::NetworkError error_type, QString error_str);
    void getJobSignalE(OAIFreeStyleProject summary, QNetworkReply::NetworkError error_type, QString error_str);
    void getJobConfigSignalE(QString summary, QNetworkReply::NetworkError error_type, QString error_str);
    void getJobLastBuildSignalE(OAIFreeStyleBuild summary, QNetworkReply::NetworkError error_type, QString error_str);
    void getJobProgressiveTextSignalE(QNetworkReply::NetworkError error_type, QString error_str);
    void getQueueSignalE(OAIQueue summary, QNetworkReply::NetworkError error_type, QString error_str);
    void getQueueItemSignalE(OAIQueue summary, QNetworkReply::NetworkError error_type, QString error_str);
    void getViewSignalE(OAIListView summary, QNetworkReply::NetworkError error_type, QString error_str);
    void getViewConfigSignalE(QString summary, QNetworkReply::NetworkError error_type, QString error_str);
    void headJenkinsSignalE(QNetworkReply::NetworkError error_type, QString error_str);
    void postCreateItemSignalE(QNetworkReply::NetworkError error_type, QString error_str);
    void postCreateViewSignalE(QNetworkReply::NetworkError error_type, QString error_str);
    void postJobBuildSignalE(QNetworkReply::NetworkError error_type, QString error_str);
    void postJobConfigSignalE(QNetworkReply::NetworkError error_type, QString error_str);
    void postJobDeleteSignalE(QNetworkReply::NetworkError error_type, QString error_str);
    void postJobDisableSignalE(QNetworkReply::NetworkError error_type, QString error_str);
    void postJobEnableSignalE(QNetworkReply::NetworkError error_type, QString error_str);
    void postJobLastBuildStopSignalE(QNetworkReply::NetworkError error_type, QString error_str);
    void postViewConfigSignalE(QNetworkReply::NetworkError error_type, QString error_str);

    void getComputerSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void getJenkinsSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void getJobSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void getJobConfigSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void getJobLastBuildSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void getJobProgressiveTextSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void getQueueSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void getQueueItemSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void getViewSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void getViewConfigSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void headJenkinsSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void postCreateItemSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void postCreateViewSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void postJobBuildSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void postJobConfigSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void postJobDeleteSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void postJobDisableSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void postJobEnableSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void postJobLastBuildStopSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void postViewConfigSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);

    void abortRequestsSignal();
    void allPendingRequestsCompleted();

public slots:
    void tokenAvailable();
    
};

} // namespace OpenAPI
#endif
