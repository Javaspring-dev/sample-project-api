package com.example.carbooking.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "User")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerid;
    private int contactnumber;
    private String emailaddress;
    private String name;


}
