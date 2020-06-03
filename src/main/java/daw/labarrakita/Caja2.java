package daw.labarrakita;

/**
 *
 * @author George
 */
public class Caja2 extends Caja{

    public Caja2(){
        descripcion="Bolsa de patatas fritas, pack de cervezas, bolsa de papa-delta, kikos mistercorn y paquete de lentejas";
    }
    
    @Override
    public double precio() {
        return 9-2;// El valor que devuelve es la suma de todos los productos restando 2 por el tema del descuento
    }
    
}
