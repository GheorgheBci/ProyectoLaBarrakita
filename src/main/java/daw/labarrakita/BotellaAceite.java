package daw.labarrakita;

/**
 *
 * @author George
 */
public class BotellaAceite extends DecoratorCaja5 {

    Caja miCaja;

    public BotellaAceite(Caja configurable) {
        this.miCaja = configurable;
    }

    @Override
    public String getDescripcion() {
        return miCaja.getDescripcion() + "Botella de aceite";
    }

    @Override
    public double precio() {
        return 4 + miCaja.precio();
    }

}
