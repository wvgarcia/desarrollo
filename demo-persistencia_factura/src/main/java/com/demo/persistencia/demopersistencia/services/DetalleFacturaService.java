package com.demo.persistencia.demopersistencia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.persistencia.demopersistencia.entidades.DetalleFactura;
import com.demo.persistencia.demopersistencia.repositorio.DetalleFacturaRepository;

@Service
public class DetalleFacturaService {

    @Autowired
    private DetalleFacturaRepository detalleFacturaRepository;

    public DetalleFactura guardarDetalleFactura(DetalleFactura detalleFactura) {
        if (detalleFactura == null) {
            throw new IllegalArgumentException("La factura no puede ser nula");
        }
        return detalleFacturaRepository.save(detalleFactura);
    }

    public List<DetalleFactura> obtenerTodosLosDetallesFactura() {
        return detalleFacturaRepository.findAll();
    }

}
