package br.edu.ifpb.ads.padroes.atv2.config;

import br.edu.ifpb.ads.padroes.atv2.gateway.PagamentoGateway;
import br.edu.ifpb.ads.padroes.atv2.gateway.PagSeguroGateway;
import com.google.inject.AbstractModule;

public class PagSeguroModule extends AbstractModule{

    @Override
    protected void configure(){
        bind(PagamentoGateway.class).to(PagSeguroGateway.class);
    }
}
