package model;

public class Usuarios {
	static int codOpcao,user,senha;
	
	public static void setCodOpcao(int codOpcao) {
		Usuarios.codOpcao = codOpcao;
	}
	
	public static void setUser(int user) {
		Usuarios.user = user;
	}
	
	public static void setSenha(int senha) {
		Usuarios.senha = senha;
	}
	
	public static int getCodOpcao() {
		return codOpcao;
	}
	
	public static int getUser() {
		return user;
	}
	
	public static int getSenha() {
		return senha;
	}
}
