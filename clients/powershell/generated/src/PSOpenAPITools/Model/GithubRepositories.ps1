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

.PARAMETER Class
No description available.
.PARAMETER Links
No description available.
.PARAMETER Items
No description available.
.PARAMETER LastPage
No description available.
.PARAMETER NextPage
No description available.
.PARAMETER PageSize
No description available.
.OUTPUTS

GithubRepositories<PSCustomObject>
#>

function Initialize-GithubRepositories {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Class},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Links},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Items},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${LastPage},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${NextPage},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${PageSize}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => GithubRepositories' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "_class" = ${Class}
            "_links" = ${Links}
            "items" = ${Items}
            "lastPage" = ${LastPage}
            "nextPage" = ${NextPage}
            "pageSize" = ${PageSize}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to GithubRepositories<PSCustomObject>

.DESCRIPTION

Convert from JSON to GithubRepositories<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

GithubRepositories<PSCustomObject>
#>
function ConvertFrom-JsonToGithubRepositories {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => GithubRepositories' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in GithubRepositories
        $AllProperties = ("_class", "_links", "items", "lastPage", "nextPage", "pageSize")
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

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "items"))) { #optional property not found
            $Items = $null
        } else {
            $Items = $JsonParameters.PSobject.Properties["items"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "lastPage"))) { #optional property not found
            $LastPage = $null
        } else {
            $LastPage = $JsonParameters.PSobject.Properties["lastPage"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "nextPage"))) { #optional property not found
            $NextPage = $null
        } else {
            $NextPage = $JsonParameters.PSobject.Properties["nextPage"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "pageSize"))) { #optional property not found
            $PageSize = $null
        } else {
            $PageSize = $JsonParameters.PSobject.Properties["pageSize"].value
        }

        $PSO = [PSCustomObject]@{
            "_class" = ${Class}
            "_links" = ${Links}
            "items" = ${Items}
            "lastPage" = ${LastPage}
            "nextPage" = ${NextPage}
            "pageSize" = ${PageSize}
        }

        return $PSO
    }

}

