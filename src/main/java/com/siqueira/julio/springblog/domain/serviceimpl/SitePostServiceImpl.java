package com.siqueira.julio.springblog.domain.serviceimpl;

import com.siqueira.julio.springblog.data.dao.PostDao;
import com.siqueira.julio.springblog.data.entities.Post;
import com.siqueira.julio.springblog.domain.service.SitePostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service @Transactional(readOnly = false)
public class SitePostServiceImpl implements SitePostService {

    @Autowired
    private PostDao dao;

    @Override @Transactional(readOnly = true)
    public Post findById(Long id) {
        return  dao.findById(id);
    }

    @Override @Transactional(readOnly = true)
    public List<Post> findAll() {
       List<Post> somelist  = dao.findAll();
       return somelist;
    }
}
