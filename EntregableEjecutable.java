package tarea;

public class EntregableEjecutable {

	public static void main(String[] args) {
		Serie listaSeries[]=new Serie[5];
        Videojuego listaVideojuegos[]=new Videojuego[5];
  
        listaSeries[0]=new Serie("Vikingos", 6 , "Drama", "Michael Hirs");
        listaSeries[1]=new Serie("Squid Games", 1 , "Drama", "Hwang Dong-hyuk");
        listaSeries[2]=new Serie("MasterChef ", 10, "Cocina", "Franc Roddam");
        listaSeries[3]=new Serie("The Owl House", 2 ,"Fantasia", "Dana Terrace");
        listaSeries[4]=new Serie("Juego de tronos", 8 , "Drama","George R. R. Martin");
  
        listaVideojuegos[0]=new Videojuego("Warframe","Digital Extremes");
        listaVideojuegos[1]=new Videojuego("Journey", 2, "Aventura", "Thatgamecompany");
        listaVideojuegos[2]=new Videojuego("Destiny", "Bungie");
        listaVideojuegos[3]=new Videojuego("Dark Souls", 60, "Accion", "FromSoftware");
        listaVideojuegos[4]=new Videojuego("Monster Hunter: World", 50, "Rol", "Capcom");
  
        listaSeries[1].entregar();
        listaSeries[4].entregar();
        listaVideojuegos[0].entregar();
        listaVideojuegos[3].entregar();
  
        int entregados=0;
  
        for(int i=0;i<listaSeries.length;i++){
            if(listaSeries[i].isEntregado()){
                entregados+=1;
                listaSeries[i].devolver();
  
            }
            if(listaVideojuegos[i].isEntregado()){
                entregados+=1;
                listaVideojuegos[i].devolver();
            }
        }
  
        System.out.println("Hay " + entregados + " articulos");
  
        Serie serieMayor=listaSeries[0];
        Videojuego videojuegoMayor=listaVideojuegos[0];
  
        for(int i=1;i<listaSeries.length;i++){
            if(listaSeries[i].compareTo(serieMayor)==Serie.mayor){
                serieMayor=listaSeries[i];
            }
            if(listaVideojuegos[i].compareTo(videojuegoMayor)==Videojuego.mayor){
                videojuegoMayor=listaVideojuegos[i];
            }
  
        }
  
        System.out.println(videojuegoMayor);
        System.out.println(serieMayor);
	}

}
