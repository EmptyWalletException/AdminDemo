package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Message;


@Repository
public interface MessageRepository extends JpaRepository<Message,Long> {
}
