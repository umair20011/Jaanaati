package com.learn.Janati.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table( name = "userRegistration")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Register {

    @Column(name = "userName")
    private String userName;

    @Id
    @Column(name = "Email")
    private String email;

    @Column(name = "Password")
    private String password;

}
