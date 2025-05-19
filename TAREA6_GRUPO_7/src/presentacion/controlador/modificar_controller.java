package presentacion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.DefaultListModel;

import entidad.Persona;
import negocio.PersonaNegocio;
import presentacion.vista.modificar;

public class modificar_controller implements ActionListener {
	
	private modificar ventana;
	private PersonaNegocio personaNegocio;
	private List<Persona> listaPersonas;

	public modificar_controller(modificar ventana, PersonaNegocio personaNegocio)
	{
		this.ventana = ventana;
		this.personaNegocio = personaNegocio;

		this.ventana.getBtnModificar().addActionListener(e -> modificarPersona());
		this.ventana.getListaPersonas().addListSelectionListener(e -> seleccionarPersona());
	}
	
	public void inicializar()
	{
		refrescarLista();
	    ventana.mostrar();
	}
	 
	private void refrescarLista()
	{
		listaPersonas = personaNegocio.readAll();
	    DefaultListModel<Persona> modelo = new DefaultListModel<>();
	    for (Persona p : listaPersonas)
	    {
	    	modelo.addElement(p);
	    }
	    ventana.getListaPersonas().setModel(modelo);
	}
	
	private void seleccionarPersona() {
        Persona seleccionada = ventana.getListaPersonas().getSelectedValue();
        if (seleccionada != null) {
            ventana.getTxtDNI().setText(seleccionada.getDni());
            ventana.getTxtNombre().setText(seleccionada.getNombre());
            ventana.getTxtApellido().setText(seleccionada.getApellido());
        }
    }
	
	

	private void modificarPersona() {
        Persona seleccionada = ventana.getListaPersonas().getSelectedValue();
        if (seleccionada != null) {
            String nuevoNombre = ventana.getTxtNombre().getText().trim();
            String nuevoApellido = ventana.getTxtApellido().getText().trim();

            if (!nuevoNombre.isEmpty() && !nuevoApellido.isEmpty()) {
                seleccionada.setNombre(nuevoNombre);
                seleccionada.setApellido(nuevoApellido);
                boolean actualizado = personaNegocio.update(seleccionada);

                if (actualizado) {
                    ventana.mostrarMensaje("Persona modificada con éxito.");
                    refrescarLista();
                } else {
                    ventana.mostrarMensaje("Error al modificar persona.");
                }
            } else {
                ventana.mostrarMensaje("Nombre y apellido no pueden estar vacíos.");
            }
        } else {
            ventana.mostrarMensaje("Seleccione una persona de la lista.");
        }
    }

	@Override
	public void actionPerformed(ActionEvent e) { }
}
