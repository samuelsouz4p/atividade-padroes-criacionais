package br.edu.ifpb.ads.padroes.atv1.rpg;

import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.ArqueiroFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.EquipamentoFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.GuerreiroFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory.MagoFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.builder.PersonagemBuilder;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorymethod.ElfoFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorymethod.HumanoFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorymethod.OrcFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.factorymethod.RacaFactory;

public class CriadorPersonagem {

    public static Personagem criarPersonagem(String nome, String raca, String classe) {

        RacaFactory racaFactory;
        EquipamentoFactory equipamentoFactory;

        switch (raca.toLowerCase()) {
            case "humano":
                racaFactory = new HumanoFactory();
                break;
            case "elfo":
                racaFactory = new ElfoFactory();
                break;
            case "orc":
                racaFactory = new OrcFactory();
                break;
            default:
                return null;
        }

        switch (classe.toLowerCase()) {
            case "guerreiro":
                equipamentoFactory = new GuerreiroFactory();
                break;
            case "mago":
                equipamentoFactory = new MagoFactory();
                break;
            case "arqueiro":
                equipamentoFactory = new ArqueiroFactory();
                break;
            default:
                return null;
        }

        return new PersonagemBuilder()
                .nome(nome)
                .raca(raca)
                .classe(classe)
                .forca(racaFactory.getForca())
                .inteligencia(racaFactory.getInteligencia())
                .agilidade(racaFactory.getAgilidade())
                .vida(racaFactory.getVida())
                .mana(racaFactory.getMana())
                .arma(equipamentoFactory.criarArma())
                .armadura(equipamentoFactory.criarArmadura())
                .habilidades(obterHabilidades(raca, classe))                .build();
    }

    public static Personagem criarPersonagemEspecial(String nome, String raca, String classe) {

        Personagem personagem = criarPersonagem(nome, raca, classe);

        if (personagem != null) {
            Personagem clone = personagem.clonar();
            clone.setNome(nome + " Lendário");
            return clone;
        }

        return null;
    }
    private static String[] obterHabilidades(String raca, String classe) {

        if (raca.equalsIgnoreCase("Humano")
                && classe.equalsIgnoreCase("Guerreiro")) {
            return new String[]{"Investida", "Bloqueio"};
        }

        if (raca.equalsIgnoreCase("Humano")
                && classe.equalsIgnoreCase("Mago")) {
            return new String[]{"Bola de Fogo", "Cura"};
        }

        if (raca.equalsIgnoreCase("Humano")
                && classe.equalsIgnoreCase("Arqueiro")) {
            return new String[]{"Tiro Certeiro", "Chuva de Flechas"};
        }

        if (raca.equalsIgnoreCase("Elfo")
                && classe.equalsIgnoreCase("Guerreiro")) {
            return new String[]{"Dança das Lâminas", "Agilidade Élfica"};
        }

        if (raca.equalsIgnoreCase("Elfo")
                && classe.equalsIgnoreCase("Mago")) {
            return new String[]{"Magia da Natureza", "Teleporte"};
        }

        if (raca.equalsIgnoreCase("Elfo")
                && classe.equalsIgnoreCase("Arqueiro")) {
            return new String[]{"Tiro Múltiplo", "Camuflagem"};
        }

        if (raca.equalsIgnoreCase("Orc")
                && classe.equalsIgnoreCase("Guerreiro")) {
            return new String[]{"Fúria", "Pancada Devastadora"};
        }

        if (raca.equalsIgnoreCase("Orc")
                && classe.equalsIgnoreCase("Mago")) {
            return new String[]{"Magia Sombria", "Invocação"};
        }

        if (raca.equalsIgnoreCase("Orc")
                && classe.equalsIgnoreCase("Arqueiro")) {
            return new String[]{"Tiro Brutal", "Intimidação"};
        }

        return new String[]{"Habilidade Básica"};
    }
}