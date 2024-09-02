public class CadastroDeLivros {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Yury Cunha");
        autor.setEmail("yurycunhah@hotmail.com");
        autor.setCpf("088.465.789-96");

        Livro n1 = new Livro(autor);
        n1.setNome("Curso Intensivo de Python");
        n1.setDescricao("Aprenda do princípio ao Avançado");
        n1.setValor(50);
//        n1.setIsbn("3213321654687987987");
        n1.mostrarDetalhes();

        Autor autor1 = new Autor();
        autor1.setNome("DeegDeeaw");
        autor1.setEmail("Deeg@gmail.com");
        autor1.setCpf("987654321");

        Livro n2 = new Livro(autor1);
        n2.setNome("Desbravando Java");
        n2.setDescricao("Tititi Tatata");
        n2.setValor(100);
        n2.setIsbn("654981556545886545512");
        n2.mostrarDetalhes();










    }
}
