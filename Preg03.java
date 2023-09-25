import java.util.Scanner;

public class Preg03 {


    public static void main(String[] args) {
        Scanner trabajo = new Scanner(System.in);
        double horas,horaAdicional=2,suma=0;
        System.out.print("Ingrese el numero de horas: ");
        horas = trabajo.nextDouble();
        if(horas>=4){
            suma += 6;
            horas=horas-4;
            if(horas>0){
                suma+=horas*horaAdicional;
            }
        }else{
            suma=6;
        }
        System.out.println("Importe a pagar: S/. "+suma);
    }
    
}
