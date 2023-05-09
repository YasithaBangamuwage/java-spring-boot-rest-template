package com.yas.javaspringbootresttemplate.controller;

import com.yas.javaspringbootresttemplate.dto.UnicornDTO;
import com.yas.javaspringbootresttemplate.response.UnicornResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class UnicornController
{
  @Autowired
  private RestTemplate restTemplate;

  @PostMapping(value = "/unicornsByEntity",
               consumes = MediaType.APPLICATION_JSON_VALUE,
               produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<UnicornResponse> createUnicornEntity(@RequestBody UnicornDTO unicornDTO)
  {
    return restTemplate.postForEntity("https://crudcrud.com/api/bec9523736aa41b8bb6def4042ffab51/unicorns",
                                      unicornDTO,
                                      UnicornResponse.class);
  }

  @GetMapping("/unicornsByEntity")
  public ResponseEntity<String> getUnicornByEntity()
  {
    return restTemplate.getForEntity("https://crudcrud.com/api/bec9523736aa41b8bb6def4042ffab51/unicorns",
                                     String.class);
  }
}
