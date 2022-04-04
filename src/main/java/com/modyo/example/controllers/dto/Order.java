package com.modyo.example.controllers.dto;

import com.modyo.ms.commons.core.dtos.Dto;
import java.util.Date;
import lombok.Data;

@Data
public class Order extends Dto {

    private Long id;
    private Long petId;
    private Integer quantity;
    private Date shipDate;
    private String status;
    private Boolean complete;

}
