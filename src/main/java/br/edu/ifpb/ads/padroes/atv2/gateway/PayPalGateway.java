package br.edu.ifpb.ads.padroes.atv2.gateway;

import br.edu.ifpb.ads.padroes.atv2.sdk.PayPalSDK;
import com.google.inject.Inject;

public class PayPalGateway implements PagamentoGateway {

    private final PayPalSDK sdk;

    @Inject
    public PayPalGateway(PayPalSDK sdk){
        this.sdk = sdk;
    }
    @Override
    public void pagar(double valor){
        sdk.realizarpagamento(valor);
    }
}
