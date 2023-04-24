package com.bosonit.training.first;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
//Especifica a Spring que estamos creando un controlador
@RestController
public class ControllerTest {
    //Hay que especificar la ruta que tiene que escuchar
    @GetMapping("/")
    public String hello(){
        return "Hello World, it's my first project whit Spring Boot";
    }
    @GetMapping("/bye/{name}")
    public String bye(@PathVariable String name){
        return "Bye: " + name;
    }
}
