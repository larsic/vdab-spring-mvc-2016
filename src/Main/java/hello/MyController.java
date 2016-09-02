package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by brandonstark on 02/09/16.
 */
@Controller
public class MyController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "hello World!";
    }

    @RequestMapping("/lars")

    String lars(){
        return "foo";
    }

}
