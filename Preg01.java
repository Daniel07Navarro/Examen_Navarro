import java.util.Scanner;


public class Preg01 {
    
    public static void main(String[] args) {
        Scanner trabajo = new Scanner(System.in);
        int a,b,aux;
        System.out.print("A: ");
        a = trabajo.nextInt();
        System.out.print("B: ");
        b = trabajo.nextInt();
        aux= a;
        a = b;
        b = aux;
        System.out.println("");
        System.out.println("A: "+ a);
        System.out.print("B: "+ b+"\n");
    }
    
}
