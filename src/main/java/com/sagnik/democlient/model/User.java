package com.sagnik.democlient.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class User {
    @Id
    private String userId;

    private String name;
    private String email;
    private String mobileNo;
    private String designation;
    private String address;
    private String password;

    private String managerId;

}
