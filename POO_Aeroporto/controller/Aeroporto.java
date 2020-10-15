package controller;

public class Aeroporto {
    String sigla;
    String nome;
    double taxaDeEmbarque;
    int quantidadePortaoDeEmbarque;
    boolean vooInternacional;

    public Aeroporto(String sigla, double taxaDeEmbarque, int quantidadePortaoDeEmbarque,
                     String nome, boolean vooInternacional) {
        this.sigla = sigla;
        this.taxaDeEmbarque = taxaDeEmbarque;
        this.quantidadePortaoDeEmbarque = quantidadePortaoDeEmbarque;
        this.nome = nome;
        this.vooInternacional = vooInternacional;
    }

    @Override
    public String toString() {
        String internacional = vooInternacional? "Sim":"Não";
        return "Aeroporto " + nome +
                "\n sigla= '" + sigla  +
                "\n taxa de embarque= R$" + taxaDeEmbarque +
                "\n quantidade portao de Embarque= " + quantidadePortaoDeEmbarque +
                "\n Quantidade de Pistas= " + nome +
                "\n Recebe voo internacional= " + internacional
                ;
    }
//
    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public double getTaxaDeEmbarque() {
        return taxaDeEmbarque;
    }

    public void setTaxaDeEmbarque(double taxaDeEmbarque) {
        this.taxaDeEmbarque = taxaDeEmbarque;
    }

    public int getQuantidadePortaoDeEmbarque() {
        return quantidadePortaoDeEmbarque;
    }

    public void setQuantidadePortaoDeEmbarque(int quantidadePortaoDeEmbarque) {
        this.quantidadePortaoDeEmbarque = quantidadePortaoDeEmbarque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isVooInternacional() {
        return vooInternacional;
    }

    public void setVooInternacional(boolean vooInternacional) {
        this.vooInternacional = vooInternacional;
    }
    //
    public void checkin(){}
}
