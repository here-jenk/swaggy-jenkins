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
.PARAMETER Diff
No description available.
.OUTPUTS

ClockDifference<PSCustomObject>
#>

function Initialize-ClockDifference {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Class},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${Diff}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => ClockDifference' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "_class" = ${Class}
            "diff" = ${Diff}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to ClockDifference<PSCustomObject>

.DESCRIPTION

Convert from JSON to ClockDifference<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

ClockDifference<PSCustomObject>
#>
function ConvertFrom-JsonToClockDifference {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => ClockDifference' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in ClockDifference
        $AllProperties = ("_class", "diff")
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "diff"))) { #optional property not found
            $Diff = $null
        } else {
            $Diff = $JsonParameters.PSobject.Properties["diff"].value
        }

        $PSO = [PSCustomObject]@{
            "_class" = ${Class}
            "diff" = ${Diff}
        }

        return $PSO
    }

}

