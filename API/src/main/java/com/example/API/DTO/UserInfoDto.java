package com.example.API.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoDto {

    private String username;
    private String password;
    private String email;
    private String phone;
    private String address;

}
