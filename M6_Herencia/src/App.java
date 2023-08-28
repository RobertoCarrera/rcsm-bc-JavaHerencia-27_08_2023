import java.util.Scanner;

public class App {

	protected static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {

		int opcion = 0;
		
		do {
			
			System.out.println("Qué quieres hacer?");
			System.out.println("1. Añadir coche");
			System.out.println("2. Añadir moto");
			System.out.println("0. Salir");
			
			opcion = teclado.nextInt();
			switch(opcion) {
			
				case 1:
					Coche coche1 = nuevoCoche();
					break;
				case 2: 
					Moto moto1 = nuevaMoto();
					break;
				default:
					System.out.println("Opción errónea");
					break;
			}
		}while(opcion!=0);
	}

	protected static Coche nuevoCoche() throws Exception {
		
		Coche nuevo_coche;
		String matricula, marca, color;
		
		System.out.println("Dame la matrícula del coche");
		matricula = teclado.next();
		System.out.println("Dame la marca del coche");
		marca = teclado.next();
		System.out.println("Dame el color del coche");
		color = teclado.next();
		
		nuevo_coche = new Coche(matricula, marca, color);
		
		return nuevo_coche;
	}
	
	protected static Moto nuevaMoto() throws Exception {
		
		Moto nueva_moto;
		String matricula, marca, color;
		
		System.out.println("Dame la matrícula del coche");
		matricula = teclado.next();
		System.out.println("Dame la marca del coche");
		marca = teclado.next();
		System.out.println("Dame el color del coche");
		color = teclado.next();
		
		nueva_moto = new Moto(matricula, marca, color);
		
		return nueva_moto;
	}
}
