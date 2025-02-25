package org.example;

public class ContaCorrente extends ContaBancaria {
    public ContaCorrente(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    private double limiteEspecial = 500.0;

    public double sacar(double valor) {
        if(saldo < 0)
            saldo = limiteEspecial;
        return saldo - valor;
    }

}
