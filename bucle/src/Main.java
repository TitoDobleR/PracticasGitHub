import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("Ingrese un número: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        while (i<=20){
            System.out.println(i);
            i++;
        }
    }
}