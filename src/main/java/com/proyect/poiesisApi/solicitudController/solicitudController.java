/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyect.poiesisApi.solicitudController;

import com.proyect.poiesisApi.model.solicitud;
import com.proyect.poiesisApi.repository.solicitudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author jesus
 */

@RestController
@RequestMapping("/api")
public class solicitudController {
    
    @Autowired
    private solicitudRepository rep;
    
    @GetMapping("/lista")
    public List<solicitud> listar(){
        return rep.findAll();
    }
    
    @GetMapping("/buscar/{id}")
    public Optional<solicitud> busarPorId(@PathVariable("id") Long id){
        return rep.findById(id);
    }
    
    @PostMapping("/registrar")
    public solicitud crearSolicitud(@RequestBody solicitud s){
        return rep.save(s);
    }
}
