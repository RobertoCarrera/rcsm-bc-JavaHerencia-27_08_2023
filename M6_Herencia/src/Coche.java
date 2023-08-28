
public class Coche extends Vehiculo{
	
	public Coche(String newMatricula, String newMarca, String newColor) throws Exception {

		super(newMatricula, newMarca, newColor);
		this.anadirRuedas();
	}
}