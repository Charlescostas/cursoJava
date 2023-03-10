package com.charles.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.charles.cursojava.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{
}
