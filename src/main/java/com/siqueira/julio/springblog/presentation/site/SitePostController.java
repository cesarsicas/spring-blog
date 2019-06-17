package com.siqueira.julio.springblog.presentation.site;

import com.siqueira.julio.springblog.data.entities.Post;
import com.siqueira.julio.springblog.data.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@Controller
public class SitePostController {

    @Autowired
    PostService service;

    @PostMapping("/posts/new")
    public ResponseEntity create(@RequestBody Post post) {
        service.save(post);
        return ResponseEntity.ok(post);

    }

    @PostMapping("/posts/edit")
    public ResponseEntity update(@RequestBody Post post) {
        return ResponseEntity.ok(post);
    }

    @GetMapping("/posts/list")
    public ResponseEntity list() {
        return ResponseEntity.ok(service.findAll());
    }


    @GetMapping("/posts/{id}")
    public ResponseEntity find(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }
}
