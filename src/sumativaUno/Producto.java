package sumativaUno;

public class Producto {
	private int id;
	private int precio;
	private String nombre;
		
	public Producto() {
		
	}

	public Producto(int id, int precio, String nombre) {
		this.id = id;
		this.precio = precio;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "ID: " + id + ", Precio=" + precio + ", Nombre=" + nombre ;
	}
	
	
	
	
}
