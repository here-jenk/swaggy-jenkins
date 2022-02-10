/**
* Swaggy Jenkins
* Jenkins API clients generated from Swagger / Open API specification
*
* The version of the OpenAPI document: 1.1.2-pre.0
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
 */
object HudsonassignedLabelss : BaseTable<HudsonassignedLabels>("HudsonassignedLabels") {
    val propertyClass = text("_class") /* null */

    /**
     * Create an entity of type HudsonassignedLabels from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = HudsonassignedLabels(
        propertyClass = row[propertyClass]  /* kotlin.String? */
    )

    /**
    * Assign all the columns from the entity of type HudsonassignedLabels to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = HudsonassignedLabels()
    * database.update(HudsonassignedLabelss, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: HudsonassignedLabels) {
        this.apply {
            set(HudsonassignedLabelss.propertyClass, entity.propertyClass)
        }
    }

}


