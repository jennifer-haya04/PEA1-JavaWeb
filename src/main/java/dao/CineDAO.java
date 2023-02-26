package dao;

import java.util.List;

import bean.Cine;
import bean.CinePeliculas;
import bean.CineTarifas;

public class CineDAO {
	db.Db db = new db.Db("CineStar");

	public String[][] getCines() {
		db.Sentencia(String.format("call sp_getCines()"));
		return db.getRegistros();
	}

	public String[] getCine(Object idCine) {
		db.Sentencia(String.format("call sp_getCine(%s)", idCine));
		return db.getRegistro();
	}

	public String[][] getCineTarifas(Object id) {
		db.Sentencia(String.format("call sp_getCineTarifas(%s)", id));
		return db.getRegistros();
	}

	public String[][] getCinePeliculas(Object id) {
		db.Sentencia(String.format("call sp_getCinePeliculas(%s)", id));
		return db.getRegistros();
	}

	public List<Cine> getCinesList() {
		db.Sentencia(String.format("call sp_getCines()"));
		return new Cine().getRegistros(db.getRegistros());
	}

	public Cine getCineList(Object idCine) {
		db.Sentencia(String.format("call sp_getCine(%s)", idCine));
		return new Cine(db.getRegistro());
	}

	public List<CineTarifas> getCineTarifasList(Object idCine) {
		db.Sentencia(String.format("call sp_getCineTarifas(%s)", idCine));
		return new CineTarifas().getCineTarifas(db.getRegistros());
	}

	public Object getCinePeliculasList(Object idCine) {
		db.Sentencia(String.format("call sp_getCinePeliculas(%s)", idCine));
		return new CinePeliculas().getCinePeliculas(db.getRegistros());
	}

}
