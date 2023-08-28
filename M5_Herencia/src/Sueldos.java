
public class Sueldos extends Exception{
	
	private String codigoException;
	
	public Sueldos(String codigoError){
		
		super();
		this.codigoException = codigoError;
	}
	
	public Sueldos() {
		
		super();
	}
	
	@Override
	public String getMessage() {
		
		String mensaje = "";
		
		switch(codigoException) {

			case "boss_error":
				
				mensaje = "El sueldo de un boss debe ser mayor de 8000€";
				break;
			case "manager_error":
				
				mensaje = "El sueldo de un manager debe estar entre 3001-4999€";
				break;
			case "senior_error":
				
				mensaje = "El sueldo de un senior debería estar entre 2701-3999€";
				break;
			case "mid_error":
				
				mensaje = "El sueldo de un mid debe estar entre 1801-2499€";
				break;
			case "junior_error":
				
				mensaje = "El sueldo de un junior debe estar entre 901-1599€";
				break;
			case "volunteer_error":
				
				mensaje = "La ayuda máxima de un voluntario puede ser de 300€";
				break;
			default:
				
				mensaje = "El sueldo no cumple los requisitos de su categoría";
				break;
		}
		
		return mensaje;
	}
}