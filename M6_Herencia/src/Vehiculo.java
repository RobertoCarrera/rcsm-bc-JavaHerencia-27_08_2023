import java.util.*;

public class Vehiculo {
	
	private static Scanner teclado = new Scanner(System.in);

	protected String matricula;
	protected String marca;
	protected String color;
	protected Rueda ruedas_traseras;
	protected Rueda ruedas_delanteras;
	private final boolean validacion;
	
	protected Vehiculo(String newMatricula, String newMarca, String newColor) throws Exception{
		
			validacion = validarMatricula(newMatricula);
			if(validacion == false){
				
				throw new Exception();
			}else {

				this.matricula = newMatricula;
				this.marca = newMarca;
				this.color = newColor;
				}
			}
	
	protected void anadirRuedas() {
		
		String marca;
		double diametro;
		
		System.out.println("Dame la marca de las ruedas traseras:");
		marca = teclado.next();
		System.out.println("Dame el diametro de las ruedas traseras:");
		diametro = teclado.nextDouble();
		try {
			
			validarDiametro(diametro);
			this.ruedas_traseras = new Rueda(marca,diametro);
		}catch(Exception ex){
			
			System.out.println(ex.getMessage());
		}
		
		System.out.println("Dame la marca de las ruedas delanteras:");
		marca = teclado.next();
		System.out.println("Dame el diametro de las ruedas delanteras:");
		diametro = teclado.nextDouble();
		try {
			
			validarDiametro(diametro);
			this.ruedas_delanteras = new Rueda(marca,diametro);
		}catch(Exception ex){
			
			System.out.println(ex.getMessage());
		}
	}
	
	protected boolean validarMatricula(String matricula) throws Exception{
		
		boolean correcta = false;
		//De esta forma valido que la matricula tenga 4 dígitos y 2 o 3 letras
		String validacion = "^[0-9]{4}[A-Z]{2,3}$";
		if(!matricula.matches(validacion)) {
			
			throw new Exception("La matrícula no tiene el formato correcto");
		}else {
			
			correcta = true;
		}
		return correcta;
	}
	
	protected void validarDiametro(double diametro) throws Exception {
		
		if((diametro<=0.4)||(diametro>=4)) {
			
			throw new Exception("El diámetro no es correcto");
		}
	}
}