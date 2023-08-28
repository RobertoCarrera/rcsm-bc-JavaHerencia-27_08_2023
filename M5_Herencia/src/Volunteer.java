
public class Volunteer extends Empleado{

	public Volunteer(String newNombre, String newApellidos, float newAyuda) throws Sueldos {
		
		super(newNombre, newApellidos, newAyuda);
		this.sueldo_bruto_mensual = newAyuda;
		if(newAyuda > 300){
			
			throw new Sueldos("volunteer_error");
		}else {
			
			System.out.println("Voluntario creado correctamente");
		}
	}
	
	@Override
	public String toString() {
		
	    return "Voluntario [Nombre = "+this.nombre+" | Apellidos = "+this.apellidos+" | Ayuda = " + this.sueldo_bruto_mensual+"]";
	}
}