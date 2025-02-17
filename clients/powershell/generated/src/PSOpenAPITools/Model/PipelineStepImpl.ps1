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
.PARAMETER Links
No description available.
.PARAMETER DisplayName
No description available.
.PARAMETER DurationInMillis
No description available.
.PARAMETER Id
No description available.
.PARAMETER VarInput
No description available.
.PARAMETER Result
No description available.
.PARAMETER StartTime
No description available.
.PARAMETER State
No description available.
.OUTPUTS

PipelineStepImpl<PSCustomObject>
#>

function Initialize-PipelineStepImpl {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Class},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Links},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${DisplayName},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${DurationInMillis},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Id},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${VarInput},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Result},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${StartTime},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${State}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => PipelineStepImpl' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "_class" = ${Class}
            "_links" = ${Links}
            "displayName" = ${DisplayName}
            "durationInMillis" = ${DurationInMillis}
            "id" = ${Id}
            "input" = ${VarInput}
            "result" = ${Result}
            "startTime" = ${StartTime}
            "state" = ${State}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to PipelineStepImpl<PSCustomObject>

.DESCRIPTION

Convert from JSON to PipelineStepImpl<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

PipelineStepImpl<PSCustomObject>
#>
function ConvertFrom-JsonToPipelineStepImpl {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => PipelineStepImpl' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in PipelineStepImpl
        $AllProperties = ("_class", "_links", "displayName", "durationInMillis", "id", "input", "result", "startTime", "state")
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "_links"))) { #optional property not found
            $Links = $null
        } else {
            $Links = $JsonParameters.PSobject.Properties["_links"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "displayName"))) { #optional property not found
            $DisplayName = $null
        } else {
            $DisplayName = $JsonParameters.PSobject.Properties["displayName"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "durationInMillis"))) { #optional property not found
            $DurationInMillis = $null
        } else {
            $DurationInMillis = $JsonParameters.PSobject.Properties["durationInMillis"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "id"))) { #optional property not found
            $Id = $null
        } else {
            $Id = $JsonParameters.PSobject.Properties["id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "input"))) { #optional property not found
            $VarInput = $null
        } else {
            $VarInput = $JsonParameters.PSobject.Properties["input"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "result"))) { #optional property not found
            $Result = $null
        } else {
            $Result = $JsonParameters.PSobject.Properties["result"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "startTime"))) { #optional property not found
            $StartTime = $null
        } else {
            $StartTime = $JsonParameters.PSobject.Properties["startTime"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "state"))) { #optional property not found
            $State = $null
        } else {
            $State = $JsonParameters.PSobject.Properties["state"].value
        }

        $PSO = [PSCustomObject]@{
            "_class" = ${Class}
            "_links" = ${Links}
            "displayName" = ${DisplayName}
            "durationInMillis" = ${DurationInMillis}
            "id" = ${Id}
            "input" = ${VarInput}
            "result" = ${Result}
            "startTime" = ${StartTime}
            "state" = ${State}
        }

        return $PSO
    }

}

