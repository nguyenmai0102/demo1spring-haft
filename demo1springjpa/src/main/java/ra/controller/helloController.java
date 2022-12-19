package ra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class helloController {
    @RequestMapping(value = {"/",""})
    public String hello(){
        return "hello";
    }

}
