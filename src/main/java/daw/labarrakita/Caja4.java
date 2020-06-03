package daw.labarrakita;

/**
 *
 * @author George
 */
public class Caja4 extends Caja{

    public Caja4(){
        descripcion="Pack de cervezas, toallitas, papel higiénico, coca-cola, 2 barras de pan, botella de lejía y pasta de dientes";
    }
    
    @Override
    public double precio() {
        return 13.7-2;// El valor que devuelve es la suma de todos los productos restando 2 por el tema del descuento
    }
    
}
