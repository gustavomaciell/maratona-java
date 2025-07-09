package academy.devdojo.maratonajava.javacore.introducao.classes.test;

import academy.devdojo.maratonajava.javacore.introducao.classes.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Carvalho";
        professor.idade = 60;
        professor.sexo = 'M';

        System.out.println("Nome:" + professor.nome + " Idade:" + professor.idade + " Sexo:" + professor.sexo);

    }
}
