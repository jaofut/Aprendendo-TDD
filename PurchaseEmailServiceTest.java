package br.ufpa.refactoring.q1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PurchaseEmailServiceTest {

    @Test
    void buildEmail_shouldKeepSameOutputAfterRefactor() {
        // TODO: complete asserts para garantir que o texto final não muda após refatorar
        PurchaseEmailService svc = new PurchaseEmailService();

        var purchase = new PurchaseEmailService.Purchase(
                "123",
                "Victor",
                List.of(
                        new PurchaseEmailService.PurchaseItem("Caderno", 2, 15.0),
                        new PurchaseEmailService.PurchaseItem("Caneta", 3, 3.5)
                ),
                false,
                "VIP-20",
                new PurchaseEmailService.Address("Rua A", "10", "Belém", "66000-000")
        );

        String email = svc.buildEmail(purchase);

        assertTrue(email.contains("Olá, Victor"));
        assertTrue(email.contains("Seu pedido #123"));
        assertTrue(email.contains("Caderno"));
        assertTrue(email.contains("Endereço de entrega"));
    }
}
