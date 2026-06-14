package br.edu.ifpb.ads.padroes.atv2.gateway;

import br.edu.ifpb.ads.padroes.atv2.sdk.PagSeguroSDK;
import br.edu.ifpb.ads.padroes.atv2.sdk.StripeSDK;
import com.google.inject.Inject;

public class PagSeguroGateway implements PagamentoGateway {

    private final PagSeguroSDK sdk;

    @Inject
    public PagSeguroGateway (PagSeguroSDK sdk){
        this.sdk = sdk;
    }

    @Override
    public void pagar(double valor){
        sdk.efetuarpagamento(valor);
    }
}
