package presentacion.vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import presentacion.controlador.insert_controller;

//KEY LISTENERS
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;

public class agregar extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDNI;
	private JButton btnAceptar;
	
	
	public agregar() {
		
		setTitle("Agregar");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);;
		getContentPane().setLayout(null);
        
        //Nombre
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNombre.setBounds(107, 26, 45, 25);
		getContentPane().add(lblNombre);
				
		txtNombre = new JTextField();
		txtNombre.setBounds(221, 23, 140, 28);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		//VALIDACIÓN SOLO LETRAS PARA NOMBRE
		txtNombre.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) {
		        char c = e.getKeyChar();
		        if (!Character.isLetter(c) && c != ' ' && c != KeyEvent.VK_BACK_SPACE) {
		            e.consume();
		        }
		    }
		});
		
		
		//Apellido
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblApellido.setBounds(107, 75, 66, 25);
		getContentPane().add(lblApellido);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(221, 72, 140, 28);
		getContentPane().add(txtApellido);
		txtApellido.setColumns(10);
		
		//VALIDACIÓN SOLO LETRAS PARA APELLIDO
		txtApellido.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) {
		        char c = e.getKeyChar();
		        if (!Character.isLetter(c) && c != ' ' && c != KeyEvent.VK_BACK_SPACE) {
		            e.consume();
		        }
		    }
		});
		
		
		//DNI
		JLabel lblDNI = new JLabel("Dni");
		lblDNI.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDNI.setBounds(107, 122, 45, 25);
		getContentPane().add(lblDNI);
		
		txtDNI = new JTextField();
		txtDNI.setBounds(221, 119, 140, 28);
		getContentPane().add(txtDNI);
		txtDNI.setColumns(10);
		
		//VALIDACIÓN SOLO NÚMEROS PARA DNI
		txtDNI.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) {
		        char c = e.getKeyChar();
		        if (!Character.isDigit(c)) {
		            e.consume();
		        }
		    }
		});
		
		//btn Aceptar
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAceptar.setBounds(107, 171, 112, 28);
		getContentPane().add(btnAceptar);
		
	}
	
	
	//Getters
	public JTextField getTxtNombre() {
	    return txtNombre;
	}

	public JTextField getTxtApellido() {
	    return txtApellido;
	}

	public JTextField getTxtDNI() {
	    return txtDNI;
	}

	public JButton getBtnAceptar() {
	    return btnAceptar;
	}

	
	//Mostrar mensaje
	public void mostrarMensaje(String mensaje)
	{
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
	
}
