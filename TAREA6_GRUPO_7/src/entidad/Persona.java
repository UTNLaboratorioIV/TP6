package entidad;

public class Persona {
	
	public String dni;
	public String nombre;
	public String apellido;
	
	public Persona() {}
	
	public Persona(String dni, String nombre, String apellido) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getDni() { return dni; }
	public String getNombre() { return nombre; }
	public String getApellido() { return apellido; }

	public void setDni(String dni) { this.dni = dni; }
	public void setNombre(String nombre) { this.nombre = nombre; }
	public void setApellido(String apellido) { this.apellido = apellido; }

	@Override
	public String toString() {
		return "Persona \nDni: " + dni + "\nNombre: " + nombre + "\nApellido: " + apellido;
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj)
	        return true;
	    if (obj == null || getClass() != obj.getClass())
	        return false;
	    Persona other = (Persona) obj;
	    return dni != null && dni.equals(other.dni);
	}

	@Override
	public int hashCode() {
	    return dni == null ? 0 : dni.hashCode();
	}

	
}