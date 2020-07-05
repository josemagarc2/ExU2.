
package ExU2;

import java.util.Scanner;

public class pregunta1 {

 
    public static void main(String[] args) throws InterruptedException {
         int cat1=0,cat2=0,cat3=0;
         double priz1 = 0,priz2=0,priz3=0;
         double total1=0,total2=0,total3=0, total=0;
        Scanner Entrada = new Scanner(System.in);
        
        System.err.println("INICIANDO OPERACION");
        
         Thread.sleep(2*1000);
         
         
         System.err.println("ingrese total de carros de categoria 1 (min 1 carro)");
         
         cat1=Entrada.nextInt();
         if (cat1==0) {
           System.err.println("ingrese total de carros de categoria 1 (min 1 carro)");         
         cat1=Entrada.nextInt();
        }else{
           System.out.println("ingrese el precio de la caregoria");
             priz1=Entrada.nextDouble();      
         }
         
         total1=cat1*priz1*0.1;
         
         
         System.err.println("ingrese total de carros de categoria 2 (min 1 carro)");
         
         cat2=Entrada.nextInt();
         if (cat2==0) {
           System.err.println("ingrese total de carros de categoria 2 (min 1 carro)");         
         cat2=Entrada.nextInt();
        }else{
           System.out.println("ingrese el precio de la caregoria");
             priz2=Entrada.nextDouble();      
         }
         
         total2=cat2*priz2*0.07;
         
         System.err.println("ingrese total de carros de categoria 3 (min 1 carro)");
         
         cat3=Entrada.nextInt();
         if (cat3==0) {
           System.err.println("ingrese total de carros de categoria 3 (min 1 carro)");         
         cat3=Entrada.nextInt();
        }else{
           System.out.println("ingrese el precio de la caregoria");
             priz3=Entrada.nextDouble();      
         }
         
         total3=cat3*priz3*0.05;
         total=total1+total2+total3;
         
         
          System.out.println("EL PAGO TOTAL A REALIZAR ES:");
          System.out.println("PAGO CATEOGRIA 1:"+ total1);
          System.out.println("PAGO CATEGORIA 2:"+ total2);
          System.out.println("PAGO CATEGORIA 3:"+ total3);
          
          System.out.println("TOTAL:"+total);
             
         
         
        
        
         
         
         
        
        
        
        
        
        
        
        
    }
    
}
