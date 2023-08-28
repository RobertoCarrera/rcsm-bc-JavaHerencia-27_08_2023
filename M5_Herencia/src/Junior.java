
public class Junior extends Empleado{

	public Junior(String newNombre, String newApellidos, float newSueldoBrutoMensual) throws Sueldos {
		
		super(newNombre, newApellidos, newSueldoBrutoMensual);
		this.sueldo_bruto_mensual = newSueldoBrutoMensual;
		this.sueldo_neto_mensual = calcularNetoMensual(newSueldoBrutoMensual,24);
		if(((sueldo_neto_mensual <= 900))||(sueldo_neto_mensual >= 1600)){
			
			throw new Sueldos("junior_error");
		}else {

			this.sueldo_bruto_anual = calcularBrutoAnual(newSueldoBrutoMensual);
			this.sueldo_neto_anual = calcularBrutoAnual(this.sueldo_neto_mensual);
			System.out.println("Junior creado correctamente");
		}
	}
	
	
	@Override
	public String toString() {
		
	    return "Junior [Nombre = "+this.nombre+" | Apellidos = "+this.apellidos+" | Sueldo = " + this.sueldo_neto_mensual+"]";
	}
}