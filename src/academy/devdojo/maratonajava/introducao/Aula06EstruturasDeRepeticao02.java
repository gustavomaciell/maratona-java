package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        //Imprima os 25 primeiro números de um dado valor, por exemplo: 50.

        int valorMax = 50;
        for (int i = 0; i < valorMax ; i++) {
            if (i > 25) {
                break;

            }
            System.out.println(i);
        }
    }
}
