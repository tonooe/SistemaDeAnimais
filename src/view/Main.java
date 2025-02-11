package view;

import model.Animal;
import model.Gato;
import model.Cachorro;
import service.PetShop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PetShop petShop = new PetShop();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do { //vai fazer tudo o que estiver dentro desse código ''do'', while(enquanto) opcao != 0, então o usuário tem que escolher 0 pra quebrar o laço
            System.out.println("\n=== Pet Shop ===");
            System.out.println("1. Cadastrar um animal");
            System.out.println("2. Listar Animais");
            System.out.println("3. Buscar Animal por Nome");
            System.out.println("4. Remover Animal");
            System.out.println("5. Atualizar Animal");
            System.out.println("0. Sair");
            System.out.println("Escolha uma opçâo: ");
            opcao = scanner.nextInt(); // o numero escolhido acima vai ficar ''guardada'' na variável int
            scanner.nextLine(); //limpa o buffer do teclado

            switch (opcao) {
                case 1:
                    System.out.println("Digite o tipo de animal: (Cachorro/Gato):  ");
                    String tipo = scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Raça: ");
                    String raca = scanner.nextLine();
                    System.out.print("Cor: ");
                    String cor = scanner.nextLine();

                    Animal animal = null; //aqui vai verificar a escolha do usuário e comparar, se for cachorro, vai criar um objeto cachorro()
                    if (tipo.equalsIgnoreCase("Cachorro")) {
                        animal = new Cachorro();
                    } else if (tipo.equalsIgnoreCase("Gato")) {
                        animal = new Gato();
                    } else {
                        System.out.println("Tipo Inválido!"); // se não for gato nem cachorro, vai retornar inválido
                    }

                    animal.setNome(nome);
                    animal.setIdade(idade);
                    animal.setRaca(raca);
                    animal.setCor(cor);
                    petShop.cadastrarAnimal(animal);
                    break;

                case 2:
                    petShop.listarAnimais();
                    break;

                case 3:
                    System.out.println("Digite o nome do animal: ");
                    String nomeBusca = scanner.nextLine(); // o scanner.nextLine le o que foi digitado acima e salva na variável nomeBusca
                    Animal animalEncontrado = petShop.buscarAnimalPorNome(nomeBusca); // nomeBusca é o nome q o usuario digitou, e o petShop.buscarAnimalPorNome chama o método q busca esse nome na lista de animais do petshop
                    // animal animalEncontrado = > guarda o resultado da busca na variável animalEncontrado
                    if (animalEncontrado != null) { // se o animal for encontrado, vai imprimir na tela abaixo
                        System.out.println("Animal encontrado: " + animalEncontrado);
                    } else {
                        System.out.println("Animal não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o nome do animal para remover: ");
                    String nomeRemover = scanner.nextLine(); // mesmo processo, scanner.nextline vai esperar o que foi digitado acima e vai guardar na variaver nomeRemover
                    petShop.removerAnimal(nomeRemover); // vai chamar o metodo pra remover o animal que foi digitado no nomeRemover
                    break;

                case 5:
                    System.out.print("Digite o nome do animal para atualizar: ");
                    String nomeAtualizar = scanner.nextLine();
                    System.out.print("Atualizar raça: ");
                    String novaRaca = scanner.nextLine();
                    System.out.print("Atualizar idade: ");
                    int novaIdade = scanner.nextInt();
                    scanner.nextLine(); // limpa o buffer
                    System.out.print("Atualizar cor: ");
                    String novaCor = scanner.nextLine();

                    petShop.atualizarAnimal(nomeAtualizar, novaRaca, novaIdade, novaCor);
                    break;

                case 0:
                    System.out.println("Saindo do Sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}