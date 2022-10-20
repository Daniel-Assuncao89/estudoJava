package aulas.poo.escola;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Renato", "renato@gmail.com", "00000000", 9);
        aluno.seApresentar();

        Professor professor = new Professor("Luiz", "luiz@org.com.br", "000000000", "Engenharia");
        professor.seApresentar();

        Pessoa p1 = new Pessoa("Antonia", "antonia@...", "00000000");
        p1.seApresentar();

        //Polimorfismo
        Pessoa p2 = new Aluno("Renato", "renato@gmail.com", "00000000", 9);
        System.out.println(" === PESSOAS ===");
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(aluno);
        pessoas.add(professor);
        pessoas.add(p1);
        pessoas.add(p2);

        for (Pessoa pessoa: pessoas) {
            pessoa.seApresentar();
        }
    }

}
