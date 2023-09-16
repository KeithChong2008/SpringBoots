package com.hkjava.demo.demoresttemplate.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import com.hkjava.demo.demoresttemplate.model.User;

public interface UserOperation {

  @GetMapping(value = "/users")
  List<User> findUsers();

}
