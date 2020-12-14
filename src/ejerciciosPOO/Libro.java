package ejerciciosPOO;

public class Libro {
	
	//Defino los atributos
	
	private String titulo ="";
	private String autor ="";
	private int ejemplares =0;
	private int ejemPrestados =0;
	
	//Constructor por defecto
	
	public Libro() {
		
	}
	
	//Constructor con parametros
	
	public Libro(String tituloIn, String autorIn, int ejemplaresIn, int ejemPrestadosIn) {
		titulo = tituloIn;
		autor = autorIn;
		ejemplares = ejemplaresIn;
		ejemPrestados = ejemPrestadosIn;
	}
	
	//get y set
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getEjemplares() {
		return ejemplares;
	}
	
	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}
	
	public int EjemPrestados() {
		return ejemPrestados;
	}
	
	public void setEjemPrestados(int ejemPrestados) {
		this.ejemPrestados = ejemPrestados;
	}
	
	//Metodo Prestamo
	
	public boolean Prestamo() {
		boolean prestamo = true;
		
		if(ejemPrestados < ejemplares) {
			ejemPrestados++;
		}else {
			prestamo = false;
		}
		
		return prestamo;
	}
	
	//Metodo devolucion
	
	public boolean Devolucion() {
		boolean devolucion = true;
		
		if(ejemPrestados == 0) {
			devolucion = true;
		}else {
			devolucion = false;
		}
		return devolucion;
	}
	
}
