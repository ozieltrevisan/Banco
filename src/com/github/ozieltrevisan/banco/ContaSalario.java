package com.github.ozieltrevisan.banco;

public class ContaSalario extends Conta {

    private double salarioMensal;

    public ContaSalario(Titular titular, int agencia, int numero) {
        super(titular, agencia, numero);
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
}
