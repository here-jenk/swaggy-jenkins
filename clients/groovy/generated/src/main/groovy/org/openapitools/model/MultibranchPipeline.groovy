package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

@Canonical
class MultibranchPipeline {
    
    String displayName
    
    Integer estimatedDurationInMillis
    
    String latestRun
    
    String name
    
    String organization
    
    Integer weatherScore
    
    List<String> branchNames = new ArrayList<>()
    
    Integer numberOfFailingBranches
    
    Integer numberOfFailingPullRequests
    
    Integer numberOfSuccessfulBranches
    
    Integer numberOfSuccessfulPullRequests
    
    Integer totalNumberOfBranches
    
    Integer totalNumberOfPullRequests
    
    String propertyClass
}
