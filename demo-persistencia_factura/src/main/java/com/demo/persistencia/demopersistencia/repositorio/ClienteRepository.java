package com.demo.persistencia.demopersistencia.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.persistencia.demopersistencia.entidades.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
