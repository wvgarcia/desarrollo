package com.demo.persistencia.demopersistencia.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FacturaDTO {

    private Long facturaId;
    private LocalDate fechaFactura;
    private String nombreCliente;
    private BigDecimal total;
    private int cantidadProducto;
    private BigDecimal precioUnitario;

}
