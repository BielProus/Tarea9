package tarea;

public class Lavadora extends Electrodomestico {
	
	private final static int cargaDefecto=5;
	  
    private int carga;
  
    public int getCarga() {
        return carga;
    }
  
    public double precioFinal(){
       
        double plus=super.precioFinal();
  
        if (carga>30){
            plus+=50;
        }
  
        return plus;
    }
  
    public Lavadora(){
        this(precioDefecto, pesoDefecto, consumoDefecto, colorDefecto, cargaDefecto);
    }
  
    public Lavadora(double precioBase, double peso){
        this(precioBase, peso, consumoDefecto, colorDefecto, cargaDefecto);
    }
 
    public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga){
        super(precioBase,peso, consumoEnergetico,color);
        this.carga=carga;
    }
}
