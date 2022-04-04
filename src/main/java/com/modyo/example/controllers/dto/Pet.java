package com.modyo.example.controllers.dto;

import com.modyo.ms.commons.core.dtos.Dto;
import java.util.List;
import lombok.Data;

@Data
public class Pet extends Dto {

    private Long id;
    private Category category;
    private String name;
    private List<String> photoUrls;
    private List<Tag> tags;
    private String status;

}
