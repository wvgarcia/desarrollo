package com.demo.persistencia.demopersistencia.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpleadoDto {


    
    private String nombreEmpleado;
    private String direccion;
    private Integer edad;
    private String puesto;
    

}
