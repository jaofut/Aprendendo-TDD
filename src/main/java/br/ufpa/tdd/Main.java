package br.ufpa.tdd;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta("João", 150);
        conta.Deposito(450);
        conta.Deposito(500);

        conta.getEntradas();

    }
}