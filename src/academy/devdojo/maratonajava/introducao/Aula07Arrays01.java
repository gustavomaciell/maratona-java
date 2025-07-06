package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        /*
        Os ARRAYS são classificados como objeto na memória.

        Eles são utilizados para agrupar variaveis, strings. Quando vamos declarar variaveis elas deixam de ser
        *tipo primitivo* e passam a ser *tipo reference*.

        Sua sintaxe é [].

        As posições dos ARRAYS sempre irao começar com um valor padrão.
         */
        int[] idades = new int[3];
        idades[0] = 12;
        idades[1] = 23;
        idades[2] = 33;

        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
    }
}
