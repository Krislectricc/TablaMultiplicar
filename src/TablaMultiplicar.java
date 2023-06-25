 import java.util.*;
/**
 * Programa que lea un número entero N y muestre la tabla de multiplicar de ese número.
 * @author Enrique
 */
public class TablaMultiplicar {

    public static void main(String[] args) {
 
        Scanner entra = new Scanner(System.in);
        int n;
        System.out.print("Introduce un número entero: ");                                                         
        n = entra.nextInt();
        System.out.println("Tabla del " + n);
        System.out.println("***********");
        for(int i = 1; i<=10; i++){
             System.out.println(n + "x" + i + "=" + n*i);                                                     
        }
    }
}