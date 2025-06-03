import java.util.Scanner;

public class index2 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        boolean opcaoValida=false;
        char confirm;
        int valor=0;
        int d=0;
        do {
            
    do {
        System.out.println("---------------------------");
        System.out.println(" DOAÇÃO PARA A CARIDADADE");
        System.out.println("---------------------------");
        System.out.println("tipos de doações.");
        System.out.println("[1] Doação de R$:15");
        System.out.println("[2] Doação de R$:25");
        System.out.println("[3] Doação de R$:45");
        System.out.println("[4] Deseja doar outro Valor");
        System.out.println("[5] Não fazer uma doação");
        System.out.println("Escolha uma das opções: ");
        d = tec.nextInt();

            if (d>=1 && d<=5) {
                opcaoValida=true;
            }
            else{
                opcaoValida=false;
                System.out.println("Informção errada por favor digitar novamente:");
            }

        } while (!opcaoValida);

        switch (d) {
            case 1:
                 valor = 15;

                break;

            case 2:
                valor= 25;
                break;
            case 3:
                valor = 45;
                break;
            case 4:
            do {
                
                System.out.println("Escolha o valor que deseja doar: "); 
                valor = tec.nextInt();

                if (valor<=0) {
                    System.out.println("Doação invalida, tente novamente.");
                }
                } while (valor<=0);
                break;

            case 5:
                valor=0;
                System.out.println("Tudo bem. Doação não realizada");
                break;
            default:
                System.out.println("Erro na escolha.");
                break;
            }
            System.out.println("O seu valor doado foi R$: " + valor);

            System.out.println("Deseja doar novamente?(S/N): ");
            tec.nextLine();
            confirm =tec.next().charAt(0);

              } while (confirm=='s'|| confirm=='S');
            tec.close();
    }
    
}
