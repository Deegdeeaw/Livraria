public class Livro {

    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;
    private boolean impresso;

    void mostrarDetalhes() {
        System.out.println("Detalhes do Livro:");
        System.out.println(nome);
        System.out.println(descricao);
        System.out.printf("R$ %.2f\n" , valor);
        System.out.println(isbn);
        if (this.temAutor()) {
            autor.mostrarDetalhes();
        }
    }

    // Construtor passando o parâmetro Autor autor para todo livro ter um autor.
    public Livro(Autor autor) {
        this();
        this.autor = autor;
        this.impresso = true;
        this.isbn = "000-00-00000-00-0";

    }

    public Livro() { this.isbn = "000000000000000000"; }

    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.3) {
            return false;
        }
        this.valor -= this.valor * porcentagem;
        return true;
    }

    // Getters and Setters dos Atributos:
    boolean temAutor() {
        return this.autor != null;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getIsbn() {
        return isbn;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public Autor getAutor() {
        return autor;
    }




}
