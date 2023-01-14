package com.example.springbootuserregistrationlogin.Model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Data
@Table(name = "auth_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "auth_user_id")
    private int id;

    @NotNull(message = "First Name cannot be empty")
    @Column(name = "first_name")
    private String name;

    @NotNull(message = "Last Name cannot be empty")
    @Column(name = "last_name")
    private String lastName;


    @NotNull(message = "Email cannot be empty")
    @Email(message = "Please enter a valid email address")
    @Column(name = "email")
    private String email;

    @NotNull(message = "Password cannot be empty")
    @Length(min = 5, message = "Password should be atleast 5 characters long")
    @Column(name = "password")
    private String password;
    @Column(name = "status")
    private String status;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "auth_user_role",
            joinColumns = {@JoinColumn(name = "auth_user_id")},
            inverseJoinColumns = {@JoinColumn(name = "auth_role_id")} )
    private Set<Role> roles;
}
