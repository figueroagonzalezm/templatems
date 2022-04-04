package com.modyo.example.controllers;

import com.modyo.example.controllers.dto.ApiResponse;
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
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@Api(tags = {"pet"})
@RestController
@RequiredArgsConstructor
public class UploadFileController {

  @ApiOperation(
      value = "uploads an image",
      nickname = "uploadFile",
      tags = {
        "pet"
      },
      response = ApiResponse.class)
  @RequestMapping(
      value = "/pet/{petId}/uploadImage",
      method = RequestMethod.POST,
      consumes = MediaType.MULTIPART_FORM_DATA_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<ApiResponse> uploadFile(
      @ApiParam(value = "ID of pet to update", required = true)
      @PathVariable(value = "petId") Long petId,
      @ApiParam(value = "Additional data to pass to server")
      @RequestParam(value = "additionalMetadata", required = false) String additionalMetadata,
      @ApiParam(value = "file to upload")
      @RequestPart(value = "file", required = false) MultipartFile file
  ) {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }
}
