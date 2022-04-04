package com.modyo.example.controllers;

import com.modyo.example.controllers.dto.Pet;
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

@Api(tags = {"pet"})
@RestController
@RequiredArgsConstructor
public class AddPetController {

  @ApiOperation(
      value = "Add a new pet to the store",
      nickname = "addPet",
      tags = {
        "pet"
      },
      response = Object.class)
  @RequestMapping(
      value = "/pet",
      method = RequestMethod.POST,
      consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Object> addPet(
      @ApiParam(value = "Pet object that needs to be added to the store", required = true)
      @RequestBody Pet body
  ) {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }
}
