
public class Boss extends Empleado{

	public Boss(String newNombre, String newApellidos, float newSueldoBrutoMensual) throws Sueldos {
		
		super(newNombre, newApellidos, newSueldoBrutoMensual);
		this.sueldo_bruto_mensual = newSueldoBrutoMensual;
		this.sueldo_neto_mensual = calcularNetoMensual(newSueldoBrutoMensual,24);
		if(sueldo_neto_mensual <= 8000){
			
			throw new Sueldos("boss_error");
		}else {

			this.sueldo_bruto_anual = calcularBrutoAnual(newSueldoBrutoMensual);
			this.sueldo_neto_anual = calcularBrutoAnual(this.sueldo_neto_mensual);
			System.out.println("Boss creado correctamente");
		}
	}
	
	@Override
	public String toString() {
		
	    return "Boss [Nombre = "+this.nombre+" | Apellidos = "+this.apellidos+" | Sueldo = " + this.sueldo_neto_mensual+"]";
	}
}