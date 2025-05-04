package com.demo.persistencia.demopersistencia.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;


import com.demo.persistencia.demopersistencia.entidades.Producto;


public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
