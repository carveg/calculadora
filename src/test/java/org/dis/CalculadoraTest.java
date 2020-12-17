package org.dis;

import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    @Test
    public void testSumar(){
        Calculadora cal=new Calculadora();
        double suma=cal.sumar(4,-2);
        assertEquals(2,suma);
    }
    @Test
    public void testRestar(){
        Calculadora cal=new Calculadora();
        double restar=cal.restar(4,-2);
        assertEquals(2,cal.restar(4,-2));
    }
    @Test
    public void testMultiplicar(){
        Calculadora cal=new Calculadora();
        assertEquals(-8,cal.multiplicar(4,-2));
    }
    @Test
    public void testDividir(){
        Calculadora cal=new Calculadora();
        assertEquals(-2,cal.dividir(4,-2));
    }
}
