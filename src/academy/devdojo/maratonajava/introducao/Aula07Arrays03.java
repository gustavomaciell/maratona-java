package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        String [] nomes = new String [3];
        nomes[0]="Goku";
        nomes[1]="Naruto";
        nomes[2]="Sasuke";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
            
        }
    }
}
