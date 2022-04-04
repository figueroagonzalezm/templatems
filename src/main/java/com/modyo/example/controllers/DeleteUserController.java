package com.modyo.example.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"user"})
@RestController
@RequiredArgsConstructor
public class DeleteUserController {

  @ApiOperation(
      value = "Delete user",
      nickname = "deleteUser",
      tags = {
        "user"
      },
      response = Object.class)
  @RequestMapping(
      value = "/user/{username}",
      method = RequestMethod.DELETE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Object> deleteUser(
      @ApiParam(value = "The name that needs to be deleted", required = true)
      @PathVariable(value = "username") String username
  ) {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }
}
