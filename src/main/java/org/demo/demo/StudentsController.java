package org.demo.demo;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentsController{
    @RequestMapping(value="/students", method=RequestMethod.GET)
    public @ResponseBody String students() {
        JsonObject jsonObject = new JsonObject();
        JsonArray students = new JsonArray();

        JsonObject jsonObject1 = new JsonObject();
        jsonObject1.addProperty("name", "Charlie");
        jsonObject1.addProperty("age", 23);

        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("name", "Anne");
        jsonObject2.addProperty("age", 21);

        JsonObject jsonObject3 = new JsonObject();
        jsonObject3.addProperty("name", "Marcus");
        jsonObject3.addProperty("age", 22);

        students.add(jsonObject1);
        students.add(jsonObject2);
        students.add(jsonObject3);

        jsonObject.add("students", students);
        return jsonObject.toString();
    }

    @RequestMapping(value="/students2", method=RequestMethod.GET)
    public @ResponseBody Map<String, Integer> students2() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Charlie", 23);
        map.put("Anne", 21);
        map.put("Marcus", 22);
        return map;
    }

    @RequestMapping(value="/students3", method=RequestMethod.GET)
    public @ResponseBody String students3() {
        JsonObject students = new JsonObject();
        students.addProperty("firstName", "Sergey");
        students.addProperty("lastName", "Kargopolov");
        return students.toString();
    }

    @RequestMapping(value="/students4", method=RequestMethod.GET)
    public @ResponseBody String students4() {
        JsonObject person = new JsonObject();
        person.addProperty("firstName", "Sergey");
        person.addProperty("lastName", "Kargopolov");
        // Create Inner JSON Object 
        JsonObject address = new JsonObject();
        address.addProperty("country", "ru");
        address.addProperty("city", "Moscow");
        person.add("address", address);
        return person.toString();
    }

    @RequestMapping(value="/students5", method=RequestMethod.GET)
    public @ResponseBody String students5() {
        // Create JSON Array 
        JsonArray languages = new JsonArray();
        languages.add("Russian");
        languages.add("English");
        languages.add("French");
        return languages.toString();
    }
}