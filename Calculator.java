import java.util.Scanner;

public class index {

    public static void main(String[]args){
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite o Primeiro Número: ");
        double num1 = tec.nextDouble();

        System.out.println("Digite o Segundo Número:");
        double num2 = tec.nextDouble();

        double r;

        System.out.println("Qual Operador você deseja usar ( + | - | * | / | % |)");
        char oper = tec.next().charAt(0);

        switch (oper) {
            case '+':
                System.out.println("O Resutado é: " +(r=num1+num2));    
                break;

            case '-':
                System.out.println("O Resultado é:" +(r=num1-num2));
                break;

            case '*':
                System.out.println("O Resultado é: " +(r=num1*num2));
                break;

            case '/':

                if (num2 != 0 && num1 !=0) {
                    System.out.println("O Resultado é: " +(r=num1/num2));
                }
                else{
                    System.out.println(" Calculo invalido :(" );
                }
                break;

            case '%':
            System.out.println("O Resultado é: " +(r=num1%num2));
            break;
            
            default:

            System.out.println(" Operador invalido");
                break;
        }

        System.out.println(oper);
        
    }
}