package com.siqueira.julio.springblog.dao;

import com.siqueira.julio.springblog.entities.Comment;
import org.springframework.stereotype.Repository;

@Repository
public class CommentDaoImpl extends AbstractDao<Comment, Long> implements CommentDao {
    
}
