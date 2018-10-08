


public class Mago extends Humano{
    public static void main (String[]args){
    
        Mago jugador1 = new Mago();
        
        jugador1.clase = "Mago";
        jugador1.nombre = "Magic Mike";
        jugador1.salud = 100;
        
        jugador1.Caminar();
        jugador1.Correr();
        jugador1.Dañado();
    
    }
}
