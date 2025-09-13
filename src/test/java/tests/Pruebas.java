package tests;

import tarea2.DobleFactorial;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Pruebas {
    @Test
    @DisplayName("n 1 retorna 1")
    public void testPositivo1() {
        assertEquals(1, DobleFactorial.factorialDoble(1));
    }
    @Test
    @DisplayName("n 2 retorna 2")
    public void testPositivo2() {
        assertEquals(2, DobleFactorial.factorialDoble(2));
    }
    @Test
    @DisplayName("n 3 retorna 6")
    public void testPositivo3() {
        assertEquals(6, DobleFactorial.factorialDoble(3));
    }
    @Test
    @DisplayName("n 4 retorna 24")
    public void testPositivo4() {
        assertEquals(24, DobleFactorial.factorialDoble(4));
    }
    @Test
    @DisplayName("n 5 retorna 120")
    public void testPositivo5() {
        assertEquals(120, DobleFactorial.factorialDoble(5));
    }
    @Test
    @DisplayName("n 6 retorna 720")
    public void testPositivo6() {
        assertEquals(720, DobleFactorial.factorialDoble(6));
    }
    @Test
    @DisplayName("n negativo retorna 0")
    public void testNegativo() {
        assertEquals(1, DobleFactorial.factorialDoble(-1));
    }
}
