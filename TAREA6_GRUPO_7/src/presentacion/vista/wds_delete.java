package presentacion.vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.border.TitledBorder;
import java.awt.BorderLayout;

public class wds_delete extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public wds_delete() {
        setTitle("Programa");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(new TitledBorder("Eliminar usuarios"));

        JList<String> listaUsuarios = new JList<>();
        JScrollPane scrollPane = new JScrollPane(listaUsuarios);

        JButton btnEliminar = new JButton("Eliminar");

        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(btnEliminar, BorderLayout.SOUTH);

        add(panel);
    }

    public static void main(String[] args) {
    	wds_delete ventana = new wds_delete();
        ventana.setVisible(true);
    }
}
