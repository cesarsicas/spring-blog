package com.siqueira.julio.springblog.domain.serviceimpl;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl<SystemUserDao> implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }


//    @Autowired
//    private SystemUserDao repository;
//
//    @Override
//    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//        SystemUser user = buscarPorEmail(username);
//        return new User(
//                usuario.getEmail(),
//                usuario.getSenha(),
//                AuthorityUtils.createAuthorityList(getAtuthorities(usuario.getPerfis()))
//        );
//    }
//

//
//    @Transactional(readOnly = true)
//    public Usuario buscarPorEmail(String email) {
//
//        return repository.findByEmail(email);
//    }
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
//    private String[] getAtuthorities(List<Perfil> perfis) {
//        String[] authorities = new String[perfis.size()];
//        for (int i = 0; i < perfis.size(); i++) {
//            authorities[i] = perfis.get(i).getDesc();
//        }
//        return authorities;
//    }
//}