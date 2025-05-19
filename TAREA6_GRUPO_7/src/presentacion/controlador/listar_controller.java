package presentacion.controlador;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import presentacion.vista.*;
import daoImpl.PersonaDaoImpl;
import entidad.Persona;

public class listar_controller {

    public void llenarTabla(listar ventana) {
        PersonaDaoImpl personaDao = new PersonaDaoImpl();
        List<Persona> personas = personaDao.readAll();

        DefaultTableModel modelo = ventana.getTableModel();
        modelo.setRowCount(0);

        for (Persona p : personas) {
            modelo.addRow(new Object[]{p.getNombre(), p.getApellido(), p.getDni()});
        }
    }
}
