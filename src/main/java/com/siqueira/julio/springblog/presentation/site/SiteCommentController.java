package com.siqueira.julio.springblog.presentation.site;

import com.siqueira.julio.springblog.data.entities.Comment;
import com.siqueira.julio.springblog.data.entities.Post;
import com.siqueira.julio.springblog.domain.service.SiteCommentService;
import com.siqueira.julio.springblog.domain.service.SitePostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@Controller
public class SiteCommentController {

    @Autowired
    SiteCommentService siteCommentService;

    @Autowired
    SitePostService sitePostService;

    @GetMapping("/posts/comments/list")
    public ResponseEntity list() {
        return ResponseEntity.ok(siteCommentService.findAll());

    }

    @PostMapping("/posts/{postId}/comments")
    public ResponseEntity create(@RequestBody Comment comment, @PathVariable Long postId) {
        Post post = sitePostService.findById(postId);
        comment.setPost(post);
        siteCommentService.save(comment);
        return ResponseEntity.ok(comment);
    }
}
