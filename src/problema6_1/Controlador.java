/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema6_1;

/**
 *
 * @author Sofia
 */
public class Controlador {
    boolean modoGrafico =true;
    SistemaNotas sn = new SistemaNotas(2);
    Vista vi = new Vista(sn);
    
    
    
    
    
    
    
    
    
    
    
    
       public void iniciar() {
        int op;
        do {
            op = vi.getOpcion();
            switch (op) {
                case 1:
                    vi.leaNota();
                    break;
                case 2:
                    vi.muestreNotas();
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    break;
                case 8:
                    
                    break;
                case 9:
                    
                    break;
                case 10:
                    
                    break;
                  
                default:
            }
        } while (op != 11);
    }
    
}
