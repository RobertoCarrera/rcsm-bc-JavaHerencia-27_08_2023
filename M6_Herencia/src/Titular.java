import java.sql.Date;

public class Titular extends Conductor{

	boolean tieneSeguro;
	boolean tieneGaraje;
	
	public Titular(String newNombre, String newApellidos, Date newFechaNacimiento, Licencia newLicencia, boolean newTieneSeguro, boolean newTieneGaraje) {
		
		super(newNombre, newApellidos, newFechaNacimiento, newLicencia);
		this.tieneSeguro = newTieneSeguro;
		this.tieneGaraje = newTieneGaraje;
	}
}