package com.example2.demo2.Helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController
{
    @GetMapping("/hello-world")
    public String helloworld()
    {
        return " Hello World! ";
    }
    @GetMapping("/Employee")
    public String getEmployee_Id()
    {
        return " Hello World! ";
    }
}
