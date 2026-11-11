package br.ufpa.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    @Test
    void novaContaIniciaComSaldo0() {
        Conta acc = new Conta("João");
        assertEquals(0, acc.getSaldo());
    }
    @Test
    void novaContaIniciaComExtratoVazio() {
        Conta conta1 = new Conta("João");
        assertNull(conta1.getExtrato());

    }
    @Test
    void DepositoAlteraSaldoCorretamente(){
        Conta conta2 = new Conta("João");
        conta2.Deposito(200);
        conta2.Deposito(300);
        assertEquals(500 , conta2.getSaldo());
    }
    @Test
    void DepositoCriaLancamentoCorretoNoExtrato(){
        Conta conta3 = new Conta("João");
        conta3.Deposito(150);
        assertTrue(conta3.getExtrato().contains("Lancamento{tipo='DEPOSITO', quantia=150.0, valorApos=150.0}"));

    }
    @Test
    void SaqueAlteraSaldoCorretamente(){
        Conta conta4 = new Conta("João");
        conta4.saldo = 300;
        conta4.Saque(100);
        assertEquals(200 , conta4.getSaldo());

    }
    @Test
    void SaqueCriaLancamentoCorretoNoExtrato(){
        Conta conta5 = new Conta("João");
        conta5.saldo = 500;
        conta5.Saque(350);
        assertTrue(conta5.getExtrato().contains("Lancamento{tipo='SAQUE', quantia=350.0, valorApos=150.0}"));

    }

}