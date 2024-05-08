public class Livro {

    private String titulo;  
    private String autor;
    private int anoPub;

    // Construtor 
    public Livro (String titulo, String autor, int AnoPub) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPub = anoPub;

    }

    // Getters e Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPub(){
        return anoPub;
    }

    public void setAnoPub(int anoPub){
        this.anoPub = anoPub;
    }

    // Metodo para exibir informações do livro

    public void exibirInformacoes() {
        System.out.println("Título " + titulo);
        System.out.println("Autor " + autor);
        System.out.println("Ano de Publicação " + anoPub);
    }

}