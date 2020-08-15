package org.eduami.spring.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorlController {
    @GetMapping("/**")
    public String helloWorl() {
        return "Hello World";
    }
}
