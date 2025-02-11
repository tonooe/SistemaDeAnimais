package model;

public class Cachorro extends Animal {

    public Cachorro() {
        super("Nome Padrão", 0, "Raça Padrão", "Cor Padrão");
    }

    public Cachorro(String nome, int idade, String raca, String cor) {
        super(nome, idade, raca, cor);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au!");
    }

    @Override
    public String toString() {
        return "Cachorro: " +
                "nome= '" + getNome() + '\'' +
                ", idade= " + getIdade() +
                ", raça= '" + getRaca() + '\'' +
                ", cor= '" + getCor() + '\'' ;
    }
}
