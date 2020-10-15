package view;

import java.time.LocalDate;

public class Teste {
    public static void main(String[] args) {

        Dono dono1 = new Dono("Pazuzu", "Travessa do Tranco", true, LocalDate.of(1989, 2, 23));
        Dono dono2 = new Dono("Joel", "Cripton", true, LocalDate.of(1970, 5, 25));
        dono1.addAnimal(new Animal("Cã", "cachorro", "vira lata caramelo", "amável", LocalDate.of(2000, 2, 20)));
        dono2.addAnimal(new Animal("Gato", "gato", "gato?", "gato", LocalDate.of(2000, 2, 20)));
        Veterinario vet1 = new Veterinario("Vetoria", "12345/SP", "011887278910", "Rua dos passarinho, 91", "animais de pequeno porte");
        Veterinario vet2 = new Veterinario("Paulo", "12355/SC", "041887278910", "Av Sulito, 91", "Gado");
        Doenca babata = new Doenca("AAD99", "babata", "botruengulotopia", "oral");
        babata.setSintomas("baba em excesso", "baba espessa", "desanimo");
        Doenca bonoro = new Doenca("GAD0", "BONORO", "GadoDemais", "oral");
        bonoro.setSintomas("Demencia", "Problemas para enchergar");
        vet1.atende(dono2, dono2.showAnimalinfo("gato"));

    }
}
