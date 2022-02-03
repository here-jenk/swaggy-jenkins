#
# Swaggy Jenkins
# Jenkins API clients generated from Swagger / Open API specification
# Version: 1.1.1
# Contact: blah@cliffano.com
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

No summary available.

.DESCRIPTION

No description available.

.PARAMETER Repositories
No description available.
.PARAMETER Self
No description available.
.PARAMETER Class
No description available.
.OUTPUTS

GithubOrganizationlinks<PSCustomObject>
#>

function Initialize-GithubOrganizationlinks {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Repositories},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Self},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Class}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => GithubOrganizationlinks' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "repositories" = ${Repositories}
            "self" = ${Self}
            "_class" = ${Class}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to GithubOrganizationlinks<PSCustomObject>

.DESCRIPTION

Convert from JSON to GithubOrganizationlinks<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

GithubOrganizationlinks<PSCustomObject>
#>
function ConvertFrom-JsonToGithubOrganizationlinks {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => GithubOrganizationlinks' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in GithubOrganizationlinks
        $AllProperties = ("repositories", "self", "_class")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "repositories"))) { #optional property not found
            $Repositories = $null
        } else {
            $Repositories = $JsonParameters.PSobject.Properties["repositories"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "self"))) { #optional property not found
            $Self = $null
        } else {
            $Self = $JsonParameters.PSobject.Properties["self"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "_class"))) { #optional property not found
            $Class = $null
        } else {
            $Class = $JsonParameters.PSobject.Properties["_class"].value
        }

        $PSO = [PSCustomObject]@{
            "repositories" = ${Repositories}
            "self" = ${Self}
            "_class" = ${Class}
        }

        return $PSO
    }

}

