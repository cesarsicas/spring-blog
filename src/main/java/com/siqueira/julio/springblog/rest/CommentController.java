package com.siqueira.julio.springblog.rest;

import com.siqueira.julio.springblog.entities.Comment;
import com.siqueira.julio.springblog.entities.Post;
import com.siqueira.julio.springblog.service.CommentService;
import com.siqueira.julio.springblog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@Controller
public class CommentController {

    @Autowired
    CommentService commentService;

    @Autowired
    PostService postService;

    @GetMapping("/posts/comments/{id}")
    public ResponseEntity find(@PathVariable Long id) {
        return ResponseEntity.ok(commentService.findById(id));
    }

    @GetMapping("/posts/comments/list")
    public ResponseEntity list() {
        return ResponseEntity.ok(commentService.findAll());

    }

//todo
//    @GetMapping("/posts/{postId}/comments/list")
//    public ResponseEntity listByPostId(@PathVariable String postId) {
//        return ResponseEntity.ok(commentService.findAll());
//    }

    @PostMapping("/posts/{postId}/comments")
    public ResponseEntity create(@RequestBody Comment comment, @PathVariable Long postId) {
        Post post = postService.findById(postId);
        comment.setPost(post);
        commentService.save(comment);
        return ResponseEntity.ok(comment);

    }

    @PutMapping("/posts/{postId}/comments")
    public ResponseEntity update(@RequestBody Comment comment, @PathVariable String postId) {
        commentService.update(comment);
        return ResponseEntity.ok(comment);
    }






}
