package org.utarid.restdemo;

import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/test/{name}")
    public String testPostParameter(@PathVariable String name) {
        return "testPost : " + name;
    }
}
