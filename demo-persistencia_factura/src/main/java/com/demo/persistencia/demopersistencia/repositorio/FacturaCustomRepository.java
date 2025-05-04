package com.demo.persistencia.demopersistencia.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.demo.persistencia.demopersistencia.entidades.Factura;

public interface FacturaCustomRepository extends JpaRepository<Factura, Long> {

    @Query("SELECT f.facturaId, f.fechaFactura, c.nombre AS nombreCliente, f.total, df.cantidad AS cantidadProducto, df.precioUnitario "
            +
            "FROM Factura f, DetalleFactura df, Cliente c " +
            "WHERE f.facturaId = df.factura.facturaId AND f.cliente.clienteId = c.clienteId AND f.cliente.clienteId = :clienteId")
    List<Object[]> getFacturasCliente(@Param("clienteId") Long clienteId);

}
