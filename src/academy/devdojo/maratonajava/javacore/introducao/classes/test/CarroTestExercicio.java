package academy.devdojo.maratonajava.javacore.introducao.classes.test;

import academy.devdojo.maratonajava.javacore.introducao.classes.dominio.Carro;

public class CarroTestExercicio {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.carro1= "Fusca";
        carro1.modelo1= "Tunado";
        carro1.ano1 = 1850;

        Carro carro2 = new Carro();
        carro2.carro2 = "Opala";
        carro2.modelo2= "Boladao";
        carro2.ano2= 1500;

        System.out.println(carro1.carro1);
        System.out.println(carro1.modelo1);
        System.out.println(carro1.ano1);

        System.out.println("/n--------");

        System.out.println(carro2.carro2);
        System.out.println(carro2.modelo2);
        System.out.println(carro2.ano2);

    }
}
