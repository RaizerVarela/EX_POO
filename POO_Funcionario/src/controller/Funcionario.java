package controller;

import java.time.LocalDate;

public class Funcionario {
    private static long contator;
    private long id;
    private String nome;
    private String matricula;
    private LocalDate admissao;
    private LocalDate demissao;
    private double salario;
    private String horario;

    public Funcionario(String nome, String matricula, LocalDate admissao, double salario, String horario) {
        Funcionario.contator++;
        this.id = contator;
        this.nome = nome;
        this.matricula = matricula;
        this.admissao = admissao;
        this.salario = salario;
        this.horario = horario;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDate getAdmissao() {
        return admissao;
    }

    public void setAdmissao(LocalDate admissao) {
        this.admissao = admissao;
    }

    public LocalDate getDemissao() {
        return demissao;
    }

    public void setDemissao(LocalDate demissao) {
        this.demissao = demissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void exibir() {
        System.out.println("Funcionario{" +
                "id=" + this.id +
                ", nome='" + this.nome + '\'' +
                ", matricula='" + this.matricula + '\'' +
                ", admissao=" + this.admissao +
                ", demissao=" + this.demissao +
                ", salario=" + this.salario +
                ", horario='" + this.horario + '\'' +
                '}');
    }
}
