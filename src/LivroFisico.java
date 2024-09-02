import java.util.ArrayList;
import java.util.List;

public class LivroFisico extends Livro {

    public LivroFisico (Autor autor) {
        super(autor);
    }

    public double getTaxaDeImpressao() {
        return this.getValor() + (getValor() * 0.05);
    }






}
