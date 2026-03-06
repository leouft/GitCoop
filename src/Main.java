import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    static void main(){

        menu();

    }

    static void menu(){
        int op;
        do{
            int a, b;
            System.out.print("O que deseja fazer?\nSomar [1]\nSubtrair [2]\nMultiplicar [3]\nDividir [4]\nSair [0]\nOpção: )");
            op = sc.nextInt();
            switch (op){
                case 1:
                    System.out.print("Digite os números a serem somados: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("Soma: " + soma(a, b));
                    break;
                case 2:
                    System.out.print("Digite os números a serem subtraídos: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("Subtração: " + sub(a, b));
                    break;
                case 3:
                    System.out.print("Digite os números a serem multiplicados: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("Multiplicação: " + mult(a, b));
                    break;
                case 4:
                    System.out.print("Digite os números a serem divididos: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    if (b == 0){
                        System.out.println("Não é possível dividir por zero.");
                    } else {
                        System.out.println("Divisão: " + div(a, b));
                        }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    static int sub(int a, int b){
        return a - b;
    }

    static int div(int a, int b){
        return a / b;
    }
}
