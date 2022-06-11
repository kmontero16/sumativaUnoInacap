package sumativaUno;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException {
		Database db = new Database();
		
		
		Producto p1 = new Producto(1, 1500, "Confort", 6);
		Producto p2 = new Producto(2, 2000, "Jabon", 4);
		Producto p3 = new Producto(3, 700, "Cepillo de dientes", 0);
		Producto p4 = new Producto(4, 3500, "Shampoo", 6);
		
		Usuario u1 = new Usuario(1,"Karla");
		Usuario u2 = new Usuario(2,"Jorge");
		
		Date date = new SimpleDateFormat("yyyy-MM-dd").parse("2018-09-09");
		
		db.agregarProducto(p1);
		db.agregarProducto(p2);
		db.agregarProducto(p3);
		db.agregarProducto(p4);
		
		db.agregarUsuario(u1);
		db.agregarUsuario(u2);
		
		p1.getDisponible();
		
		System.out.println("IMPRIMIR PRODUCTOS");
		db.listarProductos();
		
		System.out.println("IMPRIMIR USUARIOS");
		db.listarUsuarios();
		
		
		Date f1 = new Date();
		
		Venta v1 = new Venta(1,u1,f1);
		v1.agregarProducto(p1, 3);
		v1.agregarProducto(p2, 1);
		//System.out.println(v1.toString());
		
		Venta v2 = new Venta(2,u2,new Date ());
		v2.agregarProducto(p4, 2);
		v2.agregarProducto(p3, 5);
		//System.out.println(v2.toString());
		
		Venta v3 = new Venta(3,u1,new Date());
		v3.agregarProducto(p1, 6);
		v3.agregarProducto(p4, 1);
		//System.out.println(v3.toString());
		
		
		db.agregarVenta(v1);
		db.agregarVenta(v2);
		db.agregarVenta(v3);
		
		System.out.println("IMPRIMIR VENTAS");
		db.listarVentas();
		
		
		//System.out.println(db.getUsuario(1).toString());
		/*
		int opt = 0 ;
		do {
			
			
			
			
		}while (opt != 9);
	 	*/
	}
	
	public static void imprimirMenuPrincipal() {
		System.out.println("###### MENU ######");
		System.out.println("1 - Usuarios ");
		System.out.println("2 - Productos");
		System.out.println("3 - Ventas");
		System.out.println("9 - Salir");
	}
	public static void imprimirMenuUsuarios() {
		System.out.println("###### USUARIOS ######");
		System.out.println("1 - Crear Usuario ");
		System.out.println("2 - Editar Usuario");
		System.out.println("3 - Eliminar Usuario");
		System.out.println("4 - Listar Usuarios");
		System.out.println("0 - Salir");
	}
	public static void imprimirMenuProductos() {
		System.out.println("###### PRODUCTOS ######");
		System.out.println("1 - Crear Productos");
		System.out.println("2 - Editar Productos");
		System.out.println("3 - Eliminar Productos");
		System.out.println("4 - Listar Productos");
		System.out.println("0 - Salir");
	}
	public static void imprimirMenuVentas() {
		System.out.println("###### VENTAS ######");
		System.out.println("1 - Crear Venta");
		System.out.println("2 - Editar Venta");
		System.out.println("3 - Eliminar Venta");
		System.out.println("4 - Listar Ventas");
		System.out.println("0 - Salir");
	}
	public static void imprimirMenuEditarVenta() {
		System.out.println("###### EDITAR VENTAS ######");
		System.out.println("1 - Editar Usuario Venta");
		System.out.println("2 - Editar Productos Venta");
		System.out.println("3 - Mostrar Venta");
		System.out.println("0 - Salir");
	}

}
