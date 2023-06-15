package Aula05.aplicacao;
import Aula05.modelo.Endereco;
import Aula05.modelo.Pessoa;


public class App {
      public static void main(String[] args) {
        Pessoa p = new Pessoa("Filipe", "123", 18, 'm');
        Endereco e = new Endereco("Rua da Mata", 595, "Teresópolis", "Tech4me");
        p.setEndereco(e);

        System.out.printf("Nome: %s, \nEndereço: Rua: %s", p.getNome(), p.getEndereco().getRua());

    }
    


      }

