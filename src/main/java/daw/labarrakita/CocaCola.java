package daw.labarrakita;

/**
 *
 * @author George
 */
public class CocaCola extends DecoratorCaja5{

    Caja miCaja;

    public CocaCola(Caja configurable) {
        this.miCaja = configurable;
    }
    
    @Override
    public String getDescripcion() {
         return miCaja.getDescripcion() + " + Coca-Cola, ";
    }

    @Override
    public double precio() {
        return 1.7 + miCaja.precio();
    }
    
}
