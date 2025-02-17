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
 * @param name 
 * @param propertySize 
 * @param url 
 * @param propertyClass 
 */
object PipelinelatestRunartifactss : BaseTable<PipelinelatestRunartifacts>("PipelinelatestRunartifacts") {
    val name = text("name") /* null */
    val propertySize = int("size") /* null */
    val url = text("url") /* null */
    val propertyClass = text("_class") /* null */

    /**
     * Create an entity of type PipelinelatestRunartifacts from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = PipelinelatestRunartifacts(
        name = row[name]  /* kotlin.String? */,
        propertySize = row[propertySize]  /* kotlin.Int? */,
        url = row[url]  /* kotlin.String? */,
        propertyClass = row[propertyClass]  /* kotlin.String? */
    )

    /**
    * Assign all the columns from the entity of type PipelinelatestRunartifacts to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = PipelinelatestRunartifacts()
    * database.update(PipelinelatestRunartifactss, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: PipelinelatestRunartifacts) {
        this.apply {
            set(PipelinelatestRunartifactss.name, entity.name)
            set(PipelinelatestRunartifactss.propertySize, entity.propertySize)
            set(PipelinelatestRunartifactss.url, entity.url)
            set(PipelinelatestRunartifactss.propertyClass, entity.propertyClass)
        }
    }

}


