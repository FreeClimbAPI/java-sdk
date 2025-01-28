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

package com.github.freeclimbapi.enums;

import com.github.freeclimbapi.models.*;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/**
 * The grammar file type to use for speech recognition. A value of &#39;URL&#39; indicates the
 * grammarFile attribute specifies a URL that points to the grammar file. A value of
 * &#x60;BUILTIN&#x60; indicates the grammarFile attribute specifies the name of one of the platform
 * built-in grammar files.
 */
@JsonAdapter(GrammarType.Adapter.class)
public enum GrammarType {
    URL("URL"),

    BUILT_IN("BUILTIN");

    private String value;

    GrammarType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static GrammarType fromValue(String value) {
        for (GrammarType b : GrammarType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }

    public static class Adapter extends TypeAdapter<GrammarType> {
        @Override
        public void write(final JsonWriter jsonWriter, final GrammarType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public GrammarType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return GrammarType.fromValue(value);
        }
    }
}
