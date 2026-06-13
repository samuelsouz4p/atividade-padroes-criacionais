package br.edu.ifpb.ads.padroes.atv1.rpg.factorymethod;

public class OrcFactory implements RacaFactory {

    @Override
    public int getForca() {
        return 20;
    }

    @Override
    public int getInteligencia() {
        return 6;
    }

    @Override
    public int getAgilidade() {
        return 8;
    }

    @Override
    public int getVida() {
        return 150;
    }

    @Override
    public int getMana() {
        return 20;
    }
}
