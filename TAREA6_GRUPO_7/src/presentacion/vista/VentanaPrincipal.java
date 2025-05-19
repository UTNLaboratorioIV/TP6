package presentacion.vista;
import presentacion.vista.agregar;
import presentacion.vista.modificar;
import presentacion.vista.eliminar;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JMenuItem menuModificar;

	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Persona");
		menuBar.add(mnNewMenu);
		
		JMenuItem menuAgregar = new JMenuItem("Agregar");
		mnNewMenu.add(menuAgregar); // agregamos la funcionalidad para ir al formulario
		menuAgregar.addActionListener(e -> {
		    agregar frmAgregar = new agregar();
		    frmAgregar.setVisible(true);
		});
		
		menuModificar = new JMenuItem("Modificar");
		mnNewMenu.add(menuModificar);
		
		/*JMenuItem menuModificar = new JMenuItem("Modificar");
		mnNewMenu.add(menuModificar);
		menuModificar.addActionListener(e ->{
			modificar frmMod = new modificar();
			frmMod.setVisible(true);
		});*/
		
		JMenuItem MenuEliminar = new JMenuItem("Eliminar");
		mnNewMenu.add(MenuEliminar);
		MenuEliminar.addActionListener(e ->{
			eliminar frmEliminar = new eliminar();
			frmEliminar.setVisible(true);
		});
		
		/*JMenuItem menuListar = new JMenuItem("Listar");
		mnNewMenu.add(menuListar);
		*/
	}

	public JMenuItem getMenuModificar() {
	    return menuModificar;
	}
	
}
