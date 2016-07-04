package io.swagger.client.api

import io.swagger.client.model.Number
import io.swagger.client.model.InlineResponse200
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class DefaultApi(val defBasePath: String = "https://api.pbxdom.com",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * 
   * Gets &#x60;Calls&#x60; info. 
   * @param rptType Report type. (0 report, 1 widget, 2 chart). 
   * @param rptId Report id. 
   * @param start Start offset. (optional)
   * @param limit Number of results to return. Max 10K. (optional)
   * @param sortBy Sort column. (optional)
   * @param sortType Sort mode asc/desc. (optional)
   * @param fromDate Start date time. (optional)
   * @param toDate End date time. (optional)
   * @param duration Duration range. (optional)
   * @param phone List of caller phone. (optional)
   * @param phone1 List of dialled phones. (optional)
   * @param co List of trunk/co. (optional)
   * @param ext list of extensions. (optional)
   * @param pbxId list of PBX Ids. (optional)
   * @param callSource list of callsource. (optional)
   * @param callType list of call type signatures.(5 Unanswered Calls, 7 Transfered Calls, 8 Forwarded Calls) (optional)
   * @param direction list of direction.(0 incoming, 1 outgoing, 2 internal) (optional)
   * @param callerName list of caller name. (optional)
   * @param did list of did. (optional)
   * @param dnis list of dnis. (optional)
   * @param acc list of account code. (optional)
   * @param ring Ring range.Seconds unit. (optional)
   * @param cost Cost range. (optional)
   * @param group Department/Group id. (optional)
   * @return List[InlineResponse200]
   */
  def callsGet (rptType: Double, rptId: Double, start: Number, limit: Number, sortBy: String, sortType: String, fromDate: String, toDate: String, duration: Number, phone: String, phone1: String, co: String, ext: String, pbxId: Number, callSource: Number, callType: Number, direction: Number, callerName: String, did: String, dnis: String, acc: String, ring: Number, cost: Number, group: Number) : Option[List[InlineResponse200]] = {
    // create path and map variables
    val path = "/Calls".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if(String.valueOf(rptType) != "null") queryParams += "rptType" -> rptType.toString
if(String.valueOf(rptId) != "null") queryParams += "rptId" -> rptId.toString
if(String.valueOf(start) != "null") queryParams += "start" -> start.toString
if(String.valueOf(limit) != "null") queryParams += "limit" -> limit.toString
if(String.valueOf(sortBy) != "null") queryParams += "sortBy" -> sortBy.toString
if(String.valueOf(sortType) != "null") queryParams += "sortType" -> sortType.toString
if(String.valueOf(fromDate) != "null") queryParams += "fromDate" -> fromDate.toString
if(String.valueOf(toDate) != "null") queryParams += "toDate" -> toDate.toString
if(String.valueOf(duration) != "null") queryParams += "duration" -> duration.toString
if(String.valueOf(phone) != "null") queryParams += "phone" -> phone.toString
if(String.valueOf(phone1) != "null") queryParams += "phone1" -> phone1.toString
if(String.valueOf(co) != "null") queryParams += "co" -> co.toString
if(String.valueOf(ext) != "null") queryParams += "ext" -> ext.toString
if(String.valueOf(pbxId) != "null") queryParams += "pbxId" -> pbxId.toString
if(String.valueOf(callSource) != "null") queryParams += "callSource" -> callSource.toString
if(String.valueOf(callType) != "null") queryParams += "callType" -> callType.toString
if(String.valueOf(direction) != "null") queryParams += "direction" -> direction.toString
if(String.valueOf(callerName) != "null") queryParams += "callerName" -> callerName.toString
if(String.valueOf(did) != "null") queryParams += "did" -> did.toString
if(String.valueOf(dnis) != "null") queryParams += "dnis" -> dnis.toString
if(String.valueOf(acc) != "null") queryParams += "acc" -> acc.toString
if(String.valueOf(ring) != "null") queryParams += "ring" -> ring.toString
if(String.valueOf(cost) != "null") queryParams += "cost" -> cost.toString
if(String.valueOf(group) != "null") queryParams += "group" -> group.toString
    
    
    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "array", classOf[InlineResponse200]).asInstanceOf[List[InlineResponse200]])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * 
   * Gets &#x60;Charts&#x60; list. 
   * @return List[InlineResponse200]
   */
  def featuresChartsGet () : Option[List[InlineResponse200]] = {
    // create path and map variables
    val path = "/Features/charts".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

        
    
    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "array", classOf[InlineResponse200]).asInstanceOf[List[InlineResponse200]])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * 
   * Gets &#x60;Reports&#x60; list. 
   * @return List[InlineResponse200]
   */
  def featuresReportsGet () : Option[List[InlineResponse200]] = {
    // create path and map variables
    val path = "/Features/reports".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

        
    
    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "array", classOf[InlineResponse200]).asInstanceOf[List[InlineResponse200]])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * 
   * Gets &#x60;Widgets&#x60; list. 
   * @return List[InlineResponse200]
   */
  def featuresWidgetGet () : Option[List[InlineResponse200]] = {
    // create path and map variables
    val path = "/Features/widget".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

        
    
    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "array", classOf[InlineResponse200]).asInstanceOf[List[InlineResponse200]])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

}
