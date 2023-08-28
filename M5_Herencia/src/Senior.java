
public class Senior extends Empleado{
	
	public Senior(String newNombre, String newApellidos, float newSueldoBrutoMensual) throws Sueldos {
		
		super(newNombre, newApellidos, newSueldoBrutoMensual);
		this.sueldo_bruto_mensual = newSueldoBrutoMensual;
		this.sueldo_neto_mensual = calcularNetoMensual(newSueldoBrutoMensual,24);
		if(((sueldo_neto_mensual <= 2700))||(sueldo_neto_mensual >= 4000)){
			
			throw new Sueldos("senior_error");
		}else {

			this.sueldo_bruto_anual = calcularBrutoAnual(newSueldoBrutoMensual);
			this.sueldo_neto_anual = calcularBrutoAnual(this.sueldo_neto_mensual);
			System.out.println("Senior creado correctamente");
		}
	}
	
	@Override
	public String toString() {
		
	    return "Senior [Nombre = "+this.nombre+" | Apellidos = "+this.apellidos+" | Sueldo = " + this.sueldo_neto_mensual+"]";
	}
}