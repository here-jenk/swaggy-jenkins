#import <Foundation/Foundation.h>
#import "OAIObject.h"

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


#import "OAIPipelineImpllinks.h"
@protocol OAIPipelineImpllinks;
@class OAIPipelineImpllinks;



@protocol OAIPipelineImpl
@end

@interface OAIPipelineImpl : OAIObject


@property(nonatomic) NSString* _class;

@property(nonatomic) NSString* displayName;

@property(nonatomic) NSNumber* estimatedDurationInMillis;

@property(nonatomic) NSString* fullName;

@property(nonatomic) NSString* latestRun;

@property(nonatomic) NSString* name;

@property(nonatomic) NSString* organization;

@property(nonatomic) NSNumber* weatherScore;

@property(nonatomic) OAIPipelineImpllinks* links;

@end
