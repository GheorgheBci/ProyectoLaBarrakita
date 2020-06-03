package daw.labarrakita;

/**
 *
 * @author George
 */
public class PastaDientes extends DecoratorCaja5 {

    Caja miCaja;

    public PastaDientes(Caja configurable) {
        this.miCaja = configurable;
    }

    @Override
    public String getDescripcion() {
        return miCaja.getDescripcion() + "Pasta de dientes";
    }

    @Override
    public double precio() {
        return 2 + miCaja.precio();
    }

}
