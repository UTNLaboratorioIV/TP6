package presentacion.vista;

import java.awt.EventQueue;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import entidad.Persona;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class eliminar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnEliminar;
	private JList<Persona> jlistPersonas;
	private DefaultListModel<Persona> modeloLista;

	public eliminar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblEliminarUser = new JLabel("Seleccionar usuario");
		lblEliminarUser.setBounds(98, 11, 134, 14);
		contentPane.add(lblEliminarUser);

		modeloLista = new DefaultListModel<>();
		jlistPersonas = new JList<>(modeloLista);
		jlistPersonas.setBounds(98, 37, 223, 153);
		contentPane.add(jlistPersonas);

		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(170, 201, 89, 23);
		contentPane.add(btnEliminar);
	}

	// nos de vuelve el boton para enlazar con el controlador 
	public JButton getbtnEliminar() {
		return btnEliminar;
	}

	// nos da la persona seleccionada en el list 
	public Persona getPersonaSeleccionada() {
		return jlistPersonas.getSelectedValue();
	}

	// carga la info de la db
	public void actualizarLista(List<Persona> personas) {
		 if (personas == null) return; 

		    DefaultListModel<Persona> model = new DefaultListModel<>();
		    for (Persona p : personas) {
		        model.addElement(p);
		    }
		    jlistPersonas.setModel(model);
	}
}
