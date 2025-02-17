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


#import "OAIBranchImpllinks.h"
#import "OAIBranchImplpermissions.h"
#import "OAIPipelineRunImpl.h"
#import "OAIStringParameterDefinition.h"
@protocol OAIBranchImpllinks;
@class OAIBranchImpllinks;
@protocol OAIBranchImplpermissions;
@class OAIBranchImplpermissions;
@protocol OAIPipelineRunImpl;
@class OAIPipelineRunImpl;
@protocol OAIStringParameterDefinition;
@class OAIStringParameterDefinition;



@protocol OAIBranchImpl
@end

@interface OAIBranchImpl : OAIObject


@property(nonatomic) NSString* _class;

@property(nonatomic) NSString* displayName;

@property(nonatomic) NSNumber* estimatedDurationInMillis;

@property(nonatomic) NSString* fullDisplayName;

@property(nonatomic) NSString* fullName;

@property(nonatomic) NSString* name;

@property(nonatomic) NSString* organization;

@property(nonatomic) NSArray<OAIStringParameterDefinition>* parameters;

@property(nonatomic) OAIBranchImplpermissions* permissions;

@property(nonatomic) NSNumber* weatherScore;

@property(nonatomic) NSString* pullRequest;

@property(nonatomic) OAIBranchImpllinks* links;

@property(nonatomic) OAIPipelineRunImpl* latestRun;

@end
