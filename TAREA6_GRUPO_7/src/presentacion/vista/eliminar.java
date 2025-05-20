package presentacion.vista;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.List;

import entidad.Persona;

public class eliminar extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JList<Persona> listaPersonas;
    private JButton btnEliminar;

    public eliminar() {
        setTitle("Eliminar Persona");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        listaPersonas = new JList<>();
        listaPersonas.setBounds(30, 20, 370, 180);
        contentPane.add(listaPersonas);

        btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(165, 220, 100, 25);
        contentPane.add(btnEliminar);
    }

    public void actualizarLista(List<Persona> personas) {
        DefaultListModel<Persona> model = new DefaultListModel<>();
        for (Persona p : personas) {
            model.addElement(p);
        }
        listaPersonas.setModel(model);
    }

    public Persona getPersonaSeleccionada() {
        return listaPersonas.getSelectedValue();
    }

    public JButton getbtnEliminar() {
        return btnEliminar;
    }
}
