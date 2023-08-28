import java.sql.Date;

public class Persona {

	String nombre;
	String apellidos;
	Date fecha_nacimiento;
	Licencia licencia;
	
	public Persona(String newNombre, String newApellidos, Date newFechaNacimiento, Licencia newLicencia) {
		
		this.nombre = newNombre;
		this.apellidos = newApellidos;
		this.fecha_nacimiento = newFechaNacimiento;
		this.licencia = newLicencia;
	}
}