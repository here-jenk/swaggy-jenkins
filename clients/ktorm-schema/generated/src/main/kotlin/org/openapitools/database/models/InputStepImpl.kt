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
 * @param id 
 * @param message 
 * @param ok 
 * @param parameters 
 * @param submitter 
 */
object InputStepImpls : BaseTable<InputStepImpl>("InputStepImpl") {
    val propertyClass = text("_class") /* null */
    val links = long("_links") /* null */
    val id = text("id") /* null */
    val message = text("message") /* null */
    val ok = text("ok") /* null */
    val submitter = text("submitter") /* null */

    /**
     * Create an entity of type InputStepImpl from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = InputStepImpl(
        propertyClass = row[propertyClass]  /* kotlin.String? */,
        links = InputStepImpllinkss.createEntity(row, withReferences) /* InputStepImpllinks? */,
        id = row[id]  /* kotlin.String? */,
        message = row[message]  /* kotlin.String? */,
        ok = row[ok]  /* kotlin.String? */,
        parameters = emptyList() /* kotlin.Array<StringParameterDefinition>? */,
        submitter = row[submitter]  /* kotlin.String? */
    )

    /**
    * Assign all the columns from the entity of type InputStepImpl to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = InputStepImpl()
    * database.update(InputStepImpls, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: InputStepImpl) {
        this.apply {
            set(InputStepImpls.propertyClass, entity.propertyClass)
            set(InputStepImpls.links, entity.links)
            set(InputStepImpls.id, entity.id)
            set(InputStepImpls.message, entity.message)
            set(InputStepImpls.ok, entity.ok)
            set(InputStepImpls.submitter, entity.submitter)
        }
    }

}


object InputStepImplStringParameterDefinition : BaseTable<Pair<kotlin.Long, kotlin.Long>>("InputStepImplStringParameterDefinition") {
    val inputStepImpl = long("inputStepImpl")
    val stringParameterDefinition = long("stringParameterDefinition")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[inputStepImpl] ?: 0, row[stringParameterDefinition] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(InputStepImplStringParameterDefinition.inputStepImpl, entity.first)
            set(InputStepImplStringParameterDefinition.stringParameterDefinition, entity.second)
        }
    }

}

