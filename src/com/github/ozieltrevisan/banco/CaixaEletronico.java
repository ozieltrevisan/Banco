package com.github.ozieltrevisan.banco;

public class CaixaEletronico {

    public static final double TARIFA_TRASFERENCIA = 10;
    public static final double TARIFA_IMPRESSAO_DEMONSTRATIVO = 5;

    public void transferir(Conta contaOrigem, Conta contaDestino,double valorTranferencia){
        System.out.printf("Transferido R$%.2f da conta %d/%d para %d/%d",valorTranferencia,contaOrigem.getAgencia(),
                contaOrigem.getNumero(),contaDestino.getAgencia(),contaDestino.getNumero());

        contaOrigem.sacar(valorTranferencia + TARIFA_TRASFERENCIA);
        contaDestino.depositar(valorTranferencia);

    }
    public void imprimirDemonstrativo(Conta conta){
        if (conta instanceof ContaInvestimento contaInvestimento
                && contaInvestimento.getValorTotalRendimentos() > 0 ) {
//            ContaInvestimento contaInvestimento = (ContaInvestimento) conta;

             System.out.println("Impressao gratuita");
        }else {
            debitarTarifaImpressaoDemonstrativo(conta);
        }
        conta.imprimirDemontrativo();
    }

    private static void debitarTarifaImpressaoDemonstrativo(Conta conta) {
        System.out.printf("Custo imprenssao: R$%.2f",TARIFA_IMPRESSAO_DEMONSTRATIVO);
        conta.sacar(TARIFA_IMPRESSAO_DEMONSTRATIVO);
    }
}
