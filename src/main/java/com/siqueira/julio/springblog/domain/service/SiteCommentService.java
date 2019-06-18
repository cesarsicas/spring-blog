package com.siqueira.julio.springblog.domain.service;

import com.siqueira.julio.springblog.data.entities.Comment;

import java.util.List;

public interface SiteCommentService {
    void save(Comment comment);

    List<Comment> findAll();
}
