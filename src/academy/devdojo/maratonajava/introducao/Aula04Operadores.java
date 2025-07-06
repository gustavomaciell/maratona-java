package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {

        //Operadores Aritmeticos
        // + - * /

        int soma = 1 + 1;
        int subtracao = 4 - 1;
        int multiplicacao = 3 * 5;
        double divisao = 4 / 2;

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);

        // Operadores Relacionais
        // < > <= >= == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10.0;
        boolean isDezDiferenteDez = 10 != 10.0;

        System.out.println("10 é maior que 20 "+isDezMaiorQueVinte);
        System.out.println("10 é menor que 20 "+isDezMenorQueVinte);
        System.out.println("10 é igual a 20 "+ isDezIgualVinte);
        System.out.println("10 é igual a 10.0 "+ isDezIgualDez);
        System.out.println("10 é diferente de 10.0 "+isDezDiferenteDez);

        //OPERADORES LOGICOS
        // && (AND)  || (OR)
        //Exemplo1: && (AND)

        int idade = 30;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4800;
        boolean isDentroDaLeMenorQueTrinta = idade <= 30  && salario >= 3500;

        System.out.println("Esta dentro da lei maior que trinta "+ isDentroDaLeiMaiorQueTrinta);
        System.out.println("Esta dentro da lei menor que trinta "+ isDentroDaLeMenorQueTrinta);

        // Exemplo2: || (OR)

        double valorContaCorrente = 300;
        double valorContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean playstationCompravel = valorContaCorrente >= valorPlaystation || valorContaPoupanca >= valorPlaystation;

        System.out.println("Posso comprar o playstation? "+ playstationCompravel);

        /*
        Operadores de atribuição:
        =  +=  -=  *=  /=  %=

         */

        double bonus = 1800; // 1800
        bonus +=1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        bonus /= 2; // 1800
        bonus %= 2;
        System.out.println(bonus);

        //++ --
        /*
        Podemos usar os ++ ou -- para acrenscentar ou subtrair 1
        EX
                 */

        int contador = 0;
        contador++; // 1
        contador--; //0
        System.out.println(contador);

        /*
        Podemos usar os mesmos sinais antes ou depois da variavel.
        EX:
         */

        int contador2 = 0;
        System.out.println(++contador2); // Primeiro é executado o comando depois é impresso o resultado

        int contador3 = 0;
        System.out.println(contador3++); //Nesse caso primeiro é impresso o resultado depois executado o comando
        System.out.println(contador3);

    }
}
