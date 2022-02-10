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
 * @param self 
 * @param actions 
 * @param runs 
 * @param queue 
 * @param propertyClass 
 */
object BranchImpllinkss : BaseTable<BranchImpllinks>("BranchImpllinks") {
    val self = long("self") /* null */
    val actions = long("actions") /* null */
    val runs = long("runs") /* null */
    val queue = long("queue") /* null */
    val propertyClass = text("_class") /* null */

    /**
     * Create an entity of type BranchImpllinks from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = BranchImpllinks(
        self = Links.createEntity(row, withReferences) /* Link? */,
        actions = Links.createEntity(row, withReferences) /* Link? */,
        runs = Links.createEntity(row, withReferences) /* Link? */,
        queue = Links.createEntity(row, withReferences) /* Link? */,
        propertyClass = row[propertyClass]  /* kotlin.String? */
    )

    /**
    * Assign all the columns from the entity of type BranchImpllinks to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = BranchImpllinks()
    * database.update(BranchImpllinkss, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: BranchImpllinks) {
        this.apply {
            set(BranchImpllinkss.self, entity.self)
            set(BranchImpllinkss.actions, entity.actions)
            set(BranchImpllinkss.runs, entity.runs)
            set(BranchImpllinkss.queue, entity.queue)
            set(BranchImpllinkss.propertyClass, entity.propertyClass)
        }
    }

}


