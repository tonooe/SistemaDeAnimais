package model;

public class Gato extends Animal {

    public Gato() {
        super("Nome Padrão", 0, "Raça Padrão", "Cor Padrão");
    }

    public Gato(String nome, int idade, String raca, String cor) {
        super(nome, idade, raca, cor);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }

    @Override
    public String toString() {
        return "Gato: " +
                "nome= '" + getNome() + '\'' +
                ", idade= " + getIdade() +
                ", raça= '" + getRaca() + '\'' +
                ", cor= '" + getCor() + '\'';
    }
}