package academy.devdojo.maratonajava.javacore.introducao.classes.test;

import academy.devdojo.maratonajava.javacore.introducao.classes.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome= "naruto";
        estudante.idade= 16;
        estudante.sexo='M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
