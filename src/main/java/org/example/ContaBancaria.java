package org.example;

abstract class ContaBancaria {
    public int numeroConta;
    private String titular;
    public double saldo;

    public ContaBancaria(int numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public double depositar(double valor) {
        return saldo += valor;
    }

    abstract double sacar(double valor);

    public void exibirInformações() {}

}
