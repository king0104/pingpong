package com.example.pingpong;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PingpongController {

    @GetMapping("/ping")
    public String getPong() {
        return "pong";
    }

}
