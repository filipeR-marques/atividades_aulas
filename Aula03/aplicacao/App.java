package Aula03.aplicacao;

import Aula03.modelo.*;
import java.util.Scanner;

public class App {
      
      public static void main (String[] args){
            try (Scanner leia = new Scanner(System.in)) {
                  System.out.println("Tela de Cadastro");
                  System.out.println("Digite o Login: ");
                  String login = leia.nextLine();
                  System.out.println("Digite sua senha: ");
                  String senha = leia.nextLine();

                  Usuario user = new Usuario(login, senha);

                  if (user.autenticar(login, senha)){
                        System.out.println("bem vindo a tela de login!");
                  }else 
                  System.out.println("Algo foi digitado errado! Tente novamente.");
            }
      }
}
