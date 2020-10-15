package controller;

public class Dinossauro {
    int energia;
    double velocidade;
    double temperatura;
    boolean humor;

    public Dinossauro(int energia, double velocidade, double temperatura, boolean humor) {
        this.energia = energia;
        this.velocidade = velocidade;
        this.temperatura = temperatura;
        this.humor = humor;
    }

    public int getEnergia() {
        return energia;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public boolean isHumor() {
        return humor;
    }

    public void setHumor(boolean humor) {
        this.humor = humor;
    }

    @Override
    public String toString() {
        return "Skeep {" +
                "energia= " + energia +
                ", velocidade= " + velocidade +
                ", temperatura= " + temperatura +
                ", humor= " + (humor ? "Bom humor" : "Mal Humor") +
                '}';
    }

    public void pular() {
        if (this.energia > 0) {
            this.diminuirEnergia();
            if (!this.humor) this.setHumor(this.mudarHumor(this.humor));
        } else {
            System.out.println("Skeep sem energia. Comer ou ficar na sombra recuperam energia");
        }
    }

    public void correr() {
        if (this.energia > 0) {
            this.aumentarVelocidade();
            if (!this.humor) this.setHumor(this.mudarHumor(this.humor));
        } else {
            System.out.println("Skeep sem energia. Comer ou ficar na sombra recuperam energia");
        }
    }

    public void comer() {
        this.aumentarEnergia();
        if (!this.humor) this.setHumor(this.mudarHumor(this.humor));
    }

    public void atirar() {
        if (this.energia > 0) {
            this.diminuirEnergia();
            if (!this.humor) this.setHumor(this.mudarHumor(this.humor));
        } else {
            System.out.println("Skeep sem energia. Comer ou ficar na sombra recuperam energia");
        }
    }

    public void tomarSol() {
        this.aumentarVelocidade();
        if (!this.humor) this.setHumor(this.mudarHumor(this.humor));
    }

    public void ficarNaSombra() {
        this.aumentarEnergia();
        this.velocidade = 0;
        if (this.humor) this.setHumor(this.mudarHumor(this.humor));
    }

    //

    private void aumentarVelocidade() {
        this.velocidade++;
        this.diminuirEnergia();
    }

    private void aumentarEnergia() {
        this.energia++;
    }

    private boolean mudarHumor(boolean humor) {
        return !humor;
    }

    private void diminuirEnergia() {
        this.energia--;

    }

}