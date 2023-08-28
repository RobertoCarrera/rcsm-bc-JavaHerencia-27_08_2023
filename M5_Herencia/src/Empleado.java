
public class Empleado{

	String nombre;
	String apellidos;
	float sueldo_bruto_mensual;
	float sueldo_neto_mensual;
	float sueldo_bruto_anual;
	float sueldo_neto_anual;

	public Empleado (String newNombre, String newApellidos, float newSueldoBrutoMensual) {
		
		this.nombre = newNombre;
		this.apellidos = newApellidos;
		this.sueldo_bruto_mensual = newSueldoBrutoMensual;
	}
	
	protected float calcularNetoMensual(float sueldoBrutoMensual, int IRPF) {
		
		float neto_mensual;
		
		neto_mensual = sueldoBrutoMensual*(100-IRPF)/100;
		
		return neto_mensual;
	}
	
	protected float calcularBrutoAnual (float brutoMensual) {
		
		float bruto_anual = brutoMensual*12;
		
		return bruto_anual;
	}
	
	protected float clacularNetoAnual (float netoMensual) {
		
		float neto_anual = netoMensual*12;
		
		return neto_anual;
	}
}