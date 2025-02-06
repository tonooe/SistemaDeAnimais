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
                    System.out.println("Digite o tipo de animal que deseja buscar (Cachorro/Gato):  ");
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

                    Animal animal; //aqui vai verificar a escolha do usuário e comparar, se for cachorro, vai criar um objeto cachorro()
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
            }
        }
    }
}