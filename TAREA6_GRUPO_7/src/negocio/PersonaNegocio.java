package negocio;

import java.util.List;

import entidad.Persona;

public interface PersonaNegocio {
	
	public boolean insert(Persona p);
	public boolean delete(Persona p_delete);
	public boolean update(Persona p_update);
	public List<Persona> readAll();
	public boolean existeDni(String dni);
	
}
