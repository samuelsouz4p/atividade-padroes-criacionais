package br.edu.ifpb.ads.padroes.atv1.rpg.builder;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;
import br.edu.ifpb.ads.padroes.atv1.rpg.Personagem;

public class PersonagemBuilder {

    private String nome;
    private String raca;
    private String classe;
    private int forca;
    private int inteligencia;
    private int agilidade;
    private int vida;
    private int mana;
    private Arma arma;
    private Armadura armadura;
    private String[] habilidades;

    public PersonagemBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public PersonagemBuilder raca(String raca) {
        this.raca = raca;
        return this;
    }

    public PersonagemBuilder classe(String classe) {
        this.classe = classe;
        return this;
    }

    public PersonagemBuilder forca(int forca) {
        this.forca = forca;
        return this;
    }

    public PersonagemBuilder inteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
        return this;
    }

    public PersonagemBuilder agilidade(int agilidade) {
        this.agilidade = agilidade;
        return this;
    }

    public PersonagemBuilder vida(int vida) {
        this.vida = vida;
        return this;
    }

    public PersonagemBuilder mana(int mana) {
        this.mana = mana;
        return this;
    }

    public PersonagemBuilder arma(Arma arma) {
        this.arma = arma;
        return this;
    }

    public PersonagemBuilder armadura(Armadura armadura) {
        this.armadura = armadura;
        return this;
    }

    public PersonagemBuilder habilidades(String[] habilidades) {
        this.habilidades = habilidades;
        return this;
    }

    public Personagem build() {
        return new Personagem(
                nome,
                raca,
                classe,
                forca,
                inteligencia,
                agilidade,
                vida,
                mana,
                arma,
                armadura,
                habilidades
        );
    }
}
