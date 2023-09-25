import java.util.Scanner;


public class Preg04 {
    
    public static void main(String[] args) {
        Scanner trabajo = new Scanner(System.in);
        double ganancia,donacion=0;
        System.out.print("Ingrese su ganancia: ");
        ganancia = trabajo.nextDouble();
        if(ganancia<=1000){
            donacion = 0.05*ganancia;
        }else if(ganancia>1000 && ganancia<=1500){
            donacion = 0.07*ganancia;
        }else if(ganancia>1500 && ganancia<=2000){
            donacion = 0.08*ganancia;
        }else if(ganancia>2000 && ganancia<=5000){
            donacion = 0.10*ganancia;
        }else if(ganancia>5000){
            donacion = 0.15*ganancia;
        }
        System.out.println("Donacion: S/. "+donacion);
    }
    
}
