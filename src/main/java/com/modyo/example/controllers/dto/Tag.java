package com.modyo.example.controllers.dto;

import com.modyo.ms.commons.core.dtos.Dto;
import lombok.Data;

@Data
public class Tag extends Dto {

    private Long id;
    private String name;

}
