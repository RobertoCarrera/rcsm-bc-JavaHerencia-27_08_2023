public class Videojuego implements IEntregable {
	
    protected String titulo;
    protected int horas_estimadas = 10;
    protected boolean entregado = false;
    protected String genero;
    protected String compania;

    public Videojuego(String titulo, String genero, String compania) {
    	
        this.titulo = titulo;
        this.genero = genero;
        this.compania = compania;
    }

    @Override
    public void entregar() {
    	
        this.entregado = true;
    }

    @Override
    public void devolver() {
    	
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
    	
        return this.entregado;
    }

    @Override
    public int compareTo(Object a) {
    	
        if (a instanceof Videojuego) {
        	
            if (this.horas_estimadas > ((Videojuego) a).getHorasEstimadas()) return -1;
            	else if (this.horas_estimadas == ((Videojuego) a).getHorasEstimadas()) return 0;
            	else return 1;
        } else {
        	
            return -1;
        }
    }

    public String getTitulo() {
    	
        return this.titulo;
    }

    public int getHorasEstimadas() {
    	
        return this.horas_estimadas;
    }

    public String getGenero() {
    	
        return this.genero;
    }

    public String getCompania() {
    	
        return this.compania;
    }

    public void setTitulo(String titulo) {
    	
        this.titulo = titulo;
    }

    public void setHorasEstimadas(int horasEstimadas) {
    	
        this.horas_estimadas = horasEstimadas;
    }

    public void setGenero(String genero) {
    	
        this.genero = genero;
    }

    public void setCompania(String compania) {
    	
        this.compania = compania;
    }

    @Override
    public String toString() {
    	
        return "Título: " + this.titulo + "| Horas estimadas: " + this.horas_estimadas + "| Entregado: " + (this.entregado ? "si" : "no") + "| Género: " + this.genero + "| Compañía: " + this.compania;
    }
}