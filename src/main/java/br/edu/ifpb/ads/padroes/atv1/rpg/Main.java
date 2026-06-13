package br.edu.ifpb.ads.padroes.atv1.rpg;

import br.edu.ifpb.ads.padroes.atv1.rpg.config.ConfiguracaoJogo;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Singleton
        ConfiguracaoJogo config = ConfiguracaoJogo.getInstance();
        System.out.println("Versão do jogo: " + config.getVersao());

        // Criação do personagem
        Personagem personagem =
                CriadorPersonagem.criarPersonagem(
                        "Legolas",
                        "Elfo",
                        "Arqueiro"
                );

        System.out.println("\nPersonagem criado:");
        System.out.println(personagem);

        System.out.println("\nHabilidades:");
        System.out.println(Arrays.toString(personagem.getHabilidades()));

        // Prototype
        Personagem clone = personagem.clonar();
        clone.setNome("Legolas Clone");

        System.out.println("\nClone:");
        System.out.println(clone);

        // Personagem especial
        Personagem especial =
                CriadorPersonagem.criarPersonagemEspecial(
                        "Legolas",
                        "Elfo",
                        "Arqueiro"
                );

        System.out.println("\nEspecial:");
        System.out.println(especial);
    }
}