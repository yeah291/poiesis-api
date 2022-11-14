/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyect.poiesisApi.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.proyect.poiesisApi.model.solicitud;
/**
 *
 * @author jesus
 */
@Repository
public interface solicitudRepository extends JpaRepository<solicitud, Long>{
    
}
