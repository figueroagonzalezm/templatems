package com.modyo.example.controllers;

import com.modyo.example.controllers.dto.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"user"})
@RestController
@RequiredArgsConstructor
public class UpdateUserController {

  @ApiOperation(
      value = "Updated user",
      nickname = "updateUser",
      tags = {
        "user"
      },
      response = Object.class)
  @RequestMapping(
      value = "/user/{username}",
      method = RequestMethod.PUT,
      consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Object> updateUser(
      @ApiParam(value = "name that need to be updated", required = true)
      @PathVariable(value = "username") String username,
      @ApiParam(value = "Updated user object", required = true)
      @RequestBody User body
  ) {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }
}
