package com.portfoliodm.dem.Interface;

import com.portfoliodm.dem.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    
    //Trae una lista de personas
    
    public List<Persona> getPersona();
    
    //guardar un objeto de tipo persona
    
    public void savePErsona(Persona persona);
    
    //eliminar un objeto, lo buscamos por id
    
    public void deletePersona(Long id);
    
    // Buscar una persona por id
    
    public Persona findPersona(Long id);
    
}
