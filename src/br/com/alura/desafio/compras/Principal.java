package br.com.alura.desafio.compras;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o limite do cartão: ");
        int limite = leitura.nextInt();
        leitura.nextLine();
        System.out.println("Digite a descrição do produto: ");
        String descricao = leitura.nextLine();
        System.out.println("Digite o valor do produto: ");
        int valor = leitura.nextInt();


        System.out.println(limite);
        System.out.println(descricao);
        System.out.println(valor);






    }
}
