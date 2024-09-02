public class Praticando {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Yury Cunha");
        autor.setCpf("031.456.789-99");
        autor.setEmail("yury@gmail.com");

        LivroFisico livro = new LivroFisico(autor);
        livro.setNome("Testando");
        livro.setDescricao("Apenas mais um teste");
        livro.setValor(100);
        double taxaImpressao = livro.getTaxaDeImpressao();
        livro.mostrarDetalhes();
        System.out.println(taxaImpressao);

        if (!livro.aplicaDescontoDe(0.40)) {
            System.out.println("Desconto inválido");
        } else {
            System.out.printf("Livro com desconto: R$ %.2f" , livro.getValor());
        }

        System.out.println("TESTE GITHUB");

    }
}
