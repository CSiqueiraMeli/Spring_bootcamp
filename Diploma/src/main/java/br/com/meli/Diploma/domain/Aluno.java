package br.com.meli.Diploma.domain;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    String nome;
    List<Disciplinas> disciplinas;

    public Aluno(String nome) {
        this.nome = nome;
        this.disciplinas = disciplinas = new ArrayList<>();
    }

    public Aluno(String nome, List<Disciplinas> disciplinas) {
        this.nome = nome;
        this.disciplinas = disciplinas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Disciplinas> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplinas> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double getMedia(){
        double media = 0.0;
        for (Disciplinas d: disciplinas) {
            media += d.getNota();
        }
        return media / disciplinas.size();
    }
}
