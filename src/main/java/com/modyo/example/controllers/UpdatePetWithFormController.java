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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"pet"})
@RestController
@RequiredArgsConstructor
public class UpdatePetWithFormController {

  @ApiOperation(
      value = "Updates a pet in the store with form data",
      nickname = "updatePetWithForm",
      tags = {
        "pet"
      },
      response = Object.class)
  @RequestMapping(
      value = "/pet/{petId}",
      method = RequestMethod.POST,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Object> updatePetWithForm(
      @ApiParam(value = "ID of pet that needs to be updated", required = true)
      @PathVariable(value = "petId") Long petId,
      @ApiParam(value = "Updated name of the pet")
      @RequestParam(value = "name", required = false) String name,
      @ApiParam(value = "Updated status of the pet")
      @RequestParam(value = "status", required = false) String status
  ) {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }
}
