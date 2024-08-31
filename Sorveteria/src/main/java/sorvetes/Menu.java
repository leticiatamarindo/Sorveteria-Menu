
package sorvetes;

/**
 *
 * @author Letícia
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Venda> carrinho = new ArrayList<>(); // Utilizando a interface Venda

        System.out.println("Bem vindo(a) à sorveteria Arco íris 🍦!!");

        boolean finalizarCompra = false;
        while (!finalizarCompra) { //Laço de repetição principal, repete enquanto for false
            System.out.println("\n****- Escolha o tipo de sorvete -****");
            System.out.println("1. Casquinha 🍦");
            System.out.println("2. Milkshake 🥛");
            System.out.println("3. Sundae 🍨");
            System.out.println("4. Finalizar Compra");
           

            int opcao = 0;
            
            try {  // isso aqui é para o código não quebrar kkk
                opcao = scanner.nextInt();
            } catch (InputMismatchException e) {//import para tratar a leitura de dados no input 
                System.out.println("Opção inválida! Digite um número.");
                scanner.nextLine(); //impedir que a próxima leitura seja afetada pelo erro, limpando o buffer do scanner
                continue;
            }
            
            switch (opcao) { //Escolha do menu principal 
                
                
                case 1: //Casquinha
                    System.out.println("\nEscolha o sabor da Casquinha:");
                    System.out.println("1. Morango");
                    System.out.println("2. Chocolate");
                    System.out.println("3. Baunilha");
                    
                    int saborCasquinha = 0; // Inicializa com um valor padrão
                    
                    try {
                        saborCasquinha = scanner.nextInt(); // lê a opção escolhida
                    } catch (InputMismatchException e) {
                        System.out.println("Opção inválida! Voltando ao menu principal...");
                        scanner.nextLine(); // Limpa o buffer do Scanner após o erro
                        continue;
                    }
                    
                    scanner.nextLine(); // Limpa o buffer do Scanner para retornar ao loop
                  
                    String saborCasquinhaEscolhido = ""; //Str vazia que recebe no switch o sabor escolhido
                    switch (saborCasquinha) { // Escolha do sub-menu de sabores
                        case 1:
                            saborCasquinhaEscolhido = "Morango";
                            break;
                        case 2:
                            saborCasquinhaEscolhido = "Chocolate";
                            break;
                        case 3:
                            saborCasquinhaEscolhido = "Baunilha";
                            break;
                        default:
                            System.out.println("\nOpção inválida!");
                            continue; 
                    }
                    System.out.println("\nCasquinha de " + saborCasquinhaEscolhido + " adicionada ao carrinho.");
                    carrinho.add(new Casquinha(saborCasquinhaEscolhido)); // criação e adição do novo objeto 
                    break;                                                           //com o sabor escolhido
                   

                    
                case 2: //Milkshake
                    System.out.println("\nEscolha o sabor do Milkshake:");
                    System.out.println("1. Morango");
                    System.out.println("2. Chocolate");
                    System.out.println("3. Baunilha");
                    
                    int saborMilkshake = 0; 
                    
                    try {
                        saborMilkshake = scanner.nextInt(); 
                    } catch (InputMismatchException e) {
                        System.out.println("Opção inválida! Voltando ao menu principal...");
                        scanner.nextLine(); 
                        continue;
                    }
                    
                    scanner.nextLine(); // Limpa o buffer do Scanner para voltar ao loop
                    
                    String saborMilkshakeEscolhido = "";
                    switch (saborMilkshake) {
                        case 1:
                            saborMilkshakeEscolhido = "Morango";
                            break;
                        case 2:
                            saborMilkshakeEscolhido = "Chocolate";
                            break;
                        case 3:
                            saborMilkshakeEscolhido = "Baunilha";
                            break;
                        default:
                            System.out.println("\nOpção inválida!");
                            continue;
                    }
                    System.out.println("\nMilkshake de " + saborMilkshakeEscolhido + " adicionado ao carrinho.");
                    carrinho.add(new Milkshake(saborMilkshakeEscolhido));
                    break;
                    

                case 3: //Sundae
                    System.out.println("\nEscolha o sabor do Sundae:");
                    System.out.println("1. Morango");
                    System.out.println("2. Chocolate");
                    System.out.println("3. Baunilha");
                    
                    int saborSundae = 0; 
                    
                    try {
                        saborSundae = scanner.nextInt(); 
                    } catch (InputMismatchException e) {
                        System.out.println("\nOpção inválida! Voltando ao menu principal...");
                        scanner.nextLine(); 
                        continue;
                    }
                    
                    scanner.nextLine(); // Limpa o buffer do Scanner para voltar ao loop
                    
                    String saborSundaeEscolhido = "";
                    switch (saborSundae) {
                        case 1:
                            saborSundaeEscolhido = "Morango";
                            break;
                        case 2:
                            saborSundaeEscolhido = "Chocolate";
                            break;
                        case 3:
                            saborSundaeEscolhido = "Baunilha";
                            break;
                        default:
                            System.out.println("\nOpção inválida!");
                            continue;
                    }
                    System.out.println("\nSundae de " + saborSundaeEscolhido + " adicionado ao carrinho.");
                    carrinho.add(new Sundae(saborSundaeEscolhido));
                    break;
                    

                case 4:
                    finalizarCompra = true;
                    break; //finalizarCompra se torna true e quebra o laço de repetição
 
                    
                default:
                    System.out.println("\nOpção inválida!");
                    break;
            }
        }

        double totalCompra = 0;
        System.out.println("\n===================================");
        System.out.println("\nItens no carrinho:");
        for (Venda gelato : carrinho) { // Utilizando a interface Venda
            gelato.comprar(); // Chamando o método comprar() da interface Venda
            totalCompra += gelato.getValor(); // Soma total da compra usando o método getValor() de Venda
        }

        System.out.println("\nTotal da compra: R$" + totalCompra);
        scanner.close();
    }
}


    

