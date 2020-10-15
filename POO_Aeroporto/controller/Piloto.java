package controller;

public class Piloto {
    String nome;
    long nCHT;
    int qtdHorasDeVoo ;
    boolean copiloto;
    Aeronave aeronave;

    public Piloto(String nome, long nCHT, int qtdHorasDeVoo, boolean copiloto, Aeronave aeronave) {
        this.nome = nome;
        this.nCHT = nCHT;
        this.qtdHorasDeVoo = qtdHorasDeVoo;
        this.copiloto = copiloto;
        this.aeronave = aeronave;
    }

    @Override
    public String toString() {
        return "Piloto " + nome +
                "\n nCHT= " + nCHT +
                "\n qtdHorasDeVoo= " + qtdHorasDeVoo +
                "\n copiloto= " + copiloto +
                "\n aeronave= " + aeronave
                ;
    }

    //
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getnCHT() {
        return nCHT;
    }

    public void setnCHT(long nCHT) {
        this.nCHT = nCHT;
    }

    public int getQtdHorasDeVoo() {
        return qtdHorasDeVoo;
    }

    public void setQtdHorasDeVoo(int qtdHorasDeVoo) {
        this.qtdHorasDeVoo = qtdHorasDeVoo;
    }

    public boolean isCopiloto() {
        return copiloto;
    }

    public void setCopiloto(boolean copiloto) {
        this.copiloto = copiloto;
    }

    public Aeronave getAeronave() {
        return aeronave;
    }

    public void setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }
    //
    public void piloar(){}
}
