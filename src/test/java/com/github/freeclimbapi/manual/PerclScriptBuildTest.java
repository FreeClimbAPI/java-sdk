package com.github.freeclimbapi;

import com.github.freeclimbapi.enums.*;
import com.github.freeclimbapi.models.*;
import java.util.*;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

public class PerclScriptBuildTest {

    private final PerclScript instance = new PerclScript();

    JSONObject getPerclCommand(String command, JSONObject value) {
        JSONObject perclCommand = new JSONObject();
        perclCommand.put(command, value);
        return perclCommand;
    }

    JSONArray createExpectedPercl() {
        JSONArray result = new JSONArray();
        result.put(getPerclCommand("Pause", new JSONObject()));
        result.put(getPerclCommand("SendDigits", new JSONObject()));
        result.put(getPerclCommand("Pause", new JSONObject()));
        JSONObject getDigits = new JSONObject();
        JSONArray getDigitPrompts = new JSONArray();
        JSONObject playValue = new JSONObject();
        playValue.put("file", "https://123.com/press_any_key.wav");
        getDigitPrompts.put(getPerclCommand("Play", playValue));
        getDigitPrompts.put(getPerclCommand("Pause", new JSONObject()));
        getDigitPrompts.put(getPerclCommand("Play", playValue));
        getDigitPrompts.put(getPerclCommand("Pause", new JSONObject()));
        getDigitPrompts.put(getPerclCommand("Play", playValue));
        getDigitPrompts.put(getPerclCommand("Pause", new JSONObject()));
        getDigits.put("prompts", getDigitPrompts);
        result.put(getPerclCommand("GetDigits", getDigits));
        return result;
    }

    public JSONArray expectedPerclJsonArray = createExpectedPercl();

    public String expectedPerclJson = expectedPerclJsonArray.toString();

    @Test
    public void buildArrayListToJsonTest() throws Exception {
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
