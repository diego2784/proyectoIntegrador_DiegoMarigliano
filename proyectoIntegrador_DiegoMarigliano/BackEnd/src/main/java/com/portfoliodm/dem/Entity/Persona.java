package com.portfoliodm.dem.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY )
    private Long id;
    
    
    @NotNull
    @Size(min = 1, max = 50, message = "Ingresar nombre valido")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 50, message = "Ingresar Apellido valido")
    private String apellido;
    
   
    @Size(min = 1, max = 50, message = "Ingresar imagen valido")
    private String img;
}
