

import com.generation.Carrito;
import com.generation.Producto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarritoTest {

    @Test
    void creacion(){

        Carrito c = new Carrito();
        assertTrue(c.estaVacio());
    }

    @Test
    void agregarProducto(){
        Producto producto = new Producto("Arepa de huevo",2.500,1);
        assertEquals(1, producto.getStock());
    }


    @Test
    void sumaProductos(){
        Producto producto = new Producto("Arepa de huevo",2.500,2);
        Producto producto2 = new Producto("Gaseosa",1.500,1);

        assertEquals(5.000,producto.getPrecio());

    }
}
