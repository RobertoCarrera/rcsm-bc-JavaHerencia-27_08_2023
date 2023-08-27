import java.util.Arrays;

public class App {

	public static void main(String[] args) {

		Electrodomestico[] electrodomesticos = new Electrodomestico[10];
		char[] consumos = {'A', 'B', 'C', 'D', 'E', 'F'};
		String[] colores = {"Negro", "Rojo", "Azul", "Gris", "Blanco"};
		
		int random_electrodomestico = 0;
		float precio_lavadoras = 0;
		float precio_televisiones = 0;
		
		for (int i = 0; i < electrodomesticos.length; i++) {
			
		    char consumo = consumos[(int) Math.floor(Math.random() * (consumos.length - 1))];
		    String color = colores[(int) Math.floor(Math.random() * (colores.length - 1))];
		    random_electrodomestico = (int) Math.floor(Math.random() * 3);

		    if (random_electrodomestico == 0) {
		    	
		        electrodomesticos[i] = new Electrodomestico(consumo, color);
		        electrodomesticos[i].precioFinal();
		    } else {
		    	
		        if (random_electrodomestico == 1) {
		        	
		            electrodomesticos[i] = new Lavadora(consumo, color);
		            electrodomesticos[i].precioFinal();
		            precio_lavadoras += electrodomesticos[i].getPrecioBase();
		        } else {
		        	
		            electrodomesticos[i] = new Television(consumo, color);
		            electrodomesticos[i].precioFinal();
		            precio_televisiones += electrodomesticos[i].getPrecioBase();
		        }
		    }
		}

		for (Electrodomestico electrodomestico : electrodomesticos) {
			
		    System.out.println(electrodomestico.toString());
		}
		System.out.println("El precio total de todos los electrodomésticos son " + (precio_lavadoras + precio_televisiones) + "€");
		System.out.println("El precio total de las lavadoras son " + precio_lavadoras + "€");
		System.out.println("El precio total de las televisiones son " + precio_televisiones + "€");
	}
}