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
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

/** Model tests for SMSTenDLCPartnerCampaignsListResult */
public class SMSTenDLCPartnerCampaignsListResultTest {

    private final SMSTenDLCPartnerCampaignsListResult model =
            new SMSTenDLCPartnerCampaignsListResult();

    /** Test the property 'total' */
    @Test
    public void totalTest() {

        model.setTotal(1);
        Assert.assertEquals(1, (int) model.getTotal());
    }

    /** Test the property 'start' */
    @Test
    public void startTest() {

        model.setStart(1);
        Assert.assertEquals(1, (int) model.getStart());
    }

    /** Test the property 'end' */
    @Test
    public void endTest() {

        model.setEnd(1);
        Assert.assertEquals(1, (int) model.getEnd());
    }

    /** Test the property 'page' */
    @Test
    public void pageTest() {

        model.setPage(1);
        Assert.assertEquals(1, (int) model.getPage());
    }

    /** Test the property 'numPages' */
    @Test
    public void numPagesTest() {

        model.setNumPages(1);
        Assert.assertEquals(1, (int) model.getNumPages());
    }

    /** Test the property 'pageSize' */
    @Test
    public void pageSizeTest() {

        model.setPageSize(1);
        Assert.assertEquals(1, (int) model.getPageSize());
    }

    /** Test the property 'nextPageUri' */
    @Test
    public void nextPageUriTest() {

        model.setNextPageUri("TEST_STRING");
        Assert.assertEquals("TEST_STRING", model.getNextPageUri());
    }

    /** Test the property 'partnerCampaigns' */
    @Test
    public void partnerCampaignsTest() {

        List<SMSTenDLCPartnerCampaign> testList = new ArrayList<SMSTenDLCPartnerCampaign>();
        model.setPartnerCampaigns(testList);
        Assert.assertEquals(testList, model.getPartnerCampaigns());
    }

    /** Test the method 'equalsTrue' */
    @Test
    public void equalsTrueTest() {
        SMSTenDLCPartnerCampaignsListResult test1 = new SMSTenDLCPartnerCampaignsListResult();
        test1.setTotal(1);

        test1.setStart(1);

        test1.setEnd(1);

        test1.setPage(1);

        test1.setNumPages(1);

        test1.setPageSize(1);

        test1.setNextPageUri("TS");

        List<SMSTenDLCPartnerCampaign> testList = new ArrayList<SMSTenDLCPartnerCampaign>();
        test1.setPartnerCampaigns(testList);
        SMSTenDLCPartnerCampaignsListResult test2 = new SMSTenDLCPartnerCampaignsListResult();
        test2.setTotal(1);

        test2.setStart(1);

        test2.setEnd(1);

        test2.setPage(1);

        test2.setNumPages(1);

        test2.setPageSize(1);

        test2.setNextPageUri("TS");

        List<SMSTenDLCPartnerCampaign> testList2 = testList;
        test2.setPartnerCampaigns(testList2);

        Assert.assertTrue(test1.equals(test2));
    }

    /** Test the method 'equalsFalse' */
    @Test
    public void equalsFalseTest() {
        SMSTenDLCPartnerCampaignsListResult test1 = new SMSTenDLCPartnerCampaignsListResult();
        test1.setTotal(1);

        test1.setStart(1);

        test1.setEnd(1);

        test1.setPage(1);

        test1.setNumPages(1);

        test1.setPageSize(1);

        test1.setNextPageUri("TS");

        List<SMSTenDLCPartnerCampaign> testList = new ArrayList<SMSTenDLCPartnerCampaign>();
        test1.setPartnerCampaigns(testList);
        SMSTenDLCPartnerCampaignsListResult test2 = new SMSTenDLCPartnerCampaignsListResult();
        test2.setTotal(0);

        test2.setStart(0);

        test2.setEnd(0);

        test2.setPage(0);

        test2.setNumPages(0);

        test2.setPageSize(0);

        test2.setNextPageUri("TS2");

        List<SMSTenDLCPartnerCampaign> testList2 = null;
        test2.setPartnerCampaigns(testList2);

        Assert.assertFalse(test1.equals(test2));
    }

    /** Test the method 'hashCodeType' */
    @Test
    public void hashCodeTypeTest() {
        SMSTenDLCPartnerCampaignsListResult test1 = new SMSTenDLCPartnerCampaignsListResult();
        test1.setTotal(1);

        test1.setStart(1);

        test1.setEnd(1);

        test1.setPage(1);

        test1.setNumPages(1);

        test1.setPageSize(1);

        test1.setNextPageUri("TS");

        List<SMSTenDLCPartnerCampaign> testList = new ArrayList<SMSTenDLCPartnerCampaign>();
        test1.setPartnerCampaigns(testList);

        int hashCode1 = test1.hashCode();
        Assert.assertTrue(Integer.class.isInstance(hashCode1));
    }

