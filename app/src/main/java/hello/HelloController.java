package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/api")
    public String index() {
        return "Hello from Spring Boot! Testing a new version";
    }   
}
