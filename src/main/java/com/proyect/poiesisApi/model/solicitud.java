/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyect.poiesisApi.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

/**
 *
 * @author jesus
 */

@Data
@Entity
@Table(name="tb_solicitud")
public class solicitud implements Serializable{
     private static final long serialVersionUID = 1l;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_soli;
    
    @NotEmpty
    private String asunto_soli;
    @NotEmpty
    private String nombre;
    
    @NotEmpty
    private String apellido;
    
    @NotEmpty
    private Long id_tipo_servicio;
    
    @NotEmpty
    private String detalle_servicio;
    
    @NotEmpty
    private Long id_estado;
    
    @Override
    public String toString(){
        return "solicitud [id_soli=" + id_soli + ", asunto_soli=" + asunto_soli + ", nombre=" + nombre + ", apellido=" + apellido + ", id_tipo_servicio=" + id_tipo_servicio+ ", detalle_servicio=" + detalle_servicio+ ", id_estado=" + id_estado + "]";
    }
    
}
