package com.example.API.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "LoginUserInfo")
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false)
    String name;
    @Column(nullable = false)
    String email;
    @Column(nullable = false)
    String password;
    @Column(nullable = false)
    String phone;


    @OneToOne(mappedBy = "userInfo")
    private Login login;
}
