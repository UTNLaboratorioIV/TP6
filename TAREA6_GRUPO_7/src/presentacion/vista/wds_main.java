package presentacion.vista;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class wds_main extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public wds_main() {
        setTitle("Programa");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menuPersona = new JMenu("Persona");
        menuBar.add(menuPersona);

        JMenuItem agregar = new JMenuItem("Agregar");
        menuPersona.add(agregar);

        JMenuItem modificar = new JMenuItem("Modificar");
        menuPersona.add(modificar);

        JMenuItem eliminar = new JMenuItem("Eliminar");
        menuPersona.add(eliminar);

        JMenuItem listar = new JMenuItem("Listar");
        menuPersona.add(listar);
    }

    public static void main(String[] args) {
    	wds_main ventana = new wds_main();
        ventana.setVisible(true);
    }
}