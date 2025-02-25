package org.example;

import java.util.Calendar;

public class ContaSalario extends ContaCorrente {
    private int qtdMes = 0;
    private int mesCorrente;

    public ContaSalario(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }



    @Override
    public void sacar(double valor) {
        int mesAtual = Calendar.MONTH;

        if (mesAtual != mesCorrente) {
            qtdMes = 0;
            mesCorrente = mesAtual;
        }

        try {
            double taxa = 0;

            if (qtdMes == 0) {
                qtdMes++;
            } else {
                taxa = 5;
            }

            double total = valor + taxa;

            if (total > getSaldo())
                throw new IllegalArgumentException("Saldo insuficiente!");
            setSaldo(getSaldo() - total);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
