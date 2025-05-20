package presentacion.controlador;

import java.util.List;
import javax.swing.JOptionPane;

import presentacion.vista.eliminar;
import entidad.Persona;
import negocio.PersonaNegocio;

public class eliminar_controller {

    private eliminar eliminarVista;
    private PersonaNegocio pNeg;

    public eliminar_controller(PersonaNegocio pNeg) {
        this.eliminarVista = new eliminar();
        this.pNeg = pNeg;

        inicializar();
    }

    public void inicializar() {
        List<Persona> lista = pNeg.readAll();
        eliminarVista.actualizarLista(lista);

        eliminarVista.getbtnEliminar().addActionListener(e -> {
            Persona seleccionada = eliminarVista.getPersonaSeleccionada();
            if (seleccionada != null) {
                System.out.println("Intentando eliminar persona con DNI: " + seleccionada.getDni()); // <-- Aquí
                int confirm = JOptionPane.showConfirmDialog(null, "¿Estás seguro de eliminar?");
                if (confirm == JOptionPane.YES_OPTION) {
                	if (pNeg.delete(seleccionada)) {
                	    System.out.println("Eliminación exitosa en delete()");
                	    JOptionPane.showMessageDialog(null, "Eliminado.");
                	    eliminarVista.actualizarLista(pNeg.readAll());
                	} else {
                	    System.out.println("Eliminación fallida en delete()");
                	    JOptionPane.showMessageDialog(null, "No se pudo eliminar la persona.");
                	}

                }
            }
        });

    }

    public void mostrarVista() {
        eliminarVista.setVisible(true);
    }
}
