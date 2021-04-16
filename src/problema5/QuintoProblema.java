/*
 */
package problema5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Sofia
 */
public class QuintoProblema {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
        int a;
        int caja1 [] = new int [4];
        int caja2 [] = new int [4];
        int caja3 [] = new int [8];
        
        //ingresar numeros del primer conjunto
        for (i = 0; i < caja1.length; i++){
            System.out.printf("Introduzca un número entero para el primer cojunto: ");
            caja1[i] = sc.nextInt();
        }
        
        //ingresar numero del segundo conjunto
        for (i = 0; i < caja2.length; i++){
            System.out.printf("Introduzca un número entero para el segundo conjunto: ");
            caja2[i] = sc.nextInt();
        }
        
        //ordenar caja1
        System.out.println("Primer conjunto ordenado: ");
        Arrays.sort(caja1);
        for (i = 0; i < caja1.length; i++){
            System.out.println(caja1[i]);
        }
        
        //ordenar caja2
        System.out.println("Segundo conjunto ordenado: ");
        Arrays.sort(caja2);
        for (i = 0; i < caja2.length; i++){
            System.out.println(caja2[i]);
        }
        
        //intercalar cajas
        a = 0;
        for (i = 0 ; i < caja1.length ; i++){
            caja3 [a] = caja1 [i];
            a++;
            caja3 [a] = caja2 [i];
            a++;
        }
        //imprimir caja3
        System.out.println("Conjuntos intercalados: ");
        for (a = 0; a < caja3.length; a++){
            System.out.println(caja3[a]);
        }
        
        //ordenar caja3
        System.out.println("Conjuntos intercalados ordenados: ");
        Arrays.sort(caja3);
        for (a = 0; a < caja3.length; a++){
            System.out.println(caja3[a]);
        }
    }
}
