package tech.kikutaro.heroku.springboot.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    
    @CrossOrigin
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}