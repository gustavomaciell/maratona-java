package academy.devdojo.maratonajava.introducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(50 - 27);
    }

    public void multiplicaDoisNumeros(int num, int num2) {
        System.out.println(num * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {

        if (num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }

    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 100;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);


    }
}
