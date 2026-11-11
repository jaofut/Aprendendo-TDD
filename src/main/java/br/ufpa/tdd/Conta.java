package br.ufpa.tdd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Conta {
    String nome;
    double saldo = 0;
    List<String> extrato ;

    public Conta(String nome ,double saldo) {
        this.nome = nome;
        this.saldo = saldo;
        this.extrato = new ArrayList<>();
    }

    public Conta(String nome) {
        this.nome = nome;
        this.extrato = new ArrayList<>();

    }

    public void Deposito(int quantia){
        Lancamento lancamento = new Lancamento("DEPOSITO" , quantia ,Conta.this);
        String registroDeposito =lancamento.toString();
        extrato.add(registroDeposito);
    }

    public void Saque(int quantia){
        Lancamento lancamento = new Lancamento("SAQUE" , quantia,Conta.this);
        String registroSaque = lancamento.toString();
        extrato.add(registroSaque);
    }

    public void getEntradas(){
        for (String lancamento : this.extrato){
            System.out.println(lancamento
            );
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getExtrato() {
        return extrato;
    }

    public void setExtrato(List<String> extrato) {
        this.extrato = extrato;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }




}