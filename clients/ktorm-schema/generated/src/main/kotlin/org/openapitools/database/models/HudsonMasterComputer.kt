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
package org.openapitools.database.models

import org.ktorm.dsl.*
import org.ktorm.schema.*
import org.ktorm.database.Database
import .*


/**
 * 
 * @param propertyClass 
 * @param displayName 
 * @param executors 
 * @param icon 
 * @param iconClassName 
 * @param idle 
 * @param jnlpAgent 
 * @param launchSupported 
 * @param loadStatistics 
 * @param manualLaunchAllowed 
 * @param monitorData 
 * @param numExecutors 
 * @param offline 
 * @param offlineCause 
 * @param offlineCauseReason 
 * @param temporarilyOffline 
 */
object HudsonMasterComputers : BaseTable<HudsonMasterComputer>("HudsonMasterComputer") {
    val propertyClass = text("_class") /* null */
    val displayName = text("displayName") /* null */
    val icon = text("icon") /* null */
    val iconClassName = text("iconClassName") /* null */
    val idle = boolean("idle") /* null */
    val jnlpAgent = boolean("jnlpAgent") /* null */
    val launchSupported = boolean("launchSupported") /* null */
    val loadStatistics = long("loadStatistics") /* null */
    val manualLaunchAllowed = boolean("manualLaunchAllowed") /* null */
    val monitorData = long("monitorData") /* null */
    val numExecutors = int("numExecutors") /* null */
    val offline = boolean("offline") /* null */
    val offlineCause = text("offlineCause") /* null */
    val offlineCauseReason = text("offlineCauseReason") /* null */
    val temporarilyOffline = boolean("temporarilyOffline") /* null */

    /**
     * Create an entity of type HudsonMasterComputer from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = HudsonMasterComputer(
        propertyClass = row[propertyClass]  /* kotlin.String? */,
        displayName = row[displayName]  /* kotlin.String? */,
        executors = emptyList() /* kotlin.Array<HudsonMasterComputerexecutors>? */,
        icon = row[icon]  /* kotlin.String? */,
        iconClassName = row[iconClassName]  /* kotlin.String? */,
        idle = row[idle]  /* kotlin.Boolean? */,
        jnlpAgent = row[jnlpAgent]  /* kotlin.Boolean? */,
        launchSupported = row[launchSupported]  /* kotlin.Boolean? */,
        loadStatistics = Label1s.createEntity(row, withReferences) /* Label1? */,
        manualLaunchAllowed = row[manualLaunchAllowed]  /* kotlin.Boolean? */,
        monitorData = HudsonMasterComputermonitorDatas.createEntity(row, withReferences) /* HudsonMasterComputermonitorData? */,
        numExecutors = row[numExecutors]  /* kotlin.Int? */,
        offline = row[offline]  /* kotlin.Boolean? */,
        offlineCause = row[offlineCause]  /* kotlin.String? */,
        offlineCauseReason = row[offlineCauseReason]  /* kotlin.String? */,
        temporarilyOffline = row[temporarilyOffline]  /* kotlin.Boolean? */
    )

    /**
    * Assign all the columns from the entity of type HudsonMasterComputer to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = HudsonMasterComputer()
    * database.update(HudsonMasterComputers, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: HudsonMasterComputer) {
        this.apply {
            set(HudsonMasterComputers.propertyClass, entity.propertyClass)
            set(HudsonMasterComputers.displayName, entity.displayName)
            set(HudsonMasterComputers.icon, entity.icon)
            set(HudsonMasterComputers.iconClassName, entity.iconClassName)
            set(HudsonMasterComputers.idle, entity.idle)
            set(HudsonMasterComputers.jnlpAgent, entity.jnlpAgent)
            set(HudsonMasterComputers.launchSupported, entity.launchSupported)
            set(HudsonMasterComputers.loadStatistics, entity.loadStatistics)
            set(HudsonMasterComputers.manualLaunchAllowed, entity.manualLaunchAllowed)
            set(HudsonMasterComputers.monitorData, entity.monitorData)
            set(HudsonMasterComputers.numExecutors, entity.numExecutors)
            set(HudsonMasterComputers.offline, entity.offline)
            set(HudsonMasterComputers.offlineCause, entity.offlineCause)
            set(HudsonMasterComputers.offlineCauseReason, entity.offlineCauseReason)
            set(HudsonMasterComputers.temporarilyOffline, entity.temporarilyOffline)
        }
    }

}


object HudsonMasterComputerHudsonMasterComputerexecutors : BaseTable<Pair<kotlin.Long, kotlin.Long>>("HudsonMasterComputerHudsonMasterComputerexecutors") {
    val hudsonMasterComputer = long("hudsonMasterComputer")
    val hudsonMasterComputerexecutors = long("hudsonMasterComputerexecutors")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[hudsonMasterComputer] ?: 0, row[hudsonMasterComputerexecutors] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(HudsonMasterComputerHudsonMasterComputerexecutors.hudsonMasterComputer, entity.first)
            set(HudsonMasterComputerHudsonMasterComputerexecutors.hudsonMasterComputerexecutors, entity.second)
        }
    }

}

