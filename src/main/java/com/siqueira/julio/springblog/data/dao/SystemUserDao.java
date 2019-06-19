package com.siqueira.julio.springblog.data.dao;

import com.siqueira.julio.springblog.data.entities.SystemUser;

interface SystemUserDao {
    public SystemUser findByEmail(String email);
}
