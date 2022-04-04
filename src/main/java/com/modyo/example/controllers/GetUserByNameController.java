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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"user"})
@RestController
@RequiredArgsConstructor
public class GetUserByNameController {

  @ApiOperation(
      value = "Get user by user name",
      nickname = "getUserByName",
      tags = {
        "user"
      },
      response = User.class)
  @RequestMapping(
      value = "/user/{username}",
      method = RequestMethod.GET,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<User> getUserByName(
      @ApiParam(value = "The name that needs to be fetched. Use user1 for testing. ", required = true)
      @PathVariable(value = "username") String username
  ) {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }
}
