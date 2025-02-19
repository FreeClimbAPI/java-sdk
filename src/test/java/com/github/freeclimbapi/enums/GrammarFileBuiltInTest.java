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

import com.github.freeclimbapi.enums.*;
import com.github.freeclimbapi.models.*;
import java.util.*;
import org.junit.Assert;
import org.junit.Test;

/** Model tests for GrammarFileBuiltIn */
public class GrammarFileBuiltInTest {

    @Test
    public void testALPHNUM6ShouldWork() {

        GrammarFileBuiltIn test = GrammarFileBuiltIn.ALPHNUM6;
        Assert.assertEquals(test.getClass(), GrammarFileBuiltIn.class);
    }

    @Test
    public void testALPHNUM6ShouldSerializeToEnum() {

        GrammarFileBuiltIn expectedValue = GrammarFileBuiltIn.ALPHNUM6;
        GrammarFileBuiltIn calculatedValue = GrammarFileBuiltIn.fromValue("ALPHNUM6");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testALPHNUM6ShouldDeserializeToString() {
        GrammarFileBuiltIn test = GrammarFileBuiltIn.ALPHNUM6;
        String expectedValue = "ALPHNUM6";
        String calculatedValue = test.toString();
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testANY_DIGShouldWork() {

        GrammarFileBuiltIn test = GrammarFileBuiltIn.ANY_DIG;
        Assert.assertEquals(test.getClass(), GrammarFileBuiltIn.class);
    }

    @Test
    public void testANY_DIGShouldSerializeToEnum() {

        GrammarFileBuiltIn expectedValue = GrammarFileBuiltIn.ANY_DIG;
        GrammarFileBuiltIn calculatedValue = GrammarFileBuiltIn.fromValue("ANY_DIG");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testANY_DIGShouldDeserializeToString() {
        GrammarFileBuiltIn test = GrammarFileBuiltIn.ANY_DIG;
        String expectedValue = "ANY_DIG";
        String calculatedValue = test.toString();
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testDIG1ShouldWork() {

        GrammarFileBuiltIn test = GrammarFileBuiltIn.DIG1;
        Assert.assertEquals(test.getClass(), GrammarFileBuiltIn.class);
    }

    @Test
    public void testDIG1ShouldSerializeToEnum() {

        GrammarFileBuiltIn expectedValue = GrammarFileBuiltIn.DIG1;
        GrammarFileBuiltIn calculatedValue = GrammarFileBuiltIn.fromValue("DIG1");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testDIG1ShouldDeserializeToString() {
        GrammarFileBuiltIn test = GrammarFileBuiltIn.DIG1;
        String expectedValue = "DIG1";
        String calculatedValue = test.toString();
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testDIG2ShouldWork() {

        GrammarFileBuiltIn test = GrammarFileBuiltIn.DIG2;
        Assert.assertEquals(test.getClass(), GrammarFileBuiltIn.class);
    }

    @Test
    public void testDIG2ShouldSerializeToEnum() {

        GrammarFileBuiltIn expectedValue = GrammarFileBuiltIn.DIG2;
        GrammarFileBuiltIn calculatedValue = GrammarFileBuiltIn.fromValue("DIG2");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testDIG2ShouldDeserializeToString() {
        GrammarFileBuiltIn test = GrammarFileBuiltIn.DIG2;
        String expectedValue = "DIG2";
        String calculatedValue = test.toString();
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testDIG3ShouldWork() {

        GrammarFileBuiltIn test = GrammarFileBuiltIn.DIG3;
        Assert.assertEquals(test.getClass(), GrammarFileBuiltIn.class);
    }

    @Test
    public void testDIG3ShouldSerializeToEnum() {

        GrammarFileBuiltIn expectedValue = GrammarFileBuiltIn.DIG3;
        GrammarFileBuiltIn calculatedValue = GrammarFileBuiltIn.fromValue("DIG3");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testDIG3ShouldDeserializeToString() {
        GrammarFileBuiltIn test = GrammarFileBuiltIn.DIG3;
        String expectedValue = "DIG3";
        String calculatedValue = test.toString();
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testDIG4ShouldWork() {

        GrammarFileBuiltIn test = GrammarFileBuiltIn.DIG4;
        Assert.assertEquals(test.getClass(), GrammarFileBuiltIn.class);
    }

    @Test
    public void testDIG4ShouldSerializeToEnum() {

        GrammarFileBuiltIn expectedValue = GrammarFileBuiltIn.DIG4;
        GrammarFileBuiltIn calculatedValue = GrammarFileBuiltIn.fromValue("DIG4");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testDIG4ShouldDeserializeToString() {
        GrammarFileBuiltIn test = GrammarFileBuiltIn.DIG4;
        String expectedValue = "DIG4";
        String calculatedValue = test.toString();
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testDIG5ShouldWork() {

        GrammarFileBuiltIn test = GrammarFileBuiltIn.DIG5;
        Assert.assertEquals(test.getClass(), GrammarFileBuiltIn.class);
    }

    @Test
    public void testDIG5ShouldSerializeToEnum() {

        GrammarFileBuiltIn expectedValue = GrammarFileBuiltIn.DIG5;
        GrammarFileBuiltIn calculatedValue = GrammarFileBuiltIn.fromValue("DIG5");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testDIG5ShouldDeserializeToString() {
        GrammarFileBuiltIn test = GrammarFileBuiltIn.DIG5;
        String expectedValue = "DIG5";
        String calculatedValue = test.toString();
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testDIG6ShouldWork() {

        GrammarFileBuiltIn test = GrammarFileBuiltIn.DIG6;
        Assert.assertEquals(test.getClass(), GrammarFileBuiltIn.class);
    }

    @Test
    public void testDIG6ShouldSerializeToEnum() {

        GrammarFileBuiltIn expectedValue = GrammarFileBuiltIn.DIG6;
        GrammarFileBuiltIn calculatedValue = GrammarFileBuiltIn.fromValue("DIG6");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testDIG6ShouldDeserializeToString() {
        GrammarFileBuiltIn test = GrammarFileBuiltIn.DIG6;
        String expectedValue = "DIG6";
        String calculatedValue = test.toString();
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testDIG7ShouldWork() {

        GrammarFileBuiltIn test = GrammarFileBuiltIn.DIG7;
        Assert.assertEquals(test.getClass(), GrammarFileBuiltIn.class);
    }

    @Test
    public void testDIG7ShouldSerializeToEnum() {

        GrammarFileBuiltIn expectedValue = GrammarFileBuiltIn.DIG7;
        GrammarFileBuiltIn calculatedValue = GrammarFileBuiltIn.fromValue("DIG7");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testDIG7ShouldDeserializeToString() {
        GrammarFileBuiltIn test = GrammarFileBuiltIn.DIG7;
        String expectedValue = "DIG7";
        String calculatedValue = test.toString();
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testDIG8ShouldWork() {

        GrammarFileBuiltIn test = GrammarFileBuiltIn.DIG8;
        Assert.assertEquals(test.getClass(), GrammarFileBuiltIn.class);
    }

    @Test
    public void testDIG8ShouldSerializeToEnum() {

        GrammarFileBuiltIn expectedValue = GrammarFileBuiltIn.DIG8;
        GrammarFileBuiltIn calculatedValue = GrammarFileBuiltIn.fromValue("DIG8");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testDIG8ShouldDeserializeToString() {
        GrammarFileBuiltIn test = GrammarFileBuiltIn.DIG8;
        String expectedValue = "DIG8";
        String calculatedValue = test.toString();
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testDIG9ShouldWork() {

        GrammarFileBuiltIn test = GrammarFileBuiltIn.DIG9;
        Assert.assertEquals(test.getClass(), GrammarFileBuiltIn.class);
    }

    @Test
    public void testDIG9ShouldSerializeToEnum() {

        GrammarFileBuiltIn expectedValue = GrammarFileBuiltIn.DIG9;
        GrammarFileBuiltIn calculatedValue = GrammarFileBuiltIn.fromValue("DIG9");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testDIG9ShouldDeserializeToString() {
        GrammarFileBuiltIn test = GrammarFileBuiltIn.DIG9;
        String expectedValue = "DIG9";
        String calculatedValue = test.toString();
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testDIG10ShouldWork() {

        GrammarFileBuiltIn test = GrammarFileBuiltIn.DIG10;
        Assert.assertEquals(test.getClass(), GrammarFileBuiltIn.class);
    }

    @Test
    public void testDIG10ShouldSerializeToEnum() {

        GrammarFileBuiltIn expectedValue = GrammarFileBuiltIn.DIG10;
        GrammarFileBuiltIn calculatedValue = GrammarFileBuiltIn.fromValue("DIG10");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testDIG10ShouldDeserializeToString() {
        GrammarFileBuiltIn test = GrammarFileBuiltIn.DIG10;
        String expectedValue = "DIG10";
        String calculatedValue = test.toString();
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testDIG11ShouldWork() {

        GrammarFileBuiltIn test = GrammarFileBuiltIn.DIG11;
        Assert.assertEquals(test.getClass(), GrammarFileBuiltIn.class);
    }

    @Test
    public void testDIG11ShouldSerializeToEnum() {

        GrammarFileBuiltIn expectedValue = GrammarFileBuiltIn.DIG11;
        GrammarFileBuiltIn calculatedValue = GrammarFileBuiltIn.fromValue("DIG11");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testDIG11ShouldDeserializeToString() {
        GrammarFileBuiltIn test = GrammarFileBuiltIn.DIG11;
        String expectedValue = "DIG11";
        String calculatedValue = test.toString();
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testUP_TO_20_DIGIT_SEQUENCEShouldWork() {

        GrammarFileBuiltIn test = GrammarFileBuiltIn.UP_TO_20_DIGIT_SEQUENCE;
        Assert.assertEquals(test.getClass(), GrammarFileBuiltIn.class);
    }

    @Test
    public void testUP_TO_20_DIGIT_SEQUENCEShouldSerializeToEnum() {

        GrammarFileBuiltIn expectedValue = GrammarFileBuiltIn.UP_TO_20_DIGIT_SEQUENCE;
        GrammarFileBuiltIn calculatedValue =
                GrammarFileBuiltIn.fromValue("UP_TO_20_DIGIT_SEQUENCE");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testUP_TO_20_DIGIT_SEQUENCEShouldDeserializeToString() {
        GrammarFileBuiltIn test = GrammarFileBuiltIn.UP_TO_20_DIGIT_SEQUENCE;
        String expectedValue = "UP_TO_20_DIGIT_SEQUENCE";
        String calculatedValue = test.toString();
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testVERSAY_YESNOShouldWork() {

        GrammarFileBuiltIn test = GrammarFileBuiltIn.VERSAY_YESNO;
        Assert.assertEquals(test.getClass(), GrammarFileBuiltIn.class);
    }

    @Test
    public void testVERSAY_YESNOShouldSerializeToEnum() {

        GrammarFileBuiltIn expectedValue = GrammarFileBuiltIn.VERSAY_YESNO;
        GrammarFileBuiltIn calculatedValue = GrammarFileBuiltIn.fromValue("VERSAY_YESNO");
        Assert.assertEquals(expectedValue, calculatedValue);
    }

    @Test
    public void testVERSAY_YESNOShouldDeserializeToString() {
        GrammarFileBuiltIn test = GrammarFileBuiltIn.VERSAY_YESNO;
        String expectedValue = "VERSAY_YESNO";
        String calculatedValue = test.toString();
        Assert.assertEquals(expectedValue, calculatedValue);
    }
}
