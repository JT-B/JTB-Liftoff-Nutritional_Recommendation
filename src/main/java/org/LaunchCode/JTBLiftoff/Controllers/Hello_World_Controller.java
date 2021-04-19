package org.LaunchCode.JTBLiftoff.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static java.lang.System.*;

@Controller
public class Hello_World_Controller {

    @GetMapping
    @ResponseBody
    public String hello() {
        return "Hello World";
    }

}
