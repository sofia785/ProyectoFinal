package examenFinal;

import java.util.Scanner;

/**
 *
 * @author Sofia
 */
public class Controlador {
    Scanner sc = new Scanner(System.in);
        
        System.out.println("----------Control Equipo de Sonido----------");
        System.out.println("Digite el numero que desea ejecutar del menú: ");
        System.out.println("(1) Reproducir lista de audios en orden \n "
                + "(2) Reproducir lista de audios aleatoria"
                + " \n (3) Mostrar lista de audios \n (4) Agregar nuevo audio \n "
                + "(5) Eliminar audio \n (6) Salir");
        public void iniciar() {
            String menu;
            do {
                menu = sc.nextLine();

                switch (menu){
                    case "1":

                        break;

                    case "2":

                        break;

                    case "3":

                        break;

                    case "4":

                        break;

                    case "5":

                        break;

                    default:
                }
            } while (menu != "6");
    }
        
    
    
}
