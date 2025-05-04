package com.demo.persistencia.demopersistencia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.persistencia.demopersistencia.dto.EmpleadoDto;
import com.demo.persistencia.demopersistencia.entidades.Empleados;
import com.demo.persistencia.demopersistencia.services.EmpleadoServicio;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") //pruebas locales.
public class EmpleadoController {

    @Autowired
    private EmpleadoServicio servicioEmpleado;

    @GetMapping("/listarEmpleados")
    public List<Empleados> consultarEmpleados() {
        return servicioEmpleado.consultarEmpleados();
    }


    @PostMapping("/registrarEmpleado")
    public Empleados registrarEmpleado(@RequestBody EmpleadoDto empleadoJson) {

        Empleados empleado = new Empleados();

        empleado.setDireccion(empleadoJson.getDireccion());
        empleado.setEdad(empleadoJson.getEdad());
        empleado.setNombreEmpleado(empleadoJson.getNombreEmpleado());
        empleado.setPuesto(empleadoJson.getPuesto());

        System.out.println("valor a persistir " + empleado.toString());

       
        return servicioEmpleado.registEmpleados(empleado);

    }

}
