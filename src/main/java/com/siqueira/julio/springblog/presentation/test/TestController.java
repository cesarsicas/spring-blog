package com.siqueira.julio.springblog.presentation.test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {


    @GetMapping("/")
    public ResponseEntity<Test> home(){

        Test test = new Test();
        test.setName("This API");
        test.setDescription("Is Working");

        return new ResponseEntity<Test>(test, HttpStatus.OK);
    }
}
