#import <Foundation/Foundation.h>
#import "OAIDefaultCrumbIssuer.h"
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



@interface OAIBaseApi: NSObject <OAIApi>

extern NSString* kOAIBaseApiErrorDomain;
extern NSInteger kOAIBaseApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(OAIApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// 
/// Retrieve CSRF protection token
///
/// 
///  code:200 message:"Successfully retrieved CSRF protection token",
///  code:401 message:"Authentication failed - incorrect username and/or password",
///  code:403 message:"Jenkins requires authentication - please set username and password"
///
/// @return OAIDefaultCrumbIssuer*
-(NSURLSessionTask*) getCrumbWithCompletionHandler: 
    (void (^)(OAIDefaultCrumbIssuer* output, NSError* error)) handler;



@end
