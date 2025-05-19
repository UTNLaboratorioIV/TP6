package presentacion.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import presentacion.vista.eliminar;
import entidad.Persona;
import negocio.PersonaNegocio;
import presentacion.vista.VentanaPrincipal;

public class Controlador implements ActionListener {

    private VentanaPrincipal ventanaPrincipal;
    private PersonaNegocio pNeg;

    public Controlador(VentanaPrincipal vista, PersonaNegocio pNeg) {
        this.ventanaPrincipal = vista;
        this.pNeg = pNeg;

        this.ventanaPrincipal.setVisible(true);

        this.ventanaPrincipal.getBtnEliminar().addActionListener(e -> mostrarEliminar());
        
    }

    private void mostrarEliminar() {
        eliminar eliminarVista = new eliminar();
        List<Persona> lista = pNeg.readAll();
        eliminarVista.actualizarLista(lista);

        eliminarVista.getbtnEliminar().addActionListener(e -> {
            Persona seleccionada = eliminarVista.getPersonaSeleccionada();
            if (seleccionada != null) {
                int confirm = JOptionPane.showConfirmDialog(null, "¿Estas seguro de eliminar?");
                if (confirm == JOptionPane.YES_OPTION) {
                    if (pNeg.delete(seleccionada)) {
                        JOptionPane.showMessageDialog(null, "Eliminado.");
                        eliminarVista.actualizarLista(pNeg.readAll()); // actualizamos lista
                    }
                }
            }
        });

        eliminarVista.setVisible(true);
    }

    

    @Override
    public void actionPerformed(ActionEvent e) {}
}
