package com.siqueira.julio.springblog.service;

import com.siqueira.julio.springblog.dao.PostDao;
import com.siqueira.julio.springblog.entities.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service @Transactional(readOnly = false)
public class PostServiceImpl implements PostService{

    @Autowired
    private PostDao dao;

    @Override
    public void save(Post post) {
        dao.save(post);
    }

    @Override
    public void update(Post post) {
        dao.update(post);
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    @Override @Transactional(readOnly = true)
    public Post findById(Long id) {
        return  dao.findById(id);
    }

    @Override @Transactional(readOnly = true)
    public List<Post> findAll() {
        return dao.findAll();
    }
}
