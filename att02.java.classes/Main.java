/* 2.	Sistema de Controle de Alunos: Uma escola precisa de um
 sistema para gerenciar informações sobre seus alunos. Desenvolva uma 
classe Aluno com atributos para o nome, idade e série. Crie objetos para 
representar três alunos diferentes e mostre seus dados.*/


public class Main {

    public static void main(String[] args) {
        
        //Criando os objetos (Instâncias) de aluno

        Aluno aluno1 = new Aluno("Gabriel ",18 , "6° ano ");
        Aluno aluno2 = new Aluno("Joao ", 15 , "5° ano " );
        Aluno aluno3 = new Aluno("Iza ", 12 , "4° ano ");
    
        // Mostrando os dados dos alunos 
        System.out.println("Dados do Aluno 1:");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Idade: " + aluno1.getIdade());
        System.out.println("Serie: " + aluno1.getSerie());
        System.out.println();

        System.out.println("Dados do Aluno 2:");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Idade: " + aluno2.getIdade());
        System.out.println("Serie: " + aluno2.getSerie());
        System.out.println();

        System.out.println("Dados do aluno 3:");
        System.out.println("Nome: " + aluno3.getNome());
        System.out.println("Idade: " + aluno3.getIdade());
        System.out.println("Serie: " + aluno3.getSerie());
        System.out.println();
    }
    
}
