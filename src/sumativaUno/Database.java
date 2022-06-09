package sumativaUno;

import java.util.HashMap;
import java.util.Map;

public class Database {

	private Map<Integer,Usuario> usuarios;
	private Map<Integer,Producto> productos;
	private Map<Integer,Venta>  ventas;
	
	public Database() {
		this.usuarios = new HashMap<Integer,Usuario>();
		this.productos = new HashMap<Integer,Producto>();
		this.ventas = new HashMap<Integer,Venta>();
	}
	
	//FUNCIONES USUARIOS
	public void agregarUsuario(Usuario u) {
		this.usuarios.put(this.usuarios.size(), u);
	}
	
	public void listarUsuarios() {
		this.usuarios.forEach( (i,u) -> System.out.println(i +  " " +u.toString()));
	}
	
	public void eliminarUsuario(Integer i) {
		this.usuarios.remove(i);
	}
	
	public void actualizarUsuario(Integer i, Usuario u ) {
		this.usuarios.replace(i, u);
	}
	
	public Usuario getUsuario(Integer i) {
		return this.usuarios.get(i);
	}
	
	//FUNCIONES PRODUCTOS
	public void agregarProducto(Producto p) {
		this.productos.put(this.productos.size(), p);
	}
	
	public void listarProductos() {
		this.productos.forEach( (i,p) -> System.out.println(i +  " " +p.toString()));
	}
	
	public void eliminarProducto(Integer i) {
		this.productos.remove(i);
	}
	
	public void actualizarProducto(Integer i, Producto p) {
		this.productos.replace(i, p);
	}
	
	public Producto getProducto(Integer i) {
		return this.productos.get(i);
	}
	
	//FUNCIONES VENTAS
	public void agregarVenta(Venta v) {
		this.ventas.put(this.ventas.size(), v);
	}
	
	public void listarVentas() {
		this.ventas.forEach( (i,v) -> System.out.println(i +  " " +v.toString()));
	}
	
	public void eliminarVenta(Integer i) {
		this.ventas.remove(i);
	}
	
	public void actualizarVenta(Integer i , Venta v) {
		this.ventas.replace(i, v);
	}
	
	public Venta getVenta(Integer i) {
		return this.ventas.get(i);
	}
	
	public void listarVentasUsuario(Usuario u) {
		this.ventas.forEach( (i,v) ->{
			if(v.getUsuario().getId() == u.getId()) {
				System.out.println(i +  " " +v.toString());
			}
		});
	}
	
	public void listarVentasProducto(Producto p) {
		this.ventas.forEach( (i,v) ->{
			if(v.getProductos().containsKey(p)) {
				System.out.println(i +  " " +v.toString());
			}
		});
	}
}
