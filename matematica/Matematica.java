package matematica;

public class Matematica {
    // Calculo de Bhaskara e delta
     public void Bhaskara (double a, double b, double c){
        double  delta, x1, x2;

        //Calculo de Delta.
        delta = Math.pow(b, 2) - (4*a*c);
        System.out.println("O valor de Delta é: "+ delta);

        //Calculo da equação 
        
        if (delta<0) {   // Se Delta for MENOR QUE ZERO ele irá constar que NÃO possui RAIZES REAIS 
            System.out.println("A equação não possui raizes reais.");
        }

        else if (delta==0) {  //Se o valor de DELTA for IGUAL a ZERO ele irá resolver SEM O DELTA.
            double x = -b /(2*a);
            System.out.println("A equação possui apenas uma equação Real X ="+ x);
        }

        else{  // Calculo NORMAL das Equaçõess. 
            x1 = (-b + Math.sqrt(delta)) / (2*a);
            x2 = (-b - Math.sqrt(delta)) / (2*a);

            System.out.println("O valor de x1 é: "+ x1);
            System.out.println("O valor de x2 é: "+ x2);
        }
     }

     //Código que irá realizar o resultado de impar ou par com base no Número digitado. 
     public String imparPar(int a){

       return "O seu Número é: " + a + ((Math.floorMod(a, 2)==0)?" Par":" Impar"); //Lembrar somente dos Parenteses
    } 

     //Código que irá realizar a média de tres números.

     public void media (double a, double b, double c){
        System.out.println("A média dos números é: "+(a+b+c)/3);
     }

     public void calculadora (double a, char Operador , double b){

        System.out.println("o seu primeiro número: "+a);
        System.out.println("O seu operador é: "+Operador);
        System.out.println("o Seu Segundo Número: "+b);

        switch (Operador) {
            case '+':
                System.out.println("O Seu Resultado é: "+(a+b));
                break;

                case '-':
                System.out.println("O Seu Resultado é: "+(a-b));
                break;

                case '*':
                System.out.println("O Seu Resultado é: "+(a*b));
                break;

                case '/':
                System.out.println("O Seu Resultado é: "+(a/b));
                break;
        
            default:
            System.out.println("Operador invalido! ");
                break;
        }

     }
}


