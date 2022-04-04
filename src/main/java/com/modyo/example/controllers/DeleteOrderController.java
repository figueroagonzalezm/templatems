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

@Api(tags = {"store"})
@RestController
@RequiredArgsConstructor
public class DeleteOrderController {

  @ApiOperation(
      value = "Delete purchase order by ID",
      nickname = "deleteOrder",
      tags = {
        "store"
      },
      response = Object.class)
  @RequestMapping(
      value = "/store/order/{orderId}",
      method = RequestMethod.DELETE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Object> deleteOrder(
      @ApiParam(value = "ID of the order that needs to be deleted", required = true)
      @PathVariable(value = "orderId") Long orderId
  ) {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }
}
