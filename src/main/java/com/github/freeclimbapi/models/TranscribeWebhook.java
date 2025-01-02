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

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.Callable;

/**
 * TranscribeWebhook
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TranscribeWebhook extends Webhook {
  public static TranscribeWebhook deserialize(String payload) {
    return (TranscribeWebhook)(new JSON().getGson().fromJson(payload, Webhook.class));
  }
  public static String getDiscriminatorValue() {
    return "transcribe";
  }
  
  public static final String SERIALIZED_NAME_REQUEST_TYPE = "requestType";
  
  
  @SerializedName(SERIALIZED_NAME_REQUEST_TYPE)
  
  protected String requestType;

  
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  
  
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  
  private String accountId;

  
  public static final String SERIALIZED_NAME_CALL_ID = "callId";
  
  
  @SerializedName(SERIALIZED_NAME_CALL_ID)
  
  private String callId;

  
  public static final String SERIALIZED_NAME_FROM = "from";
  
  
  @SerializedName(SERIALIZED_NAME_FROM)
  
  private String from;

  
  public static final String SERIALIZED_NAME_TO = "to";
  
  
  @SerializedName(SERIALIZED_NAME_TO)
  
  private String to;

  
  public static final String SERIALIZED_NAME_RECORDING_ID = "recordingId";
  
  
  @SerializedName(SERIALIZED_NAME_RECORDING_ID)
  
  private String recordingId;

  
  public static final String SERIALIZED_NAME_RECORDING_URL = "recordingUrl";
  
  
  @SerializedName(SERIALIZED_NAME_RECORDING_URL)
  
  private URI recordingUrl;

  
  public static final String SERIALIZED_NAME_RECORDING_SIZE = "recordingSize";
  
  
  @SerializedName(SERIALIZED_NAME_RECORDING_SIZE)
  
  private Integer recordingSize;

  
  public static final String SERIALIZED_NAME_RECORDING_FORMAT = "recordingFormat";
  
  
  @SerializedName(SERIALIZED_NAME_RECORDING_FORMAT)
  
  private String recordingFormat;

  
  public static final String SERIALIZED_NAME_RECORDING_DURATION_MS = "recordingDurationMs";
  
  
  @SerializedName(SERIALIZED_NAME_RECORDING_DURATION_MS)
  
  private Integer recordingDurationMs;

  
  public static final String SERIALIZED_NAME_TERM_REASON = "termReason";
  
  
  @SerializedName(SERIALIZED_NAME_TERM_REASON)
  
  private TranscribeTermReason termReason;

  
  public static final String SERIALIZED_NAME_RECORD_TERM_REASON = "recordTermReason";
  
  
  @SerializedName(SERIALIZED_NAME_RECORD_TERM_REASON)
  
  private RecordUtteranceTermReason recordTermReason;

  
  public static final String SERIALIZED_NAME_DIGIT = "digit";
  
  
  @SerializedName(SERIALIZED_NAME_DIGIT)
  
  private String digit;

  
  public static final String SERIALIZED_NAME_PRIVACY_FOR_LOGGING = "privacyForLogging";
  
  
  @SerializedName(SERIALIZED_NAME_PRIVACY_FOR_LOGGING)
  
  private Boolean privacyForLogging;

  
  public static final String SERIALIZED_NAME_PRIVACY_FOR_RECORDING = "privacyForRecording";
  
  
  @SerializedName(SERIALIZED_NAME_PRIVACY_FOR_RECORDING)
  
  private Boolean privacyForRecording;

  
  public static final String SERIALIZED_NAME_BARGE_IN_REASON = "bargeInReason";
  
  
  @SerializedName(SERIALIZED_NAME_BARGE_IN_REASON)
  
  private BargeInReason bargeInReason;

  
  public static final String SERIALIZED_NAME_BARGED_IN_PROMPT_NO = "bargedInPromptNo";
  
  
  @SerializedName(SERIALIZED_NAME_BARGED_IN_PROMPT_NO)
  
  private Integer bargedInPromptNo;

  
  public static final String SERIALIZED_NAME_BARGED_IN_PROMPT_MS = "bargedInPromptMs";
  
  
  @SerializedName(SERIALIZED_NAME_BARGED_IN_PROMPT_MS)
  
  private Integer bargedInPromptMs;

  
  public static final String SERIALIZED_NAME_BARGED_IN_PROMPT_LOOP_NO = "bargedInPromptLoopNo";
  
  
  @SerializedName(SERIALIZED_NAME_BARGED_IN_PROMPT_LOOP_NO)
  
  private Integer bargedInPromptLoopNo;

  
  public static final String SERIALIZED_NAME_BARGE_IN_TIME_MS = "bargeInTimeMs";
  
  
  @SerializedName(SERIALIZED_NAME_BARGE_IN_TIME_MS)
  
  private Integer bargeInTimeMs;

  
  public static final String SERIALIZED_NAME_TRANSCRIPT = "transcript";
  
  
  @SerializedName(SERIALIZED_NAME_TRANSCRIPT)
  
  private String transcript;

  
  public static final String SERIALIZED_NAME_TRANSCRIBE_REASON = "transcribeReason";
  
  
  @SerializedName(SERIALIZED_NAME_TRANSCRIBE_REASON)
  
  private TranscribeReason transcribeReason;

  
  public static final String SERIALIZED_NAME_TRANSCRIPTION_DURATION_MS = "transcriptionDurationMs";
  
  
  @SerializedName(SERIALIZED_NAME_TRANSCRIPTION_DURATION_MS)
  
  private Integer transcriptionDurationMs;


  public TranscribeWebhook() { 
    this.requestType = this.getClass().getSimpleName();
  }

  public TranscribeWebhook requestType(String requestType) {
    
    this.requestType = requestType;
    return this;
  }

   /**
   * The context or reason why this request is being made. Will be transcribe - The TranscribeUtterance command has completed and its actionUrl is being invoked.
   * @return requestType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The context or reason why this request is being made. Will be transcribe - The TranscribeUtterance command has completed and its actionUrl is being invoked.")

  public String getRequestType() {
    return requestType;
  }


  public void setRequestType(String requestType) {
    this.requestType = requestType;
  }


  public TranscribeWebhook accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Account ID associated with your account.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Account ID associated with your account.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public TranscribeWebhook callId(String callId) {
    
    this.callId = callId;
    return this;
  }

   /**
   * Unique identifier for this Call, generated by FreeClimb
   * @return callId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier for this Call, generated by FreeClimb")

  public String getCallId() {
    return callId;
  }


  public void setCallId(String callId) {
    this.callId = callId;
  }


  public TranscribeWebhook from(String from) {
    
    this.from = from;
    return this;
  }

   /**
   * Phone number of the party that initiated the Call (in E.164 format).
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Phone number of the party that initiated the Call (in E.164 format).")

  public String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    this.from = from;
  }


  public TranscribeWebhook to(String to) {
    
    this.to = to;
    return this;
  }

   /**
   * Phone number provisioned to the customer and to which this Call is directed (in E.164 format).
   * @return to
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Phone number provisioned to the customer and to which this Call is directed (in E.164 format).")

  public String getTo() {
    return to;
  }


  public void setTo(String to) {
    this.to = to;
  }


  public TranscribeWebhook recordingId(String recordingId) {
    
    this.recordingId = recordingId;
    return this;
  }

   /**
   * The ID of the recording. If no recording was made due to errors or the &#39;saveRecording&#39; flag being disabled this field will be set to null.
   * @return recordingId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the recording. If no recording was made due to errors or the 'saveRecording' flag being disabled this field will be set to null.")

  public String getRecordingId() {
    return recordingId;
  }


  public void setRecordingId(String recordingId) {
    this.recordingId = recordingId;
  }


  public TranscribeWebhook recordingUrl(URI recordingUrl) {
    
    this.recordingUrl = recordingUrl;
    return this;
  }

   /**
   * The URL of the recorded audio file. This URL can be used as is in a Play command to play the recording (no authentication needed). It can also be used to download the recording file via the REST API.
   * @return recordingUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the recorded audio file. This URL can be used as is in a Play command to play the recording (no authentication needed). It can also be used to download the recording file via the REST API.")

  public URI getRecordingUrl() {
    return recordingUrl;
  }


  public void setRecordingUrl(URI recordingUrl) {
    this.recordingUrl = recordingUrl;
  }


  public TranscribeWebhook recordingSize(Integer recordingSize) {
    
    this.recordingSize = recordingSize;
    return this;
  }

   /**
   * The size of the recording in bytes.
   * @return recordingSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The size of the recording in bytes.")

  public Integer getRecordingSize() {
    return recordingSize;
  }


  public void setRecordingSize(Integer recordingSize) {
    this.recordingSize = recordingSize;
  }


  public TranscribeWebhook recordingFormat(String recordingFormat) {
    
    this.recordingFormat = recordingFormat;
    return this;
  }

   /**
   * The media type of the recording.
   * @return recordingFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The media type of the recording.")

  public String getRecordingFormat() {
    return recordingFormat;
  }


  public void setRecordingFormat(String recordingFormat) {
    this.recordingFormat = recordingFormat;
  }


  public TranscribeWebhook recordingDurationMs(Integer recordingDurationMs) {
    
    this.recordingDurationMs = recordingDurationMs;
    return this;
  }

   /**
   * The duration of the recorded audio in milliseconds.
   * @return recordingDurationMs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The duration of the recorded audio in milliseconds.")

  public Integer getRecordingDurationMs() {
    return recordingDurationMs;
  }


  public void setRecordingDurationMs(Integer recordingDurationMs) {
    this.recordingDurationMs = recordingDurationMs;
  }


  public TranscribeWebhook termReason(TranscribeTermReason termReason) {
    
    this.termReason = termReason;
    return this;
  }

   /**
   * Get termReason
   * @return termReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TranscribeTermReason getTermReason() {
    return termReason;
  }


  public void setTermReason(TranscribeTermReason termReason) {
    this.termReason = termReason;
  }


  public TranscribeWebhook recordTermReason(RecordUtteranceTermReason recordTermReason) {
    
    this.recordTermReason = recordTermReason;
    return this;
  }

   /**
   * Get recordTermReason
   * @return recordTermReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RecordUtteranceTermReason getRecordTermReason() {
    return recordTermReason;
  }


  public void setRecordTermReason(RecordUtteranceTermReason recordTermReason) {
    this.recordTermReason = recordTermReason;
  }


  public TranscribeWebhook digit(String digit) {
    
    this.digit = digit;
    return this;
  }

   /**
   * If recordTermReason is digit, this will be the digit that was pressed. Otherwise it will be null.
   * @return digit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If recordTermReason is digit, this will be the digit that was pressed. Otherwise it will be null.")

  public String getDigit() {
    return digit;
  }


  public void setDigit(String digit) {
    this.digit = digit;
  }


  public TranscribeWebhook privacyForLogging(Boolean privacyForLogging) {
    
    this.privacyForLogging = privacyForLogging;
    return this;
  }

   /**
   * Echo back of the privacyForLogging flag as specified in the transcribe utterance command – confirmation of logging protection has been applied. Can be used by application to know it should also apply protection when handling this request.
   * @return privacyForLogging
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Echo back of the privacyForLogging flag as specified in the transcribe utterance command – confirmation of logging protection has been applied. Can be used by application to know it should also apply protection when handling this request.")

  public Boolean getPrivacyForLogging() {
    return privacyForLogging;
  }


  public void setPrivacyForLogging(Boolean privacyForLogging) {
    this.privacyForLogging = privacyForLogging;
  }


  public TranscribeWebhook privacyForRecording(Boolean privacyForRecording) {
    
    this.privacyForRecording = privacyForRecording;
    return this;
  }

   /**
   * Echo back of the privacyForRecording flag as specified in the transcribe utterance command – confirmation of logging protection has been applied. Can be used by application to know it should also apply protection when handling this request.
   * @return privacyForRecording
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Echo back of the privacyForRecording flag as specified in the transcribe utterance command – confirmation of logging protection has been applied. Can be used by application to know it should also apply protection when handling this request.")

  public Boolean getPrivacyForRecording() {
    return privacyForRecording;
  }


  public void setPrivacyForRecording(Boolean privacyForRecording) {
    this.privacyForRecording = privacyForRecording;
  }


  public TranscribeWebhook bargeInReason(BargeInReason bargeInReason) {
    
    this.bargeInReason = bargeInReason;
    return this;
  }

   /**
   * Get bargeInReason
   * @return bargeInReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BargeInReason getBargeInReason() {
    return bargeInReason;
  }


  public void setBargeInReason(BargeInReason bargeInReason) {
    this.bargeInReason = bargeInReason;
  }


  public TranscribeWebhook bargedInPromptNo(Integer bargedInPromptNo) {
    
    this.bargedInPromptNo = bargedInPromptNo;
    return this;
  }

   /**
   * Get bargedInPromptNo
   * @return bargedInPromptNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getBargedInPromptNo() {
    return bargedInPromptNo;
  }


  public void setBargedInPromptNo(Integer bargedInPromptNo) {
    this.bargedInPromptNo = bargedInPromptNo;
  }


  public TranscribeWebhook bargedInPromptMs(Integer bargedInPromptMs) {
    
    this.bargedInPromptMs = bargedInPromptMs;
    return this;
  }

   /**
   * duration in ms bargedInPromptNo prompt was executing until barge-in occurred.
   * @return bargedInPromptMs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "duration in ms bargedInPromptNo prompt was executing until barge-in occurred.")

  public Integer getBargedInPromptMs() {
    return bargedInPromptMs;
  }


  public void setBargedInPromptMs(Integer bargedInPromptMs) {
    this.bargedInPromptMs = bargedInPromptMs;
  }


  public TranscribeWebhook bargedInPromptLoopNo(Integer bargedInPromptLoopNo) {
    
    this.bargedInPromptLoopNo = bargedInPromptLoopNo;
    return this;
  }

   /**
   * Get bargedInPromptLoopNo
   * @return bargedInPromptLoopNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getBargedInPromptLoopNo() {
    return bargedInPromptLoopNo;
  }


  public void setBargedInPromptLoopNo(Integer bargedInPromptLoopNo) {
    this.bargedInPromptLoopNo = bargedInPromptLoopNo;
  }


  public TranscribeWebhook bargeInTimeMs(Integer bargeInTimeMs) {
    
    this.bargeInTimeMs = bargeInTimeMs;
    return this;
  }

   /**
   * epoch time in ms
   * @return bargeInTimeMs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "epoch time in ms")

  public Integer getBargeInTimeMs() {
    return bargeInTimeMs;
  }


  public void setBargeInTimeMs(Integer bargeInTimeMs) {
    this.bargeInTimeMs = bargeInTimeMs;
  }


  public TranscribeWebhook transcript(String transcript) {
    
    this.transcript = transcript;
    return this;
  }

   /**
   * Transcribed text of the recording. Can be empty or null. null means there was a failure in transcribing the audio, refer to transcribeReason for detailed failure reason.
   * @return transcript
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Transcribed text of the recording. Can be empty or null. null means there was a failure in transcribing the audio, refer to transcribeReason for detailed failure reason.")

  public String getTranscript() {
    return transcript;
  }


  public void setTranscript(String transcript) {
    this.transcript = transcript;
  }


  public TranscribeWebhook transcribeReason(TranscribeReason transcribeReason) {
    
    this.transcribeReason = transcribeReason;
    return this;
  }

   /**
   * Get transcribeReason
   * @return transcribeReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TranscribeReason getTranscribeReason() {
    return transcribeReason;
  }


  public void setTranscribeReason(TranscribeReason transcribeReason) {
    this.transcribeReason = transcribeReason;
  }


  public TranscribeWebhook transcriptionDurationMs(Integer transcriptionDurationMs) {
    
    this.transcriptionDurationMs = transcriptionDurationMs;
    return this;
  }

   /**
   * The duration of the audio being transcribed in milliseconds
   * @return transcriptionDurationMs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The duration of the audio being transcribed in milliseconds")

  public Integer getTranscriptionDurationMs() {
    return transcriptionDurationMs;
  }


  public void setTranscriptionDurationMs(Integer transcriptionDurationMs) {
    this.transcriptionDurationMs = transcriptionDurationMs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscribeWebhook transcribeWebhook = (TranscribeWebhook) o;
    return Objects.equals(this.requestType, transcribeWebhook.requestType) &&
        Objects.equals(this.accountId, transcribeWebhook.accountId) &&
        Objects.equals(this.callId, transcribeWebhook.callId) &&
        Objects.equals(this.from, transcribeWebhook.from) &&
        Objects.equals(this.to, transcribeWebhook.to) &&
        Objects.equals(this.recordingId, transcribeWebhook.recordingId) &&
        Objects.equals(this.recordingUrl, transcribeWebhook.recordingUrl) &&
        Objects.equals(this.recordingSize, transcribeWebhook.recordingSize) &&
        Objects.equals(this.recordingFormat, transcribeWebhook.recordingFormat) &&
        Objects.equals(this.recordingDurationMs, transcribeWebhook.recordingDurationMs) &&
        Objects.equals(this.termReason, transcribeWebhook.termReason) &&
        Objects.equals(this.recordTermReason, transcribeWebhook.recordTermReason) &&
        Objects.equals(this.digit, transcribeWebhook.digit) &&
        Objects.equals(this.privacyForLogging, transcribeWebhook.privacyForLogging) &&
        Objects.equals(this.privacyForRecording, transcribeWebhook.privacyForRecording) &&
        Objects.equals(this.bargeInReason, transcribeWebhook.bargeInReason) &&
        Objects.equals(this.bargedInPromptNo, transcribeWebhook.bargedInPromptNo) &&
        Objects.equals(this.bargedInPromptMs, transcribeWebhook.bargedInPromptMs) &&
        Objects.equals(this.bargedInPromptLoopNo, transcribeWebhook.bargedInPromptLoopNo) &&
        Objects.equals(this.bargeInTimeMs, transcribeWebhook.bargeInTimeMs) &&
        Objects.equals(this.transcript, transcribeWebhook.transcript) &&
        Objects.equals(this.transcribeReason, transcribeWebhook.transcribeReason) &&
        Objects.equals(this.transcriptionDurationMs, transcribeWebhook.transcriptionDurationMs) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestType, accountId, callId, from, to, recordingId, recordingUrl, recordingSize, recordingFormat, recordingDurationMs, termReason, recordTermReason, digit, privacyForLogging, privacyForRecording, bargeInReason, bargedInPromptNo, bargedInPromptMs, bargedInPromptLoopNo, bargeInTimeMs, transcript, transcribeReason, transcriptionDurationMs, super.hashCode());
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
    sb.append("class TranscribeWebhook {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    callId: ").append(toIndentedString(callId)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    recordingId: ").append(toIndentedString(recordingId)).append("\n");
    sb.append("    recordingUrl: ").append(toIndentedString(recordingUrl)).append("\n");
    sb.append("    recordingSize: ").append(toIndentedString(recordingSize)).append("\n");
    sb.append("    recordingFormat: ").append(toIndentedString(recordingFormat)).append("\n");
    sb.append("    recordingDurationMs: ").append(toIndentedString(recordingDurationMs)).append("\n");
    sb.append("    termReason: ").append(toIndentedString(termReason)).append("\n");
    sb.append("    recordTermReason: ").append(toIndentedString(recordTermReason)).append("\n");
    sb.append("    digit: ").append(toIndentedString(digit)).append("\n");
    sb.append("    privacyForLogging: ").append(toIndentedString(privacyForLogging)).append("\n");
    sb.append("    privacyForRecording: ").append(toIndentedString(privacyForRecording)).append("\n");
    sb.append("    bargeInReason: ").append(toIndentedString(bargeInReason)).append("\n");
    sb.append("    bargedInPromptNo: ").append(toIndentedString(bargedInPromptNo)).append("\n");
    sb.append("    bargedInPromptMs: ").append(toIndentedString(bargedInPromptMs)).append("\n");
    sb.append("    bargedInPromptLoopNo: ").append(toIndentedString(bargedInPromptLoopNo)).append("\n");
    sb.append("    bargeInTimeMs: ").append(toIndentedString(bargeInTimeMs)).append("\n");
    sb.append("    transcript: ").append(toIndentedString(transcript)).append("\n");
    sb.append("    transcribeReason: ").append(toIndentedString(transcribeReason)).append("\n");
    sb.append("    transcriptionDurationMs: ").append(toIndentedString(transcriptionDurationMs)).append("\n");
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