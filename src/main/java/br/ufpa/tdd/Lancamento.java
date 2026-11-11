package br.ufpa.tdd;

public class Lancamento {
    String tipo;
    double quantia;
    double valorApos;
    Conta conta;

    public Lancamento(String tipo, double quantia, Conta conta) {
        this.tipo = tipo;
        this.quantia = quantia;
        this.conta = conta;
        if (tipo == "DEPOSITO") {
            this.valorApos = quantia + conta.getSaldo();
        }
        else{
            this.valorApos = conta.getSaldo() - quantia;
        }

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getQuantia() {
        return quantia;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public void setQuantia(double quantia) {
        this.quantia = quantia;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Lancamento{" +
                "tipo='" + tipo + '\'' +
                ", quantia=" + quantia +
                ", valorApos=" + valorApos +
                ", conta=" + conta +
                '}';
    }
}
