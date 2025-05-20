package presentacion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import entidad.Persona;
import negocio.PersonaNegocio;
import negocioImpl.PersonaNegocioImpl;
import presentacion.vista.agregar;

public class insert_controller implements ActionListener{
	
	private PersonaNegocio personaNegocio = new PersonaNegocioImpl();
	private agregar insert_ventana;
	
	
	public insert_controller(agregar ventana)
	{
		this.insert_ventana = ventana;
		
		 //VINCULACIÖN DEL BOTÓN ACEPTAR
	    this.insert_ventana.getBtnAceptar().addActionListener(this);
	}
	
	
	public void EventoClickBtn_Insert(ActionEvent a) {
	    String nombre = insert_ventana.getTxtNombre().getText().trim();
	    String apellido = insert_ventana.getTxtApellido().getText().trim();
	    String dni = insert_ventana.getTxtDNI().getText().trim();

	    //VALIDAR CAMPOS VACÍOS
	    if (nombre.isEmpty() || apellido.isEmpty() || dni.isEmpty()) {
	        insert_ventana.mostrarMensaje("Es necesario completar\n    todos los campos");
	        return;
	    }

	    //VALIDACION DNI DUPLICADO
	    if (personaNegocio.existeDni(dni)) {
	      insert_ventana.mostrarMensaje("El DNI ingresado ya existe.");
	       return;
	    }

	    Persona nuevaPersona = new Persona(dni, nombre, apellido);
	    boolean estado = personaNegocio.insert(nuevaPersona);

	    if (estado) {
	        insert_ventana.mostrarMensaje("Persona agregada con éxito.");
	        insert_ventana.getTxtNombre().setText("");
	        insert_ventana.getTxtApellido().setText("");
	        insert_ventana.getTxtDNI().setText("");
	    } else {
	        insert_ventana.mostrarMensaje("Error al agregar persona.");
	    }
	}

	private Object getTxtDNI() {
		// TODO Auto-generated method stub
		return null;
	}


	private Object getTxtApellido() {
		// TODO Auto-generated method stub
		return null;
	}


	private Object getTxtNombre() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void actionPerformed(ActionEvent a) {
	    if (a.getSource() == insert_ventana.getBtnAceptar()) {
	        EventoClickBtn_Insert(a);
	    }
	}


}
