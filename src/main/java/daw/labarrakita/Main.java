package daw.labarrakita;

/**
 *
 * @author George
 */
public class Main {

    public static void main(String[] args) {

        Caja configurable = new Caja1();
        System.out.println("La caja 1 tiene los siguientes productos: " + configurable.getDescripcion());
        System.out.println("En total su precio más el descuento son: " + configurable.precio() + " euros");

        configurable = new Caja2();
        System.out.println("La caja 2 tiene los siguientes productos: " + configurable.getDescripcion());
        System.out.println("En total su precio más el descuento son: " + configurable.precio() + " euros");
        
        configurable = new Caja3();
        System.out.println("La caja 3 tiene los siguientes productos: " + configurable.getDescripcion());
        System.out.println("En total su precio más el descuento son: " + configurable.precio() + " euros");
        
        configurable = new Caja4();
        System.out.println("La caja 4 tiene los siguientes productos: " + configurable.getDescripcion());
        System.out.println("En total su precio más el descuento son: " + configurable.precio() + " euros");
        
        System.out.println("-------------------------------------");
        
        // Vamos a crear la caja 5 con los productos que tenemos creado
        
        configurable = new CocaCola(configurable);
        configurable = new PastaDientes(configurable);
        configurable = new BotellaAceite(configurable);
        
        System.out.println("En la caja 5 has añadido los siguientes productos: " + configurable.getDescripcion());
        System.out.println("El precio total es: " + configurable.precio());
        
    }
}
