package com.demo.persistencia.demopersistencia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.persistencia.demopersistencia.entidades.DetalleFactura;
import com.demo.persistencia.demopersistencia.services.DetalleFacturaService;

@RestController
@RequestMapping("/api")
public class DetalleFacturaController {

    @Autowired
    private DetalleFacturaService detalleFacturaService;

    @PostMapping("/crearDetalleFactura")
    public ResponseEntity<DetalleFactura> crearDetalleFactura(@RequestBody DetalleFactura detalleFactura) {
        DetalleFactura detalleFacturaGuardado = detalleFacturaService.guardarDetalleFactura(detalleFactura);
        return ResponseEntity.status(HttpStatus.CREATED).body(detalleFacturaGuardado);
    }

}
