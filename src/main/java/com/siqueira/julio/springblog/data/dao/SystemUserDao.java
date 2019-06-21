package com.siqueira.julio.springblog.data.dao;

import com.siqueira.julio.springblog.data.entities.SystemUser;

public interface SystemUserDao {
    public SystemUser findByEmail(String email);
}
