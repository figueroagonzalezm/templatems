package com.modyo.example.controllers.dto;

import com.modyo.ms.commons.core.dtos.Dto;
import lombok.Data;

@Data
public class User extends Dto {

    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private Integer userStatus;

}
