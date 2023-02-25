package dao;

public class CineDAO {
	db.Db db = new db.Db("CineStar");

	public String[][] getCines() {
		db.Sentencia(String.format("call sp_getCines()"));
		return db.getRegistros();
	}

	public String[][] getCine(Object id) {
		db.Sentencia(String.format("call sp_getCine(%s)", id));
		return db.getRegistros();
	}

	public String[][] getCineTarifas(Object id) {
		db.Sentencia(String.format("call sp_getCineTarifas(%s)", id));
		return db.getRegistros();
	}

	public String[][] getCinePeliculas(Object id) {
		db.Sentencia(String.format("call sp_getCinePeliculas(%s)", id));
		return db.getRegistros();
	}

}
