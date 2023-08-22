package com.college.studentmanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@RestController
public class HomeController {

    @GetMapping("/hello-world")
    public String helloWorld() throws UnknownHostException {
        String serverIp = InetAddress.getLocalHost().toString();
        return "Hello world from server : " +serverIp;
    }
}
