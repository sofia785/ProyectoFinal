
package problema6_1;
/**
 * @author Sofia
 */

import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Vista {
    SistemaNotas nota;

    Vista(SistemaNotas sn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    public int getOpcion() {
        int r = 0;
        try {
            r = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar nota\n2. Mostrar Notas\n3.Salir"));
            if ((r < 1) || (r > 3)) {
                throw new Exception("# de opcion  es inválido");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return r;
    }
    
}//fin class Vista
