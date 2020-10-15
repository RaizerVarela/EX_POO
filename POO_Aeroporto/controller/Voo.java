package controller;

public class Voo {
    Aeroporto origem;
    Aeroporto destino;
    Aeronave aeronave;
    int numero;
    int numeroPassageiros;

    public Voo(Aeroporto origem, Aeroporto destino, Aeronave aeronave, int numero, int numeroPassageiros) {
        this.origem = origem;
        this.destino = destino;
        this.aeronave = aeronave;
        this.numero = numero;
        this.numeroPassageiros = numeroPassageiros;
    }

    public Aeroporto getOrigem() {
        return origem;
    }

    public Aeroporto getDestino() {
        return destino;
    }

    public Aeronave getAeronave() {
        return aeronave;
    }

    public int getNumero() {
        return numero;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    @Override
    public String toString() {
        return "Voo " + numero +
                "\norigem= " + origem +
                "\ndestino= " + destino +
                "\naeronave= " + aeronave +
                "\nnumeroPassageiros= " + numeroPassageiros
                ;
    }
}
