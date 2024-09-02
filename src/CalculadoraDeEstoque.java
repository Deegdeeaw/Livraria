public class CalculadoraDeEstoque {
    public static void main(String[] args) {

        double livroJava8 = 59.90;
        double livroTDD = 59.90;
        int qtdJava8 = 2;
        int qtdLivroTDD = 18;
        double somaJava8 = 0;
        double somaLivroTDD = 0;
        int i = 0;

        while ( i <= qtdJava8 ) {
            somaJava8 += livroJava8;
            i ++;

        }

        System.out.printf("O total dos livros Java 8 é: R$%.2f %n" , (somaJava8));

        if (somaJava8 < 150) {
            System.out.println("O estoque do livro Java 8 está baixo.");
        } else if (somaJava8 < 800) {
            System.out.println("O estoque do livro Java 8 está bom.");
        } else {
            System.out.println("O estoque do livro Java 8 está alto.");
        }



        for ( int i1 = 0; i1 <= qtdLivroTDD; i1++ ) {
            somaLivroTDD += livroTDD;
        }

        System.out.printf("O total dos livros TDD é: R$%.2f %n" , (somaLivroTDD));

        if (somaLivroTDD < 150) {
            System.out.println("O estoque do livro TDD está baixo.");
        } else if (somaLivroTDD < 800) {
            System.out.println("O estoque do livro TDD está bom.");
        } else {
            System.out.println("O estoque do livro TDD está alto.");
        }


        Autor autor1 = new Autor();
        autor1.setNome("Teste de Autor");
        autor1.setCpf("021.732.950-04");
        autor1.setEmail("yueyxunah@jijaisjias.com");

        Livro livro = new Livro(autor1);
        livro.setNome("Java 8 Prático");
        livro.setDescricao("Novos recursos da linguagem.");
        livro.setValor(59.90);
        livro.setIsbn("978-85-66250-46-6");
//        livro.setAutor(autor1);

        livro.mostrarDetalhes();

        Autor autor2 = new Autor();
        autor2.setNome("Teste de Autor");
        autor2.setCpf("021.732.950-04");
        autor2.setEmail("yueyxunah@jijaisjias.com");

        Livro livro001 = new Livro(autor2);
        livro001.setNome("Lógica de Programação");
        livro001.setDescricao("Crie seu Primeiro Programa.");
        livro001.setValor(59.90);
        livro001.setIsbn("978-85-66250-46-5");

        livro.mostrarDetalhes();




    }


}
