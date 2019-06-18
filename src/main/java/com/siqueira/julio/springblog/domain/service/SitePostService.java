package com.siqueira.julio.springblog.domain.service;

import com.siqueira.julio.springblog.data.entities.Post;

import java.util.List;

public interface SitePostService {

    Post findById(Long id);

    List<Post> findAll();
}
