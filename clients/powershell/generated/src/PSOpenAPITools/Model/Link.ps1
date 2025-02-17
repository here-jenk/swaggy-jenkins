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
.PARAMETER Href
No description available.
.OUTPUTS

Link<PSCustomObject>
#>

function Initialize-Link {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Class},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Href}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => Link' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "_class" = ${Class}
            "href" = ${Href}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to Link<PSCustomObject>

.DESCRIPTION

Convert from JSON to Link<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

Link<PSCustomObject>
#>
function ConvertFrom-JsonToLink {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => Link' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in Link
        $AllProperties = ("_class", "href")
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "href"))) { #optional property not found
            $Href = $null
        } else {
            $Href = $JsonParameters.PSobject.Properties["href"].value
        }

        $PSO = [PSCustomObject]@{
            "_class" = ${Class}
            "href" = ${Href}
        }

        return $PSO
    }

}

