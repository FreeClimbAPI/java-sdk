package com.github.freeclimbapi;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.*;
import java.io.File;
import java.math.BigDecimal;
import com.github.freeclimbapi.models.*;
import com.github.freeclimbapi.enums.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import java.security.NoSuchAlgorithmException;
import java.security.InvalidKeyException;

public class PerclScriptBuildTest {

    private final PerclScript instance = new PerclScript();

    public String expectedPerclJson = "[{\"Pause\":{}},{\"SendDigits\":{}},{\"Pause\":{}},{\"GetDigits\":{\"prompts\":[{\"Play\":"
            +
            "{\"file\":\"https://123.com/press_any_key.wav\"}},{\"Pause\":{}},{\"Play\":{\"file\":\"https://123.com/press_any_key.wav\"}}"
            +
            ",{\"Pause\":{}},{\"Play\":{\"file\":\"https://123.com/press_any_key.wav\"}},{\"Pause\":{}}]}}]";

    @Test
    public void buildArrayListToJsonTest() throws Exception {
        JSON jsonWriter = new JSON();
        Pause pause = new Pause();
        SendDigits sendDigits = new SendDigits();
        GetDigits digits = new GetDigits();
        instance.addCommand(pause);
        instance.addCommand(sendDigits);
        instance.addCommand(pause);

        ArrayList<PerclCommand> prompts = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Play play = new Play();
            Pause agentPause = new Pause();

            play.setFile("https://123.com" + "/press_any_key.wav");

            prompts.add(play);
            prompts.add(agentPause);
        }

        digits.setPrompts(prompts);
        instance.addCommand(digits);
        String perclJson = instance.toJson();
        Assert.assertEquals(perclJson, expectedPerclJson);
    }

    @Test
    public void buildLinkedListToJsonTest() throws Exception {
        JSON jsonWriter = new JSON();
        Pause pause = new Pause();
        SendDigits sendDigits = new SendDigits();
        GetDigits digits = new GetDigits();
        instance.addCommand(pause);
        instance.addCommand(sendDigits);
        instance.addCommand(pause);

        LinkedList<PerclCommand> prompts = new LinkedList<>();

        for (int i = 0; i < 3; i++) {
            Play play = new Play();
            Pause agentPause = new Pause();

            play.setFile("https://123.com" + "/press_any_key.wav");

            prompts.add(play);
            prompts.add(agentPause);
        }

        digits.setPrompts(prompts);
        instance.addCommand(digits);
        String perclJson = instance.toJson();
        Assert.assertEquals(perclJson, expectedPerclJson);
    }

    @Test
    public void buildVectorToJsonTest() throws Exception {
        Pause pause = new Pause();
        SendDigits sendDigits = new SendDigits();
        GetDigits digits = new GetDigits();
        instance.addCommand(pause);
        instance.addCommand(sendDigits);
        instance.addCommand(pause);

        Vector<PerclCommand> prompts = new Vector<>();

        for (int i = 0; i < 3; i++) {
            Play play = new Play();
            Pause agentPause = new Pause();

            play.setFile("https://123.com" + "/press_any_key.wav");

            prompts.add(play);
            prompts.add(agentPause);
        }

        digits.setPrompts(prompts);
        instance.addCommand(digits);
        String perclJson = instance.toJson();
        Assert.assertEquals(perclJson, expectedPerclJson);
    }

    @Test
    public void buildStackToJsonTest() throws Exception {
        Pause pause = new Pause();
        SendDigits sendDigits = new SendDigits();
        GetDigits digits = new GetDigits();
        instance.addCommand(pause);
        instance.addCommand(sendDigits);
        instance.addCommand(pause);

        Stack<PerclCommand> prompts = new Stack<>();

        for (int i = 0; i < 3; i++) {
            Play play = new Play();
            Pause agentPause = new Pause();

            play.setFile("https://123.com" + "/press_any_key.wav");

            prompts.add(play);
            prompts.add(agentPause);
        }

        digits.setPrompts(prompts);
        instance.addCommand(digits);
        String perclJson = instance.toJson();
        Assert.assertEquals(perclJson, expectedPerclJson);
    }

}