package com.siqueira.julio.springblog.dao;

import com.siqueira.julio.springblog.entities.Post;
import org.springframework.stereotype.Repository;

@Repository
public class PostDaoImpl extends AbstractDao<Post, Long> implements PostDao {

}
