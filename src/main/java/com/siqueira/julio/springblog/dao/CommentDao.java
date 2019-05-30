package com.siqueira.julio.springblog.dao;

import com.siqueira.julio.springblog.entities.Comment;

import java.util.List;

public interface CommentDao {
    void save(Comment comment);

    void update(Comment comment);

    void delete(Long id);

    Comment findById(Long id);

    List<Comment> findAll();
}
