package model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrianguloTeste {

    private Triang triang = new Triang();


    @Test
    public void isoceles() {
//        2 Lados iguais
        double valor1 = 2;
        double valor2 = 2;
        double valor3 = 3;
        String resultado = triang.verificaTriangulo(valor1, valor2, valor3);
        assertEquals("isoceles", resultado);
    }

    @Test
    public void escaleno() {
//        Lados distintos
        double valor1 = 1;
        double valor2 = 2;
        double valor3 = 3;
        String resultado = triang.verificaTriangulo(valor1, valor2, valor3);
        assertEquals("escaleno", resultado);
    }

    @Test
    public void equilatero() {
//        Lados iguais
        double valor1 = 2;
        double valor2 = 2;
        double valor3 = 2;
        String resultado = triang.verificaTriangulo(valor1, valor2, valor3);
        assertEquals("equilatero", resultado);
    }
}
