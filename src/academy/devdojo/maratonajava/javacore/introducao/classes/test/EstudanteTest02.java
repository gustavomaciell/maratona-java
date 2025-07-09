package academy.devdojo.maratonajava.javacore.introducao.classes.test;

import academy.devdojo.maratonajava.javacore.introducao.classes.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "Naruto";
        estudante.idade = 16;
        estudante.sexo = 'M';

        estudante2.nome = "Sasuke";
        estudante2.idade = 17;
        estudante2.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        System.out.println("------------------");

        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);

    }
}
