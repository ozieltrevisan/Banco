package com.github.ozieltrevisan.banco;

public class ContaInvestimento extends Conta {

    private double valorTotalRendimentos;

    public ContaInvestimento(Titular titular, int agencia, int numero) {
        super(titular, agencia, numero);
    }

    public double getValorTotalRendimentos() {
        return valorTotalRendimentos;
    }

    @Override
    boolean possuiGratuidadeImpressao() {
        return getValorTotalRendimentos() > 0;
    }

    public void creditarRendimento(double percentualJuros) {
        double valorRedimentos = getSaldo() * percentualJuros / 100;
        this.valorTotalRendimentos += valorRedimentos;
        depositar(valorRedimentos);
    }

    @Override
    public String toString() {
        return "ContaInvestimento{" +
                "titular=" + getTitular() +
                ", agencia=" + getAgencia() +
                ", numero=" + getNumero() +
                ",ValorTotalInvestimeto=" + valorTotalRendimentos +
                '}';
    }
}
