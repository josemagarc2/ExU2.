package ExU2;
import java.util.Scanner;

public class pregunta4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese el Numero Base:");
        long base = teclado.nextLong();
        System.out.print("Ingrese el Numero Exponente:");
        Long exponente = teclado.nextLong();
        
        System.out.println("Resultado " + potencia(base,exponente));
    }
    
    public static long potencia(long base, long exponente){
        if(exponente ==0)return 1;
        return base * potencia(base,exponente-1);

    }
    
}
