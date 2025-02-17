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
 * @param self 
 * @param propertyClass 
 */
object FavoriteImpllinkss : BaseTable<FavoriteImpllinks>("FavoriteImpllinks") {
    val self = long("self") /* null */
    val propertyClass = text("_class") /* null */

    /**
     * Create an entity of type FavoriteImpllinks from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = FavoriteImpllinks(
        self = Links.createEntity(row, withReferences) /* Link? */,
        propertyClass = row[propertyClass]  /* kotlin.String? */
    )

    /**
    * Assign all the columns from the entity of type FavoriteImpllinks to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = FavoriteImpllinks()
    * database.update(FavoriteImpllinkss, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: FavoriteImpllinks) {
        this.apply {
            set(FavoriteImpllinkss.self, entity.self)
            set(FavoriteImpllinkss.propertyClass, entity.propertyClass)
        }
    }

}


