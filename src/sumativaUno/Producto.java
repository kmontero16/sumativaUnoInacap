package sumativaUno;

public class Producto {
	private int id;
	private int precio;
	private String nombre;
	private int disponible;
		
	public Producto() {
		
	}

	public Producto(int id, int precio, String nombre, int disponible) {
		this.id = id;
		this.precio = precio;
		this.nombre = nombre;
		this.disponible = disponible;
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
	
	public int isDisponible() {
		if (disponible > 0 ) {
		return disponible;
		}
		else {
		System.out.println("No hay disponibilidad de producto");
		}
		return disponible;
			
	}
	public void setDisponible(int disponible) {
		this.disponible = disponible;
	}
	
	@Override
	public String toString() {
		return "ID: " + id + ", Precio=" + precio + ", Nombre=" + nombre+ ",Disponible= "+ disponible ;
	}
	
	
	
	
}
