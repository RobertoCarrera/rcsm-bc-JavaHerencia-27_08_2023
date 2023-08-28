
public class Manager extends Empleado{

	public Manager(String newNombre, String newApellidos, float newSueldoBrutoMensual) throws Sueldos {
		
		super(newNombre, newApellidos, newSueldoBrutoMensual);
		this.sueldo_bruto_mensual = newSueldoBrutoMensual;
		this.sueldo_neto_mensual = calcularNetoMensual(newSueldoBrutoMensual,26);
		if(((sueldo_neto_mensual <= 3000))||(sueldo_neto_mensual >= 5000)){
			
			throw new Sueldos("manager_error");
		}else {

			this.sueldo_bruto_anual = calcularBrutoAnual(newSueldoBrutoMensual);
			this.sueldo_neto_anual = calcularBrutoAnual(this.sueldo_neto_mensual);
			System.out.println("Manager creado correctamente");
		}
	}
	
	@Override
	public String toString() {
		
	    return "Manager [Nombre = "+this.nombre+" | Apellidos = "+this.apellidos+" | Sueldo = " + this.sueldo_neto_mensual+"]";
	}
}
