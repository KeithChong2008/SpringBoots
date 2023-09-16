package com.hkjava.demo.demoresttemplate.service.impl;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
import com.hkjava.demo.demoresttemplate.model.User;
import com.hkjava.demo.demoresttemplate.service.UserService;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private RestTemplate restTemplate;

  @Value(value = "${api.jsonplaceholder.domain}")
  private String jphDomain; // jsonplaceholder.typicode.com

  @Value(value = "${api.jsonplaceholder.endpoints.user}")
  private String userEndpoint; // /users

  @Override
  public List<User> findUsers() {

    String url = UriComponentsBuilder.newInstance() //
        .scheme("https") //
        .host(jphDomain) //
        .path(userEndpoint) //
        .toUriString();
    System.out.println("url=" + url);
    // Invoke API + Deserialization (JSON -> Object)
    User[] users = restTemplate.getForObject(url, User[].class);
    return Arrays.asList(users);
  }

}
