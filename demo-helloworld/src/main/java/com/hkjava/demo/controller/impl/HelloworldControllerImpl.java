package com.hkjava.demo.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.hkjava.demo.controller.HelloworldController;
import com.hkjava.demo.service.HelloworldService;

@Controller
@ResponseBody
@RequestMapping(value = "/api/v1")
public class HelloworldControllerImpl implements HelloworldController {

  @Autowired // Check if any object implementing HelloworldService in SpringContext
  HelloworldService helloworldService;

  @Override
  public String hello() {
    // HelloworldServiceImpl helloworldServiceImpl = new HelloworldServiceImpl();
    return helloworldService.generate(102);
  }

}
