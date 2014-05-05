package controller.TestesUnit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import controller.Validador;

@RunWith(JUnit4.class)
public class Validador_Teste_Unit {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//Prints.msg("BeforeClass <--> Passei pelo setUpBeforeClass - Antes da classe.");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//Prints.msg("AfterClass <--> Passei pelo tearDownAfterClass - Depois da Classe");
	}

	@Before
	public void setUp() throws Exception {
		new Validador();
	}

	@After
	public void tearDown() throws Exception {
		
	}

	
	@Test
	public void validaCargo(){
		assertTrue("Valida cargo: ",Validador.validaCargo("Diretor")== true);
	}

	@Test
	public void validaSenha(){		
		assertTrue("Valida senha: ",Validador.validaSenha("1234")== true);		
	}

	@Test
	public void autenticaUser(){
		Validador.autenticaUser("Diretor", "1234");	}

	@Test
	public void verificaAcesso(){
		Validador.verificaAcesso("Diretor", "1234");
	}	
}
