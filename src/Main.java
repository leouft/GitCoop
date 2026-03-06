import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static void main(){

        menu();

    }

    static void menu(){
        int op;
        do{
            float a, b;
            System.out.print("\nO que deseja fazer?\nSomar [1]\nSubtrair [2]\nMultiplicar [3]\nDividir [4]\nSair [0]\nOpção: ");
            op = sc.nextInt();
            switch (op){
                case 1:
                    System.out.print("Digite os números a serem somados: ");
                    a = sc.nextFloat();
                    b = sc.nextFloat();
                    System.out.println("\nSoma: " + soma(a, b));
                    break;
                case 2:
                    System.out.print("Digite os números a serem subtraídos: ");
                    a = sc.nextFloat();
                    b = sc.nextFloat();
                    System.out.println("\nSubtração: " + sub(a, b));
                    break;
                case 3:
                    System.out.print("Digite os números a serem multiplicados: ");
                    a = sc.nextFloat();
                    b = sc.nextFloat();
                    System.out.println("\nMultiplicação: " + multi(a, b));
                    break;
                case 4:
                    System.out.print("Digite os números a serem divididos: ");
                    a = sc.nextFloat();
                    b = sc.nextFloat();
                    if (b == 0){
                        System.out.println("\nNão é possível dividir por zero.");
                    } else {
                        System.out.println("\nDivisão: " + div(a, b));
                        }
                    break;
                case 0:
                    System.out.println("\nSaindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (op != 0);
    }

    static float sub(float a, float b){
        return a - b;
    }

    static float div(float a, float b){
        return a / b;
    }

    static float soma(float a, float b){
        return(a+b);
    }

    static float multi(float a, float b){
        return(a*b);
    }
}
