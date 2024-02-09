package com.store.auth.controller;

import com.store.auth.domain.User;
import com.store.auth.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user")
public class UserController extends GenericController<User>{
    public UserController(UserService service){ super(service); }
}
