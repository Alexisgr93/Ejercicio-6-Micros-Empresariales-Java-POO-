import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

class testMicro {

	Micro micro;
	
	Apurados apurado;
	Claustrofobico claustrofobico;
	Fiaca fiaca;
	Moderado moderado;
	
	
	@BeforeEach
	void setUp() throws Exception {
		
		micro = new Micro(2, 1, 100);
		apurado = new Apurados();
		claustrofobico = new Claustrofobico();
		fiaca = new Fiaca();
		moderado = new Moderado();
		
	}

	//@Test
	@Order(1)
	void test() {
		micro.subirA(apurado);
		
		System.out.println(micro.cantidadPasajeros());
	}
	
	//@Test
	@Order(2)
	void test2() {
		
		micro.subirA(claustrofobico);
		System.out.println(micro.cantidadPasajeros());
		
		micro.setVolumen(140);
		micro.subirA(claustrofobico);
		System.out.println(micro.cantidadPasajeros());
	}
	
	//@Test
	@Order(3)
	void test3() {
		micro.subirA(apurado);
		System.out.println(micro.cantidadPasajeros());
		
		//intento subir a fica porque apurado subia si o si siempre.
		micro.subirA(fiaca);
		System.out.println(micro.cantidadPasajeros());
	}

	
	@Test
	@Order(4)
	void test4() {
		micro.subirA(apurado);
		System.out.println(micro.cantidadPasajeros());
		
		moderado.setLugaresLibres(3);
		micro.subirA(moderado);
		System.out.println(micro.cantidadPasajeros());
		
		micro.bajarA(apurado);
		
		micro.subirA(moderado);
		System.out.println(micro.cantidadPasajeros());
	}

}
