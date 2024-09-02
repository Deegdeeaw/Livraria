public class RegrasDeDesconto {
    public static void main(String[] args) {

        Autor n1 = new Autor();
        n1.setCpf("1321354656546");
        n1.setNome("lkasl alskdjla slkj");
        n1.setEmail("ashjdjkjashd@Jjjjjjjjjj");

        Livro livro = new Livro(n1);
        livro.setValor(59.90);

        System.out.println("Valor do livro: R$" + livro.getValor());

        if (!livro.aplicaDescontoDe(0.4)) {
            System.out.println("Desconto inválido");
        } else {
            System.out.println("Valor do livro com desconto: R$" + livro.getValor());
        }


    }



}
