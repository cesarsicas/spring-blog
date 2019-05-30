package com.siqueira.julio.springblog.dao;

import com.siqueira.julio.springblog.entities.Post;

import java.util.List;

public interface PostDao {
    void save(Post post);

    void update(Post post);

    void delete(Long id);

    Post findById(Long id);

    List<Post> findAll();
}
