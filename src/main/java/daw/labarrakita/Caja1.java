package daw.labarrakita;

/**
 *
 * @author George
 */
public class Caja1 extends Caja{
    
    public Caja1(){
        descripcion="Toallitas, papel higiénico, coca-cola, 2 barras de pan, botella de lejía, pasta de dientes y botella de aceite";
    }

    @Override
    public double precio() {
        return 14.7-2;// El valor que devuelve es la suma de todos los productos restando 2 por el tema del descuento
    }
    
}
