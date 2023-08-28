import java.sql.Date;

public class Licencia {

	String id;
	String tipo;
	String nombre_completo;
	Date fecha_caducidad;
	
	public Licencia(String newID, String newTipo, String newNombreCompleto, Date newFechaCaducidad) {
		
		this.id = newID;
		this.tipo = newTipo;
		this.nombre_completo = newNombreCompleto;
		this.fecha_caducidad = newFechaCaducidad;
	}
}
