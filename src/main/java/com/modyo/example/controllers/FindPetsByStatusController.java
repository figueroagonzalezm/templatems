package com.modyo.example.controllers;

import com.modyo.example.controllers.dto.Pet;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"pet"})
@RestController
@RequiredArgsConstructor
public class FindPetsByStatusController {

  @ApiOperation(
      value = "Finds Pets by status",
      nickname = "findPetsByStatus",
      responseContainer = "List",
      tags = {
        "pet"
      },
      response = Pet.class)
  @RequestMapping(
      value = "/pet/findByStatus",
      method = RequestMethod.GET,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<List<Pet>> findPetsByStatus(
      @ApiParam(value = "Status values that need to be considered for filter", required = true)
      @RequestParam(value = "status") List<String> status
  ) {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }
}
