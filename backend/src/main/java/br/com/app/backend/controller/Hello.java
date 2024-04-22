package br.com.app.backend.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Hello {

  @GetMapping("/")
  public String helo() {
    return "Olá mundo Spring " + new Date();
  }
  
}
