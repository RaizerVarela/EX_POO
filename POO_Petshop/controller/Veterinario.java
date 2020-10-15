package controller;

public class Veterinario {
    private String nome;
    private String crmv;
    private String telefone;
    private String endereco;
    private String especializacao;

    public Veterinario(String nome, String crmv, String telefone, String endereco, String especializacao) {
        this.nome = nome;
        this.crmv = crmv;
        this.telefone = telefone;
        this.endereco = endereco;
        this.especializacao = especializacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public void atende(Dono dono, Animal animal){
        System.out.println("médico está em consulta com o animal " + animal.getNome() + ". Dono: " + dono.getNome());
    }
}
