package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
//        WHILE    DO WHILE   FOR
        int count = 0;
//        Para  o WHILE ser executado a condição precisa ser verdadeira.

        while (count <= 10) {
            System.out.println("contagem " + count);
            count += 1;
        }

//      DO WHILE será executado pelo menos uma vez mesmo que a condição seja falsa.

        count = 12;
        do {
            System.out.println("Dentro do DO WHILE " + ++count);
            count = count + 1;
        } while (count < 10);

        // FOR funciona com indices

        for (int i = 0; i < 10; i= i+2)
        System.out.println("FOR "+ i);

        /*
        Podemos usar o FOR sem declarar uma variavel basta associar um valor a um statement
        EX:

        for (exemplo = 0; exemplo < 10; exemplo= exemplo+2)
        System.out.println("FOR "+ exemplo);

         */
    }
}
