#
# Swaggy Jenkins
# Jenkins API clients generated from Swagger / Open API specification
# Version: 1.5.1-pre.0
# Contact: blah@cliffano.com
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

No summary available.

.DESCRIPTION

No description available.

.PARAMETER Class
No description available.
.PARAMETER DisplayName
No description available.
.PARAMETER EstimatedDurationInMillis
No description available.
.PARAMETER FullDisplayName
No description available.
.PARAMETER FullName
No description available.
.PARAMETER Name
No description available.
.PARAMETER Organization
No description available.
.PARAMETER Parameters
No description available.
.PARAMETER Permissions
No description available.
.PARAMETER WeatherScore
No description available.
.PARAMETER PullRequest
No description available.
.PARAMETER Links
No description available.
.PARAMETER LatestRun
No description available.
.OUTPUTS

BranchImpl<PSCustomObject>
#>

function Initialize-BranchImpl {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Class},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${DisplayName},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${EstimatedDurationInMillis},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${FullDisplayName},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${FullName},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Name},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Organization},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Parameters},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Permissions},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${WeatherScore},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${PullRequest},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Links},
        [Parameter(Position = 12, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${LatestRun}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => BranchImpl' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "_class" = ${Class}
            "displayName" = ${DisplayName}
            "estimatedDurationInMillis" = ${EstimatedDurationInMillis}
            "fullDisplayName" = ${FullDisplayName}
            "fullName" = ${FullName}
            "name" = ${Name}
            "organization" = ${Organization}
            "parameters" = ${Parameters}
            "permissions" = ${Permissions}
            "weatherScore" = ${WeatherScore}
            "pullRequest" = ${PullRequest}
            "_links" = ${Links}
            "latestRun" = ${LatestRun}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to BranchImpl<PSCustomObject>

.DESCRIPTION

Convert from JSON to BranchImpl<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

BranchImpl<PSCustomObject>
#>
function ConvertFrom-JsonToBranchImpl {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => BranchImpl' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in BranchImpl
        $AllProperties = ("_class", "displayName", "estimatedDurationInMillis", "fullDisplayName", "fullName", "name", "organization", "parameters", "permissions", "weatherScore", "pullRequest", "_links", "latestRun")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "_class"))) { #optional property not found
            $Class = $null
        } else {
            $Class = $JsonParameters.PSobject.Properties["_class"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "displayName"))) { #optional property not found
            $DisplayName = $null
        } else {
            $DisplayName = $JsonParameters.PSobject.Properties["displayName"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "estimatedDurationInMillis"))) { #optional property not found
            $EstimatedDurationInMillis = $null
        } else {
            $EstimatedDurationInMillis = $JsonParameters.PSobject.Properties["estimatedDurationInMillis"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "fullDisplayName"))) { #optional property not found
            $FullDisplayName = $null
        } else {
            $FullDisplayName = $JsonParameters.PSobject.Properties["fullDisplayName"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "fullName"))) { #optional property not found
            $FullName = $null
        } else {
            $FullName = $JsonParameters.PSobject.Properties["fullName"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "name"))) { #optional property not found
            $Name = $null
        } else {
            $Name = $JsonParameters.PSobject.Properties["name"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "organization"))) { #optional property not found
            $Organization = $null
        } else {
            $Organization = $JsonParameters.PSobject.Properties["organization"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "parameters"))) { #optional property not found
            $Parameters = $null
        } else {
            $Parameters = $JsonParameters.PSobject.Properties["parameters"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "permissions"))) { #optional property not found
            $Permissions = $null
        } else {
            $Permissions = $JsonParameters.PSobject.Properties["permissions"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "weatherScore"))) { #optional property not found
            $WeatherScore = $null
        } else {
            $WeatherScore = $JsonParameters.PSobject.Properties["weatherScore"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "pullRequest"))) { #optional property not found
            $PullRequest = $null
        } else {
            $PullRequest = $JsonParameters.PSobject.Properties["pullRequest"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "_links"))) { #optional property not found
            $Links = $null
        } else {
            $Links = $JsonParameters.PSobject.Properties["_links"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "latestRun"))) { #optional property not found
            $LatestRun = $null
        } else {
            $LatestRun = $JsonParameters.PSobject.Properties["latestRun"].value
        }

        $PSO = [PSCustomObject]@{
            "_class" = ${Class}
            "displayName" = ${DisplayName}
            "estimatedDurationInMillis" = ${EstimatedDurationInMillis}
            "fullDisplayName" = ${FullDisplayName}
            "fullName" = ${FullName}
            "name" = ${Name}
            "organization" = ${Organization}
            "parameters" = ${Parameters}
            "permissions" = ${Permissions}
            "weatherScore" = ${WeatherScore}
            "pullRequest" = ${PullRequest}
            "_links" = ${Links}
            "latestRun" = ${LatestRun}
        }

        return $PSO
    }

}

