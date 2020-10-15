package view;

public class Main {
    public static void main(String[] args) {
        Aeronave aeronave1 = new Aeronave("PP-PPC", "VAIJÁ", "Embraer", "789", 19);
        Aeronave aeronave2 = new Aeronave("PT-ABC", "VAIJÁ", "Embraer", "789", 19);
        Piloto piloto = new Piloto("Maria", 123654, 9875, false, aeronave1);
        Piloto coPiloto = new Piloto("Zé", 987654, 7000, true, aeronave1);
        Aeroporto guarulhos = new Aeroporto("GRU", 114.97, 77, "Aeroporto Internacional de São Paulo", true);
        Aeroporto fortaleza = new Aeroporto("FOR", 32.13, 40, "Aeroporto Pinto Martins", true);
        Voo gruFor = new Voo(guarulhos, fortaleza, aeronave1, 001, 15);
        Voo forGru = new Voo(fortaleza, guarulhos, aeronave2, 001, 15);
        Passageiro claudio = new Passageiro("Claudio", "77777777701", gruFor, aeronave1, false);
        Passageiro jessie = new Passageiro("Jessie", "77777777700", gruFor, aeronave1, false);

        System.out.println(aeronave1.toString());
        
    }
}
