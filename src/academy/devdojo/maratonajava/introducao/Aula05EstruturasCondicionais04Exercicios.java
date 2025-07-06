package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04Exercicios {
    public static void main(String[] args) {
        //Utilizando SWITCH e Dado os valores de 1 a 7 imprima se é dia útil ou final de semana considerando 1
        // como domingo.

        int dia = 5;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
        if (dia == 1 || dia == 7) {
            System.out.println("Final de semana");
        } else
            System.out.println("Dia útil");
    }
}
