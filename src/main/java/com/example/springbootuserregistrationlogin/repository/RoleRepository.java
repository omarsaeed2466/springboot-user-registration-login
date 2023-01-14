package com.example.springbootuserregistrationlogin.repository;

import com.example.springbootuserregistrationlogin.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Integer> {
    public Role findByRole(String role);
}
