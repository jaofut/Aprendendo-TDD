package br.ufpa.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContaTest {

    @Test
    void novaContaIniciaComSaldo0() {
        Conta acc = new Conta();
        assertEquals(0, acc.getSaldo());
    }
    @Test
    void novaContaIniciaComExtratoVazio() {
        Conta conta1 = new Conta();
        assertEquals(0, conta1.getExtrato().length);

    }
    @Test
    void DepositoAlteraSaldoCorretamente(){
        Conta conta2 = new Conta();
        conta2.Deposito(200);
        conta2.Deposito(300);
        assertEquals(500 , conta2.getSaldo());
    }
    @Test
    void DepositoCriaLancamentoCorretoNoExtrato(){
        Conta conta3 = new Conta();
        conta3.Deposito(150);
        conta3.Deposito(350);
        assertEquals(List.of(150,350) , conta3.getExtrato());

    }
    @Test
    void SaqueAlteraSaldoCorretamente(){
        Conta conta4 = new Conta();
        conta4.Saldo = 300;
        conta4.Saque(100);
        assertEquals(200 , conta4.getSaldo());

    }
    @Test
    void SaqueCriaLancamentoCorretoNoExtrato(){
        Conta conta5 = new Conta();
        conta5.Saldo = 500;
        conta5.Deposito(350);
        assertEquals(350 , conta5.getExtrato());

    }

}