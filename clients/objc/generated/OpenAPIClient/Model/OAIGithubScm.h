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


#import "OAIGithubScmlinks.h"
@protocol OAIGithubScmlinks;
@class OAIGithubScmlinks;



@protocol OAIGithubScm
@end

@interface OAIGithubScm : OAIObject


@property(nonatomic) NSString* _class;

@property(nonatomic) OAIGithubScmlinks* links;

@property(nonatomic) NSString* credentialId;

@property(nonatomic) NSString* _id;

@property(nonatomic) NSString* uri;

@end
