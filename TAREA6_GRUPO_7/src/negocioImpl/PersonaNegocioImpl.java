package negocioImpl;

import java.util.List;

import dao.PersonaDao;
import daoImpl.PersonaDaoImpl;
import entidad.Persona;
import negocio.PersonaNegocio;

public class PersonaNegocioImpl implements PersonaNegocio {

	PersonaDao pdao = new PersonaDaoImpl();
	
	@Override
	public boolean insert(Persona p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Persona p_delete) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Persona p_update) {
		boolean estado = false;
		
		if (p_update.getNombre().trim().length() > 0 &&
				p_update.getApellido().trim().length() > 0 &&
				p_update.getDni().trim().length() > 0) {

		    estado = pdao.update(p_update);
		}
		
		return estado;
	}

	@Override
	public List<Persona> readAll() {
		return pdao.readAll();
	}

}
