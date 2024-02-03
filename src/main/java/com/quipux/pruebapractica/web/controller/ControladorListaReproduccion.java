package com.quipux.pruebapractica.web.controller;

import com.quipux.pruebapractica.dominio.dto.PeticionListaReproduccionDto;
import com.quipux.pruebapractica.dominio.dto.RespuestaListaReproduccionDto;
import com.quipux.pruebapractica.dominio.service.ServicioListaReproduccion;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class ControladorListaReproduccion {

    private final ServicioListaReproduccion servicio;

    public ControladorListaReproduccion(ServicioListaReproduccion servicio) {
        this.servicio = servicio;
    }

    @GetMapping("")
    public ResponseEntity<List<RespuestaListaReproduccionDto>> obtenerListasReproduccion(){
        return ResponseEntity.ok(servicio.obtenerListasReproduccion());
    }

    @GetMapping("/{listName}")
    RespuestaListaReproduccionDto obtenerListaReproduccionPorNombre(@PathVariable("listName") String nombre){
        return servicio.obtenerListaReproduccionPorNombre(nombre);
    }

    @PostMapping("")
    public ResponseEntity<RespuestaListaReproduccionDto> guardarListaReproduccion(@RequestBody PeticionListaReproduccionDto dto){
        return ResponseEntity.ok(servicio.guardarListaReproduccion(dto));
    }

//    void eliminarListaReproduccion(String nombre){
//        servicio.eliminarListaReproduccion(nombre);
//    }
}
