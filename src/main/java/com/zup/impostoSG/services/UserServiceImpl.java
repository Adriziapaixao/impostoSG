package com.zup.impostoSG.services;

import com.zup.impostoSG.infra.security.JwtTokenProvider;
import com.zup.impostoSG.repositories.RoleRepository;
import com.zup.impostoSG.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private final UserRepository userRepository;
    @Autowired
    private final PasswordEncoder bCryptPasswordEncoder;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private final JwtTokenProvider jwtTokenProvider;


    public UserServiceImpl(UserRepository userRepository, PasswordEncoder bCryptPasswordEncoder, JwtTokenProvider jwtTokenProvider) {
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this.jwtTokenProvider = jwtTokenProvider;
        this.roleRepository = roleRepository;

    }


}
