package com.ksoot.sample;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
class SampleController {

  private final SampleService sampleService;

  @GetMapping(path = "/sample/test", produces = MediaType.APPLICATION_JSON_VALUE)
  ResponseEntity<String> doesStateExists() {
    this.sampleService.testMethodOne("Some input");
    return ResponseEntity.ok("API called successfully");
  }
}
