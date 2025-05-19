package daoImpl;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import dao.PersonaDao;
import entidad.Persona;

public class PersonaDaoImpl implements PersonaDao {
	
	private static final String insert = "INSERT INTO personas (dni, nombre, apellido) VALUES (?, ?, ?)";
	private static final String update = "UPDATE personas SET nombre = ?, apellido = ? WHERE dni = ?";
	
	public PersonaDaoImpl()
	{
		
	}
	
	@Override
	public boolean insert(Persona p) {
		PreparedStatement statement;
		Connection conexion = Conexion.getConexion().getSQLConexion();
		boolean insertOk = false;
		
		try {
			statement = conexion.prepareStatement(insert);
			statement.setString(1, p.getDni());
			statement.setString(2, p.getNombre());
			statement.setString(3, p.getApellido());
			
			if (statement.executeUpdate() > 0) {
				conexion.commit();
				insertOk = true;
				System.out.println("Persona insertada correctamente");
			}

			
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conexion.rollback();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		
		
		return insertOk;
	}

	@Override
	public boolean delete(Persona p_delete) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Persona p_update) {
		PreparedStatement statement;
		Connection conexion = Conexion.getConexion().getSQLConexion();
		boolean updateOk = false;

		try {
		    statement = conexion.prepareStatement(update);
		    statement.setString(1, p_update.getNombre());
		    statement.setString(2, p_update.getApellido());
		    statement.setString(3, p_update.getDni());

		    if (statement.executeUpdate() > 0) {
		        conexion.commit();
		        updateOk = true;
		        System.out.println("Persona modificada correctamente");
		    }
		} catch (SQLException e) {
		    e.printStackTrace();
		    try {
		        conexion.rollback();
		    } catch (SQLException e2) {
		        e2.printStackTrace();
		    }
		}
		
		return updateOk;
	}

	@Override
	public List<Persona> readAll() {
	    PreparedStatement statement;
	    ResultSet resultSet;
	    Connection conexion = Conexion.getConexion().getSQLConexion();
	    List<Persona> personas = new ArrayList<>();

	    String readAll = "SELECT dni, nombre, apellido FROM personas";
	    try {
	        statement = conexion.prepareStatement(readAll);
	        resultSet = statement.executeQuery();

	        while (resultSet.next()) {
	            String dni = resultSet.getString("dni");
	            String nombre = resultSet.getString("nombre");
	            String apellido = resultSet.getString("apellido");

	            Persona persona = new Persona(dni, nombre, apellido);
	            personas.add(persona);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return personas;
	}
	
}
