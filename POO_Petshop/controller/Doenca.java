package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Doenca {

    private String CID;
    private String nomeComum;
    private String nomeCientifico;
    private String transmissao;
    private final List<String> sintomas = new ArrayList<>();

    public Doenca(String CID, String nomeComum, String nomeCientifico, String transmissao) {
        this.CID = CID;
        this.nomeComum = nomeComum;
        this.nomeCientifico = nomeCientifico;
        this.transmissao = transmissao;
    }

    public String getCID() {
        return CID;
    }

    public void setCID(String CID) {
        this.CID = CID;
    }

    public String getNomeComum() {
        return nomeComum;
    }

    public void setNomeComum(String nomeComum) {
        this.nomeComum = nomeComum;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public String getTransmissao() {
        return transmissao;
    }

    public void setTransmissao(String transmissao) {
        this.transmissao = transmissao;
    }

    public void showSintomaInfo() {
        this.sintomas.forEach(System.out::println);
    }


    public void getSintomas() {
        this.sintomas.forEach(System.out::println);
    }

    public void setSintomas(String... sintoma) {
        Collections.addAll(this.sintomas, sintoma);
    }


    @Override
    public String toString() {
        return nomeComum + ": "+
                "\n CID= " + CID + "" +
                "\n Nome Cientifico= " + nomeCientifico +
                "\n transmissao= " + transmissao +
                "\n sintomas= {" + String.join(", ", sintomas) +
                '}';
    }
}
