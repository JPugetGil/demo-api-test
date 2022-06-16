package xyz.hemoreg.demopostgresql.usermanagment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(path = "/ping")
public class PingController {


    @GetMapping
    public String getPing() {
        return "Pong";
    }
}
