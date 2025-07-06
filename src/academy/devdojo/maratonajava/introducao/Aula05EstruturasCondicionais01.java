package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
    // A condição if só é executada caso a condição for verdadeira.
        int idade = 17;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida");
        }
        // ! é um operador de negação
        if (!isAutorizadoComprarBebida){
            System.out.println("Não autorizado a comprar bebida");

         // A condição ELSE funciona como o operador !

         /*
            int idade = 20;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida");
        }else(isAutorizadoComprarBebida) {
            System.out.println("Não autorizado a comprar bebida");
        }
          */

        }
    }
}
