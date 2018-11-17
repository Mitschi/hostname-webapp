package com.github.mitschi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
public class App 
{
    @RequestMapping("/")
    public String home() {
        try {
            return "Hello Docker World from "+ InetAddress.getLocalHost().getHostName()+" !  Time is: "+new Date();
        } catch (UnknownHostException e) {
            return "Hello DOCKER!";
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
