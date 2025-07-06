package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //TIPOS PRIMITIVOS -> int, short, float, double, char, byte, long, boolean
        int Idade = 60;
        double salarioDouble = 2000.7;
        float salarioFloat = 25000;
        short idadeShor = 10;
        long idadeLong =10000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 65;
        String nome = "Gustavo";

        //String não é um tipo primitivo mas sim uma classe.

        /* Cada variavel acima aceita um total de bytes.

        É possivel forçar uma variavel na outra mesmo que ela nao suporte por exemplo:

        int Idade = (long)1000000000000000000

        Nesse caso a variavel estamos forçando a variavel long na variavel int mesmo que a mesma nao suporte
        porém o nao aparecera o numero inteiro, a variavel ira quebrar o numero.

         */

        System.out.println("A idade é " +Idade+" anos");
        System.out.println(falso);
        System.out.println(verdadeiro);
        System.out.println("A variavel double trabalha com decimais "+salarioDouble);
        System.out.println("Meu nome é "+ nome);

    }
}
