package com.github.eugenemsv.temporal.user;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
@RequiredArgsConstructor
public class UserController {

  @GetMapping
  public ResponseEntity<?> ping() {
    return ResponseEntity.status(HttpStatus.OK).body("test");
  }
}
