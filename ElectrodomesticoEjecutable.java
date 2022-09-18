package tarea;

public class ElectrodomesticoEjecutable {
	
	public static void main(String[] args) {
		   
        Electrodomestico listaElectrodomesticos[]=new Electrodomestico[10];
   
        listaElectrodomesticos[0]=new Electrodomestico(250, 78, 'B', "rojo");
        listaElectrodomesticos[1]=new Electrodomestico(333, 31, 'A', "blanco");
        listaElectrodomesticos[2]=new Electrodomestico(150, 60, 'E', "negro");
        listaElectrodomesticos[3]=new Lavadora(270, 20, 'A', "gris", 23);
        listaElectrodomesticos[4]=new Lavadora(660, 70, 'D', "azul", 10);
        listaElectrodomesticos[5]=new Lavadora(890, 90, 'B', "blanco", 34);
        listaElectrodomesticos[6]=new Lavadora();
        listaElectrodomesticos[7]=new Televisor(178, 10, 'C', "negro", 5, false);
        listaElectrodomesticos[8]=new Televisor(234, 60, 'C', "rojo", 30, true);
        listaElectrodomesticos[9]=new Televisor();
   
        double sumaElectrodomesticos=0;
        double sumaTelevisoress=0;
        double sumaLavadoras=0;

        for(int i=0;i<listaElectrodomesticos.length;i++){
   
            if(listaElectrodomesticos[i] instanceof Electrodomestico){
                sumaElectrodomesticos+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Lavadora){
                sumaLavadoras+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Televisor){
            	sumaTelevisoress+=listaElectrodomesticos[i].precioFinal();
            }
        }
   
        System.out.println("La suma de los electrodomesticos da: " + sumaElectrodomesticos);
        System.out.println("La suma de las lavadoras da: " + sumaLavadoras);
        System.out.println("La suma de los televisores da: " + sumaTelevisoress);
   
    }
}
