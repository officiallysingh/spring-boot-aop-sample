package com.ksoot.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @OpenAPIDefinition(servers = {@Server(url = "${server.servlet.context-path}")})
public class AopSampleApplication {

  public static void main(final String[] args) {
    SpringApplication.run(AopSampleApplication.class, args);
  }
}
