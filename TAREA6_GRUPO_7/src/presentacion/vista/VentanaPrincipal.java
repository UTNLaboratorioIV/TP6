package presentacion.vista;
import presentacion.controlador.insert_controller;
import presentacion.controlador.listar_controller;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu mnNewMenu = new JMenu("Persona");
		menuBar.add(mnNewMenu);
		
		JMenuItem menuAgregar = new JMenuItem("Agregar");
		mnNewMenu.add(menuAgregar); 
		menuAgregar.addActionListener(e -> {
			agregar ventana_agregar = new agregar();
			insert_controller controlador = new insert_controller(ventana_agregar);
			ventana_agregar.setVisible(true);
		});

		JMenuItem menuModificar = new JMenuItem("Modificar");
		mnNewMenu.add(menuModificar);
		menuModificar.addActionListener(e ->{
			modificar frmMod = new modificar();
			frmMod.setVisible(true);
		});
	
		JMenuItem MenuEliminar = new JMenuItem("Eliminar");
		mnNewMenu.add(MenuEliminar);
		MenuEliminar.addActionListener(e ->{
			eliminar frmEliminar = new eliminar();
			frmEliminar.setVisible(true);
		});
		
		JMenuItem menuListar = new JMenuItem("Listar");
		mnNewMenu.add(menuListar);
			menuListar.addActionListener(e ->{
				listar ventana = new listar();
				listar_controller controlador = new listar_controller();
				controlador.llenarTabla(ventana);
				ventana.setVisible(true);
			});
	}

	public JButton getBtnEliminar() {
        return getBtnEliminar();
    }
	public JButton getBtnAgregar() {
        return getBtnAgregar();
    }

}
