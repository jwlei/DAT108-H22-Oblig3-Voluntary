package ex3.initializer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;
import java.util.stream.Collectors;

@Controller
public class HeaderController {
    @GetMapping(value = "/headers", produces="text/plain")
    @ResponseBody
    public String headers(@RequestHeader Map<String, String> headers) {
        //https://www.baeldung.com/java-maps-streams
        return headers.entrySet().stream()
                .map((Map.Entry<String, String> e) -> String.format("Header '%s' = %s", e.getKey(), e.getValue()))
                .collect(Collectors.joining("\n"));
    }
}

