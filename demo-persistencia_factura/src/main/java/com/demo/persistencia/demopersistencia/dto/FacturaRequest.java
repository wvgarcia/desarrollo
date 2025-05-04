package com.demo.persistencia.demopersistencia.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class FacturaRequest {

    private LocalDate fechaFactura;
    private Long clienteId;
    private BigDecimal total;
    private List<DetalleFacturaRequest> detalles;

}
