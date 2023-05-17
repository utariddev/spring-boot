package org.utarid.restdemo.controller;

import org.springframework.web.bind.annotation.*;
import org.utarid.restdemo.User;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/test")
    public String testGet() {
        return "testGet";
    }

    @PostMapping("/test")
    public String testPost() {
        return "testPost";
    }

    @GetMapping("/test/{name}")
    public String testGetParameter(@PathVariable String name) {
        return "testGet : " + name;
    }

    @GetMapping("/testRequestParam")
    public String testGetRequestParam(@RequestParam("name") String name) {
        return "testGet : " + name;
    }

    @PostMapping("/testbody")
    public String testPostParameter(@RequestBody User user) {
        return "testPost : " + user.name();
    }
}
