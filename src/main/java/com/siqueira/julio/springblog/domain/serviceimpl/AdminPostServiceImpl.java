package com.siqueira.julio.springblog.domain.serviceimpl;

import com.siqueira.julio.springblog.data.dao.PostDao;
import com.siqueira.julio.springblog.data.entities.Post;
import com.siqueira.julio.springblog.domain.service.AdminPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = false)
public class AdminPostServiceImpl implements AdminPostService {
    @Autowired
    private PostDao dao;

    @Override @Transactional(readOnly = true)
    public Post findById(Long id) {
        return dao.findById(id);
    }

    @Override @Transactional(readOnly = true)
    public List<Post> findAll() {
        return dao.findAll();
    }

    @Override
    public void create(Post post) {
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
}
