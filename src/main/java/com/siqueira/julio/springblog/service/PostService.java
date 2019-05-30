package com.siqueira.julio.springblog.service;

import com.siqueira.julio.springblog.entities.Post;

import java.util.List;

public interface PostService {
    void save(Post post);

    void update(Post post);

    void delete(Long id);

    Post findById(Long id);

    List<Post> findAll();
}
