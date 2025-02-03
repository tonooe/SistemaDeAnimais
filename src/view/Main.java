package view;

import model.Gato;
import model.Cachorro;
import service.PetShop;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Zé Vira Lixo");
        cachorro.setIdade(1);
        cachorro.setRaca("Vira-Lata");
        cachorro.setCor("Caramelo");

        Gato gato = new Gato();
        gato.setNome("Gato");
        gato.setIdade(2);
        gato.setRaca("Persa");
        gato.setCor("Branco");

        System.out.println(cachorro.getNome() + " tem " + cachorro.getIdade() + " ano.");
        cachorro.emitirSom();
        System.out.println(gato.getNome() + " tem " + gato.getIdade() + " anos.");
        gato.emitirSom();
    }
}