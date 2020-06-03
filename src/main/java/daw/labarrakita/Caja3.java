package daw.labarrakita;

/**
 *
 * @author George
 */
public class Caja3 extends Caja{

    public Caja3(){
        descripcion="Bolsa de patatas fritas, pack de cervezas, paquete de garbanzos, fideos chinos rápidos, judías de lata litoral y azúcar";
    }
    
    @Override
    public double precio() {
        return 11-2;// El valor que devuelve es la suma de todos los productos restando 2 por el tema del descuento
    }
    
}
