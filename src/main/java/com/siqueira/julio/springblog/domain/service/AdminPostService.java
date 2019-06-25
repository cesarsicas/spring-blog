package com.siqueira.julio.springblog.domain.service;

import com.siqueira.julio.springblog.data.entities.Post;

import java.util.List;

public interface AdminPostService {

    Post findById(Long id);

    List<Post> findAll();

    void create(Post post);

    void update(Post post);

    void delete(Long id);

}
