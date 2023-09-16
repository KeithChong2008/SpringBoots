package com.hkjava.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

public interface HelloworldController {
  
  @GetMapping(value = "/hello")
  String hello();
  
}
