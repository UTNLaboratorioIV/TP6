package main;

import daoImpl.PersonaDaoImpl;
import entidad.Persona;
import negocio.PersonaNegocio;
import negocioImpl.PersonaNegocioImpl;
import presentacion.controller.Controlador;
import presentacion.vista.VentanaPrincipal;
import presentacion.vista.eliminar;

public class Principal {

	public static void main(String[] args) {
		
		  PersonaNegocio personaNegocio = new PersonaNegocioImpl(); // 
	        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();

	        Controlador controlador = new Controlador(ventanaPrincipal, personaNegocio);

	}

}
