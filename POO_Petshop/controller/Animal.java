package controller;

import java.time.LocalDate;
import java.time.Period;

public class Animal {
    private String nome;
    private String especie;
    private String raca;
    private String personalidade;

    public String getPersonalidade() {
        return personalidade;
    }

    public void setPersonalidade(String personalidade) {
        this.personalidade = personalidade;
    }

    private LocalDate nascimento;

    public Animal(String nome, String especie, String raca, String personalidade,  LocalDate nascimento) {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.personalidade = personalidade;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public String getRaca() {
        return raca;
    }


    public LocalDate getNascimento() {
        return nascimento;
    }

    @Override
    public String toString() {
        LocalDate currentDate = LocalDate.now();
        return nome + "\n" +
                "\n especie= " + especie + '\'' +
                "\n raca= " + raca + '\'' +
                "\n personalidade= " + personalidade +
                "\n idade= " + Period.between(nascimento, currentDate).getYears();
    }

    public void brincar(){
        System.out.println(this.nome + " está feliz");
    }
}
