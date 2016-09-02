package hello;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/kevin")
    @ResponseBody
    String kevin() {
        return "<html><head></head><body><h1>Dit is mijn pagina</h1></body></html>";
    }


    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}
