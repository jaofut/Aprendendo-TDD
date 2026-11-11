package br.ufpa.tdd;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta("João");
        System.out.println(conta.saldo);
        conta.Deposito(450);
        conta.Deposito(500);
        conta.getEntradas();
        System.out.println(conta.getSaldo());

    }
}