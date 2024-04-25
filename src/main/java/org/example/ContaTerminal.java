package org.example;

import java.util.Scanner;

public class ContaTerminal {

    public static void main (String[] args){

        //TODO: Exibir mensagem e coletar dados do usuário
        Scanner sc = new Scanner(System.in);

        System.out.println("Digita o nome do cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Digita o  numero da Conta: ");
        int numero = sc.nextInt();

        System.out.println("Digita a agencia da conta: ");
        String agencia = sc.next();

        System.out.println("Informe seu saldo: ");
        float saldo = sc.nextFloat();

        //TODO: exibir mensagem final do desafio
        System.out.println("Olá" +nomeCliente+ ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " +agencia+ ", conta " +numero+" e seu saldo R$"+saldo+" já está disponível para saque\".");

    }
}
