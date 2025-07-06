package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01Exercicios {
    public static void main(String[] args) {
        //Imprima todos os Números pares de 0 até 1000000

        for (int i = 0; i <= 1000000; i = i + 2) {
            if (i % 2 == 0) {
                System.out.println("Contagem " + i);
            }
        }
    }
}
