/* 2.	Sistema de Controle de Alunos: Uma escola precisa de um
 sistema para gerenciar informações sobre seus alunos. Desenvolva uma 
classe Aluno com atributos para o nome, idade e série. Crie objetos para 
representar três alunos diferentes e mostre seus dados.*/


public class Aluno {

    private String nome;
    private int idade;
    private String serie;

    //construtor 

    public Aluno (String nome, int idade, String serie) {
        this.nome = nome; 
        this.idade = idade; 
        this.serie = serie;
    }

    //Getters e Setters

    public String getNome() {
        return nome;
    }


    public int getIdade(){
        return idade;
    }

 
    public String getSerie(){
        return serie;
    } 
}