package com.demo.persistencia.demopersistencia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.persistencia.demopersistencia.entidades.Empleados;
import com.demo.persistencia.demopersistencia.repositorio.EmpleadoRepositorio;



@Service
public class EmpleadoServicio {

    @Autowired
    private EmpleadoRepositorio empleadoRepositorio;

    /**
     * consultar el empleado.
     * 
     * @return
     */
    public List<Empleados> consultarEmpleados() {
        return (List<Empleados>) empleadoRepositorio.findAll();
    }

    /**
     * @param empleado
     * @return el registro del empleado.
     */

    public Empleados registEmpleados(Empleados empleado) {

        System.out.println("Servicio trae" + empleado.toString());
        return empleadoRepositorio.save(empleado);

    }



}
