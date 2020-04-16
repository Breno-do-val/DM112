package br.inatel.dm112.conta;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestContaPoupanca {

	@Test
	public void test() {
		
		ContaPoupanca breno = new ContaPoupanca(1, "Breno Ribeiro", 10);
		
		assertEquals(0, breno.getSaldo(), 0.1);
		
		breno.depositar(200);
		assertEquals(200, breno.getSaldo(), 0.1);
		
		try {
			breno.atualizarSaldo();
			assertEquals(220, breno.getSaldo(), 0.1);			
		} catch (SaldoInsuficienteException e) {
			fail("O saldo é 220: " + e.getMessage());
		}
		
		try {
			breno.atualizarSaldo();
			assertEquals(242, breno.getSaldo(), 0.1);
		} catch (SaldoInsuficienteException e) {
			fail("O saldo é 242: " + e.getMessage());
		}
		
		System.out.println("Saldo da conta: " + breno.getSaldo());
		
	}
	
}
