
public class Moto extends Vehiculo{
	
	public Moto(String newMatricula, String newMarca, String newColor) throws Exception {
		
		super(newMatricula, newMarca, newColor);
		this.anadirRuedas();
	}
	
}
