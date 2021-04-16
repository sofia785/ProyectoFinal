/*
 * 
 */
package problema2;

import java.util.Scanner;

/**
 * @author Sofia
 */
public class SegundoProblema {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double monto;
        int monedaorigen;
        int monedadestino;
        String monedaorigentxt = "";
        String monedadestinotxt = "";
        double resultado = 0;
        double tipoCambio = 0;
        //double colon = 1;
        //double dolar = 500;
        //double euro = 1.53;        
        
        
        System.out.println("------------Convertidor de divisas-------------");
        System.out.println("Ingrese el monto que quiere convertir: ");
        monto = sc.nextDouble();
        
        System.out.println("Seleccione el tipo de moneda inicial." + " \n " + "(1) Colones" + " \n " + "(2) Dolares" + " \n " + "(3) Euros");
        monedaorigen = sc.nextInt();
        
        System.out.println("Seleccione el tipo de moneda al que desea cambiar." + " \n " + "(1) Colones" + " \n " + "(2) Dolares" + " \n " + "(3) Euros");
        monedadestino = sc.nextInt();
        
        System.out.println("Ingrese el tipo de cambio: ");
        tipoCambio = sc.nextDouble();
        
        if (monedaorigen == 1 && monedadestino == 1){
           resultado = (monto * tipoCambio);
           monedaorigentxt = "Colones";
           monedadestinotxt = "Colones";
        }
        
        if (monedaorigen == 1 && monedadestino == 2){
           resultado = (monto / tipoCambio);
           monedaorigentxt = "Colones";
           monedadestinotxt = "Dolares";
        }
        
        if (monedaorigen == 1 && monedadestino == 3){
           resultado = (monto / tipoCambio);
           monedaorigentxt = "Colones";
           monedadestinotxt = "Euros";
        }
        
        if (monedaorigen == 2 && monedadestino == 1){
           resultado = (monto * tipoCambio);
           monedaorigentxt = "Dolares";
           monedadestinotxt = "Colones";
        }
        
        if (monedaorigen == 2 && monedadestino == 2){
           resultado = (monto * tipoCambio);
           monedaorigentxt = "Dolares";
           monedadestinotxt = "Dolares";
        }
        
        if (monedaorigen == 2 && monedadestino == 3){
           resultado = (monto * tipoCambio);
           monedaorigentxt = "Dolares";
           monedadestinotxt = "Euros";
        }
        
        if (monedaorigen == 3 && monedadestino == 1){
           resultado = (monto * tipoCambio);
           monedaorigentxt = "Euros";
           monedadestinotxt = "Colones";
        }
        
        if (monedaorigen == 3 && monedadestino == 2){
           resultado = (monto / tipoCambio);
           monedaorigentxt = "Euros";
           monedadestinotxt = "Colones";
        }
        
        if (monedaorigen == 3 && monedadestino == 3){
           resultado = (monto * tipoCambio);
           monedaorigentxt = "Euros";
           monedadestinotxt = "Colones";
        }
        
    System.out.println(monto + " " + monedaorigentxt + " es igual a " + resultado + " " + monedadestinotxt);    
    System.out.println("--------------Fin------------------");    
    }//fin main
}
