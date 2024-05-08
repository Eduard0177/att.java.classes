public class Main {
public static void main(String[] args) {
    // Criando instâncias de livros
    Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
    Livro livro2 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997);
    Livro livro3 = new Livro("1984", "George Orwell", 1949);
    
    // Exibindo informações dos livros
    System.out.println("Informações dos Livros:");
    System.out.println("-----------------------");
    livro1.exibirInformacoes();
    livro2.exibirInformacoes();
    livro3.exibirInformacoes();
}

}