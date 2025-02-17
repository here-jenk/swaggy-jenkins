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
 * @param content 
 * @param propertyClass 
 */
object GithubFiles : BaseTable<GithubFile>("GithubFile") {
    val content = long("content") /* null */
    val propertyClass = text("_class") /* null */

    /**
     * Create an entity of type GithubFile from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = GithubFile(
        content = GithubContents.createEntity(row, withReferences) /* GithubContent? */,
        propertyClass = row[propertyClass]  /* kotlin.String? */
    )

    /**
    * Assign all the columns from the entity of type GithubFile to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = GithubFile()
    * database.update(GithubFiles, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: GithubFile) {
        this.apply {
            set(GithubFiles.content, entity.content)
            set(GithubFiles.propertyClass, entity.propertyClass)
        }
    }

}


