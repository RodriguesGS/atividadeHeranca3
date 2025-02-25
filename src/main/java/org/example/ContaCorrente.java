package org.example;

public class ContaCorrente extends ContaBancaria {
    private double limiteEspecial = 500.0;

    public ContaCorrente(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        try {
            if (valor > (getSaldo() + limiteEspecial))
                throw new IllegalArgumentException("Saldo ultrapassou o limite Especial de R$500,00!!");
            setSaldo(getSaldo() - valor);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
