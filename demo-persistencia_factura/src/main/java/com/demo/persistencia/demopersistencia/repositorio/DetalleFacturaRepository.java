package com.demo.persistencia.demopersistencia.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.persistencia.demopersistencia.entidades.DetalleFactura;

public interface DetalleFacturaRepository extends JpaRepository<DetalleFactura,Long>{

}
