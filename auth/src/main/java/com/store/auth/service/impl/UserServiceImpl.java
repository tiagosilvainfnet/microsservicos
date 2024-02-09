package com.store.auth.service.impl;

import com.store.auth.domain.User;
import com.store.auth.repository.UserRepository;
import com.store.auth.service.UserService;

public class UserServiceImpl extends GenericServiceImpl<User, Long, UserRepository> implements UserService {
    public UserServiceImpl(UserRepository repository){ super(repository); }
}
