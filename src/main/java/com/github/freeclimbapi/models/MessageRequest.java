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

import com.github.freeclimbapi.enums.*;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** MessageRequest */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MessageRequest {
    public static String getDiscriminatorValue() {
        return null;
    }

    public static final String SERIALIZED_NAME_URI = "uri";

    @SerializedName(SERIALIZED_NAME_URI)
    private String uri;

    public static final String SERIALIZED_NAME_DATE_CREATED = "dateCreated";

    @SerializedName(SERIALIZED_NAME_DATE_CREATED)
    private String dateCreated;

    public static final String SERIALIZED_NAME_DATE_UPDATED = "dateUpdated";

    @SerializedName(SERIALIZED_NAME_DATE_UPDATED)
    private String dateUpdated;

    public static final String SERIALIZED_NAME_REVISION = "revision";

    @SerializedName(SERIALIZED_NAME_REVISION)
    private Integer revision;

    public static final String SERIALIZED_NAME_FROM = "from";

    @SerializedName(SERIALIZED_NAME_FROM)
    private String from;

    public static final String SERIALIZED_NAME_TO = "to";

    @SerializedName(SERIALIZED_NAME_TO)
    private String to;

    public static final String SERIALIZED_NAME_TEXT = "text";

    @SerializedName(SERIALIZED_NAME_TEXT)
    private String text;

    public static final String SERIALIZED_NAME_NOTIFICATION_URL = "notificationUrl";

    @SerializedName(SERIALIZED_NAME_NOTIFICATION_URL)
    private URI notificationUrl;

    public static final String SERIALIZED_NAME_MEDIA_URLS = "mediaUrls";

    @SerializedName(SERIALIZED_NAME_MEDIA_URLS)
    private List<URI> mediaUrls = null;

    public MessageRequest() {}

    public MessageRequest uri(String uri) {

        this.uri = uri;
        return this;
    }

    /**
     * The URI for this resource, relative to /apiserver.
     *
     * @return uri
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The URI for this resource, relative to /apiserver.")
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public MessageRequest dateCreated(String dateCreated) {

        this.dateCreated = dateCreated;
        return this;
    }

    /**
     * The date that this resource was created (GMT) in RFC 1123 format (e.g., Mon, 15 Jun 2009
     * 20:45:30 GMT).
     *
     * @return dateCreated
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "The date that this resource was created (GMT) in RFC 1123 format (e.g., Mon,"
                            + " 15 Jun 2009 20:45:30 GMT).")
    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public MessageRequest dateUpdated(String dateUpdated) {

        this.dateUpdated = dateUpdated;
        return this;
    }

    /**
     * The date that this resource was last updated (GMT) in RFC 1123 format (e.g., Mon, 15 Jun 2009
     * 20:45:30 GMT).
     *
     * @return dateUpdated
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "The date that this resource was last updated (GMT) in RFC 1123 format (e.g.,"
                            + " Mon, 15 Jun 2009 20:45:30 GMT).")
    public String getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(String dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public MessageRequest revision(Integer revision) {

        this.revision = revision;
        return this;
    }

    /**
     * Revision count for the resource. This count is set to 1 on creation and is incremented every
     * time it is updated.
     *
     * @return revision
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "Revision count for the resource. This count is set to 1 on creation and is"
                            + " incremented every time it is updated.")
    public Integer getRevision() {
        return revision;
    }

    public void setRevision(Integer revision) {
        this.revision = revision;
    }

    public MessageRequest from(String from) {

        this.from = from;
        return this;
    }

    /**
     * Phone number to use as the sender. This must be an incoming phone number that you have
     * purchased from FreeClimb.
     *
     * @return from
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(
            required = true,
            value =
                    "Phone number to use as the sender. This must be an incoming phone number that"
                            + " you have purchased from FreeClimb.")
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public MessageRequest to(String to) {

        this.to = to;
        return this;
    }

    /**
     * Phone number to receive the message. Must be within FreeClimb&#39;s service area.
     *
     * @return to
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(
            required = true,
            value = "Phone number to receive the message. Must be within FreeClimb's service area.")
    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public MessageRequest text(String text) {

        this.text = text;
        return this;
    }

    /**
     * Text contained in the message (maximum 160 characters). **Note:** For text, only ASCII
     * characters are supported.
     *
     * @return text
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(
            required = true,
            value =
                    "Text contained in the message (maximum 160 characters).   **Note:** For text,"
                            + " only ASCII characters are supported.")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public MessageRequest notificationUrl(URI notificationUrl) {

        this.notificationUrl = notificationUrl;
        return this;
    }

    /**
     * When the Message changes status, this URL is invoked using HTTP POST with the messageStatus
     * parameters. **Note:** This is a notification only; any PerCL returned is ignored.
     *
     * @return notificationUrl
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "When the Message changes status, this URL is invoked using HTTP POST with the"
                        + " messageStatus parameters.  **Note:** This is a notification only; any"
                        + " PerCL returned is ignored.")
    public URI getNotificationUrl() {
        return notificationUrl;
    }

    public void setNotificationUrl(URI notificationUrl) {
        this.notificationUrl = notificationUrl;
    }

    public MessageRequest mediaUrls(List<URI> mediaUrls) {

        this.mediaUrls = mediaUrls;
        return this;
    }

    public MessageRequest addMediaUrlsItem(URI mediaUrlsItem) {
        if (this.mediaUrls == null) {
            this.mediaUrls = new ArrayList<URI>();
        }
        this.mediaUrls.add(mediaUrlsItem);
        return this;
    }

    /**
     * an array of HTTP URLs which are to be used as attachments to the message. This will force the
     * message into being an MMS message and must be done using a from number which is MMS capabile.
     *
     * @return mediaUrls
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value =
                    "an array of HTTP URLs which are to be used as attachments to the message. This"
                        + " will force the message into being an MMS message and must be done using"
                        + " a from number which is MMS capabile.")
    public List<URI> getMediaUrls() {
        return mediaUrls;
    }

    public void setMediaUrls(List<URI> mediaUrls) {
        this.mediaUrls = mediaUrls;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessageRequest messageRequest = (MessageRequest) o;
        return Objects.equals(this.uri, messageRequest.uri)
                && Objects.equals(this.dateCreated, messageRequest.dateCreated)
                && Objects.equals(this.dateUpdated, messageRequest.dateUpdated)
                && Objects.equals(this.revision, messageRequest.revision)
                && Objects.equals(this.from, messageRequest.from)
                && Objects.equals(this.to, messageRequest.to)
                && Objects.equals(this.text, messageRequest.text)
                && Objects.equals(this.notificationUrl, messageRequest.notificationUrl)
                && Objects.equals(this.mediaUrls, messageRequest.mediaUrls);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null
                        && b != null
                        && a.isPresent()
                        && b.isPresent()
                        && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                uri,
                dateCreated,
                dateUpdated,
                revision,
                from,
                to,
                text,
                notificationUrl,
                mediaUrls);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MessageRequest {\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
        sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
        sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    notificationUrl: ").append(toIndentedString(notificationUrl)).append("\n");
        sb.append("    mediaUrls: ").append(toIndentedString(mediaUrls)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
