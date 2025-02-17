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

.PARAMETER HudsonNodeMonitorsSwapSpaceMonitor
No description available.
.PARAMETER HudsonNodeMonitorsTemporarySpaceMonitor
No description available.
.PARAMETER HudsonNodeMonitorsDiskSpaceMonitor
No description available.
.PARAMETER HudsonNodeMonitorsArchitectureMonitor
No description available.
.PARAMETER HudsonNodeMonitorsResponseTimeMonitor
No description available.
.PARAMETER HudsonNodeMonitorsClockMonitor
No description available.
.PARAMETER Class
No description available.
.OUTPUTS

HudsonMasterComputermonitorData<PSCustomObject>
#>

function Initialize-HudsonMasterComputermonitorData {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${HudsonNodeMonitorsSwapSpaceMonitor},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${HudsonNodeMonitorsTemporarySpaceMonitor},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${HudsonNodeMonitorsDiskSpaceMonitor},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${HudsonNodeMonitorsArchitectureMonitor},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${HudsonNodeMonitorsResponseTimeMonitor},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${HudsonNodeMonitorsClockMonitor},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Class}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => HudsonMasterComputermonitorData' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "hudson.node_monitors.SwapSpaceMonitor" = ${HudsonNodeMonitorsSwapSpaceMonitor}
            "hudson.node_monitors.TemporarySpaceMonitor" = ${HudsonNodeMonitorsTemporarySpaceMonitor}
            "hudson.node_monitors.DiskSpaceMonitor" = ${HudsonNodeMonitorsDiskSpaceMonitor}
            "hudson.node_monitors.ArchitectureMonitor" = ${HudsonNodeMonitorsArchitectureMonitor}
            "hudson.node_monitors.ResponseTimeMonitor" = ${HudsonNodeMonitorsResponseTimeMonitor}
            "hudson.node_monitors.ClockMonitor" = ${HudsonNodeMonitorsClockMonitor}
            "_class" = ${Class}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to HudsonMasterComputermonitorData<PSCustomObject>

.DESCRIPTION

Convert from JSON to HudsonMasterComputermonitorData<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

HudsonMasterComputermonitorData<PSCustomObject>
#>
function ConvertFrom-JsonToHudsonMasterComputermonitorData {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => HudsonMasterComputermonitorData' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in HudsonMasterComputermonitorData
        $AllProperties = ("hudson.node_monitors.SwapSpaceMonitor", "hudson.node_monitors.TemporarySpaceMonitor", "hudson.node_monitors.DiskSpaceMonitor", "hudson.node_monitors.ArchitectureMonitor", "hudson.node_monitors.ResponseTimeMonitor", "hudson.node_monitors.ClockMonitor", "_class")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "hudson.node_monitors.SwapSpaceMonitor"))) { #optional property not found
            $HudsonNodeMonitorsSwapSpaceMonitor = $null
        } else {
            $HudsonNodeMonitorsSwapSpaceMonitor = $JsonParameters.PSobject.Properties["hudson.node_monitors.SwapSpaceMonitor"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "hudson.node_monitors.TemporarySpaceMonitor"))) { #optional property not found
            $HudsonNodeMonitorsTemporarySpaceMonitor = $null
        } else {
            $HudsonNodeMonitorsTemporarySpaceMonitor = $JsonParameters.PSobject.Properties["hudson.node_monitors.TemporarySpaceMonitor"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "hudson.node_monitors.DiskSpaceMonitor"))) { #optional property not found
            $HudsonNodeMonitorsDiskSpaceMonitor = $null
        } else {
            $HudsonNodeMonitorsDiskSpaceMonitor = $JsonParameters.PSobject.Properties["hudson.node_monitors.DiskSpaceMonitor"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "hudson.node_monitors.ArchitectureMonitor"))) { #optional property not found
            $HudsonNodeMonitorsArchitectureMonitor = $null
        } else {
            $HudsonNodeMonitorsArchitectureMonitor = $JsonParameters.PSobject.Properties["hudson.node_monitors.ArchitectureMonitor"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "hudson.node_monitors.ResponseTimeMonitor"))) { #optional property not found
            $HudsonNodeMonitorsResponseTimeMonitor = $null
        } else {
            $HudsonNodeMonitorsResponseTimeMonitor = $JsonParameters.PSobject.Properties["hudson.node_monitors.ResponseTimeMonitor"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "hudson.node_monitors.ClockMonitor"))) { #optional property not found
            $HudsonNodeMonitorsClockMonitor = $null
        } else {
            $HudsonNodeMonitorsClockMonitor = $JsonParameters.PSobject.Properties["hudson.node_monitors.ClockMonitor"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "_class"))) { #optional property not found
            $Class = $null
        } else {
            $Class = $JsonParameters.PSobject.Properties["_class"].value
        }

        $PSO = [PSCustomObject]@{
            "hudson.node_monitors.SwapSpaceMonitor" = ${HudsonNodeMonitorsSwapSpaceMonitor}
            "hudson.node_monitors.TemporarySpaceMonitor" = ${HudsonNodeMonitorsTemporarySpaceMonitor}
            "hudson.node_monitors.DiskSpaceMonitor" = ${HudsonNodeMonitorsDiskSpaceMonitor}
            "hudson.node_monitors.ArchitectureMonitor" = ${HudsonNodeMonitorsArchitectureMonitor}
            "hudson.node_monitors.ResponseTimeMonitor" = ${HudsonNodeMonitorsResponseTimeMonitor}
            "hudson.node_monitors.ClockMonitor" = ${HudsonNodeMonitorsClockMonitor}
            "_class" = ${Class}
        }

        return $PSO
    }

}

