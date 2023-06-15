package Aula02.aplicacao;

import Aula02.modelo.Pessoa;

public class App {
      public static void main(String[] args) {
            Pessoa p = new Pessoa();

            p.setNome("Filipe");
            p.setCpf("12345678912");
            p.setSalario(1000);

            System.out.printf("Pessoa 1: Nome: %s, CPF: %s, Salario: R$%.2f", 
            p.getNome(), p.getCpf(), p.getSalario());
      }
      
}
