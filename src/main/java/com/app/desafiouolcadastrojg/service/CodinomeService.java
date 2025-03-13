package com.app.desafiouolcadastrojg.service;

import com.app.desafiouolcadastrojg.model.enums.GrupoCodinome;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodinomeService {
    public String gerarCodinome(GrupoCodinome grupoCodinome, List<String> codinomesEmUso) throws Exception {
        var codinomeDisponiveis = listarCodinomesDisponiveis(grupoCodinome, codinomesEmUso);
        if (codinomeDisponiveis.isEmpty())
            throw new Exception("Não há codinomes disponíveis para o grupo "+ grupoCodinome.getNome());

        var codinomeSorteado = sortearCodinome(codinomeDisponiveis);
        return codinomeSorteado;
    }

    private List<String> listarCodinomesDisponiveis(GrupoCodinome grupoCodinome, List<String> codinomesEmUso){
        var codinomes = buscarCodinomes(grupoCodinome);

        var codinomesDisponiveis = codinomes
                .stream()
                .filter(codinome -> !codinomesEmUso.contains(codinome) )
                .toList();
        return codinomesDisponiveis;
    }

    private List<String> buscarCodinomes(GrupoCodinome grupoCodinome){
        var codinomeRepositroy = codinomeRepositoryFactory.create(grupoCodinome);
    }
}
