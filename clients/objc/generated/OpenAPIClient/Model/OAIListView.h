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


#import "OAIFreeStyleProject.h"
@protocol OAIFreeStyleProject;
@class OAIFreeStyleProject;



@protocol OAIListView
@end

@interface OAIListView : OAIObject


@property(nonatomic) NSString* _class;

@property(nonatomic) NSString* _description;

@property(nonatomic) NSArray<OAIFreeStyleProject>* jobs;

@property(nonatomic) NSString* name;

@property(nonatomic) NSString* url;

@end
