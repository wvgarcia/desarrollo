package com.demo.persistencia.demopersistencia.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.demo.persistencia.demopersistencia.entidades.Empleados;

public interface EmpleadoRepositorio extends CrudRepository<Empleados, Long>{

}
