package br.edu.ifpb.ads.padroes.atv1.rpg.abstractfactory;

import br.edu.ifpb.ads.padroes.atv1.rpg.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.Armadura;

public interface EquipamentoFactory {

    Arma criarArma();
    Armadura criarArmadura();
}
