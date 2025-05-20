package presentacion.vista;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;

import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;

import entidad.Persona;


public class modificar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JList<Persona> listaPersonas;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDNI;
	private JButton btnModificar;
	
	public modificar() {	
		super();
		initialize();
	}
	
	public JList<Persona> getListaPersonas() { return listaPersonas; }
	public JTextField getTxtNombre() { return txtNombre; }
	public JTextField getTxtApellido() { return txtApellido; }
	public JTextField getTxtDNI() { return txtDNI; }
	public JButton getBtnModificar() { return btnModificar; }
	
	private void initialize() {
		
		setTitle("Modificar Persona");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		listaPersonas = new JList<Persona>();
		listaPersonas.setBounds(36, 11, 352, 172);
		contentPane.add(listaPersonas);

		txtNombre = new JTextField();
		txtNombre.setBounds(36, 205, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		txtApellido = new JTextField();
		txtApellido.setBounds(166, 205, 86, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);

		txtDNI = new JTextField();
		txtDNI.setBounds(302, 205, 86, 20);
		txtDNI.setEditable(false);
		contentPane.add(txtDNI);
		txtDNI.setColumns(10);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(166, 240, 100, 25);
		contentPane.add(btnModificar);
	}
	
	public void mostrar() {
        this.setVisible(true);
    }
	
	public void mostrarMensaje(String mensaje)
	{
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
	public void llenarLista(List<Persona> personas) {
	    DefaultListModel<Persona> model = new DefaultListModel<>();
	    for (Persona p : personas) {
	        model.addElement(p);
	    }
	    listaPersonas.setModel(model);
	}

}