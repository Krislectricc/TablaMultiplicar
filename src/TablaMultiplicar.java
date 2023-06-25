 import java.util.*;
/**
 * HACIENDO CAMBIOS PARA EL EJERCICIO DE CLASEEE
 * @author Enrique
 */
public class TablaMultiplicar {

    public static void main(String[] args) {
 
        Scanner entra = new Scanner(System.in);
        int n;
        System.out.print("SOLO PON EL NUMERO 4 ");                                                         
        n = entra.nextInt();
        System.out.println("Tabla del " + n);
        System.out.println("***********");
        for(int i = 1; i<=10; i++){
             System.out.println(n + "x" + i + "=" + n*i);                                                     
        }
    }
}