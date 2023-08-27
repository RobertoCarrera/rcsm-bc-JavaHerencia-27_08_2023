public class Serie implements IEntregable {
	
    private static final String GENERO_DEFECTO = "Drama";
    private static final int TEMPORADAS_DEFECTO = 3;
    private static final boolean ENTREGADO_DEFECTO = false;

    private String titulo;
    private int temporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    public Serie(String newTitulo, String newCreador) {
    	
        this.titulo = newTitulo;
        this.temporadas = TEMPORADAS_DEFECTO;
        this.entregado = ENTREGADO_DEFECTO;
        this.genero = GENERO_DEFECTO;
        this.creador = newCreador;
    }

    public void setTitulo(String newTitulo) {
    	
        this.titulo = newTitulo;
    }

    public void setTemporadas(int newTemporadas) {
    	
        this.temporadas = newTemporadas;
    }

    public void setGenero(String newGenero) {
    	
        this.genero = newGenero;
    }

    public void setCreador(String newCreador) {
    	
        this.creador = newCreador;
    }

    public String getTitulo() {
    	
        return titulo;
    }

    public int getTemporadas() {
    	
        return temporadas;
    }

    public String getGenero() {
    	
        return genero;
    }

    public String getCreador() {
    	
        return creador;
    }

    @Override
    public String toString() {
    	
        return titulo+" tiene " +temporadas+" temporadas, pertenece al género de "+genero+" y fue creada por "+creador;
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
    	
        return entregado;
    }

    @Override
    public int compareTo(Object a) {
    	
        if (a instanceof Serie) {
        	
            if (this.temporadas > ((Serie) a).getTemporadas()) return -1;
            	else if (this.temporadas == ((Serie) a).getTemporadas()) return 0;
            	else return 1;
        } else {
        	
            return -1;
        }
    }
}