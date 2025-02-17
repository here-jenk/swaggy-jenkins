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
.PARAMETER BusyExecutors
No description available.
.PARAMETER Computer
No description available.
.PARAMETER DisplayName
No description available.
.PARAMETER TotalExecutors
No description available.
.OUTPUTS

ComputerSet<PSCustomObject>
#>

function Initialize-ComputerSet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Class},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${BusyExecutors},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Computer},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${DisplayName},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${TotalExecutors}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => ComputerSet' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "_class" = ${Class}
            "busyExecutors" = ${BusyExecutors}
            "computer" = ${Computer}
            "displayName" = ${DisplayName}
            "totalExecutors" = ${TotalExecutors}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to ComputerSet<PSCustomObject>

.DESCRIPTION

Convert from JSON to ComputerSet<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

ComputerSet<PSCustomObject>
#>
function ConvertFrom-JsonToComputerSet {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => ComputerSet' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in ComputerSet
        $AllProperties = ("_class", "busyExecutors", "computer", "displayName", "totalExecutors")
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "busyExecutors"))) { #optional property not found
            $BusyExecutors = $null
        } else {
            $BusyExecutors = $JsonParameters.PSobject.Properties["busyExecutors"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "computer"))) { #optional property not found
            $Computer = $null
        } else {
            $Computer = $JsonParameters.PSobject.Properties["computer"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "displayName"))) { #optional property not found
            $DisplayName = $null
        } else {
            $DisplayName = $JsonParameters.PSobject.Properties["displayName"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "totalExecutors"))) { #optional property not found
            $TotalExecutors = $null
        } else {
            $TotalExecutors = $JsonParameters.PSobject.Properties["totalExecutors"].value
        }

        $PSO = [PSCustomObject]@{
            "_class" = ${Class}
            "busyExecutors" = ${BusyExecutors}
            "computer" = ${Computer}
            "displayName" = ${DisplayName}
            "totalExecutors" = ${TotalExecutors}
        }

        return $PSO
    }

}

