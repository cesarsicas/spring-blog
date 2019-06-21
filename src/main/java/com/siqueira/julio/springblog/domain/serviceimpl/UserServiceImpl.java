package com.siqueira.julio.springblog.domain.serviceimpl;

import com.siqueira.julio.springblog.data.dao.SystemUserDao;
import com.siqueira.julio.springblog.data.entities.Role;
import com.siqueira.julio.springblog.data.entities.SystemUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserDetailsService {


    @Autowired
    SystemUserDao dao;



    @Override @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SystemUser user = searchByEmail(username);

        return new User(
                user.getEmail(),
                user.getPassword(),
                AuthorityUtils.createAuthorityList(getAuthorities(user.getRoles()))
        );
    }

    @Transactional(readOnly = true)
    public SystemUser searchByEmail(String email) {
        return dao.findByEmail(email);
    }

    private String[] getAuthorities(List<Role> roles) {
        String[] authorities = {"admin", "editor", "author"};
        return  authorities;

//        String[] authorities = new String[roles.size()];
//        for (int i = 0; i < roles.size(); i++) {
//            authorities[i] = roles.get(i).getDesc();
//        }
//        return authorities;
    }
}


//
//@Service
//public class UsuarioService implements UserDetailsService {
//
//    @Autowired
//    private UsuarioRepository repository;
//
//    @Transactional(readOnly = true)
//    public Usuario buscarPorEmail(String email) {
//
//        return repository.findByEmail(email);
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Usuario usuario = buscarPorEmail(username);
//        return new User(
//                usuario.getEmail(),
//                usuario.getSenha(),
//                AuthorityUtils.createAuthorityList(getAtuthorities(usuario.getPerfis()))
//        );
//    }
//

//}