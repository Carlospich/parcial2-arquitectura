package co.edu.unisabana.parcialarquitectura.service;

import co.edu.unisabana.parcialarquitectura.repository.Database;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

class BuyTest {

    private final Buy service = new Buy(new Database());
    @ExtendWith(MockitoExtension.class)
    @InjectMocks
    Buy buy;

    @Test
    public void test() {
        service.makePurchase(2, 3, "Books");
    }

    @Test
    public void Given_codes_When_buyer_code_and_vendor_code_equals_Then_verify_throw_exception() {

    }
}