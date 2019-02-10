package org.demo.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentsController{
    @RequestMapping(value="/students", method=RequestMethod.GET)
    public @ResponseBody Map<String, Integer> students() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Charlie", 23);
        map.put("Anne", 21);
        map.put("Marcus", 22);
        return map;
    }
}