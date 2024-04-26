package david.gonzalez.springboot.secured.restapi.jwt.demo;

import java.text.MessageFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return MessageFormat.format("Hello {0}", name);
    }
}
