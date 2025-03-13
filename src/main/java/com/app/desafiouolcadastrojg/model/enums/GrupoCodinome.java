package com.app.desafiouolcadastrojg.model.enums;

public enum GrupoCodinome {
    VINGADORES
            ("Vingadores","https://raw.githubusercontent.com/uolhost/test-backEnd-Java/master/referencias/vingadores.json"  ),
    LIGA_DA_JUSTICA
            ("Liga da justiça", "https://raw.githubusercontent.com/uolhost/test-backEnd-Java/master/referencias/liga_da_justica.xml");


    GrupoCodinome(String nome, String uri){
        this.nome = nome;
        this.uri = uri;
    }

    private final String nome;
    private final String uri;

    public String getNome() {
        return nome;
    }
    public String getUri() {
        return uri;
    }

}
