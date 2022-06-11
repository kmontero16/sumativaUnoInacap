package sumativaUno;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Venta {

	private int id;
	private ArrayList<Producto> productos;
	private ArrayList <Integer> cantidadventa;
	private Usuario usuario;
	private Date fecha;
	
	public Venta() {
		
	}
	
	public Venta(int id,Usuario usuario, Date fecha) {
		this.id = id;
		this.productos = new ArrayList<Producto>() ;
		this.cantidadventa = new ArrayList <Integer>();
		this.usuario = usuario;
		this.setFecha(fecha);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public ArrayList<Integer> getCantidadventa() {
		return cantidadventa;
	}

	public void setCantidadventa(ArrayList<Integer> cantidadventa) {
		this.cantidadventa = cantidadventa;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "ID: " + id + ", Productos: " + productos + ", Usuario: " + usuario 
				+ ", Fecha: " + new SimpleDateFormat("yyyy-MM-dd").format(fecha) + ",Total: $" + this.calcularTotal();
	}
	
	//CUSTOM METODOS
	public void agregarProducto(Producto prod, int cant) {
		this.productos.add(prod);
		this.cantidadventa.add(cant);
	}
	
	public int calcularTotal() {
		int total = 0 ; 
		for (int i = 0; i< productos.size();i++) {
			total += productos.get(i).getPrecio() * cantidadventa.get(i);
		}
		return total;
	}
	
	public void actualizarCantidad(Producto prod,int cantidad) {
		for(int i = 0 ; i< productos.size();i++) {
			if (productos.get(i).getId() == prod.getId()){
				cantidadventa.set(i,cantidad);
			}
		}
	}
	
	public void eliminarProducto(Producto prod) {
		for(int i = 0; i<productos.size(); i++) {
			if(productos.get(i).getId()== prod.getId()) {
				productos.remove(i);
				cantidadventa.remove(i);
			}
		}
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}	
}
