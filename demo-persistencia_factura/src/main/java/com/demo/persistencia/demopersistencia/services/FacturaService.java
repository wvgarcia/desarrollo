package com.demo.persistencia.demopersistencia.services;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.persistencia.demopersistencia.dto.FacturaDTO;
//import com.demo.persistencia.demopersistencia.entidades.DetalleFactura;
import com.demo.persistencia.demopersistencia.entidades.Factura;
//import com.demo.persistencia.demopersistencia.repositorio.DetalleFacturaRepository;
import com.demo.persistencia.demopersistencia.repositorio.FacturaCustomRepository;

@Service
public class FacturaService {

    @Autowired
    private FacturaCustomRepository facturaRepository;

    public List<FacturaDTO> getFacturasCliente(Long clienteId) {

        System.out.println("LOG-ingresa antes del repositorio");
        List<Object[]> results = facturaRepository.getFacturasCliente(clienteId);

        System.out.println("LOG-ingresa despues del repositorio");

        List<FacturaDTO> facturas = new ArrayList<>();

        for (Object[] row : results) {
            FacturaDTO facturaDTO = new FacturaDTO();
            facturaDTO.setFacturaId((Long) row[0]);
            facturaDTO.setFechaFactura((LocalDate) row[1]);
            facturaDTO.setNombreCliente((String) row[2]);
            facturaDTO.setTotal((BigDecimal) row[3]);
            facturaDTO.setCantidadProducto((int) row[4]);
            facturaDTO.setPrecioUnitario((BigDecimal) row[5]);
            facturas.add(facturaDTO);
        }

        return facturas;
    }

    // @Transactional
    /*
     * public void registrarFactura(Factura factura, List<DetalleFactura> detalles)
     * {
     * 
     * Factura facturaGuardada = facturaRepository.save(factura);
     * for (DetalleFactura detalle : detalles) {
     * detalle.setFactura(facturaGuardada);
     * detalleFacturaRepository.save(detalle);
     * }
     * }
     */

    public Factura guardarFactura(Factura factura) {
        if (factura == null) {
            throw new IllegalArgumentException("La factura no puede ser nula");
        }
        return facturaRepository.save(factura);
    }

    public List<Factura> obtenerTodasLasFacturas() {
        return facturaRepository.findAll();
    }



}
