package service;

import model.Animal;
import java.util.ArrayList;

public class PetShop {
    private ArrayList<Animal> animais; //lista da classe Animal q se chama animais

    // contrutor pra inicializar
    public PetShop() {
        this.animais = new ArrayList<>(); //lista para armazenar os animais
    }
    public void cadastrarAnimal (Animal animal) { //criamos um método de cadastro de animais
        if (buscarAnimalPorNome(animal.getNome()) == null) { // vai fazer a checagem, se o resultado for nulo, vai cadastrar um animal
            animais.add(animal); //adiciona o animal na lista/aray animais
            System.out.println("Animal cadastrado com sucesso!");
        } else {
            System.out.println("Animal já cadastrado.");
        }
    }
    public Animal buscarAnimalPorNome(String nome) { //não vai ser void pois precisa retornar um obj do tipo Animal
        for (Animal a : animais) { // aqui o loop vai percorrer cada animal da lista e o animal vai ser o 'a' a=animal
            if (a.getNome().equalsIgnoreCase(nome)) {
                return a;
            }
        }
        return null;//a.getNome() pega o nome do animal atual do loop que está rodando.
                    //.equalsIgnoreCase(nome) compara esse nome do loop com o nome que foi passado como parâmetro no método exemplo: BuscarAnimalPorNome("Juca")
                    // Se forem iguais (ignorando maiúsculas e minúsculas), o método retorna esse animal.

    }
    public void removerAnimal(String nome) {
        Animal animal = buscarAnimalPorNome(nome); { //Animal animal serve pra guardar o resultado da busca dos animais, se encontrar o nome no BuscarAnimalPeloNome, vai guardar o resultado dentro da var animal pra dps executar o resto do codigo, se for null ou tiver o animal
            if (animal != null) {
                animais.remove(animal); //vai pegar a lista de animais e vai remover do array animais, o animal q foi encontrado
                System.out.println("Animal removido com sucesso!");
            } else {
                System.out.println("Animal não encontrado."); // se não existir na lista, vai retornar null e vai gerar esse resultado, ja que o animal não foi encontrado
            }
        }
    }
    public void listarAnimais() {
        if (animais.isEmpty()) { // lista vazia, vai printar nenhum animal cadastrado
            System.out.println("Nenhum animal cadastrado.");
        } else {
            System.out.println("Animais cadastrados: ");
            for(Animal a : animais) { // loop do array animais, em cada iteração do loop, o animal vai ser animal = a, dps disso, vai printar com o system.out cada animal (a)
                System.out.println(a);
            }
        }
    }
    public void atualizarAnimal(String nome, String novaRaca, int novaIdade, String novaCor) {
        Animal animal = buscarAnimalPorNome(nome);
        if (animal != null) {
            animal.setRaca(novaRaca);
            animal.setIdade(novaIdade);
            animal.setCor(novaCor);
            System.out.println("Animal atualizado com sucesso!");
        } else {
            System.out.println("Animal não encontrado.");
        }
    }
}
