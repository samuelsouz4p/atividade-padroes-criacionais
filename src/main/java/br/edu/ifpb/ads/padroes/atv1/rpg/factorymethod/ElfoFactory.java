package br.edu.ifpb.ads.padroes.atv1.rpg.factorymethod;

public class ElfoFactory implements RacaFactory{
    @Override
    public int getForca() {
        return 12;
    }

    @Override
    public int getInteligencia() {
        return 14;
    }

    @Override
    public int getAgilidade() {
        return 16;
    }

    @Override
    public int getVida() {
        return 100;
    }

    @Override
    public int getMana() {
        return 60;
    }
}
