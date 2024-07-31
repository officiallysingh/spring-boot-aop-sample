package com.ksoot.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.EnableLoadTimeWeaving;

@SpringBootApplication
//@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableLoadTimeWeaving
// @OpenAPIDefinition(servers = {@Server(url = "${server.servlet.context-path}")})
public class AopSampleApplication {

  public static void main(final String[] args) {
    SpringApplication.run(AopSampleApplication.class, args);
  }
}
