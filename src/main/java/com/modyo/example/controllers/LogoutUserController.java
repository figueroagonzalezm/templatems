package com.modyo.example.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"user"})
@RestController
@RequiredArgsConstructor
public class LogoutUserController {

  @ApiOperation(
      value = "Logs out current logged in user session",
      nickname = "logoutUser",
      tags = {
        "user"
      },
      response = Object.class)
  @RequestMapping(
      value = "/user/logout",
      method = RequestMethod.GET,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Object> logoutUser(
  ) {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }
}
