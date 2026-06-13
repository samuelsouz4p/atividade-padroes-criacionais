package br.edu.ifpb.ads.padroes.atv1.rpg.factorymethod;

public class HumanoFactory implements  RacaFactory{
    @Override
    public int getForca() {
        return 15;
    }

    @Override
    public int getInteligencia() {
        return 8;
    }

    @Override
    public int getAgilidade() {
        return 10;
    }

    @Override
    public int getVida() {
        return 120;
    }

    @Override
    public int getMana() {
        return 30;
    }
}
