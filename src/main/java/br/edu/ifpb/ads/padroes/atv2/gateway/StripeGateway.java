package br.edu.ifpb.ads.padroes.atv2.gateway;

import br.edu.ifpb.ads.padroes.atv2.sdk.StripeSDK;
import com.google.inject.Inject;

public class StripeGateway implements PagamentoGateway{

    private final StripeSDK sdk;

    @Inject
    public StripeGateway(StripeSDK sdk){
        this.sdk = sdk;
    }

    @Override
    public void pagar (double valor){
        sdk.charge(valor);
    }
}
