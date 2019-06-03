package com.siqueira.julio.springblog.test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {


    @GetMapping("/")
    public ResponseEntity<Fruit> home(){

        Fruit fruit = new Fruit();
        fruit.setName("This API");
        fruit.setDescription("Is Working");

        return new ResponseEntity<Fruit>(fruit, HttpStatus.OK);
    }
}
