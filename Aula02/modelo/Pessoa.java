package Aula02.modelo;

public class Pessoa {
    public String nome;
	private String cpf;
	private double salario;

    //Region getters and setters

    //os métodos set servem para definir o valor do atributo
    //set = tipo do dado void e parâmetro do mesmo tipo do dado do atributo
    //os métodos get servem para obter o valor do atributo
    //get = 

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setCpf(String cpf){
        if (cpf.matches("//d{3}[.]{1}//d{3}[.]{1}//d{3}[-]{1}//d{2}")){
            this.cpf = cpf;
        }else{
            this.cpf = "ERRO!!";
        }
        
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setSalario(double salario){
        calcularSalario(salario);
    }

    public double getSalario(){
        return this.salario;
    }

    
    public void calcularSalario(double salarioBruto){
        salario = salarioBruto - (salarioBruto * 0.1);
    }
}
