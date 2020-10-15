package com.example.demo.dao;

import com.example.demo.model.Empleo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleoDAO extends JpaRepository<Empleo, Integer> {

}
