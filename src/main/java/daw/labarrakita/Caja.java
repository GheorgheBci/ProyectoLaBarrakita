package daw.labarrakita;

/**
 *
 * @author George
 */
public abstract class Caja {
    String descripcion="";
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public abstract double precio();
}
