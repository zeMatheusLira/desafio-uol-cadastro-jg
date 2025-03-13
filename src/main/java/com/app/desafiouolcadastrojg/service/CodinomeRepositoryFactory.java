package com.app.desafiouolcadastrojg.service;

import com.app.desafiouolcadastrojg.model.enums.GrupoCodinome;
import org.springframework.stereotype.Component;

@Component
public class CodinomeRepositoryFactory {
    private final LigaDaJusticaRepository ligaDaJusticaRepository;
    private final VingadoresRepository vingadoresRepository;

    public CodinomeRepositoryFactory (LigaDaJusticaRepository ligaDaJusticaRepository, VingadoresRepository vingadoresRepository{
        this.ligaDaJusticaRepository = ligaDaJusticaRepository;
        this.vingadoresRepository = vingadoresRepository;
    }

    public CodinomeRepository create(GrupoCodinome grupoCodinome){
        return switch (grupoCodinome){
            case LIGA_DA_JUSTICA -> ligaDaJusticaRepository;
            case VINGADORES -> vingadoresRepository;
        };
    }
}
