package entities;

import java.math.BigDecimal;
import java.util.Date;

public class CompraLibro {
	public String idCompra;
	public String idLibro;
	public String idEditorial;
	public String idEmpleado;
	public Date fecCompra;
	public BigDecimal precio;
	public int cantidad;
	public String libro;
	public String editorial;
	public String empleado;

	public CompraLibro() {

	}

	public CompraLibro(String idCompra, String idLibro, String idEditorial, String idEmpleado, Date fecCompra,
			BigDecimal precio, int cantidad, String libro, String editorial, String empleado) {
		//super();
		this.idCompra = idCompra;
		this.idLibro = idLibro;
		this.idEditorial = idEditorial;
		this.idEmpleado = idEmpleado;
		this.fecCompra = fecCompra;
		this.precio = precio;
		this.cantidad = cantidad;
		this.libro = libro;
		this.editorial = editorial;
		this.empleado = empleado;
	}

	public CompraLibro(String idCompra, String idLibro, String idEditorial, String idEmpleado, Date fecCompra,
			BigDecimal precio, int cantidad) {
		//super();
		this.idCompra = idCompra;
		this.idLibro = idLibro;
		this.idEditorial = idEditorial;
		this.idEmpleado = idEmpleado;
		this.fecCompra = fecCompra;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public CompraLibro(String idCompra, Date fecCompra, BigDecimal precio, int cantidad, String libro,
			String editorial, String empleado) {
		//super();
		this.idCompra = idCompra;
		this.fecCompra = fecCompra;
		this.precio = precio;
		this.cantidad = cantidad;
		this.libro = libro;
		this.editorial = editorial;
		this.empleado = empleado;
	}

	public String getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(String idCompra) {
		this.idCompra = idCompra;
	}

	public String getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(String idLibro) {
		this.idLibro = idLibro;
	}

	public String getIdEditorial() {
		return idEditorial;
	}

	public void setIdEditorial(String idEditorial) {
		this.idEditorial = idEditorial;
	}

	public String getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	
	public Date getFecCompra() {
		return fecCompra;
	}

	public void setFecCompra(Date fecCompra) {
		this.fecCompra = fecCompra;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getLibro() {
		return libro;
	}

	public void setLibro(String libro) {
		this.libro = libro;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getEmpleado() {
		return empleado;
	}

	public void setEmpleado(String empleado) {
		this.empleado = empleado;
	}
}
