package com.portfoliodm.dem.Service;

import com.portfoliodm.dem.Entity.Persona;
import com.portfoliodm.dem.Interface.IPersonaService;
import com.portfoliodm.dem.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{

    
    @Autowired IPersonaRepository ipersonaRepository; 
    
    @Override
    public List<Persona> getPersona() {
       List<Persona> persona = ipersonaRepository.findAll();
       return persona;
    }

    @Override
    public void savePErsona(Persona persona) {
       ipersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona =ipersonaRepository.findById(id).orElse(null);
        return persona;
        
    }
    
}
