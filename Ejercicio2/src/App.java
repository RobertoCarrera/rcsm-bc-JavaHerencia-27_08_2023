
public class App {

	public static void main(String[] args) {
		
		Serie[] listaSeries = new Serie[5];
		Videojuego[] listaVideojuegos = new Videojuego[5];

		listaSeries[0] = new Serie("Serie01", "Creador01");
		listaSeries[0].setTemporadas(4);
		listaSeries[1] = new Serie("Serie02", "Creador02");
		listaSeries[1].setTemporadas(10);
		listaSeries[1].entregar();
		listaSeries[2] = new Serie("Serie03", "Creador03");
		listaSeries[2].setTemporadas(1);
		listaSeries[3] = new Serie("Serie04", "Creador04");
		listaSeries[3].setTemporadas(11);
		listaSeries[4] = new Serie("Serie05", "Creador05");
		listaSeries[4].setTemporadas(5);

		listaVideojuegos[0] = new Videojuego("Videojuego01", "Genereo01", "Compañia01");
		listaVideojuegos[0].setHorasEstimadas(100);
		listaVideojuegos[1] = new Videojuego("Videojuego02", "Genereo02", "Compañia02");
		listaVideojuegos[1].setHorasEstimadas(200);
		listaVideojuegos[2] = new Videojuego("Videojuego03", "Genereo03", "Compañia03");
		listaVideojuegos[2].setHorasEstimadas(199);
		listaVideojuegos[2].entregar();
		listaVideojuegos[3] = new Videojuego("Videojuego04", "Genereo04", "Compañia04");
		listaVideojuegos[3].setHorasEstimadas(201);
		listaVideojuegos[4] = new Videojuego("Videojuego05", "Genereo05", "Compañia05");
		listaVideojuegos[4].setHorasEstimadas(70);

		int count = 0;

		Serie serieMasTemp = listaSeries[0];
		Videojuego videojuegoMasHoras = listaVideojuegos[0];

		for (int i = 0; i < 5; i++) {
			
		    if (listaSeries[i].isEntregado()) count++;
		    if (listaVideojuegos[i].isEntregado()) count++;

		    Serie tempSerie = listaSeries[i];
		    if (tempSerie.compareTo(serieMasTemp) < 0) {
		    	
		        serieMasTemp = tempSerie;
		    }

		    Videojuego tempVideojuego = listaVideojuegos[i];
		    if (tempVideojuego.compareTo(videojuegoMasHoras) < 0) {
		    	
		        videojuegoMasHoras = tempVideojuego;
		    }
		}
		System.out.println("El total de series y videojuegos entregados es " + count);
		System.out.println("La serie con mas temporadas es " + serieMasTemp.toString());
		System.out.println("El videojuego con mas horas es " + videojuegoMasHoras.toString());
	}
}
