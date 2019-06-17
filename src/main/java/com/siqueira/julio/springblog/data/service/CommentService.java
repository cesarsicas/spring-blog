package com.siqueira.julio.springblog.data.service;

import com.siqueira.julio.springblog.data.entities.Comment;

import java.util.List;

public interface CommentService {
    void save(Comment comment);

    void update(Comment comment);

    void delete(Long id);

    Comment findById(Long id);

    List<Comment> findAll();
}
