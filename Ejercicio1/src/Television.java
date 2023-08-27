public class Television extends Electrodomestico {
	
    private static final double DEFECTO_RESOLUCION = 20;
    private static final boolean DEFECTO_TDT = false;

    private double resolucion;
    private boolean tdt;

    public Television(char newConsumo, String newColor) {
    	
        super(newConsumo, newColor);
        this.resolucion = DEFECTO_RESOLUCION;
        this.tdt = DEFECTO_TDT;
    }

    public double getResolucion() {
    	
        return resolucion;
    }

    public boolean getTDT() {
    	
        return tdt;
    }

    public float precioFinal() {
    	
    	float precioFinal = super.precioFinal();
    	float aumento = 0;
    	float total = 0;

        if (resolucion > 40) {
        	
            aumento += (precioFinal * 0.3);
        }

        if (tdt == true) {
        	
            aumento += 50;
        }

        total = precioFinal + aumento;

        this.precio_base += total;

        return total;
    }
}