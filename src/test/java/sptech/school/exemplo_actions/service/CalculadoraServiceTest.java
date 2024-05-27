package sptech.school.exemplo_actions.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sptech.school.exemplo_actions.service.CalculadoraService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraServiceTest {
    @Test
    @DisplayName("Quando acionado com 10 e 2, então deve retornar 5")
    public void testDividir(){
        CalculadoraService calculadoraService = new CalculadoraService();
        double a = 10;
        double b = 2;
        double esperado = 5;

        //Act testando
        double resultado = calculadoraService.dividir(a, b);

        assertEquals(esperado, resultado);
    }
}
