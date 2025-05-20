package negocioImpl;

import java.util.List;

import dao.PersonaDao;
import daoImpl.PersonaDaoImpl;
import entidad.Persona;
import negocio.PersonaNegocio;

public class PersonaNegocioImpl implements PersonaNegocio {
	
	PersonaDao pdao = new PersonaDaoImpl();

	@Override
	public boolean insert(Persona p_insert) {
		boolean estado=false;
		if(p_insert.getNombre().trim().length()>0 && p_insert.getApellido().trim().length()>0 && p_insert.getDni().trim().length()>0)
		{
			estado=pdao.insert(p_insert);
		}
		return estado;
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
	
	@Override
	public boolean existeDni(String dni) {
	    List<Persona> personas = pdao.readAll();
	    for (Persona p : personas) {
	        if (p.getDni().equals(dni)) {
	            return true;
	        }
	    }
	    return false;
	}


}
