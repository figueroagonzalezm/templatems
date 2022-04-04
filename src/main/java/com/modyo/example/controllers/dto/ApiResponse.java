package com.modyo.example.controllers.dto;

import com.modyo.ms.commons.core.dtos.Dto;
import lombok.Data;

@Data
public class ApiResponse extends Dto {

    private Integer code;
    private String type;
    private String message;

}
