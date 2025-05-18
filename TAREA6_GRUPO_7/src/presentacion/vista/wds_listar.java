package presentacion.vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import java.util.List;
import daoImpl.PersonaDaoImpl;
import entidad.Persona;

public class wds_listar extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTable table;

    public wds_listar() {
        setTitle("Programa");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Dni");

        table = new JTable(modelo);
        JScrollPane scrollPane = new JScrollPane(table);

        panel.add(scrollPane, BorderLayout.CENTER);

        add(panel);

        cargarDatos();
    }

    public DefaultTableModel getTableModel() {
        return (DefaultTableModel) table.getModel();
    }

    private void cargarDatos() {
        PersonaDaoImpl personaDao = new PersonaDaoImpl();
        List<Persona> personas = personaDao.readAll();
        DefaultTableModel modelo = getTableModel();
        modelo.setRowCount(0);

        for (Persona p : personas) {
            modelo.addRow(new Object[]{p.getNombre(), p.getApellido(), p.getDni()});
        }
    }

    public static void main(String[] args) {
        wds_listar ventana = new wds_listar();
        ventana.setVisible(true);
    }
}
