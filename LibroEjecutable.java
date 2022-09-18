package tarea;

public class LibroEjecutable {

	public static void main(String[] args) {
		
        Libro libro1=new Libro(1568, "Ready Player One", "Ernest Cline", 464);
        Libro libro2=new Libro(2345, "La llamada de Cthulhu", "H. P. Lovecraft", 64);
         
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
         
        libro1.setNumPaginas(70);
         
        if(libro1.getNumPaginas()>libro2.getNumPaginas()){
            System.out.println(libro1.getTitulo()+" tiene más páginas");
        }else{
            System.out.println(libro2.getTitulo()+" tiene más páginas");
        }
         
         
    }

}