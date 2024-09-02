public class Testes {
    public static void main(String[] args) {

        int v1 = 8;
        int v2 = 9;
        int valor = v1 > v2 ? 1 : 0;

        System.out.println(valor);

        for ( int i = 0; i <= 10; i++) {
            if (i == 7) {
                continue;
            } System.out.println("Continue pula o número 7 " + i);
        }

        for ( int i = 0; i <= 10; i++) {
            if (i == 7) {
                break;
            } System.out.println("Break para no número 7 " + i);
        }


        int v3 = 7;
        int v4 = 8;
        int v5 = 9;

        if ( v3 < v4 && v4 < v5 ) {
            System.out.println("Teste de \"E\" OK ");

        }

        if ( v3 < v4 || v4 < v5 ) {
            System.out.println("Teste de \"OU\" OK ");

        }

        boolean negada = 1 > 0;
        negada = 1<0;

        if (!negada) {
            System.out.println("Teste De Negação");
        }






    }
}
