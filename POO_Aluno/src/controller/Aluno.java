package controller;

import javax.swing.*;
import java.time.LocalDate;

public class Aluno {

    private static long contador;
    private long id;
    private String nome;
    private String ra;
    private LocalDate nascimento;

    public Aluno(String nome, String ra, LocalDate nascimento) {
        Aluno.contador++;
        this.id = contador;
        this.nome = nome;
        this.ra = ra;
        this.nascimento = nascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getRa() {
        return ra;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void exibir(){
        JOptionPane.showMessageDialog(null,
                "ID: " + this.getId() + "\n" +
                "Nome: " + this.getNome() + "\n" +
                "RA: " + this.getRa() + "\n" +
                "Data de Nascimento: " + this.getNascimento() + "\n"
        );
    }
}