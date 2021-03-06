package br.inatel.dm112.conta;

import java.util.HashMap;

public class GerenteContas {
	
	private HashMap<Integer, Atualizacao> contas = new HashMap<Integer, Atualizacao>();
	
	public void atualizarContas() {
		for (Atualizacao conta: contas.values()) {
			try {
				conta.atualizarSaldo();
			} catch(SaldoInsuficienteException e) {
				System.out.println("A conta " + conta.getNumero() + " n�o tem saldo para atualiza��o.");
			}
		}
	}
	
	public void adicionar(Atualizacao a) {
		this.contas.put(a.getNumero(), a);
	}
	
	public void removerConta(int numero) {
		this.contas.remove(numero);
	}
	
}
