package br.com.gregorio;

public class NumeroAleatorio {

	public double sorteio(double qtdSorteio) {
		return Math.random() * qtdSorteio + 1;
	}
}
