
public class Lavadora extends Electrodomestico{

	private final int CARGA_DEFECTO = 5;
	
	protected int carga;
	
	public Lavadora(char newConsumo, String newColor){
		
		super(newConsumo, newColor);
		this.carga = CARGA_DEFECTO;
	}
	
	public int getCarga() {
		
		return this.carga;
	}
	
	public float precioFinal() {
		
		float precio_final = super.precioFinal();
		float total = 0;
		int aumento_precio = 0;
		
		if(this.carga > 30) {
			
			aumento_precio = 50;
		}
		
		total = precio_final + aumento_precio;
		
		this.precio_base += total;
		
		return total;
	}
}
