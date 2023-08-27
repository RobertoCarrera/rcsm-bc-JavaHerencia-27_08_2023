public class Electrodomestico {
	
    private static final double PRECIO_DEFECTO = 100;
    private static final String COLOR_DEFECTO = "Blanco";
    private static final char CONSUMO_DEFECTO = 'F';
    private static final double PESO_DEFECTO = 5;

    protected double precio_base;
    protected String color;
    protected char consumo_energetico;
    protected double peso;

    public Electrodomestico(char newConsumo, String newColor) {
        this.precio_base = PRECIO_DEFECTO;
        this.color = comprobarColor(newColor);
        this.consumo_energetico = comprobarConsumoEnergetico(newConsumo);
        this.peso = PESO_DEFECTO;
    }

    public double getPrecioBase() {
    	
        return precio_base;
    }

    public String getColor() {
    	
        return color;
    }

    public char getConsumo() {
    	
        return consumo_energetico;
    }

    public double getPeso() {
    	
        return peso;
    }
    
    @Override
    public String toString() {
    	
        return "Electrodomestico [Precio base = " + precio_base + ", Color = " + color + ", Consumo Energético = " + consumo_energetico + ", Peso = " + peso + "]";
    }

    public char comprobarConsumoEnergetico(char newConsumo) {
    	
        switch (newConsumo) {
        
            case 'A':
                return 'A';
                
            case 'B':
                return 'B';
                
            case 'C':
                return 'C';
                
            case 'D':
                return 'D';
                
            case 'E':
                return 'E';
                
            default:
                return 'F';
        }
    }

    public String comprobarColor(String newColor) {
    	
        switch (newColor) {
        
            case "Negro":            	
                return "Negro";
                
            case "Rojo":            	
                return "Rojo";
                
            case "Azul":            	
                return "Azul";
                
            case "Gris":            	
                return "Gris";
                
            default:            	
                return "Blanco";
        }
    }

    public float precioFinal() {
    	
    	float precio_final = 0;

        switch (consumo_energetico) {
        
            case 'A':            	
            	precio_final += 100;
                break;
                
            case 'B':            	
            	precio_final += 80;
                break;
                
            case 'C':            	
            	precio_final += 60;
                break;
                
            case 'D':            	
            	precio_final += 50;
                break; 
                
            case 'E':            	
            	precio_final += 30;
                break; 
                
            default:            	
            	precio_final += 10;
                break;
        }

        if(peso<20)
        {
        	precio_final += 10;
        }else{
            if ((peso>=20)&&(peso<50)) {
            	precio_final += 50;
            }else{
                if ((peso>=50)&&(peso<80)) {
                	precio_final += 80;
                }else{
                	precio_final += 100;
                }
            }
        }

        this.precio_base += precio_final;

        return precio_final;

    }
}