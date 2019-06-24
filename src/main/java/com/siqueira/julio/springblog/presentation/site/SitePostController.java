package com.siqueira.julio.springblog.presentation.site;

import com.siqueira.julio.springblog.domain.service.SitePostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@Controller
public class SitePostController {

    @Autowired
    SitePostService service;

    @GetMapping("/posts/list")
    public ResponseEntity list() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/posts/{id}")
    public ResponseEntity find(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }
}
