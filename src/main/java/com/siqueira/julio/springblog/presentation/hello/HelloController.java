package com.siqueira.julio.springblog.presentation.hello;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {


    @GetMapping("/")
    public ResponseEntity<String> home(){
        return new ResponseEntity<String>("The api is ok", HttpStatus.OK);
    }
}
