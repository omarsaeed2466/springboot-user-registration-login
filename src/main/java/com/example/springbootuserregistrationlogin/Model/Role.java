package com.example.springbootuserregistrationlogin.Model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Set;

@Data
@Entity
@Table(name = "auth_role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "auth_role_id")
    private int id;
    @Column(name = "role_name")
    private String role;

    @Column(name = "role_desc")
    private String desc;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

}
