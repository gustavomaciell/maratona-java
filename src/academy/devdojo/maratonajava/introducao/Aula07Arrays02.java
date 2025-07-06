package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //Valores padrões para variaveis

        //byte, short, long, int, double, float 0
        //char '\000' '
        //boolean false
        //String null

        String[] nomes = new String[3];
        nomes[0] = "Asta";
        nomes[1] = "Yuno";
        nomes[2] = "Goku";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
            
        }

    }
}
