package tarea;

public class Videojuego implements Entregable {

	private final static int horasDefecto=100;
	
    public final static int mayor=1;
  
    public final static int menor=-1;
  
    public final static int igual=0;
  
    private String titulo;

    private int horasEstimadas;
  
    private boolean entregado;

    private String genero;

    private String compañia;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getcompañia() {
        return compañia;
    }

    public void setcompañia(String compañia) {
        this.compañia = compañia;
    }

    public void entregar() {
        entregado=true;
    }

    public void devolver() {
        entregado=false;
    }

    
    public boolean isEntregado() {
        if(entregado){
            return true;
        }
        return false;
    }

    public int compareTo(Object i) {
        int estado=menor;

        Videojuego ref=(Videojuego)i;
        
        if (horasEstimadas>ref.getHorasEstimadas()){
            estado=mayor;
        }
        
        else if(horasEstimadas==ref.getHorasEstimadas()){
            estado=igual;
        }
  
        return estado;
    }

    public String toString(){
        return "Informacion del videojuego: \n" + "\tTitulo: " + titulo + "\n" + "\tHoras estimadas: " + horasEstimadas + "\n" + "\tGenero: " + genero + "\n" + "\tcompañia: " + compañia;
    }

    public boolean equals(Videojuego i){
        if (titulo.equalsIgnoreCase(i.getTitulo()) && compañia.equalsIgnoreCase(i.getcompañia())){
            return true;
        }
        return false;
    }

    public Videojuego(){
        this("",horasDefecto, "", "");
    }

    public Videojuego(String titulo, String compañia){
        this(titulo,horasDefecto, "", compañia);
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compañia){
        this.titulo=titulo;
        this.horasEstimadas=horasEstimadas;
        this.genero=genero;
        this.compañia=compañia;
        this.entregado=false;
    }
 
}
