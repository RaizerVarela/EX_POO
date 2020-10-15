package controller;

public class Passageiro {
    String nome;
    String cpf;
    Voo voo;
    Aeronave aeronave;
    boolean bagagemDespachada;

    public Passageiro(String nome, String cpf, Voo voo, Aeronave aeronave, boolean bagagemDespachada) {
        this.nome = nome;
        this.cpf = cpf;
        this.voo = voo;
        this.aeronave = aeronave;
        this.bagagemDespachada = bagagemDespachada;
    }

    @Override
    public String toString() {
        String despachou = bagagemDespachada? "Sim":"Não";
        return "Passageiro " + nome +
                "\n cpf= " + cpf +
                "\n voo= " + voo +
                "\n aeronave= " + aeronave +
                "\n bagagemDespachada= " + bagagemDespachada
                ;
    }
//
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public Aeronave getAeronave() {
        return aeronave;
    }

    public void setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }

    public boolean isBagagemDespachada() {
        return bagagemDespachada;
    }

    public void setBagagemDespachada(boolean bagagemDespachada) {
        this.bagagemDespachada = bagagemDespachada;
    }
    //
    public void despacharBagagem(){}
}
