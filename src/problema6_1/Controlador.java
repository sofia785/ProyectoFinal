package problema6_1;

import java.util.Date;

/**
 * @author Sofia
 */
public class Controlador {
    boolean modoGrafico =true;
    SistemaNotas sn = new SistemaNotas(2);
    Vista vi = new Vista(sn);
    
    public double[] calificaciones;
    private int indice;
    private String[] strNomAlums;
    private String[] strNomPadrs;
    private String[] strPtsObt;
    private String strNomProf;
    private String strNomCurso;
    private String strcodCurso;
    
    
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
