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
 * @param crumb 
 * @param crumbRequestField 
 */
object DefaultCrumbIssuers : BaseTable<DefaultCrumbIssuer>("DefaultCrumbIssuer") {
    val propertyClass = text("_class") /* null */
    val crumb = text("crumb") /* null */
    val crumbRequestField = text("crumbRequestField") /* null */

    /**
     * Create an entity of type DefaultCrumbIssuer from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = DefaultCrumbIssuer(
        propertyClass = row[propertyClass]  /* kotlin.String? */,
        crumb = row[crumb]  /* kotlin.String? */,
        crumbRequestField = row[crumbRequestField]  /* kotlin.String? */
    )

    /**
    * Assign all the columns from the entity of type DefaultCrumbIssuer to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = DefaultCrumbIssuer()
    * database.update(DefaultCrumbIssuers, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: DefaultCrumbIssuer) {
        this.apply {
            set(DefaultCrumbIssuers.propertyClass, entity.propertyClass)
            set(DefaultCrumbIssuers.crumb, entity.crumb)
            set(DefaultCrumbIssuers.crumbRequestField, entity.crumbRequestField)
        }
    }

}


