package C.TestesUnit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import C.ValidadorUser;


@RunWith(JUnit4.class)
public class Validador_Teste_Unit {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//Prints.msg("BeforeClass <--> setUpBeforeClass - Antes da classe.");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//Prints.msg("AfterClass <--> tearDownAfterClass - Depois da Classe");
	}

	@Before
	public void setUp() throws Exception {
		new ValidadorUser();
	}

	@After
	public void tearDown() throws Exception {
		
	}

	
	@Test
	public void validaCargo(){
		assertTrue("Valida cargo: ",ValidadorUser.validaCargo("Diretor")== true);
	}

	@Test
	public void validaSenha(){		
		assertTrue("Valida senha: ",ValidadorUser.validaSenha("1234")== true);		
	}

	@Test
	public void autenticaUser(){
		ValidadorUser.autenticaUser("Diretor", "1234");	}

	@Test
	public void verificaAcesso(){
		ValidadorUser.verificaAcesso("Diretor", "1234");
	}	
}
