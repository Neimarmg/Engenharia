package model;

public class Usuarios {
	static String cargo = "Diretor";
	static String user = "Jose";
	static String senha = "1234";
	
		
	public static void setCargo(String cargo) {
		Usuarios.cargo = cargo;
	}
	
	public static void setSenha(String senha) {
		Usuarios.senha = senha;
	}
	
	public static void setUser(String user) {
		Usuarios.user = user;
	}
	
	
	
	public static String getCargo() {
		return cargo;
	}
	
	public static String getSenha() {
		return senha;
	}
	
	public static String getUser() {
		return user;
	}
}
