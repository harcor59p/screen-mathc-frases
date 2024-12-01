package com.example.aluracursos.screen_mathc_frases.service;

import com.example.aluracursos.screen_mathc_frases.dto.FraseDTO;
import com.example.aluracursos.screen_mathc_frases.model.Frase;
import com.example.aluracursos.screen_mathc_frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {
    @Autowired
    private FraseRepository repository ;
    public FraseDTO obtenerFraseAleatoria() {
        Frase frase =  repository.obtenerFraseAleatoria();
        return new FraseDTO(frase.getTitulo() , frase.getFrase(), frase.getPersonaje() , frase.getPoster()) ;
    }
}
