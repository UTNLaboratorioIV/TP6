package entidad;

public class Persona {
	
	public String dni;
	public String nombre;
	public String apellido;
	private int id;
	
	
	public Persona() {
		
		
	}
	
	
	public Persona(String dni, String nombre, String apellido) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public Persona(int id, String nombre, String apellido, String dni) {
	    this.id = id;
	    this.nombre = nombre;
	    this.apellido = apellido;
	    this.dni = dni;
	}

	

	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	@Override
	public String toString() {
		return "Persona \nDni: " + dni + "\nNombre: " + nombre + "\nApellido: " + apellido;
	}
	
	
	
	
	
}
