package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;
/**
 * @author Daniel Torres 287871
 */
public class Controlador implements ActionListener{
    private Vista view;
    private Modelo model;
    //Instancia
    public Controlador(Vista view,Modelo model){
        this.view = view;
        this.model = model;
        this.view.btnCalcular.addActionListener(this);
    }
    //Inicia el Jframe
    public void iniciar(){
        view.setTitle("Serie Taylor (Sen)");
        view.setLocationRelativeTo(null);
    }
    //Programación para el evento en el boton
    public void actionPerformed(ActionEvent e){
        model.setValorN(Integer.parseInt(view.txtN.getText()));
        model.setAngulo(Double.parseDouble(view.txtX.getText()));
        model.seno();
        view.txtResultado.setText(String.valueOf(model.getSalida()));
    }
            
}
