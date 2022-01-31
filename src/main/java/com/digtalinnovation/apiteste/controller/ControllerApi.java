package com.digtalinnovation.apiteste.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/teste-api")
public class ControllerApi {


    @GetMapping
    public String getApi() {
        return "API Test sucesseful!";
    }
}
