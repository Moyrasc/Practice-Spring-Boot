package com.bosonit.training.first;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//Especifica a Spring que estamos creando un controlador
@RestController
public class ControllerTest {
    @GetMapping("/")
    public String hello(){
        return "Hello World, it's my first project whit Spring Boot";
    }
}
