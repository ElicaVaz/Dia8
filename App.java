/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Dia8;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de dinheiro em reais: ");
        float quantidadeReais = leitor.nextFloat();
        
        float rendimento = quantidadeReais + (quantidadeReais*7)/10000;
        
        System.out.println("O rendimento de " + quantidadeReais + " ? de R$" + rendimento);
        
    }
}
