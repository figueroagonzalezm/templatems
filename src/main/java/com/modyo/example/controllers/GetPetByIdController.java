package com.modyo.example.controllers;

import com.modyo.example.controllers.dto.Pet;
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

@Api(tags = {"pet"})
@RestController
@RequiredArgsConstructor
public class GetPetByIdController {

  @ApiOperation(
      value = "Find pet by ID",
      nickname = "getPetById",
      tags = {
        "pet"
      },
      response = Pet.class)
  @RequestMapping(
      value = "/pet/{petId}",
      method = RequestMethod.GET,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Pet> getPetById(
      @ApiParam(value = "ID of pet to return", required = true)
      @PathVariable(value = "petId") Long petId
  ) {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }
}
