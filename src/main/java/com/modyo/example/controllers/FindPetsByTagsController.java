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
public class FindPetsByTagsController {

  @ApiOperation(
      value = "Finds Pets by tags",
      nickname = "findPetsByTags",
      responseContainer = "List",
      tags = {
        "pet"
      },
      response = Pet.class)
  @RequestMapping(
      value = "/pet/findByTags",
      method = RequestMethod.GET,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<List<Pet>> findPetsByTags(
      @ApiParam(value = "Tags to filter by", required = true)
      @RequestParam(value = "tags") List<String> tags
  ) {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }
}
