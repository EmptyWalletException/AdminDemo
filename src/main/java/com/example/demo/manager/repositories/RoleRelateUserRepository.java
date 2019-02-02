package com.example.demo.manager.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.manager.entity.RoleRelateUser;

@Repository
public interface RoleRelateUserRepository extends JpaRepository<RoleRelateUser,Long> {
}
