package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionaisExercicios {
    public static void main(String[] args) {
        //Dado um determinado salario anual qual o valor de imposto terei que pagar

        /*
        € 0	€ 34.712	9,70%
        € 34.713	€ 68.507	37,35%
        € 68.508		49,50%
         */
        double salarioAnual = 70000;
        double primeiraFaixa = 9.70/100;
        double segundaFaixa = 37.35/100;
        double terceiraFaixa = 49.50/100;
        double valorImposto;

        if (salarioAnual <= 34712){
            valorImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            valorImposto = salarioAnual * segundaFaixa;
        }else {
            valorImposto = salarioAnual * terceiraFaixa;
        }

        System.out.println("O valor pago sera de "+valorImposto);
    }
}
