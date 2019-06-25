package com.siqueira.julio.springblog.data.dao;

import com.siqueira.julio.springblog.data.entities.Post;
import org.springframework.stereotype.Repository;

@Repository
public class PostDaoImpl extends AbstractDao<Post, Long> implements PostDao {

}
