import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestExisteClaseProducto {

	@Test
	void test() {
		Producto producto = new Producto();
		
		assertNotNull(producto);
	}

}
