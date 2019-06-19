package com.siqueira.julio.springblog.data.dao;

import com.siqueira.julio.springblog.data.entities.Post;
import com.siqueira.julio.springblog.data.entities.SystemUser;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.persistence.TypedQuery;
import java.util.List;

class SystemUserDaoImpl extends AbstractDao<SystemUser, Long> implements SystemUserDao{
    //    public SystemUser findByEmail(String email){
//
//    }

    @Override
    public SystemUser findByEmail(String email){
        List<SystemUser>  users = super.createQuery("SELECT c FROM Country c");
        return users.get(0);
    }

}
