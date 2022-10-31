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


package com.github.freeclimbapi;

import java.util.Objects;
import java.util.Arrays;
import com.github.freeclimbapi.AddToConference;
import com.github.freeclimbapi.CreateConference;
import com.github.freeclimbapi.Dequeue;
import com.github.freeclimbapi.Enqueue;
import com.github.freeclimbapi.GetDigits;
import com.github.freeclimbapi.GetSpeech;
import com.github.freeclimbapi.GetSpeechAllOf;
import com.github.freeclimbapi.Hangup;
import com.github.freeclimbapi.OutDial;
import com.github.freeclimbapi.Park;
import com.github.freeclimbapi.Pause;
import com.github.freeclimbapi.PerclCommand;
import com.github.freeclimbapi.Play;
import com.github.freeclimbapi.PlayEarlyMedia;
import com.github.freeclimbapi.RecordUtterance;
import com.github.freeclimbapi.Redirect;
import com.github.freeclimbapi.Reject;
import com.github.freeclimbapi.RemoveFromConference;
import com.github.freeclimbapi.Say;
import com.github.freeclimbapi.SendDigits;
import com.github.freeclimbapi.SetListen;
import com.github.freeclimbapi.SetTalk;
import com.github.freeclimbapi.Sms;
import com.github.freeclimbapi.StartRecordCall;
import com.github.freeclimbapi.TerminateConference;
import com.github.freeclimbapi.Unpark;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.Callable;

/**
 * The &#x60;GetSpeech&#x60; command enables the Caller to respond to the application using a supported language. Unlike DTMF entry, which implicitly restricts the user to using the available buttons on the phone key pad, speech input allows for flexible audio inputs based on grammar. FreeClimb supports grammars written using GRXML compatible with the Microsoft Speech Platform. &#x60;GetSpeech&#x60; is only supported on a single call leg. It is not supported when there are two or more call legs connected (as in within a Conference).
 */
@ApiModel(description = "The `GetSpeech` command enables the Caller to respond to the application using a supported language. Unlike DTMF entry, which implicitly restricts the user to using the available buttons on the phone key pad, speech input allows for flexible audio inputs based on grammar. FreeClimb supports grammars written using GRXML compatible with the Microsoft Speech Platform. `GetSpeech` is only supported on a single call leg. It is not supported when there are two or more call legs connected (as in within a Conference).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T13:04:20.214-05:00[America/Chicago]")
public class GetSpeech extends PerclCommand {
  public static final String SERIALIZED_NAME_ACTION_URL = "actionUrl";
  @SerializedName(SERIALIZED_NAME_ACTION_URL)
  private String actionUrl;

  public static final String SERIALIZED_NAME_GRAMMAR_TYPE = "grammarType";
  @SerializedName(SERIALIZED_NAME_GRAMMAR_TYPE)
  private Integer grammarType;

  public static final String SERIALIZED_NAME_GRAMMAR_FILE = "grammarFile";
  @SerializedName(SERIALIZED_NAME_GRAMMAR_FILE)
  private String grammarFile;

  public static final String SERIALIZED_NAME_GRAMMAR_RULE = "grammarRule";
  @SerializedName(SERIALIZED_NAME_GRAMMAR_RULE)
  private Boolean grammarRule;

  public static final String SERIALIZED_NAME_PLAY_BEEP = "playBeep";
  @SerializedName(SERIALIZED_NAME_PLAY_BEEP)
  private String playBeep;

  public static final String SERIALIZED_NAME_PROMPTS = "prompts";
  @SerializedName(SERIALIZED_NAME_PROMPTS)
  private List<PerclCommand> prompts = null;

  public static final String SERIALIZED_NAME_NO_INPUT_TIMEOUT_MS = "noInputTimeoutMs";
  @SerializedName(SERIALIZED_NAME_NO_INPUT_TIMEOUT_MS)
  private Integer noInputTimeoutMs;

  public static final String SERIALIZED_NAME_RECOGNITION_TIMEOUT_MS = "recognitionTimeoutMs";
  @SerializedName(SERIALIZED_NAME_RECOGNITION_TIMEOUT_MS)
  private Integer recognitionTimeoutMs;

