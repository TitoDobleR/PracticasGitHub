import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Ingrese un 1 o 0: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i == 0) {
            return;
        }
        else if (i == 1) {
            System.out.println("ingrese un texto: ");
            Scanner sc1 = new Scanner(System.in);
            String texto = sc1.nextLine();
            System.out.println(texto);
        }
        }
    }