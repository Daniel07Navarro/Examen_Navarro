import java.util.Scanner;


public class Preg02 {
    
    public static void main(String[] args) {
        Scanner trabajo = new Scanner(System.in);
        int suma = 0,n;
        System.out.print("Ingrese el valor de n: ");
        n = trabajo.nextInt();
        for(int i=0;i<=n;i++){
            suma+= i;
        }
        System.out.println("Sumatoria: "+suma);
    }
    
}  
