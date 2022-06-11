package sumativaUno;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException {
		//Se instancia objeto de la clase Database para almacenar ventas, productos y usuarios.
		Database db = new Database();
		
		//Se inicializa objetos de la clase producto para agregar sus datos.
		Producto p1 = new Producto(1, 1500, "Confort", 6);
		Producto p2 = new Producto(2, 2000, "Jabon", 4);
		Producto p3 = new Producto(3, 700, "Cepillo de dientes", 0);
		Producto p4 = new Producto(4, 3500, "Shampoo", 6);
		
		//Se inicializa objetos de la clase usuario para asignar datos.
		Usuario u1 = new Usuario(1,"Karla");
		Usuario u2 = new Usuario(2,"Jorge");
		
		//Se agregan productos a la base de datos.
		db.agregarProducto(p1);
		db.agregarProducto(p2);
		db.agregarProducto(p3);
		db.agregarProducto(p4);
		
		//Se agregan usuarios productos a la base de datos.
		db.agregarUsuario(u1);
		db.agregarUsuario(u2);
		
		p1.getDisponible();
		
		//Se listan los productos
		System.out.println("IMPRIMIR PRODUCTOS");
		db.listarProductos();
		
		//Se listan los productos
		System.out.println("IMPRIMIR USUARIOS");
		db.listarUsuarios();
		
		//Se instancia la fecha
		Date date = new SimpleDateFormat("yyyy-MM-dd").parse("2018-09-09");
		Date f1 = new Date();
		
		//Se instancia un objeto de la clase venta y se asignan datos a la clase venta
		Venta v1 = new Venta(1,u1,f1);
		v1.agregarProducto(p1, 3);
		v1.agregarProducto(p2, 1);
		
		Venta v2 = new Venta(2,u2,new Date ());
		v2.agregarProducto(p4, 2);
		v2.agregarProducto(p3, 5);
		//System.out.println(v2.toString());
		
		Venta v3 = new Venta(3,u1,new Date());
		v3.agregarProducto(p1, 6);
		v3.agregarProducto(p4, 1);
		//System.out.println(v3.toString());
		
		//Se agregan las ventas a la base de datos
		db.agregarVenta(v1);
		db.agregarVenta(v2);
		db.agregarVenta(v3);
		
		//Se imprimen las ventas
		System.out.println("IMPRIMIR VENTAS");
		db.listarVentas();
	}

}
