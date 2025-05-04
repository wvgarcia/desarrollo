package com.demo.persistencia.demopersistencia.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetalleFacturaRequest {

    private Long productoId;
    private Integer cantidad;
    private BigDecimal precioUnitario;

}
