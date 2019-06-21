package com.siqueira.julio.springblog.data.dao;

import com.siqueira.julio.springblog.data.entities.SystemUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SystemUserDaoImpl extends AbstractDao<SystemUser, Long> implements SystemUserDao {

    @Override
    public SystemUser findByEmail(String email) {
        List<SystemUser> users = super.createQuery("SELECT u FROM SystemUser u WHERE u.email = ?1", email);
        return users.get(0);
    }
}
