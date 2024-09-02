public class RegistroDeVendas {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Yury Cunha");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test-Driven Development");

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Test-Driven Development");




    }


}
