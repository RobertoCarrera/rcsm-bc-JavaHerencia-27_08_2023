public class App {

	public static void main(String[] args) throws Sueldos {

		try {

			Boss boss_correcto = new Boss("Berta", "Arrojo", 12000);
			Manager manager_correcto = new Manager("Berta", "Arrojo", 4200);
			Senior senior_correcto = new Senior("Rodrigo", "Arrojo", 3800);
			Mid mid_correcto = new Mid("Rodrigo", "Arrojo", 2600);
			Junior junior_correcto = new Junior("Berta", "Arrojo", 1500);
			Volunteer voluntario_correcto = new Volunteer("Berta", "Flamingo", 300);
			Volunteer voluntario_baratito = new Volunteer("Adolfo", "Barato", 0);
			
			// ========== Bloque de empleados incorrectos para pruebas ===========
			
			//Boss boss_incorrecto = new Boss("Berta", "Arrojo", 7500);
			//Manager manager_incorrecto = new Manager("Berta", "Arrojo", 7200);
			//Senior senior_incorrecto = new Senior("Rodrigo", "Arrojo", 2900);
			//Mid mid_incorrecto = new Mid("Rodrigo", "Arrojo", 3500);
			//Junior junior_incorrecto = new Junior("Berta", "Arrojo", 980);
			//Volunteer voluntario_incorrecto = new Volunteer("Berta", "Flamingo", 301);

			System.out.println(boss_correcto.toString());
			System.out.println(manager_correcto.toString());
			System.out.println(senior_correcto.toString());
			System.out.println(mid_correcto.toString());
			System.out.println(junior_correcto.toString());
			System.out.println(voluntario_correcto.toString());
			System.out.println(voluntario_baratito.toString());
		}catch (Sueldos ex) {
			
			System.out.println(ex.getMessage());
		}
	}
}