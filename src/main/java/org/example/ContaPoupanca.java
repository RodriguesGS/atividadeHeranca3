package org.example;

public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        try {
            if (valor > getSaldo())
                throw new IllegalArgumentException("Saldo insuficiente!");
            setSaldo(getSaldo() - valor);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
