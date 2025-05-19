package dao;

import java.util.List;

import entidad.Persona;

public interface PersonaDao {
	
	public boolean insert(Persona p);
	public boolean delete(Persona p_delete);
	public boolean update(Persona p_update);
	public List<Persona> readAll();		
	
	
}
