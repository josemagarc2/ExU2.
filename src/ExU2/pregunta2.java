
package ExU2;

import java.util.Scanner;

public class pregunta2 {

    public static void main(String[] args) {
        System.out.println("CREAR TABLAS DE MULTIPLICACION DEL 1 AL 20");
        System.out.println("DESEA INICIAR (Y/N)");
          Scanner Entrada = new Scanner(System.in);
          String confirmacion =Entrada.next();
        if (confirmacion.equals("Y")) {
            
            for (int i = 1; i < 21; i++) {
                System.out.println("  ");
                System.out.println("   ");
                System.out.println("TABLA DEL "+ i);
                System.out.println("-----------");                
                for (int j = 1; j < 11; j++) {
                  System.out.println( i +"x" +j+"="+i*j);                    
                }
                System.out.println("-----------");
                
            }
            
        }else{
           System.out.println("CERRANDO APLICACION");
           System.exit(0);
        }
    }
    
}
