package tarea;

public class Televisor extends Electrodomestico {

	private final static int resolucionDefecto=20;
	  
    int resolucion;
  
    private boolean sintonizador;
  
    public double precioFinal(){
       
        double plus=super.precioFinal();
  
        if (resolucion>40){
            plus+=precioBase*0.3;
        }
        if (sintonizador){
            plus+=50;
        }
  
        return plus;
    }
  
    public Televisor(){
        this(precioDefecto, pesoDefecto, consumoDefecto, colorDefecto, resolucionDefecto, false);
    }
  
    public Televisor(double precioBase, double peso){
        this(precioBase, peso, consumoDefecto, colorDefecto, resolucionDefecto, false);
    }
  
    public Televisor(double precioBase, double peso, char consumoEnergetico, String color, int resolucion, boolean sintonizador){
        super(precioBase, peso, consumoEnergetico, color);
        this.resolucion=resolucion;
        this.sintonizador=sintonizador;
    }
}