  public static final String SERIALIZED_NAME_CONFIDENCE_THRESHOLD = "confidenceThreshold";
  @SerializedName(SERIALIZED_NAME_CONFIDENCE_THRESHOLD)
  private BigDecimal confidenceThreshold;

  public static final String SERIALIZED_NAME_SENSITIVITY_LEVEL = "sensitivityLevel";
  @SerializedName(SERIALIZED_NAME_SENSITIVITY_LEVEL)
  private BigDecimal sensitivityLevel;

  public static final String SERIALIZED_NAME_SPEECH_COMPLETE_TIMEOUT_MS = "speechCompleteTimeoutMs";
  @SerializedName(SERIALIZED_NAME_SPEECH_COMPLETE_TIMEOUT_MS)
  private Integer speechCompleteTimeoutMs;

  public static final String SERIALIZED_NAME_SPEECH_INCOMPLETE_TIMEOUT_MS = "speechIncompleteTimeoutMs";
  @SerializedName(SERIALIZED_NAME_SPEECH_INCOMPLETE_TIMEOUT_MS)
  private Integer speechIncompleteTimeoutMs;

  public static final String SERIALIZED_NAME_PRIVACY_MODE = "privacyMode";
  @SerializedName(SERIALIZED_NAME_PRIVACY_MODE)
  private Boolean privacyMode;

  public GetSpeech() { 
    this.command = this.getClass().getSimpleName();
  }

  public GetSpeech actionUrl(String actionUrl) {
    
    this.actionUrl = actionUrl;
    return this;
  }

