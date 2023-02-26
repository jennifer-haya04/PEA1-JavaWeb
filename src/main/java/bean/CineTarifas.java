package bean;

import java.util.ArrayList;
import java.util.List;

public class CineTarifas {
	String DiasSemana="", Precio="";
	
	public CineTarifas() {
		
	}
	
	public CineTarifas(String Dias, String Precio) {
		this.DiasSemana = Dias;
		this.Precio = Precio;
	}

	public String getDiasSemana() {
		return DiasSemana;
	}

	public void setDiasSemana(String diasSemana) {
		DiasSemana = diasSemana;
	}

	public String getPrecio() {
		return Precio;
	}

	public void setPrecio(String precio) {
		Precio = precio;
	}
	
	public List<CineTarifas> getCineTarifas( String[][] mRegistros){
		if( mRegistros == null) return null;
		
		List<CineTarifas> lstCineTarifas = new ArrayList<>();
		for( String [] aCineTarifa: mRegistros) {
			lstCineTarifas.add(new CineTarifas( aCineTarifa[0], aCineTarifa[1]));
		}
		
		return lstCineTarifas;
	}
	
	
}
