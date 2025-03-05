package com.gilDaEsfiha.lanches.controller;

import com.gilDaEsfiha.lanches.domain.User;
import com.gilDaEsfiha.lanches.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;


    /*
    Injeçao usando construtor

    private HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }*/

    @GetMapping
    public String helloWorld(){

        return helloWorldService.helloWorld("Jorge");
    }
    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id") String id, @RequestParam(value = "filter", defaultValue = "Nenhum") String filter, @RequestBody User body){
        return "Hello World "+ filter;
    }
}
