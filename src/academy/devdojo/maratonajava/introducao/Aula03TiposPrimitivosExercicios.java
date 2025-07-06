package academy.devdojo.maratonajava.introducao;

public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        /*
        Exercicio:
        Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

        Eu <nome>, morando no endereço <endereço>,
        confirmo que recebi o salário de <salário>, na data <data>.
         */

        String nome = "Gustavo";
        String endereco = "Rua Canarinho";
        double salario = 1850.30;
        int dia = 2;
        int mes = 7;
        int ano = 2025;

        System.out.println("Eu "+nome+",morando no endereço "+endereco+",");
        System.out.print("confirmo que recebi o salário de "+salario+", na data "+dia+"/"+mes+"/"+ano);

    }
}
