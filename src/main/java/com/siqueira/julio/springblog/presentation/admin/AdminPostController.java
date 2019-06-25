package com.siqueira.julio.springblog.presentation.admin;

import com.siqueira.julio.springblog.data.entities.Post;
import com.siqueira.julio.springblog.domain.service.AdminPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/admin")
@Controller
public class AdminPostController {
    @Autowired
    AdminPostService service;

    @GetMapping("/posts")
    public ResponseEntity list() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/posts/{id}")
    public ResponseEntity find(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping("/posts")
    public ResponseEntity create(@RequestBody Post post) {
        service.create(post);
        return ResponseEntity.ok(post);
    }

    @DeleteMapping("/posts/{id}/")
    public ResponseEntity create(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.ok().build();
    }

}
