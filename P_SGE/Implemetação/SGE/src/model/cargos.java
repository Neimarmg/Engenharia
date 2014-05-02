package model;

public class cargos {
	static int codCargo;
	static String descCargo;
	
	public static void setCodCargo(int codCargo) {
		cargos.codCargo = codCargo;
	}
	
	public static void setDescCargo(String descCargo) {
		cargos.descCargo = descCargo;
	}
	
	public static int getCodCargo() {
		return codCargo;
	}
	public static String getDescCargo() {
		return descCargo;
	}
}
