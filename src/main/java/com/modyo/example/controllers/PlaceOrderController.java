package com.modyo.example.controllers;

import com.modyo.example.controllers.dto.Order;
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

@Api(tags = {"store"})
@RestController
@RequiredArgsConstructor
public class PlaceOrderController {

  @ApiOperation(
      value = "Place an order for a pet",
      nickname = "placeOrder",
      tags = {
        "store"
      },
      response = Order.class)
  @RequestMapping(
      value = "/store/order",
      method = RequestMethod.POST,
      consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Order> placeOrder(
      @ApiParam(value = "order placed for purchasing the pet", required = true)
      @RequestBody Order body
  ) {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }
}
