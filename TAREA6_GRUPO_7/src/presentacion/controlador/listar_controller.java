package presentacion.controlador;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import presentacion.vista.*;
import daoImpl.PersonaDaoImpl;
import entidad.Persona;

public class listar_controller {

    public void llenarTabla(wds_listar ventana) {
        PersonaDaoImpl personaDao = new PersonaDaoImpl();
        List<Persona> personas = personaDao.readAll();

        DefaultTableModel modelo = ventana.getTableModel();
        modelo.setRowCount(0);

        for (Persona p : personas) {
            modelo.addRow(new Object[]{p.getNombre(), p.getApellido(), p.getDni()});
        }
    }

    public static void main(String[] args) {
    	wds_listar ventana = new wds_listar();
    	listar_controller controlador = new listar_controller();
        controlador.llenarTabla(ventana);
        ventana.setVisible(true);
    }
}
