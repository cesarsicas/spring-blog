package com.siqueira.julio.springblog.data.dao;

import com.siqueira.julio.springblog.data.entities.Comment;
import org.springframework.stereotype.Repository;

@Repository
public class CommentDaoImpl extends AbstractDao<Comment, Long> implements CommentDao {
    
}
