package com.hkjava.demo.demoresttemplate.controller.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hkjava.demo.demoresttemplate.controller.UserOperation;
import com.hkjava.demo.demoresttemplate.model.User;
import com.hkjava.demo.demoresttemplate.service.UserService;

@RestController
@RequestMapping("/api/v1")
public class UserController implements UserOperation {

  @Autowired
  private UserService userService;

  @Override
  public List<User> findUsers() {
    return userService.findUsers();
  }

}
