#import <Foundation/Foundation.h>
#import "OAIBranchImpl.h"
#import "OAIFavoriteImpl.h"
#import "OAIGithubOrganization.h"
#import "OAIGithubScm.h"
#import "OAIMultibranchPipeline.h"
#import "OAIOrganisation.h"
#import "OAIPipeline.h"
#import "OAIPipelineActivity.h"
#import "OAIPipelineFolderImpl.h"
#import "OAIPipelineImpl.h"
#import "OAIPipelineRun.h"
#import "OAIPipelineRunNode.h"
#import "OAIPipelineStepImpl.h"
#import "OAIQueueItemImpl.h"
#import "OAIUser.h"
#import "OAIApi.h"

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



@interface OAIBlueOceanApi: NSObject <OAIApi>

extern NSString* kOAIBlueOceanApiErrorDomain;
extern NSInteger kOAIBlueOceanApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(OAIApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// 
/// Delete queue item from an organization pipeline queue
///
/// @param organization Name of the organization
/// @param pipeline Name of the pipeline
/// @param queue Name of the queue item
/// 
///  code:200 message:"Successfully deleted queue item",
///  code:401 message:"Authentication failed - incorrect username and/or password",
///  code:403 message:"Jenkins requires authentication - please set username and password"
///
/// @return void
-(NSURLSessionTask*) deletePipelineQueueItemWithOrganization: (NSString*) organization
    pipeline: (NSString*) pipeline
    queue: (NSString*) queue
    completionHandler: (void (^)(NSError* error)) handler;


/// 
/// Retrieve authenticated user details for an organization
///
/// @param organization Name of the organization
/// 
///  code:200 message:"Successfully retrieved authenticated user details",
///  code:401 message:"Authentication failed - incorrect username and/or password",
///  code:403 message:"Jenkins requires authentication - please set username and password"
///
/// @return OAIUser*
-(NSURLSessionTask*) getAuthenticatedUserWithOrganization: (NSString*) organization
    completionHandler: (void (^)(OAIUser* output, NSError* error)) handler;


/// 
/// Get a list of class names supported by a given class
///
/// @param _class Name of the class
/// 
///  code:200 message:"Successfully retrieved class names",
///  code:401 message:"Authentication failed - incorrect username and/or password",
///  code:403 message:"Jenkins requires authentication - please set username and password"
///
/// @return NSString*
-(NSURLSessionTask*) getClassesWithClass: (NSString*) _class
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;


/// 
/// Retrieve JSON Web Key
///
/// @param key Key ID received as part of JWT header field kid
/// 
///  code:200 message:"Successfully retrieved JWT token",
///  code:401 message:"Authentication failed - incorrect username and/or password",
///  code:403 message:"Jenkins requires authentication - please set username and password"
///
/// @return NSString*
-(NSURLSessionTask*) getJsonWebKeyWithKey: (NSNumber*) key
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;


/// 
/// Retrieve JSON Web Token
///
/// @param expiryTimeInMins Token expiry time in minutes, default: 30 minutes (optional)
/// @param maxExpiryTimeInMins Maximum token expiry time in minutes, default: 480 minutes (optional)
/// 
///  code:200 message:"Successfully retrieved JWT token",
///  code:401 message:"Authentication failed - incorrect username and/or password",
///  code:403 message:"Jenkins requires authentication - please set username and password"
///
/// @return NSString*
-(NSURLSessionTask*) getJsonWebTokenWithExpiryTimeInMins: (NSNumber*) expiryTimeInMins
    maxExpiryTimeInMins: (NSNumber*) maxExpiryTimeInMins
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;


/// 
/// Retrieve organization details
///
/// @param organization Name of the organization
/// 
///  code:200 message:"Successfully retrieved pipeline details",
///  code:401 message:"Authentication failed - incorrect username and/or password",
///  code:403 message:"Jenkins requires authentication - please set username and password",
///  code:404 message:"Pipeline cannot be found on Jenkins instance"
///
/// @return OAIOrganisation*
-(NSURLSessionTask*) getOrganisationWithOrganization: (NSString*) organization
    completionHandler: (void (^)(OAIOrganisation* output, NSError* error)) handler;


/// 
/// Retrieve all organizations details
///
/// 
///  code:200 message:"Successfully retrieved pipelines details",
///  code:401 message:"Authentication failed - incorrect username and/or password",
///  code:403 message:"Jenkins requires authentication - please set username and password"
///
/// @return NSArray<OAIOrganisation>*
-(NSURLSessionTask*) getOrganisationsWithCompletionHandler: 
    (void (^)(NSArray<OAIOrganisation>* output, NSError* error)) handler;


/// 
/// Retrieve pipeline details for an organization
///
/// @param organization Name of the organization
/// @param pipeline Name of the pipeline
/// 
///  code:200 message:"Successfully retrieved pipeline details",
///  code:401 message:"Authentication failed - incorrect username and/or password",
///  code:403 message:"Jenkins requires authentication - please set username and password",
///  code:404 message:"Pipeline cannot be found on Jenkins instance"
///
/// @return OAIPipeline*
-(NSURLSessionTask*) getPipelineWithOrganization: (NSString*) organization
    pipeline: (NSString*) pipeline
    completionHandler: (void (^)(OAIPipeline* output, NSError* error)) handler;


/// 
/// Retrieve all activities details for an organization pipeline
///
/// @param organization Name of the organization
/// @param pipeline Name of the pipeline
/// 
///  code:200 message:"Successfully retrieved all activities details",
///  code:401 message:"Authentication failed - incorrect username and/or password",
///  code:403 message:"Jenkins requires authentication - please set username and password"
///
/// @return NSArray<OAIPipelineActivity>*
-(NSURLSessionTask*) getPipelineActivitiesWithOrganization: (NSString*) organization
    pipeline: (NSString*) pipeline
    completionHandler: (void (^)(NSArray<OAIPipelineActivity>* output, NSError* error)) handler;


/// 
/// Retrieve branch details for an organization pipeline
///
/// @param organization Name of the organization
/// @param pipeline Name of the pipeline
/// @param branch Name of the branch
/// 
///  code:200 message:"Successfully retrieved branch details",
///  code:401 message:"Authentication failed - incorrect username and/or password",
///  code:403 message:"Jenkins requires authentication - please set username and password"
///
/// @return OAIBranchImpl*
-(NSURLSessionTask*) getPipelineBranchWithOrganization: (NSString*) organization
    pipeline: (NSString*) pipeline
    branch: (NSString*) branch
    completionHandler: (void (^)(OAIBranchImpl* output, NSError* error)) handler;


/// 
/// Retrieve branch run details for an organization pipeline
///
/// @param organization Name of the organization
/// @param pipeline Name of the pipeline
/// @param branch Name of the branch
/// @param run Name of the run
/// 
///  code:200 message:"Successfully retrieved run details",
///  code:401 message:"Authentication failed - incorrect username and/or password",
///  code:403 message:"Jenkins requires authentication - please set username and password"
///
/// @return OAIPipelineRun*
-(NSURLSessionTask*) getPipelineBranchRunWithOrganization: (NSString*) organization
    pipeline: (NSString*) pipeline
    branch: (NSString*) branch
    run: (NSString*) run
    completionHandler: (void (^)(OAIPipelineRun* output, NSError* error)) handler;


/// 
/// Retrieve all branches details for an organization pipeline
///
/// @param organization Name of the organization
/// @param pipeline Name of the pipeline
/// 
///  code:200 message:"Successfully retrieved all branches details",
///  code:401 message:"Authentication failed - incorrect username and/or password",
///  code:403 message:"Jenkins requires authentication - please set username and password"
///
/// @return OAIMultibranchPipeline*
-(NSURLSessionTask*) getPipelineBranchesWithOrganization: (NSString*) organization
    pipeline: (NSString*) pipeline
    completionHandler: (void (^)(OAIMultibranchPipeline* output, NSError* error)) handler;


/// 
/// Retrieve pipeline folder for an organization
///
/// @param organization Name of the organization
/// @param folder Name of the folder
/// 
///  code:200 message:"Successfully retrieved folder details",
///  code:401 message:"Authentication failed - incorrect username and/or password",
///  code:403 message:"Jenkins requires authentication - please set username and password"
///
/// @return OAIPipelineFolderImpl*
-(NSURLSessionTask*) getPipelineFolderWithOrganization: (NSString*) organization
    folder: (NSString*) folder
    completionHandler: (void (^)(OAIPipelineFolderImpl* output, NSError* error)) handler;


/// 
/// Retrieve pipeline details for an organization folder
///
/// @param organization Name of the organization
/// @param pipeline Name of the pipeline
/// @param folder Name of the folder
/// 
///  code:200 message:"Successfully retrieved pipeline details",
///  code:401 message:"Authentication failed - incorrect username and/or password",
///  code:403 message:"Jenkins requires authentication - please set username and password"
///
/// @return OAIPipelineImpl*
-(NSURLSessionTask*) getPipelineFolderPipelineWithOrganization: (NSString*) organization
    pipeline: (NSString*) pipeline
    folder: (NSString*) folder
    completionHandler: (void (^)(OAIPipelineImpl* output, NSError* error)) handler;


/// 
/// Retrieve queue details for an organization pipeline
///
/// @param organization Name of the organization
/// @param pipeline Name of the pipeline
/// 
///  code:200 message:"Successfully retrieved queue details",
///  code:401 message:"Authentication failed - incorrect username and/or password",
///  code:403 message:"Jenkins requires authentication - please set username and password"
///
/// @return NSArray<OAIQueueItemImpl>*
-(NSURLSessionTask*) getPipelineQueueWithOrganization: (NSString*) organization
    pipeline: (NSString*) pipeline
    completionHandler: (void (^)(NSArray<OAIQueueItemImpl>* output, NSError* error)) handler;


/// 
/// Retrieve run details for an organization pipeline
///
/// @param organization Name of the organization
/// @param pipeline Name of the pipeline
/// @param run Name of the run
/// 
///  code:200 message:"Successfully retrieved run details",
///  code:401 message:"Authentication failed - incorrect username and/or password",
///  code:403 message:"Jenkins requires authentication - please set username and password"
///
/// @return OAIPipelineRun*
-(NSURLSessionTask*) getPipelineRunWithOrganization: (NSString*) organization
    pipeline: (NSString*) pipeline
    run: (NSString*) run
    completionHandler: (void (^)(OAIPipelineRun* output, NSError* error)) handler;


/// 
/// Get log for a pipeline run
///
/// @param organization Name of the organization
/// @param pipeline Name of the pipeline
/// @param run Name of the run
/// @param start Start position of the log (optional)
/// @param download Set to true in order to download the file, otherwise it&#39;s passed as a response body (optional)
/// 
///  code:200 message:"Successfully retrieved pipeline run log",
///  code:401 message:"Authentication failed - incorrect username and/or password",
///  code:403 message:"Jenkins requires authentication - please set username and password"
///
/// @return NSString*
-(NSURLSessionTask*) getPipelineRunLogWithOrganization: (NSString*) organization
    pipeline: (NSString*) pipeline
    run: (NSString*) run
    start: (NSNumber*) start
    download: (NSNumber*) download
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;


/// 
/// Retrieve run node details for an organization pipeline
///
/// @param organization Name of the organization
/// @param pipeline Name of the pipeline
/// @param run Name of the run
/// @param node Name of the node
/// 
///  code:200 message:"Successfully retrieved run node details",
///  code:401 message:"Authentication failed - incorrect username and/or password",
///  code:403 message:"Jenkins requires authentication - please set username and password"
///
/// @return OAIPipelineRunNode*
-(NSURLSessionTask*) getPipelineRunNodeWithOrganization: (NSString*) organization
    pipeline: (NSString*) pipeline
    run: (NSString*) run
    node: (NSString*) node
    completionHandler: (void (^)(OAIPipelineRunNode* output, NSError* error)) handler;


/// 
/// Retrieve run node details for an organization pipeline
///
/// @param organization Name of the organization
/// @param pipeline Name of the pipeline
/// @param run Name of the run
/// @param node Name of the node
/// @param step Name of the step
/// 
///  code:200 message:"Successfully retrieved run node step details",
///  code:401 message:"Authentication failed - incorrect username and/or password",
///  code:403 message:"Jenkins requires authentication - please set username and password"
///
/// @return OAIPipelineStepImpl*
-(NSURLSessionTask*) getPipelineRunNodeStepWithOrganization: (NSString*) organization
    pipeline: (NSString*) pipeline
    run: (NSString*) run
    node: (NSString*) node
    step: (NSString*) step
    completionHandler: (void (^)(OAIPipelineStepImpl* output, NSError* error)) handler;


/// 
/// Get log for a pipeline run node step
///
/// @param organization Name of the organization
/// @param pipeline Name of the pipeline
/// @param run Name of the run
/// @param node Name of the node
/// @param step Name of the step
/// 
///  code:200 message:"Successfully retrieved pipeline run node step log",
///  code:401 message:"Authentication failed - incorrect username and/or password",
///  code:403 message:"Jenkins requires authentication - please set username and password"
///
/// @return NSString*
-(NSURLSessionTask*) getPipelineRunNodeStepLogWithOrganization: (NSString*) organization
    pipeline: (NSString*) pipeline
    run: (NSString*) run
    node: (NSString*) node
    step: (NSString*) step
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;


/// 
/// Retrieve run node steps details for an organization pipeline
///
/// @param organization Name of the organization
/// @param pipeline Name of the pipeline
/// @param run Name of the run
/// @param node Name of the node
/// 
///  code:200 message:"Successfully retrieved run node steps details",
///  code:401 message:"Authentication failed - incorrect username and/or password",
///  code:403 message:"Jenkins requires authentication - please set username and password"
///
/// @return NSArray<OAIPipelineStepImpl>*
-(NSURLSessionTask*) getPipelineRunNodeStepsWithOrganization: (NSString*) organization
    pipeline: (NSString*) pipeline
    run: (NSString*) run
    node: (NSString*) node
    completionHandler: (void (^)(NSArray<OAIPipelineStepImpl>* output, NSError* error)) handler;


/// 
/// Retrieve run nodes details for an organization pipeline
///
/// @param organization Name of the organization
/// @param pipeline Name of the pipeline
/// @param run Name of the run
/// 
///  code:200 message:"Successfully retrieved run nodes details",
///  code:401 message:"Authentication failed - incorrect username and/or password",
///  code:403 message:"Jenkins requires authentication - please set username and password"
///
/// @return NSArray<OAIPipelineRunNode>*
-(NSURLSessionTask*) getPipelineRunNodesWithOrganization: (NSString*) organization
    pipeline: (NSString*) pipeline
    run: (NSString*) run
    completionHandler: (void (^)(NSArray<OAIPipelineRunNode>* output, NSError* error)) handler;


/// 
/// Retrieve all runs details for an organization pipeline
///
/// @param organization Name of the organization
/// @param pipeline Name of the pipeline
/// 
///  code:200 message:"Successfully retrieved runs details",
///  code:401 message:"Authentication failed - incorrect username and/or password",
///  code:403 message:"Jenkins requires authentication - please set username and password"
///
/// @return NSArray<OAIPipelineRun>*
-(NSURLSessionTask*) getPipelineRunsWithOrganization: (NSString*) organization
    pipeline: (NSString*) pipeline
    completionHandler: (void (^)(NSArray<OAIPipelineRun>* output, NSError* error)) handler;


/// 
/// Retrieve all pipelines details for an organization
///
/// @param organization Name of the organization
/// 
///  code:200 message:"Successfully retrieved pipelines details",
///  code:401 message:"Authentication failed - incorrect username and/or password",
///  code:403 message:"Jenkins requires authentication - please set username and password"
///
/// @return NSArray<OAIPipeline>*
-(NSURLSessionTask*) getPipelinesWithOrganization: (NSString*) organization
    completionHandler: (void (^)(NSArray<OAIPipeline>* output, NSError* error)) handler;


/// 
/// Retrieve SCM details for an organization
///
/// @param organization Name of the organization
/// @param scm Name of SCM
/// 
///  code:200 message:"Successfully retrieved SCM details",
///  code:401 message:"Authentication failed - incorrect username and/or password",
///  code:403 message:"Jenkins requires authentication - please set username and password"
///
/// @return OAIGithubScm*
-(NSURLSessionTask*) getSCMWithOrganization: (NSString*) organization
    scm: (NSString*) scm
    completionHandler: (void (^)(OAIGithubScm* output, NSError* error)) handler;


/// 
/// Retrieve SCM organization repositories details for an organization
///
/// @param organization Name of the organization
/// @param scm Name of SCM
/// @param scmOrganisation Name of the SCM organization
/// @param credentialId Credential ID (optional)
/// @param pageSize Number of items in a page (optional)
/// @param pageNumber Page number (optional)
/// 
///  code:200 message:"Successfully retrieved SCM organization repositories details",
///  code:401 message:"Authentication failed - incorrect username and/or password",
///  code:403 message:"Jenkins requires authentication - please set username and password"
///
/// @return NSArray<OAIGithubOrganization>*
-(NSURLSessionTask*) getSCMOrganisationRepositoriesWithOrganization: (NSString*) organization
    scm: (NSString*) scm
    scmOrganisation: (NSString*) scmOrganisation
    credentialId: (NSString*) credentialId
    pageSize: (NSNumber*) pageSize
    pageNumber: (NSNumber*) pageNumber
    completionHandler: (void (^)(NSArray<OAIGithubOrganization>* output, NSError* error)) handler;


/// 
/// Retrieve SCM organization repository details for an organization
///
/// @param organization Name of the organization
/// @param scm Name of SCM
/// @param scmOrganisation Name of the SCM organization
/// @param repository Name of the SCM repository
/// @param credentialId Credential ID (optional)
/// 
///  code:200 message:"Successfully retrieved SCM organizations details",
///  code:401 message:"Authentication failed - incorrect username and/or password",
///  code:403 message:"Jenkins requires authentication - please set username and password"
///
/// @return NSArray<OAIGithubOrganization>*
-(NSURLSessionTask*) getSCMOrganisationRepositoryWithOrganization: (NSString*) organization
    scm: (NSString*) scm
    scmOrganisation: (NSString*) scmOrganisation
    repository: (NSString*) repository
    credentialId: (NSString*) credentialId
    completionHandler: (void (^)(NSArray<OAIGithubOrganization>* output, NSError* error)) handler;


/// 
/// Retrieve SCM organizations details for an organization
///
/// @param organization Name of the organization
/// @param scm Name of SCM
/// @param credentialId Credential ID (optional)
/// 
///  code:200 message:"Successfully retrieved SCM organizations details",
///  code:401 message:"Authentication failed - incorrect username and/or password",
///  code:403 message:"Jenkins requires authentication - please set username and password"
///
/// @return NSArray<OAIGithubOrganization>*
-(NSURLSessionTask*) getSCMOrganisationsWithOrganization: (NSString*) organization
    scm: (NSString*) scm
    credentialId: (NSString*) credentialId
    completionHandler: (void (^)(NSArray<OAIGithubOrganization>* output, NSError* error)) handler;


/// 
/// Retrieve user details for an organization
///
/// @param organization Name of the organization
/// @param user Name of the user
/// 
///  code:200 message:"Successfully retrieved users details",
///  code:401 message:"Authentication failed - incorrect username and/or password",
///  code:403 message:"Jenkins requires authentication - please set username and password"
///
/// @return OAIUser*
-(NSURLSessionTask*) getUserWithOrganization: (NSString*) organization
    user: (NSString*) user
    completionHandler: (void (^)(OAIUser* output, NSError* error)) handler;


/// 
/// Retrieve user favorites details for an organization
///
/// @param user Name of the user
/// 
///  code:200 message:"Successfully retrieved users favorites details",
///  code:401 message:"Authentication failed - incorrect username and/or password",
///  code:403 message:"Jenkins requires authentication - please set username and password"
///
/// @return NSArray<OAIFavoriteImpl>*
-(NSURLSessionTask*) getUserFavoritesWithUser: (NSString*) user
    completionHandler: (void (^)(NSArray<OAIFavoriteImpl>* output, NSError* error)) handler;


/// 
/// Retrieve users details for an organization
///
/// @param organization Name of the organization
/// 
///  code:200 message:"Successfully retrieved users details",
///  code:401 message:"Authentication failed - incorrect username and/or password",
///  code:403 message:"Jenkins requires authentication - please set username and password"
///
/// @return OAIUser*
-(NSURLSessionTask*) getUsersWithOrganization: (NSString*) organization
    completionHandler: (void (^)(OAIUser* output, NSError* error)) handler;


/// 
/// Replay an organization pipeline run
///
/// @param organization Name of the organization
/// @param pipeline Name of the pipeline
/// @param run Name of the run
/// 
///  code:200 message:"Successfully replayed a pipeline run",
///  code:401 message:"Authentication failed - incorrect username and/or password",
///  code:403 message:"Jenkins requires authentication - please set username and password"
///
/// @return OAIQueueItemImpl*
-(NSURLSessionTask*) postPipelineRunWithOrganization: (NSString*) organization
    pipeline: (NSString*) pipeline
    run: (NSString*) run
    completionHandler: (void (^)(OAIQueueItemImpl* output, NSError* error)) handler;


/// 
/// Start a build for an organization pipeline
///
/// @param organization Name of the organization
/// @param pipeline Name of the pipeline
/// 
///  code:200 message:"Successfully started a build",
///  code:401 message:"Authentication failed - incorrect username and/or password",
///  code:403 message:"Jenkins requires authentication - please set username and password"
///
/// @return OAIQueueItemImpl*
-(NSURLSessionTask*) postPipelineRunsWithOrganization: (NSString*) organization
    pipeline: (NSString*) pipeline
    completionHandler: (void (^)(OAIQueueItemImpl* output, NSError* error)) handler;


/// 
/// Favorite/unfavorite a pipeline
///
/// @param organization Name of the organization
/// @param pipeline Name of the pipeline
/// @param body Set JSON string body to {\&quot;favorite\&quot;: true} to favorite, set value to false to unfavorite
/// 
///  code:200 message:"Successfully favorited/unfavorited a pipeline",
///  code:401 message:"Authentication failed - incorrect username and/or password",
///  code:403 message:"Jenkins requires authentication - please set username and password"
///
/// @return OAIFavoriteImpl*
-(NSURLSessionTask*) putPipelineFavoriteWithOrganization: (NSString*) organization
    pipeline: (NSString*) pipeline
    body: (NSNumber*) body
    completionHandler: (void (^)(OAIFavoriteImpl* output, NSError* error)) handler;


/// 
/// Stop a build of an organization pipeline
///
/// @param organization Name of the organization
/// @param pipeline Name of the pipeline
/// @param run Name of the run
/// @param blocking Set to true to make blocking stop, default: false (optional)
/// @param timeOutInSecs Timeout in seconds, default: 10 seconds (optional)
/// 
///  code:200 message:"Successfully stopped a build",
///  code:401 message:"Authentication failed - incorrect username and/or password",
///  code:403 message:"Jenkins requires authentication - please set username and password"
///
/// @return OAIPipelineRun*
-(NSURLSessionTask*) putPipelineRunWithOrganization: (NSString*) organization
    pipeline: (NSString*) pipeline
    run: (NSString*) run
    blocking: (NSString*) blocking
    timeOutInSecs: (NSNumber*) timeOutInSecs
    completionHandler: (void (^)(OAIPipelineRun* output, NSError* error)) handler;


/// 
/// Search for any resource details
///
/// @param q Query string
/// 
///  code:200 message:"Successfully retrieved search result",
///  code:401 message:"Authentication failed - incorrect username and/or password",
///  code:403 message:"Jenkins requires authentication - please set username and password"
///
/// @return NSString*
-(NSURLSessionTask*) searchWithQ: (NSString*) q
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;


/// 
/// Get classes details
///
/// @param q Query string containing an array of class names
/// 
///  code:200 message:"Successfully retrieved search result",
///  code:401 message:"Authentication failed - incorrect username and/or password",
///  code:403 message:"Jenkins requires authentication - please set username and password"
///
/// @return NSString*
-(NSURLSessionTask*) searchClassesWithQ: (NSString*) q
    completionHandler: (void (^)(NSString* output, NSError* error)) handler;



@end
