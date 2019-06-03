package com.siqueira.julio.springblog.rest;

import com.siqueira.julio.springblog.entities.Comment;
import com.siqueira.julio.springblog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("comments")
public class CommentController {

    @Autowired
    CommentService service;

    @PostMapping("/new")
    public ResponseEntity create(@RequestBody Comment comment) {
        service.save(comment);
        return ResponseEntity.ok(comment);

    }

    @PostMapping("/edit")
    public ResponseEntity update(@RequestBody Comment post) {
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
