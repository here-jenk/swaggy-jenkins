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
 * @param id 
 * @param fullName 
 * @param email 
 * @param name 
 */
object Users : BaseTable<User>("User") {
    val propertyClass = text("_class") /* null */
    val id = text("id") /* null */
    val fullName = text("fullName") /* null */
    val email = text("email") /* null */
    val name = text("name") /* null */

    /**
     * Create an entity of type User from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = User(
        propertyClass = row[propertyClass]  /* kotlin.String? */,
        id = row[id]  /* kotlin.String? */,
        fullName = row[fullName]  /* kotlin.String? */,
        email = row[email]  /* kotlin.String? */,
        name = row[name]  /* kotlin.String? */
    )

    /**
    * Assign all the columns from the entity of type User to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = User()
    * database.update(Users, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: User) {
        this.apply {
            set(Users.propertyClass, entity.propertyClass)
            set(Users.id, entity.id)
            set(Users.fullName, entity.fullName)
            set(Users.email, entity.email)
            set(Users.name, entity.name)
        }
    }

}


