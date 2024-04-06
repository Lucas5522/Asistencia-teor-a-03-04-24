package ar.edu.unju.fi.Model;

public class RegistroNota {
	private String codigo;
	private Alumno alumno;
	private Materia materia;
	private double notaFinal;
	
	public RegistroNota() {
		// TODO Auto-generated constructor stub
	}

	public RegistroNota(String codigo, Alumno alumno, Materia materia, double notaFinal) {
		super();
		this.codigo = codigo;
		this.alumno = alumno;
		this.materia = materia;
		this.notaFinal = notaFinal;
	}

	
	
	
	
	
	@Override
	public String toString() {
		return "RegistroNota [codigo=" + codigo + ", alumno=" + alumno + ", materia=" + materia + ", notaFinal="
				+ notaFinal + "]";
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public double getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}

	
	
}
