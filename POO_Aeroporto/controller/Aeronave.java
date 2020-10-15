package controller;

public class Aeronave {
    String matricula;
    String companhia;
    String fabricante;
    String modelo;
    int numeroDeAssentos;

    public Aeronave(String matricula, String companhia, String fabricante, String modelo, int numeroDeAssentos) {
        this.matricula = matricula;
        this.companhia = companhia;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.numeroDeAssentos = numeroDeAssentos;
    }

    @Override
    public String toString() {
        return "Aeronave " +matricula+
                " companhia= " + companhia +
                " fabricante= " + fabricante +
                " modelo= " + modelo +
                " numeroDeAssentos= " + numeroDeAssentos +
                '}';
    }

    //
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroDeAssentos() {
        return numeroDeAssentos;
    }

    public void setNumeroDeAssentos(int numeroDeAssentos) {
        this.numeroDeAssentos = numeroDeAssentos;
    }
    //

    public void voar(){}
}
