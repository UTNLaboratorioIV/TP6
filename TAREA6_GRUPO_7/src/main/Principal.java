package main;

import negocio.PersonaNegocio;
import negocioImpl.PersonaNegocioImpl;
import presentacion.controlador.modificar_controller;
import presentacion.vista.VentanaPrincipal;
import presentacion.vista.modificar;

public class Principal {

	public static void main(String[] args) {
		
        PersonaNegocio pNeg = new PersonaNegocioImpl();

        VentanaPrincipal vistaPrincipal = new VentanaPrincipal();
       
        modificar vistaModificar = new modificar();
        modificar_controller controladorModificar = new modificar_controller(vistaModificar, pNeg);
        vistaPrincipal.getMenuModificar().addActionListener(e -> controladorModificar.inicializar());
        vistaPrincipal.setVisible(true);

	}

}
