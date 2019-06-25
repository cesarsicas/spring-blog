package com.siqueira.julio.springblog.domain.serviceimpl;

import com.siqueira.julio.springblog.data.dao.CommentDao;
import com.siqueira.julio.springblog.data.entities.Comment;
import com.siqueira.julio.springblog.domain.service.SiteCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service @Transactional(readOnly = false)
public class SiteCommentServiceImpl implements SiteCommentService {

    @Autowired
    private CommentDao dao;

    @Override
    public void save(Comment comment) {
        dao.save(comment);
    }

    @Override @Transactional(readOnly = true)
    public List<Comment> findAll() {
        return dao.findAll();
    }
}
