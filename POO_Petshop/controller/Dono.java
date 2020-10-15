package controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Dono {

    private String nome;
    private String endereco;
    private boolean possuiPlano;
    private LocalDate nascimento;
    private List<Animal> animais = new ArrayList<>();

    public Dono(String nome, String endereco, boolean possuiPlano, LocalDate nascimento) {
        this.nome = nome;
        this.endereco = endereco;
        this.possuiPlano = possuiPlano;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isPossuiPlano() {
        return possuiPlano;
    }

    public void setPossuiPlano(boolean possuiPlano) {
        this.possuiPlano = possuiPlano;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }


    public void addAnimal(Animal animal){
        this.animais.add(animal);
    }

    public void showAnimalinfo(){
        this.animais.forEach(animal -> System.out.println(animal.toString()));
    }

    public Animal showAnimalinfo(String nomePet) {
        return animais.stream()
                .filter(pet -> nomePet.equalsIgnoreCase(pet.getNome()))
                .findFirst()
                .orElse(null);
    }

}
