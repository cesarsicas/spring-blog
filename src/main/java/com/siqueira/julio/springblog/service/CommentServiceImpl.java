package com.siqueira.julio.springblog.service;

import com.siqueira.julio.springblog.dao.CommentDao;
import com.siqueira.julio.springblog.entities.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service @Transactional(readOnly = false)
public class CommentServiceImpl implements CommentService{

    @Autowired
    private CommentDao dao;

    @Override
    public void save(Comment comment) {
        dao.save(comment);
    }

    @Override
    public void update(Comment comment) {
        dao.update(comment);
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    @Override @Transactional(readOnly = true)
    public Comment findById(Long id) {
        return  dao.findById(id);
    }

    @Override @Transactional(readOnly = true)
    public List<Comment> findAll() {
        return dao.findAll();
    }
}
