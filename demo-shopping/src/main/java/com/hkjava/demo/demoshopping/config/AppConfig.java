package com.hkjava.demo.demoshopping.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration // Annotation on class ONLY
public class AppConfig {

  @Bean // Annotation on method ONLY
  RestTemplate restTemplate() { // public, private, nothing
    return new RestTemplate();
  }

}
