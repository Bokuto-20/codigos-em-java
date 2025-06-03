import java.util.Scanner; 

public class bhaskara {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        double a=0, b=0, c=0, x1=0, x2=0, delta=0; //o Número que for colocado no "C" tem que ser Negativo.

        System.out.println("Digite o primeiro número:");
        a=tec.nextDouble();

        System.out.println("Digite o segundo Número: ");
        b=tec.nextDouble();

        System.out.println("Digite o terceiro Número: ");
        c=tec.nextDouble();

        //Calculo de DELTA!.

        delta=(b*b)-(4*a*c);
        
        //Calculo da equação.

        x1=(-b + Math.sqrt(delta))/(2*a);

        x2=(-b + Math.sqrt(delta))/(2*a);

        System.out.println("O valor de Delta é: "+ delta);

        System.out.println("O resultado de x1 é: "+ x1);

        System.out.println("O resultado de x1 é: "+ x1);

        tec.close();
    }
}