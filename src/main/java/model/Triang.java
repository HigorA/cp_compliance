package model;

public class Triang {

    public String verificaTriangulo(double valor1, double valor2, double valor3) {
        if(valor1 == valor2 && valor1 == valor3 && valor2 == valor3) {
            return "equilatero";
        } else if (valor1 == valor2 || valor2 == valor3) {
            return "isoceles";
        } else if (valor1 != valor2 && valor2 != valor3) {
            return "escaleno";
        }
        return "erro";
    }
}
