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

package io.swagger.client.api

import akka.{Done, NotUsed}
import com.lightbend.lagom.scaladsl.api.transport.Method
import com.lightbend.lagom.scaladsl.api.{Service, ServiceCall}
import play.api.libs.json._
import com.lightbend.lagom.scaladsl.api.deser.PathParamSerializer

import io.swagger.client.model.ComputerSet
import io.swagger.client.model.FreeStyleBuild
import io.swagger.client.model.FreeStyleProject
import io.swagger.client.model.Hudson
import io.swagger.client.model.ListView
import io.swagger.client.model.Queue

trait RemoteAccessApi extends Service {


  final override def descriptor = {
    import Service._
    named("RemoteAccessApi").withCalls(
      restCall(Method.GET, "/computer/api/json?depth", getComputer _), 
      restCall(Method.GET, "/api/json", getJenkins _), 
      restCall(Method.GET, "/job/:name/api/json", getJob _), 
      restCall(Method.GET, "/job/:name/config.xml", getJobConfig _), 
      restCall(Method.GET, "/job/:name/lastBuild/api/json", getJobLastBuild _), 
      restCall(Method.GET, "/job/:name/:number/logText/progressiveText?start", getJobProgressiveText _), 
      restCall(Method.GET, "/queue/api/json", getQueue _), 
      restCall(Method.GET, "/queue/item/:number/api/json", getQueueItem _), 
      restCall(Method.GET, "/view/:name/api/json", getView _), 
      restCall(Method.GET, "/view/:name/config.xml", getViewConfig _), 
      restCall(Method.HEAD, "/api/json", headJenkins _), 
      restCall(Method.POST, "/createItem?name&from&mode", postCreateItem _), 
      restCall(Method.POST, "/createView?name", postCreateView _), 
      restCall(Method.POST, "/job/:name/build?json&token", postJobBuild _), 
      restCall(Method.POST, "/job/:name/config.xml", postJobConfig _), 
      restCall(Method.POST, "/job/:name/doDelete", postJobDelete _), 
      restCall(Method.POST, "/job/:name/disable", postJobDisable _), 
      restCall(Method.POST, "/job/:name/enable", postJobEnable _), 
      restCall(Method.POST, "/job/:name/lastBuild/stop", postJobLastBuildStop _), 
      restCall(Method.POST, "/view/:name/config.xml", postViewConfig _)
    ).withAutoAcl(true)
  }

      
  /**
    * 
    * Retrieve computer details
    *  
    * @param depth Recursion depth in response model 
    * @return ComputerSet
    */
  def getComputer(depth:Int          ): ServiceCall[NotUsed ,ComputerSet]
  
  /**
    * 
    * Retrieve Jenkins details
    * 
    * @return Hudson
    */
  def getJenkins(): ServiceCall[NotUsed ,Hudson]
  
  /**
    * 
    * Retrieve job details
    *  
    * @param name Name of the job 
    * @return FreeStyleProject
    */
  def getJob(name: String): ServiceCall[NotUsed ,FreeStyleProject]
  
  /**
    * 
    * Retrieve job configuration
    *  
    * @param name Name of the job 
    * @return String
    */
  def getJobConfig(name: String): ServiceCall[NotUsed ,String]
  
  /**
    * 
    * Retrieve job&#39;s last build details
    *  
    * @param name Name of the job 
    * @return FreeStyleBuild
    */
  def getJobLastBuild(name: String): ServiceCall[NotUsed ,FreeStyleBuild]
        
  /**
    * 
    * Retrieve job&#39;s build progressive text output
    *  
    * @param name Name of the job  
    * @param number Build number  
    * @param start Starting point of progressive text output 
    * @return void
    */
  def getJobProgressiveText(start:String          name: String, number: String): ServiceCall[NotUsed ,Done]
  
  /**
    * 
    * Retrieve queue details
    * 
    * @return Queue
    */
  def getQueue(): ServiceCall[NotUsed ,Queue]
  
  /**
    * 
    * Retrieve queued item details
    *  
    * @param number Queue number 
    * @return Queue
    */
  def getQueueItem(number: String): ServiceCall[NotUsed ,Queue]
  
