package model;

public class funcionarios {
	static int codFuncionario,CodCargo;
	static String nomeFuncionario;
	
	public static void setCodFuncionario(int codFuncionario) {
		funcionarios.codFuncionario = codFuncionario;
	}
	
	public static void setCodCargo(int codCargo) {
		CodCargo = codCargo;
	}
	
	public static void setNomeFuncionario(String nomeFuncionario) {
		funcionarios.nomeFuncionario = nomeFuncionario;
	}
	
	public static int getCodFuncionario() {
		return codFuncionario;
	}
	
	public static int getCodCargo() {
		return CodCargo;
	}
	
	public static String getNomeFuncionario() {
		return nomeFuncionario;
	}
}
