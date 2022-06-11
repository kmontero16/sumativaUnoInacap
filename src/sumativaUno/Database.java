package sumativaUno;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

//Registro de Ventas
public class Database {

	private ArrayList<Usuario> usuarios;
	private ArrayList<Producto> productos;
	private ArrayList<Venta>  ventas;
	
	
	public Database() {
		this.usuarios = new ArrayList<Usuario>();
		this.productos = new ArrayList<Producto>();
		this.ventas = new ArrayList<Venta>();
		
	}
	
	
	//FUNCIONES USUARIOS 	| Registro de usuario
	public void agregarUsuario(Usuario u) {
		this.usuarios.add(u);
	}
	
	public void listarUsuarios() {
		System.out.println(this.usuarios);
	}
	
	public void eliminarUsuario(Usuario u) {
		this.usuarios.remove(u);
	}
	
	public void actualizarUsuario( Usuario u ) {
		//this.usuarios.replace(u);
		//Si variable es igual a cero, menor o igual a lista usuario y revisando uno por uno...
		for (int i=0;i<=this.usuarios.size();i++) {
			
			if(this.usuarios.get(i).getId()==u.getId()) {
				this.usuarios.set(i,u);
			}
			else
			System.out.println("Usuario existente");	
		}
	}
	
	public Usuario getUsuario(Integer i) {
		return this.usuarios.get(i);
	}
	
	
	//FUNCIONES PRODUCTOS  | Registro de productos
	public void agregarProducto(Producto p) {
		this.productos.add(p);
	}
	
	public void listarProductos() {
		System.out.println(this.productos);
	}
	
	public void eliminarProducto(Producto p) {
		this.productos.remove(p);
	}
	
	public void actualizarProducto(Producto p) {
		//this.productos.replaceAll(i, p);
		for (int i=0;i<=this.productos.size();i++) {
			if (this.productos.get(i).getId()==p.getId()) {
				this.productos.set(i, p);
		}
			else
				System.out.println("Producto existente");
		}		
	}
	
	public Producto getProducto(Integer i) {
		return this.productos.get(i); 
	}
	
	//FUNCIONES VENTAS   |Registro de ventas
	public void agregarVenta(Venta v) {
		this.ventas.add(v);
	}
	
	public void listarVentas() {
		System.out.println(ventas);
	}
	
	public void eliminarVenta(Venta v) {
		this.ventas.remove(v);
	}
	
	public void actualizarVenta(Venta v) {
		//this.ventas.replaceAll(v);
		for (int i=0;i<=this.ventas.size();i++) {
			if (this.ventas.get(i).getId()==v.getId()) {
				this.ventas.set(i, v);
		}
			else
				System.out.println("Venta registrada");
		}
	}
	
	public Venta getVenta(Integer i) {
		return this.ventas.get(i);
	}
	
	/*public void listarVentasUsuario(Usuario u) {
		this.ventas.forEach( (i,v)->{
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
	}*/

	public void listarVentasUsuario (Usuario u) {
		for(int i=0;i<=this.ventas.size();i++) {
			if(this.ventas.get(i).getUsuario().getId() == u.getId()) {
				System.out.println(this.ventas.get(i).toString());
				
			}
		}
			
	
	}
	
	
	}
	
	
