package sumativaUno;

import java.util.HashMap;
import java.util.Map;

public class Venta {

	private int id;
	private Map<Producto,Integer> productos;
	private Usuario usuario;
	
	public Venta() {
		
	}
	
	public Venta(int id,Usuario usuario) {
		this.id = id;
		this.productos = new HashMap<Producto,Integer>() ;
		this.usuario = usuario;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Map<Producto, Integer> getProductos() {
		return productos;
	}

	public void setProductos(Map<Producto, Integer> productos) {
		this.productos = productos;
	}

	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "ID: " + id + ", Productos: " + productos + ", Usuario: " + usuario + ",Total: $" + this.calcularTotal();
	}
	
	//CUSTOM METODOS
	public void agregarProducto(Producto prod,int cantidad) {
		this.productos.put(prod, cantidad);
	}
	
	public int calcularTotal() {
		int total = 0 ; 
		for (Map.Entry<Producto,Integer > entry : this.productos.entrySet()) {
		    total += entry.getKey().getPrecio() * entry.getValue();
		}
		return total;
	}
	
	public void actualizarCantidad(Producto prod,int cantidad) {
		this.productos.replace(prod, cantidad);
	}
	
	public boolean eliminarProducto(Producto prod) {
		if(this.productos.containsKey(prod)) {
			this.productos.remove(prod);
			return true;
		}else {
			return false;
		}
		
	}	
}