   /**
   * When the caller has finished speaking or the command has timed out, FreeClimb will make a POST request to this URL. A PerCL response is expected to continue handling the call.
   * @return actionUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "When the caller has finished speaking or the command has timed out, FreeClimb will make a POST request to this URL. A PerCL response is expected to continue handling the call.")

  public String getActionUrl() {
    return actionUrl;
  }


  public void setActionUrl(String actionUrl) {
    this.actionUrl = actionUrl;
  }


  public GetSpeech grammarType(Integer grammarType) {
    
    this.grammarType = grammarType;
    return this;
  }

   /**
   * The grammar file type to use for speech recognition. A value of &#39;URL&#39; indicates the grammarFile attribute specifies a URL that points to the grammar file. A value of &#x60;BUILTIN&#x60; indicates the grammarFile attribute specifies the name of one of the platform built-in grammar files.
   * @return grammarType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The grammar file type to use for speech recognition. A value of 'URL' indicates the grammarFile attribute specifies a URL that points to the grammar file. A value of `BUILTIN` indicates the grammarFile attribute specifies the name of one of the platform built-in grammar files.")

  public Integer getGrammarType() {
    return grammarType;
  }


  public void setGrammarType(Integer grammarType) {
    this.grammarType = grammarType;
  }


  public GetSpeech grammarFile(String grammarFile) {
    
    this.grammarFile = grammarFile;
    return this;
  }

   /**
   * The grammar file to use for speech recognition. If grammarType is set to URL, this attribute is specified as a download URL.
   * @return grammarFile
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The grammar file to use for speech recognition. If grammarType is set to URL, this attribute is specified as a download URL.")

  public String getGrammarFile() {
    return grammarFile;
  }


  public void setGrammarFile(String grammarFile) {
    this.grammarFile = grammarFile;
  }


  public GetSpeech grammarRule(Boolean grammarRule) {
    
    this.grammarRule = grammarRule;
    return this;
  }

   /**
   * The grammar rule within the specified grammar file to use for speech recognition. This attribute is optional if &#x60;grammarType&#x60; is &#x60;URL&#x60; and ignored if &#x60;grammarType&#x60; is &#x60;BUILTIN&#x60;.
   * @return grammarRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The grammar rule within the specified grammar file to use for speech recognition. This attribute is optional if `grammarType` is `URL` and ignored if `grammarType` is `BUILTIN`.")

  public Boolean getGrammarRule() {
    return grammarRule;
  }


  public void setGrammarRule(Boolean grammarRule) {
    this.grammarRule = grammarRule;
  }


  public GetSpeech playBeep(String playBeep) {
    
    this.playBeep = playBeep;
    return this;
  }

   /**
   * Indicates whether a beep should be played just before speech recognition is initiated so that the speaker can start to speak.
   * @return playBeep
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether a beep should be played just before speech recognition is initiated so that the speaker can start to speak.")

  public String getPlayBeep() {
    return playBeep;
  }


  public void setPlayBeep(String playBeep) {
    this.playBeep = playBeep;
  }


  public GetSpeech prompts(List<PerclCommand> prompts) {
    
    this.prompts = prompts;
    return this;
  }

  public GetSpeech addPromptsItem(PerclCommand promptsItem) {
    if (this.prompts == null) {
      this.prompts = new ArrayList<PerclCommand>();
    }
    this.prompts.add(promptsItem);
    return this;
  }

   /**
   * The JSON array of PerCL commands to nest within the &#x60;GetSpeech&#x60; command. The &#x60;Say&#x60;, &#x60;Play&#x60;, and &#x60;Pause&#x60; commands can be used. The nested actions are executed while FreeClimb is waiting for input from the caller. This allows for playing menu options to the caller and to prompt for the expected input. These commands stop executing when the caller begins to input speech.
   * @return prompts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The JSON array of PerCL commands to nest within the `GetSpeech` command. The `Say`, `Play`, and `Pause` commands can be used. The nested actions are executed while FreeClimb is waiting for input from the caller. This allows for playing menu options to the caller and to prompt for the expected input. These commands stop executing when the caller begins to input speech.")

  public List<PerclCommand> getPrompts() {
    return prompts;
  }


  public void setPrompts(List<PerclCommand> prompts) {
    this.prompts = prompts;
  }


  public GetSpeech noInputTimeoutMs(Integer noInputTimeoutMs) {
    
    this.noInputTimeoutMs = noInputTimeoutMs;
    return this;
  }

   /**
   * When recognition is started and there is no speech detected for &#x60;noInputTimeoutMs&#x60; milliseconds, the recognizer will terminate the recognition operation.
   * @return noInputTimeoutMs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When recognition is started and there is no speech detected for `noInputTimeoutMs` milliseconds, the recognizer will terminate the recognition operation.")

  public Integer getNoInputTimeoutMs() {
    return noInputTimeoutMs;
  }


  public void setNoInputTimeoutMs(Integer noInputTimeoutMs) {
    this.noInputTimeoutMs = noInputTimeoutMs;
  }


  public GetSpeech recognitionTimeoutMs(Integer recognitionTimeoutMs) {
    
    this.recognitionTimeoutMs = recognitionTimeoutMs;
    return this;
  }

   /**
   * When playback of prompts ends and there is no match for &#x60;recognitionTimeoutMs&#x60; milliseconds, the recognizer will terminate the recognition operation.
   * @return recognitionTimeoutMs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When playback of prompts ends and there is no match for `recognitionTimeoutMs` milliseconds, the recognizer will terminate the recognition operation.")

  public Integer getRecognitionTimeoutMs() {
    return recognitionTimeoutMs;
  }


  public void setRecognitionTimeoutMs(Integer recognitionTimeoutMs) {
    this.recognitionTimeoutMs = recognitionTimeoutMs;
  }


  public GetSpeech confidenceThreshold(BigDecimal confidenceThreshold) {
    
    this.confidenceThreshold = confidenceThreshold;
    return this;
  }

   /**
   * When a recognition resource recognizes a spoken phrase, it associates a confidence level with that match. Parameter &#x60;confidenceThreshold&#x60; specifies what confidence level is considered a successful match. Values are between 0.0 and 1.0.
   * @return confidenceThreshold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When a recognition resource recognizes a spoken phrase, it associates a confidence level with that match. Parameter `confidenceThreshold` specifies what confidence level is considered a successful match. Values are between 0.0 and 1.0.")

  public BigDecimal getConfidenceThreshold() {
    return confidenceThreshold;
  }


  public void setConfidenceThreshold(BigDecimal confidenceThreshold) {
    this.confidenceThreshold = confidenceThreshold;
  }


  public GetSpeech sensitivityLevel(BigDecimal sensitivityLevel) {
    
    this.sensitivityLevel = sensitivityLevel;
    return this;
  }

   /**
   * The speech recognizer supports a variable level of sound sensitivity. The sensitivityLevel attribute allows for filtering out background noise, so it is not mistaken for speech. Values are between 0.0 and 1.0 
   * @return sensitivityLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The speech recognizer supports a variable level of sound sensitivity. The sensitivityLevel attribute allows for filtering out background noise, so it is not mistaken for speech. Values are between 0.0 and 1.0 ")

  public BigDecimal getSensitivityLevel() {
    return sensitivityLevel;
  }


  public void setSensitivityLevel(BigDecimal sensitivityLevel) {
    this.sensitivityLevel = sensitivityLevel;
  }


  public GetSpeech speechCompleteTimeoutMs(Integer speechCompleteTimeoutMs) {
    
    this.speechCompleteTimeoutMs = speechCompleteTimeoutMs;
    return this;
  }

   /**
   * Parameter &#x60;speechCompleteTimeoutMs&#x60; specifies the length of silence required following user speech before the speech recognizer finalizes a result. This timeout applies when the recognizer currently has a complete match against an active grammar. Reasonable speech complete timeout values are typically in the range of 0.3 seconds to 1.0 seconds.
   * @return speechCompleteTimeoutMs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Parameter `speechCompleteTimeoutMs` specifies the length of silence required following user speech before the speech recognizer finalizes a result. This timeout applies when the recognizer currently has a complete match against an active grammar. Reasonable speech complete timeout values are typically in the range of 0.3 seconds to 1.0 seconds.")

  public Integer getSpeechCompleteTimeoutMs() {
    return speechCompleteTimeoutMs;
  }


  public void setSpeechCompleteTimeoutMs(Integer speechCompleteTimeoutMs) {
    this.speechCompleteTimeoutMs = speechCompleteTimeoutMs;
  }


  public GetSpeech speechIncompleteTimeoutMs(Integer speechIncompleteTimeoutMs) {
    
    this.speechIncompleteTimeoutMs = speechIncompleteTimeoutMs;
    return this;
  }

   /**
   * Parameter &#x60;speechIncompleteTimeoutMs&#x60; specifies the length of silence following user speech after which a recognizer finalizes a result. This timeout applies when the speech prior to the silence is an incomplete match of all active grammars. Timeout &#x60;speechIncompleteTimeoutMs&#x60; is usually longer than &#x60;speechCompleteTimeoutMs&#x60; to allow users to pause mid-utterance.
   * @return speechIncompleteTimeoutMs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Parameter `speechIncompleteTimeoutMs` specifies the length of silence following user speech after which a recognizer finalizes a result. This timeout applies when the speech prior to the silence is an incomplete match of all active grammars. Timeout `speechIncompleteTimeoutMs` is usually longer than `speechCompleteTimeoutMs` to allow users to pause mid-utterance.")

  public Integer getSpeechIncompleteTimeoutMs() {
    return speechIncompleteTimeoutMs;
  }


  public void setSpeechIncompleteTimeoutMs(Integer speechIncompleteTimeoutMs) {
    this.speechIncompleteTimeoutMs = speechIncompleteTimeoutMs;
  }


  public GetSpeech privacyMode(Boolean privacyMode) {
    
    this.privacyMode = privacyMode;
    return this;
  }

   /**
   * Parameter privacyMode will not log the &#x60;text&#x60; as required by PCI compliance.
   * @return privacyMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Parameter privacyMode will not log the `text` as required by PCI compliance.")

  public Boolean getPrivacyMode() {
    return privacyMode;
  }


  public void setPrivacyMode(Boolean privacyMode) {
    this.privacyMode = privacyMode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSpeech getSpeech = (GetSpeech) o;
    return Objects.equals(this.actionUrl, getSpeech.actionUrl) &&
        Objects.equals(this.grammarType, getSpeech.grammarType) &&
        Objects.equals(this.grammarFile, getSpeech.grammarFile) &&
        Objects.equals(this.grammarRule, getSpeech.grammarRule) &&
        Objects.equals(this.playBeep, getSpeech.playBeep) &&
        Objects.equals(this.prompts, getSpeech.prompts) &&
        Objects.equals(this.noInputTimeoutMs, getSpeech.noInputTimeoutMs) &&
        Objects.equals(this.recognitionTimeoutMs, getSpeech.recognitionTimeoutMs) &&
        Objects.equals(this.confidenceThreshold, getSpeech.confidenceThreshold) &&
        Objects.equals(this.sensitivityLevel, getSpeech.sensitivityLevel) &&
        Objects.equals(this.speechCompleteTimeoutMs, getSpeech.speechCompleteTimeoutMs) &&
        Objects.equals(this.speechIncompleteTimeoutMs, getSpeech.speechIncompleteTimeoutMs) &&
        Objects.equals(this.privacyMode, getSpeech.privacyMode) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionUrl, grammarType, grammarFile, grammarRule, playBeep, prompts, noInputTimeoutMs, recognitionTimeoutMs, confidenceThreshold, sensitivityLevel, speechCompleteTimeoutMs, speechIncompleteTimeoutMs, privacyMode, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSpeech {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    actionUrl: ").append(toIndentedString(actionUrl)).append("\n");
    sb.append("    grammarType: ").append(toIndentedString(grammarType)).append("\n");
    sb.append("    grammarFile: ").append(toIndentedString(grammarFile)).append("\n");
    sb.append("    grammarRule: ").append(toIndentedString(grammarRule)).append("\n");
    sb.append("    playBeep: ").append(toIndentedString(playBeep)).append("\n");
    sb.append("    prompts: ").append(toIndentedString(prompts)).append("\n");
    sb.append("    noInputTimeoutMs: ").append(toIndentedString(noInputTimeoutMs)).append("\n");
    sb.append("    recognitionTimeoutMs: ").append(toIndentedString(recognitionTimeoutMs)).append("\n");
    sb.append("    confidenceThreshold: ").append(toIndentedString(confidenceThreshold)).append("\n");
    sb.append("    sensitivityLevel: ").append(toIndentedString(sensitivityLevel)).append("\n");
    sb.append("    speechCompleteTimeoutMs: ").append(toIndentedString(speechCompleteTimeoutMs)).append("\n");
    sb.append("    speechIncompleteTimeoutMs: ").append(toIndentedString(speechIncompleteTimeoutMs)).append("\n");
    sb.append("    privacyMode: ").append(toIndentedString(privacyMode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  @Override
  public Map<String, Callable<Object>> attributeTypeMap() {
    Map<String, Callable<Object>> attributes = new HashMap();
    attributes.put("actionUrl", () -> this.getActionUrl());
    attributes.put("grammarType", () -> this.getGrammarType());
    attributes.put("grammarFile", () -> this.getGrammarFile());
    attributes.put("grammarRule", () -> this.getGrammarRule());
    attributes.put("playBeep", () -> this.getPlayBeep());
    attributes.put("prompts", () -> this.getPrompts());
    attributes.put("noInputTimeoutMs", () -> this.getNoInputTimeoutMs());
    attributes.put("recognitionTimeoutMs", () -> this.getRecognitionTimeoutMs());
    attributes.put("confidenceThreshold", () -> this.getConfidenceThreshold());
    attributes.put("sensitivityLevel", () -> this.getSensitivityLevel());
    attributes.put("speechCompleteTimeoutMs", () -> this.getSpeechCompleteTimeoutMs());
    attributes.put("speechIncompleteTimeoutMs", () -> this.getSpeechIncompleteTimeoutMs());
    attributes.put("privacyMode", () -> this.getPrivacyMode());
    return attributes;
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

