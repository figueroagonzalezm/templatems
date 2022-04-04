package com.modyo.example.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"user"})
@RestController
@RequiredArgsConstructor
public class LoginUserController {

  @ApiOperation(
      value = "Logs user into the system",
      nickname = "loginUser",
      tags = {
        "user"
      },
      response = String.class)
  @RequestMapping(
      value = "/user/login",
      method = RequestMethod.GET,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<String> loginUser(
      @ApiParam(value = "The user name for login", required = true)
      @RequestParam(value = "username") String username,
      @ApiParam(value = "The password for login in clear text", required = true)
      @RequestParam(value = "password") String password
  ) {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }
}
