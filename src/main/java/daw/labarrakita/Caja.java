package daw.labarrakita;

/**
 *
 * @author George
 */
public abstract class Caja {
    String descripcion="";
    
    public String geDescripcion(){
        return descripcion;
    }
    
    public abstract double precio();
}
