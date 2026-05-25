package com.aerolinea.Aerolinea.controller;

import com.aerolinea.Aerolinea.model.Vuelo;
import com.aerolinea.Aerolinea.service.VueloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vuelos")
public class VueloController {

    private final VueloService vueloService;

    public VueloController(VueloService vueloService) {
        this.vueloService = vueloService;
    }
    @GetMapping
    public List<Vuelo> obtenerTodos() {
        return vueloService.findAll();
    }
}
