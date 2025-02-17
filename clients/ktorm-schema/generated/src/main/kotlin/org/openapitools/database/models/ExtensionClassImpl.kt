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
 * @param links 
 * @param classes 
 */
object ExtensionClassImpls : BaseTable<ExtensionClassImpl>("ExtensionClassImpl") {
    val propertyClass = text("_class") /* null */
    val links = long("_links") /* null */

    /**
     * Create an entity of type ExtensionClassImpl from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = ExtensionClassImpl(
        propertyClass = row[propertyClass]  /* kotlin.String? */,
        links = ExtensionClassImpllinkss.createEntity(row, withReferences) /* ExtensionClassImpllinks? */,
        classes = emptyList() /* kotlin.Array<kotlin.String>? */
    )

    /**
    * Assign all the columns from the entity of type ExtensionClassImpl to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = ExtensionClassImpl()
    * database.update(ExtensionClassImpls, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: ExtensionClassImpl) {
        this.apply {
            set(ExtensionClassImpls.propertyClass, entity.propertyClass)
            set(ExtensionClassImpls.links, entity.links)
        }
    }

}


object ExtensionClassImplClasses : BaseTable<Pair<kotlin.Long, kotlin.String>>("ExtensionClassImplClasses") {
    val extensionClassImpl = long("extensionClassImpl")
    val classes = text("classes")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.String> =
        Pair(row[extensionClassImpl] ?: 0, row[classes] ?: "")

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.String>) {
        this.apply {
            set(ExtensionClassImplClasses.extensionClassImpl, entity.first)
            set(ExtensionClassImplClasses.classes, entity.second)
        }
    }

}

