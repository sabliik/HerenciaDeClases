
public class Humano {
    
    public String nombre;
    public String clase;
    public int salud;
    
    
    public void Caminar(){
        System.out.println(nombre+ " está caminando.");
    }
    
    public void Correr(){
        System.out.println(nombre+ " está corriendo.");
    }
    
    public void Dañado(){
        System.out.println(nombre+ " fue herido." + " Su salud ahora está en "+(salud-5));
    }
    
    
    
}
