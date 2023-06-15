package Aula02poo.aplicacao;

import Aula02poo.modelo.Conta;

public class App {
      public static void main(String[] args) throws Exception {
          
          // criação e instanciação do objeto Gustavo da classe ContaBancaria
          Conta gustavo = new Conta();
          gustavo.setTitular("Gustavo");
          gustavo.setSaldo(200);
          gustavo.setNumeroConta(111222333);
  
          // criação e instanciação do objeto Gustavo da classe ContaBancaria
          Conta jacqueline = new Conta();
          jacqueline.setTitular("Jacqueline");
          jacqueline.setSaldo(500);
          jacqueline.setNumeroConta(444555666);
  
          // Apresentar o saldo atual
          System.out.println("Saldos iniciais");
          System.out.println("Saldo do Gustavo R$" + gustavo.getSaldo());
          System.out.println("Saldo da Jacqueline R$" + jacqueline.getSaldo());
  
          // uso dos métodos para manipulação da ContaBancaria do Gustavo
          gustavo.depositar(450);
          gustavo.sacar(400);
          gustavo.transferir("Jacqueline", 200); jacqueline.depositar(200);
  
          // uso dos métodos para manipulação da ContaBancaria da Jacqueline
          jacqueline.depositar(250);
          jacqueline.sacar(100);
          jacqueline.transferir("Gustavo", 300); gustavo.depositar(300);
  
          // Apresentar o saldo atual
          System.out.println("\nSaldos finais");
          System.out.println("Saldo do Gustavo R$" + gustavo.getSaldo());
          System.out.println("Saldo da Jacqueline R$" + jacqueline.getSaldo());
      }
  }
  
