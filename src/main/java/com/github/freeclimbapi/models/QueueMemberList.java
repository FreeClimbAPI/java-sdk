/*
 * FreeClimb API
 * FreeClimb is a cloud-based application programming interface (API) that puts the power of the Vail platform in your hands. FreeClimb simplifies the process of creating applications that can use a full range of telephony features without requiring specialized or on-site telephony equipment. Using the FreeClimb REST API to write applications is easy! You have the option to use the language of your choice or hit the API directly. Your application can execute a command by issuing a RESTful request to the FreeClimb API. The base URL to send HTTP requests to the FreeClimb REST API is: /apiserver. FreeClimb authenticates and processes your request.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@freeclimb.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.github.freeclimbapi.models;

import java.util.Objects;
import java.util.Arrays;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.format.DateTimeFormatter;
import java.io.IOException;
import java.util.*;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.math.BigDecimal;
import java.net.URI;
import org.openapitools.jackson.nullable.JsonNullable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.github.freeclimbapi.enums.*;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.JSON;
import com.github.freeclimbapi.utils.*;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.Callable;

/**
 * QueueMemberList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class QueueMemberList implements Pagination {
  public static String getDiscriminatorValue() {
    return null;
  }
  
  public static final String SERIALIZED_NAME_TOTAL = "total";
  
  
  @SerializedName(SERIALIZED_NAME_TOTAL)
  
  private Integer total;

  
  public static final String SERIALIZED_NAME_START = "start";
  
  
  @SerializedName(SERIALIZED_NAME_START)
  
  private Integer start;

  
  public static final String SERIALIZED_NAME_END = "end";
  
  
  @SerializedName(SERIALIZED_NAME_END)
  
  private Integer end;

  
  public static final String SERIALIZED_NAME_PAGE = "page";
  
  
  @SerializedName(SERIALIZED_NAME_PAGE)
  
  private Integer page;

  
  public static final String SERIALIZED_NAME_NUM_PAGES = "numPages";
  
  
  @SerializedName(SERIALIZED_NAME_NUM_PAGES)
  
  private Integer numPages;

  
  public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
  
  
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  
  private Integer pageSize;

  
  public static final String SERIALIZED_NAME_NEXT_PAGE_URI = "nextPageUri";
  
  
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE_URI)
  
  private String nextPageUri;

  
  public static final String SERIALIZED_NAME_QUEUE_MEMBERS = "queueMembers";
  
  
  @SerializedName(SERIALIZED_NAME_QUEUE_MEMBERS)
  
  private List<QueueMember> queueMembers = null;


  public QueueMemberList() { 
  }

  public QueueMemberList total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * Total amount of requested resource.
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total amount of requested resource.")

  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    this.total = total;
  }


  public QueueMemberList start(Integer start) {
    
    this.start = start;
    return this;
  }

   /**
   * Resource index at start of current page
   * @return start
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Resource index at start of current page")

  public Integer getStart() {
    return start;
  }


  public void setStart(Integer start) {
    this.start = start;
  }


  public QueueMemberList end(Integer end) {
    
    this.end = end;
    return this;
  }

   /**
   * Resource index at end of current page
   * @return end
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Resource index at end of current page")

  public Integer getEnd() {
    return end;
  }


  public void setEnd(Integer end) {
    this.end = end;
  }


  public QueueMemberList page(Integer page) {
    
    this.page = page;
    return this;
  }

   /**
   * Current page
   * @return page
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Current page")

  public Integer getPage() {
    return page;
  }


  public void setPage(Integer page) {
    this.page = page;
  }


  public QueueMemberList numPages(Integer numPages) {
    
    this.numPages = numPages;
    return this;
  }

   /**
   * Total number of pages
   * @return numPages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total number of pages")

  public Integer getNumPages() {
    return numPages;
  }


  public void setNumPages(Integer numPages) {
    this.numPages = numPages;
  }


  public QueueMemberList pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Number of items per page
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of items per page")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public QueueMemberList nextPageUri(String nextPageUri) {
    
    this.nextPageUri = nextPageUri;
    return this;
  }

   /**
   * Uri to retrieve the next page of items
   * @return nextPageUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Uri to retrieve the next page of items")

  public String getNextPageUri() {
    return nextPageUri;
  }


  public void setNextPageUri(String nextPageUri) {
    this.nextPageUri = nextPageUri;
  }


  public QueueMemberList queueMembers(List<QueueMember> queueMembers) {
    
    this.queueMembers = queueMembers;
    return this;
  }
  public QueueMemberList addQueueMembersItem(QueueMember queueMembersItem) {
    if (this.queueMembers == null) {
      this.queueMembers = new ArrayList<QueueMember>();
    }
    this.queueMembers.add(queueMembersItem);
    return this;
  }

   /**
   * Get queueMembers
   * @return queueMembers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<QueueMember> getQueueMembers() {
    return queueMembers;
  }


  public void setQueueMembers(List<QueueMember> queueMembers) {
    this.queueMembers = queueMembers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueMemberList queueMemberList = (QueueMemberList) o;
    return Objects.equals(this.total, queueMemberList.total) &&
        Objects.equals(this.start, queueMemberList.start) &&
        Objects.equals(this.end, queueMemberList.end) &&
        Objects.equals(this.page, queueMemberList.page) &&
        Objects.equals(this.numPages, queueMemberList.numPages) &&
        Objects.equals(this.pageSize, queueMemberList.pageSize) &&
        Objects.equals(this.nextPageUri, queueMemberList.nextPageUri) &&
        Objects.equals(this.queueMembers, queueMemberList.queueMembers);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, start, end, page, numPages, pageSize, nextPageUri, queueMembers);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueMemberList {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    numPages: ").append(toIndentedString(numPages)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    nextPageUri: ").append(toIndentedString(nextPageUri)).append("\n");
    sb.append("    queueMembers: ").append(toIndentedString(queueMembers)).append("\n");
    sb.append("}");
    return sb.toString();
  }


  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
