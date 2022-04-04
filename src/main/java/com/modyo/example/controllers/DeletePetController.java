package com.modyo.example.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"pet"})
@RestController
@RequiredArgsConstructor
public class DeletePetController {

  @ApiOperation(
      value = "Deletes a pet",
      nickname = "deletePet",
      tags = {
        "pet"
      },
      response = Object.class)
  @RequestMapping(
      value = "/pet/{petId}",
      method = RequestMethod.DELETE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  @ApiImplicitParams({
      @ApiImplicitParam(
          name = "api_key",
          value = "",
          paramType = "groupedParameters.header",
          dataTypeClass = String.class,
          example = "")
  })
  public ResponseEntity<Object> deletePet(
      @RequestHeader(value = "api_key", required = false) String apiKey,
      @ApiParam(value = "Pet id to delete", required = true)
      @PathVariable(value = "petId") Long petId
  ) {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }
}
