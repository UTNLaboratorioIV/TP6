package presentacion.vista;
import presentacion.controlador.eliminar_controller;
import presentacion.controlador.insert_controller;
import presentacion.controlador.listar_controller;
import presentacion.controlador.modificar_controller;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import negocioImpl.PersonaNegocioImpl;
public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JMenuItem menuModificar;
	private JButton btnEliminar;

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
		menuModificar.addActionListener(e -> {
			modificar frmMod = new modificar();
			modificar_controller controlador = new modificar_controller(frmMod, new negocioImpl.PersonaNegocioImpl());
			controlador.inicializar();
		});
		
	
		JMenuItem MenuEliminar = new JMenuItem("Eliminar");
	    mnNewMenu.add(MenuEliminar);
	    MenuEliminar.addActionListener(e -> {
	        eliminar_controller controlador = new eliminar_controller(new PersonaNegocioImpl());
	        controlador.mostrarVista();
	    });

	    btnEliminar = new JButton("Eliminar");

		
		JMenuItem menuListar = new JMenuItem("Listar");
		mnNewMenu.add(menuListar);
			menuListar.addActionListener(e ->{
				listar ventana = new listar();
				listar_controller controlador = new listar_controller();
				controlador.llenarTabla(ventana);
				ventana.setVisible(true);
			});
	}
	
	public JMenuItem getMenuModificar() {
	    return menuModificar;
	}
	
	public JButton getBtnEliminar() {
	    return btnEliminar;
	}

	public JButton getBtnAgregar() {
        return getBtnAgregar();
    }

}
