public class Ebook extends Livro {
    public Ebook(Autor autor){
        super(autor);
    }
    private String waterMark;



    public String getWaterMark() {

        return waterMark;
    }
    public void setWaterMark(String waterMark) {

        this.waterMark = waterMark;
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.15) {
            return false;
        }
//        double desconto = this.getValor() * porcentagem;
//        this.setValor(this.getValor() - desconto);
//        return true;
        return super.aplicaDescontoDe(porcentagem);
    }












}
