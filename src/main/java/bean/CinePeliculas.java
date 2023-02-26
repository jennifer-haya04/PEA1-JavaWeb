package bean;

import java.util.ArrayList;
import java.util.List;

public class CinePeliculas {
	String Titulo="", Horario="";
	
	public CinePeliculas() {}
	
	public CinePeliculas(String Titulo, String Horario) {
		this.Titulo = Titulo;
		this.Horario = Horario;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getHorario() {
		return Horario;
	}

	public void setHorario(String horario) {
		Horario = horario;
	}

	public List<CinePeliculas> getCinePeliculas( String[][] mRegistros){
		if( mRegistros == null) return null;
		
		List<CinePeliculas> lstCinePeliculas = new ArrayList<>();
		for( String [] aCinePeli: mRegistros) {
			lstCinePeliculas.add(new CinePeliculas( aCinePeli[0], aCinePeli[1]));
		}
		
		return lstCinePeliculas;
	}
}
