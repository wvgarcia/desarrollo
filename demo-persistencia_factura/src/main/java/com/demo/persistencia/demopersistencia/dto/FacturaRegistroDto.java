package com.demo.persistencia.demopersistencia.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FacturaRegistroDto {

    private LocalDate fechaFactura;
    private Integer clienteId;
    private BigDecimal total;

}
