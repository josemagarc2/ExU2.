package ExU2;

import static ExU2.pregunta3.Perfect;
import java.util.Scanner;

public class pregunta3 {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO PARA DETERMINAR LOS NUMEROS "); 
        int rango=0;
        
        rango=in.nextInt(); 
        int aux = 0;
        int i =1;
        while (aux<rango) {   
            if ((Perfect(i))) {
                System.out.println("El numeró "+i+"  es perfecto");
                    aux++;
            }
            i++;        
        }          
        }
        
        
    
   
    public static boolean Perfect(int number) {
        boolean bool = false;
        int addDivisors = 0, divisor = 1;
       while(divisor <= number/2){
           if(number % divisor==0)
               addDivisors += divisor;
           divisor++;
       }
        if(addDivisors == number)
            bool = true; 
        return bool;
    }


    
}
