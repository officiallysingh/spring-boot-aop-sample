package com.ksoot.sample;

import org.springframework.stereotype.Service;

@Service
public class SampleService {

  @TriggerAop
  public String testMethodOne(final String inputOne) {
    this.testMethodTwo("Input two");
    return "outputOne";
  }

  @TriggerAop
  public String testMethodTwo(final String inputTwo) {

    return "outputTwo";
  }
}
