package br.edu.ifpb.ads.padroes.atv2;

import br.edu.ifpb.ads.padroes.atv2.config.PagSeguroModule;
import br.edu.ifpb.ads.padroes.atv2.config.PayPalModule;
import br.edu.ifpb.ads.padroes.atv2.config.StripeModule;
import br.edu.ifpb.ads.padroes.atv2.service.PagamentoService;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== E-COMMERCE ===");
        System.out.println("Produto: Notebook Gamer");
        System.out.println("Valor: R$ 4500.00");
        System.out.println();

        System.out.println("Cliente 1 escolheu PayPal:");

        Injector paypalInjector =
                Guice.createInjector(new PayPalModule());

        PagamentoService paypalService =
                paypalInjector.getInstance(PagamentoService.class);

        paypalService.pagar(4500.00);

        System.out.println("Cliente 2 escolheu Stripe:");

        Injector stripeInjector =
                Guice.createInjector(new StripeModule());

        PagamentoService stripeService =
                stripeInjector.getInstance(PagamentoService.class);

        stripeService.pagar(4500.00);

        System.out.println("Cliente 3 escolheu PagSeguro:");

        Injector pagSeguroInjector =
                Guice.createInjector(new PagSeguroModule());

        PagamentoService pagSeguroService =
                pagSeguroInjector.getInstance(PagamentoService.class);

        pagSeguroService.pagar(4500.00);
    }
}