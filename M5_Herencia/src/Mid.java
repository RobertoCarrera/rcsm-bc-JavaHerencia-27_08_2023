
public class Mid extends Empleado{
	
	public Mid(String newNombre, String newApellidos, float newSueldoBrutoMensual) throws Sueldos {
		
		super(newNombre, newApellidos, newSueldoBrutoMensual);
		this.sueldo_bruto_mensual = newSueldoBrutoMensual;
		this.sueldo_neto_mensual = calcularNetoMensual(newSueldoBrutoMensual,15);
		if(((sueldo_neto_mensual <= 1800))||(sueldo_neto_mensual >= 2500)){
			
			throw new Sueldos("mid_error");
		}else {

			this.sueldo_bruto_anual = calcularBrutoAnual(newSueldoBrutoMensual);
			this.sueldo_neto_anual = calcularBrutoAnual(this.sueldo_neto_mensual);
			System.out.println("Mid creado correctamente");
		}
	}
	
	@Override
	public String toString() {
		
	    return "Mid [Nombre = "+this.nombre+" | Apellidos = "+this.apellidos+" | Sueldo = " + this.sueldo_neto_mensual+"]";
	}
}