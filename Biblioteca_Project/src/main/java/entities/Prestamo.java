package entities;

import java.util.Date;

public class Prestamo {
	private String idPrestamo;
	private Date fecPrestamo;
	private Date fecDevolucion;
	private String estado;
	private String idLibro;
	private String idAlumno;
	private String titulo;
	private String alumno;
	
	public Prestamo() {
	}
	
	public Prestamo(String idPrestamo, String titulo, String alumno, Date fecPrestamo, Date fecDevolucion, String estado) {
		this.idPrestamo = idPrestamo;
		this.titulo = titulo;
		this.alumno = alumno;
		this.fecPrestamo = fecPrestamo;
		this.fecDevolucion = fecPrestamo;
		this.estado = estado;
	}
	
	public Prestamo(String idPrestamo, Date fecPrestamo, Date fecDevolucion, String estado, String idLibro, String idAlumno, String ac1) {
		this.idPrestamo = idPrestamo;
		this.fecPrestamo = fecPrestamo;
		this.fecDevolucion = fecDevolucion;
		this.estado = estado;
		this.idLibro = idLibro;
		this.idAlumno = idAlumno;
	}

	public String getIdPrestamo() {
		return idPrestamo;
	}

	public void setIdPrestamo(String idPrestamo) {
		this.idPrestamo = idPrestamo;
	}

	public Date getFecPrestamo() {
		return fecPrestamo;
	}

	public void setFecPrestamo(Date fecPrestamo) {
		this.fecPrestamo = fecPrestamo;
	}

	public Date getFecDevolucion() {
		return fecDevolucion;
	}

	public void setFecDevolucion(Date fecDevolucion) {
		this.fecDevolucion = fecDevolucion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(String idLibro) {
		this.idLibro = idLibro;
	}

	public String getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(String idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAlumno() {
		return alumno;
	}

	public void setAlumno(String alumno) {
		this.alumno = alumno;
	}
}
