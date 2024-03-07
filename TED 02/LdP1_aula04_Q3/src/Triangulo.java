public class Triangulo {

    private double lado1, lado2, lado3;
    private int x;

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public int getX(){
        return x;
    }

    public void verificacao() {
        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            System.out.println("Os lados formam um triângulo");
            x = 1;
        } else {
            System.out.println("Os lados informados não formam um triângulo.");
            x = 0;
        }
    }

    public void tipoTriangulo() {
        if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
            System.out.println("Triângulo ESCALENO");
        } else if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Triandulo ISÓSCELES");
        } else {
            System.out.println("Triângulo EQUILÁTERO");
        }
    }

}
