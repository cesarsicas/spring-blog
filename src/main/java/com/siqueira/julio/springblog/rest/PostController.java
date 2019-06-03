package com.siqueira.julio.springblog.rest;

import com.siqueira.julio.springblog.entities.Post;
import com.siqueira.julio.springblog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("posts")
public class PostController {

    @Autowired
    PostService service;

    @PostMapping("/new")
    public ResponseEntity create(@RequestBody Post post) {
        service.save(post);
        return ResponseEntity.ok(post);

    }

    @PostMapping("/edit")
    public ResponseEntity update(@RequestBody Post post) {
        return ResponseEntity.ok(post);
    }

    @GetMapping("/list")
    public ResponseEntity list() {
        return ResponseEntity.ok(service.findAll());
    }


    @GetMapping("/find/{id}")
    public ResponseEntity find(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }
}
