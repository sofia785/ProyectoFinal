/**
 * 
 */
package problema4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Sofia
 */
public class CuartoPrograma {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numeros[] = new int[5];
        int intCantidad;
        int intNumBus;
        String strRespuestaUsiario;
        int i;
        
        for (i = 0; i < numeros.length; i++){
            System.out.printf("Introduzca un número entero:");
            numeros[i] = sc.nextInt();
        }
        
        System.out.println("Vector de números ingresados");
        
        for (i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
        
        System.out.println("Vector de números ordenados");
        Arrays.sort(numeros);
        
        for (i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
        
        System.out.printf("Introduzca el número que desea buscar:");
        intNumBus = sc.nextInt();
        
        if (Arrays.binarySearch(numeros,intNumBus)>0){
            System.out.println("El número buscado (" + intNumBus + ") si existe en el vector!");
        }
        
        else{
            System.out.println("El número buscado (" + intNumBus + ") no existe en el vector!");
        }
        
    }
        
}
