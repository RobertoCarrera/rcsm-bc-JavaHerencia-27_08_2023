//A partir del milestone 2, ya no se utiliza, pero la dejo como constancia
public class Employee extends Empleado{

	public Employee(String newNombre, String newApellidos, float newSueldo) {
		
		super(newNombre, newApellidos, newSueldo);
		this.sueldo = (float)(this.sueldo*0.85);
	}
}