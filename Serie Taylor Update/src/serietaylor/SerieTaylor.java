package serietaylor;
import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

/**
 * @author Daniel Torres 28781
 */
public class SerieTaylor {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se instancian clases y se inicia el controlador
        Modelo mod = new Modelo();
        Vista view = new Vista();
        Controlador ctrl = new Controlador(view,mod);
        ctrl.iniciar();
        view.setVisible(true);

    }

}
