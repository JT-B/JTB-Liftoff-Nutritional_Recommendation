package org.LaunchCode.JTBLiftoff.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.System.*;

@RestController
public class Hello_World_Controller {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World! Welcome!";
    }

    @GetMapping("/restricted")
    public String restricted() {
        return "You are logged in.";
    }
}
