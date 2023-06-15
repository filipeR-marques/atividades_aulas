package aplicacao;

import model.Cliente;
import model.Funcionario;
import model.Pessoa;

public class App {
      public static void main(String[] args) {
          Pessoa pessoa = new Pessoa();
          pessoa.setNome("Filipe");
          pessoa.setCpf("123");
          pessoa.cumprimentar();

          Funcionario funcionario = new Funcionario();

          funcionario.setNome("Joao");
          funcionario.setCpf("1234");
          funcionario.cumprimentar();

          Cliente cliente = new Cliente();
          cliente.setNome("Ana");
          cliente.setCpf("12345");
          cliente.cumprimentar();

          Pessoa pessoas[] = new Pessoa[3];

          pessoas[0] = pessoa;
          pessoas[1] = funcionario;
          pessoas[3] = cliente;

          for (int i = 0; i < pessoas.length; i++) {
            pessoas[i].cumprimentar();
          }

      }
}
