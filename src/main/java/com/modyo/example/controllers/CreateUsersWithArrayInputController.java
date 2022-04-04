package com.modyo.example.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"user"})
@RestController
@RequiredArgsConstructor
public class CreateUsersWithArrayInputController {

  @ApiOperation(
      value = "Creates list of users with given input array",
      nickname = "createUsersWithArrayInput",
      tags = {
        "user"
      },
      response = Object.class)
  @RequestMapping(
      value = "/user/createWithArray",
      method = RequestMethod.POST,
      consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Object> createUsersWithArrayInput(
      @ApiParam(value = "List of user object", required = true)
      @RequestBody Integer body
  ) {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }
}
