/*
 * 
 */
package problema6;

/**
 *
 * @author Sofia
 */
public class SistemaNotasControlador {
    boolean modoGrafico =true;
    SextoProblema seis = new SextoProblema(2);
    vista vi = new vista(seis);
    
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
                default:
            }
        } while (op != 3);
    }
}//fin