    /** Test the method 'toStringEquals' */
    @Test
    public void toStringEqualsTest() {
        SMSTenDLCPartnerCampaignsListResult test1 = new SMSTenDLCPartnerCampaignsListResult();
        test1.setTotal(1);

        test1.setStart(1);

        test1.setEnd(1);

        test1.setPage(1);

        test1.setNumPages(1);

        test1.setPageSize(1);

        test1.setNextPageUri("TS");

        List<SMSTenDLCPartnerCampaign> testList = new ArrayList<SMSTenDLCPartnerCampaign>();
        test1.setPartnerCampaigns(testList);
        SMSTenDLCPartnerCampaignsListResult test2 = new SMSTenDLCPartnerCampaignsListResult();
        test2.setTotal(1);

        test2.setStart(1);

        test2.setEnd(1);

        test2.setPage(1);

        test2.setNumPages(1);

        test2.setPageSize(1);

        test2.setNextPageUri("TS");

        List<SMSTenDLCPartnerCampaign> testList2 = testList;
        test2.setPartnerCampaigns(testList2);

        String toString1 = test1.toString();
        String toString2 = test2.toString();
        Assert.assertEquals(toString1, toString2);
    }

    /** Test the method 'hashCodeEqualsTrue' */
    @Test
    public void hashCodeEqualsTrueTest() {
        SMSTenDLCPartnerCampaignsListResult test1 = new SMSTenDLCPartnerCampaignsListResult();
        test1.setTotal(1);

        test1.setStart(1);

        test1.setEnd(1);

        test1.setPage(1);

        test1.setNumPages(1);

        test1.setPageSize(1);

        test1.setNextPageUri("TS");

        List<SMSTenDLCPartnerCampaign> testList = new ArrayList<SMSTenDLCPartnerCampaign>();
        test1.setPartnerCampaigns(testList);
        SMSTenDLCPartnerCampaignsListResult test2 = new SMSTenDLCPartnerCampaignsListResult();
        test2.setTotal(1);

        test2.setStart(1);

        test2.setEnd(1);

        test2.setPage(1);

        test2.setNumPages(1);

        test2.setPageSize(1);

        test2.setNextPageUri("TS");

        List<SMSTenDLCPartnerCampaign> testList2 = testList;
        test2.setPartnerCampaigns(testList2);
        Assert.assertEquals(test1.hashCode(), test2.hashCode());
    }

    /** Test the method 'hashCodeEqualsFalse' */
    @Test
    public void hashCodeEqualsFalseTest() {
        SMSTenDLCPartnerCampaignsListResult test1 = new SMSTenDLCPartnerCampaignsListResult();
        test1.setTotal(1);

        test1.setStart(1);

        test1.setEnd(1);

        test1.setPage(1);

        test1.setNumPages(1);

        test1.setPageSize(1);

        test1.setNextPageUri("TS");

        List<SMSTenDLCPartnerCampaign> testList = new ArrayList<SMSTenDLCPartnerCampaign>();
        test1.setPartnerCampaigns(testList);
        SMSTenDLCPartnerCampaignsListResult test2 = new SMSTenDLCPartnerCampaignsListResult();
        test2.setTotal(0);

        test2.setStart(0);

        test2.setEnd(0);

        test2.setPage(0);

        test2.setNumPages(0);

        test2.setPageSize(0);

        test2.setNextPageUri("TS2");

        List<SMSTenDLCPartnerCampaign> testList2 = null;
        test2.setPartnerCampaigns(testList2);
        Assert.assertNotEquals(test1.hashCode(), test2.hashCode());
    }

    /** Test the method 'toStringType' */
    @Test
    public void toStringTypeTest() {
        SMSTenDLCPartnerCampaignsListResult test1 = new SMSTenDLCPartnerCampaignsListResult();
        test1.setTotal(1);

        test1.setStart(1);

        test1.setEnd(1);

        test1.setPage(1);

        test1.setNumPages(1);

        test1.setPageSize(1);

        test1.setNextPageUri("TS");

        List<SMSTenDLCPartnerCampaign> testList = new ArrayList<SMSTenDLCPartnerCampaign>();
        test1.setPartnerCampaigns(testList);

        String toString1 = test1.toString();
        Assert.assertTrue(String.class.isInstance(toString1));
    }
}
