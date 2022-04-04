package com.modyo.example.controllers;

import com.modyo.example.controllers.dto.Order;
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
public class GetOrderByIdController {

  @ApiOperation(
      value = "Find purchase order by ID",
      nickname = "getOrderById",
      tags = {
        "store"
      },
      response = Order.class)
  @RequestMapping(
      value = "/store/order/{orderId}",
      method = RequestMethod.GET,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Order> getOrderById(
      @ApiParam(value = "ID of pet that needs to be fetched", required = true)
      @PathVariable(value = "orderId") Long orderId
  ) {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }
}
