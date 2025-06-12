package matematica;

public class Main {

    public static void main(String[] args) {
        Matematica resultado = new Matematica();

        System.out.println("-----TESTE DE BHASKARA------");
        resultado.Bhaskara(1, 5, 6);

        System.out.println();

        System.out.println("-----TESTE DO IMPAR OU PAR------");
        System.out.println(resultado.imparPar(2));

        System.out.println();

        System.out.println("-----TESTE DA MÉDIA DE TRÊS NÚMEROS------");
        resultado.media(1, 10, 88);

        System.out.println();

        System.out.println("-----TESTE DA Calculadora------");
        resultado.calculadora (25, '*', 5);


    }
}