  /**
    * 
    * Retrieve view details
    *  
    * @param name Name of the view 
    * @return ListView
    */
  def getView(name: String): ServiceCall[NotUsed ,ListView]
  
  /**
    * 
    * Retrieve view configuration
    *  
    * @param name Name of the view 
    * @return String
    */
  def getViewConfig(name: String): ServiceCall[NotUsed ,String]
  
  /**
    * 
    * Retrieve Jenkins headers
    * 
    * @return void
    */
  def headJenkins(): ServiceCall[NotUsed ,Done]
        



  // jenkinsCrumb:String  -- not yet supported header params
  // `contentType`:String  -- not yet supported header params

  /**
    * 
    * Create a new job using job configuration, or copied from an existing job
    *  
    * @param name Name of the new job  
    * @param from Existing job to copy from (optional) 
    * @param mode Set to &#39;copy&#39; for copying an existing job (optional) 
    * @param jenkinsCrumb CSRF protection token (optional) 
    * @param `contentType` Content type header application/xml (optional) 
    * @return void Body Parameter  Job configuration in config.xml format 
    */
  def postCreateItem(name:String          ,from:           Option[String] = None,mode:           Option[String] = None): ServiceCall[String ,Done]
        

  // jenkinsCrumb:String  -- not yet supported header params
  // `contentType`:String  -- not yet supported header params

  /**
    * 
    * Create a new view using view configuration
    *  
    * @param name Name of the new view  
    * @param jenkinsCrumb CSRF protection token (optional) 
    * @param `contentType` Content type header application/xml (optional) 
    * @return void Body Parameter  View configuration in config.xml format 
    */
  def postCreateView(name:String          ): ServiceCall[String ,Done]
        



  // jenkinsCrumb:String  -- not yet supported header params
  /**
    * 
    * Build a job
    *  
    * @param name Name of the job  
    * @param json   
    * @param token  (optional) 
    * @param jenkinsCrumb CSRF protection token (optional)
    * @return void
    */
  def postJobBuild(json:String          ,token:           Option[String] = Nonename: String): ServiceCall[NotUsed ,Done]
  


  // jenkinsCrumb:String  -- not yet supported header params
  /**
    * 
    * Update job configuration
    *  
    * @param name Name of the job   
    * @param jenkinsCrumb CSRF protection token (optional)
    * @return void Body Parameter  Job configuration in config.xml format 
    */
  def postJobConfig(name: String): ServiceCall[String ,Done]
  

  // jenkinsCrumb:String  -- not yet supported header params
  /**
    * 
    * Delete a job
    *  
    * @param name Name of the job  
    * @param jenkinsCrumb CSRF protection token (optional)
    * @return void
    */
  def postJobDelete(name: String): ServiceCall[NotUsed ,Done]
  

  // jenkinsCrumb:String  -- not yet supported header params
  /**
    * 
    * Disable a job
    *  
    * @param name Name of the job  
    * @param jenkinsCrumb CSRF protection token (optional)
    * @return void
    */
  def postJobDisable(name: String): ServiceCall[NotUsed ,Done]
  

  // jenkinsCrumb:String  -- not yet supported header params
  /**
    * 
    * Enable a job
    *  
    * @param name Name of the job  
    * @param jenkinsCrumb CSRF protection token (optional)
    * @return void
    */
  def postJobEnable(name: String): ServiceCall[NotUsed ,Done]
  

  // jenkinsCrumb:String  -- not yet supported header params
  /**
    * 
    * Stop a job
    *  
    * @param name Name of the job  
    * @param jenkinsCrumb CSRF protection token (optional)
    * @return void
    */
  def postJobLastBuildStop(name: String): ServiceCall[NotUsed ,Done]
  


  // jenkinsCrumb:String  -- not yet supported header params
  /**
    * 
    * Update view configuration
    *  
    * @param name Name of the view   
    * @param jenkinsCrumb CSRF protection token (optional)
    * @return void Body Parameter  View configuration in config.xml format 
    */
  def postViewConfig(name: String): ServiceCall[String ,Done]
  

  }
