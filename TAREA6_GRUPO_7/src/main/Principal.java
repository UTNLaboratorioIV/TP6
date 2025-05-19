/*package main;

import daoImpl.PersonaDaoImpl;
import entidad.Persona;

public class Principal {

	public static void main(String[] args) {
		


	}

}*/

package main;

import negocio.PersonaNegocio;
import negocioImpl.PersonaNegocioImpl;
import presentacion.controlador.insert_controller;
import presentacion.vista.wds_insert;

public class Principal {

    public static void main(String[] args) {
        //CREO LA VISTA
        wds_insert ventana = new wds_insert();
        ventana.setBounds(100, 100, 500, 300); 
        ventana.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        

        //CAPA DE NEGOCio
        PersonaNegocio personaNegocio = new PersonaNegocioImpl();

        //CONTROLADOR
        insert_controller controlador = new insert_controller(ventana, personaNegocio);
        
        ventana.setVisible(true); // Mostrar la ventana
    }
}



