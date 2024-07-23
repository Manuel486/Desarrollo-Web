package com.example.pruebaseguridarolcondb.service;

import com.example.pruebaseguridarolcondb.model.RoleEntity;
import com.example.pruebaseguridarolcondb.model.UsuarioEntity;
import com.example.pruebaseguridarolcondb.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UsuarioEntity usuarioEntity = usuarioRepository.findByNombre(username);
        if (usuarioEntity == null){
            throw new UsernameNotFoundException("Usuario no encontrado");
        }

        return new User(
                usuarioEntity.getNombre(),
                usuarioEntity.getPassword(),
                getAuthorities(usuarioEntity.getRoles())
        );
    }

    private Collection<? extends GrantedAuthority> getAuthorities(Collection<RoleEntity> roles) {
        return roles.stream()
                .map(rol -> new SimpleGrantedAuthority("ROLE_" + rol.getNombre()))
                .collect(Collectors.toList());
    }
}
