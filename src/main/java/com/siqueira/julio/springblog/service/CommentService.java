package com.siqueira.julio.springblog.service;

import com.siqueira.julio.springblog.entities.Comment;
import com.siqueira.julio.springblog.entities.Post;

import java.util.List;

public interface CommentService {
    void save(Comment comment);

    void update(Comment comment);

    void delete(Long id);

    Comment findById(Long id);

    List<Comment> findAll();
}
