package com.github.ozieltrevisan.banco;


public final class ContaEspecial extends ContaInvestimento {


    private double tarifaMesal;
    private double limiteChequeEspecial;

    public ContaEspecial(Titular titular, int agencia, int numero, double tarifaMesal) {
        super(titular, agencia, numero);
        this.tarifaMesal = tarifaMesal;
    }

    public double getTarifaMesal() {
        return tarifaMesal;
    }

    public void setTarifaMesal(double tarifaMesal) {
        this.tarifaMesal = tarifaMesal;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getSaldoDisponovel() {
        return getSaldo() + getLimiteChequeEspecial();
    }

    @Override
    public void imprimirDemontrativo() {
        super.imprimirDemontrativo();
        System.out.printf("Saldo Disponovel: %.2f%n", getSaldoDisponovel());
    }

    protected void ValidarSaldoDisponivel(double valorSaque) {
        if (getSaldoDisponovel() < valorSaque) {
            throw new RuntimeException("Saldo insuficiente para saque ");
        }
    }

    public void debitarTarifaMensal() {
        sacar(getTarifaMesal());
    }

    @Override
    public String toString() {
        return "ContaInvestimento{" +
                "titular=" + getTitular() +
                ", agencia=" + getAgencia() +
                ", numero=" + getNumero() +
                ",ValorTotalInvestimeto=" + getValorTotalRendimentos() +
                ",tarifaMensal=" + tarifaMesal +
                ",chequeEpecial=" + limiteChequeEspecial +
                '}';
    }
}
