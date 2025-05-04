package com.demo.persistencia.demopersistencia.entidades;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "facturas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "factura_id")
    private Long facturaId;

    @Column(name = "fecha_factura")
    private LocalDate fechaFactura;

     
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    
    /* 
    @Column(name = "cliente_id")
    private Long clienteId;
    */
    @Column(name = "total")
    private BigDecimal total;
    
    @OneToMany(mappedBy = "factura")
    private List<DetalleFactura> detalles;
    
}
