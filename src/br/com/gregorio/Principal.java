package br.com.gregorio;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Neste Primeiro exemplo utilizaremos funcões matematicas pronta do java");
		
		System.out.println("Qual o maior entre dois numero: "+ new MaiorMenor().maior(10, 20) );
		System.out.println("Qual o menor entre dois numero: "+ new MaiorMenor().menor(110, 200) );
		System.out.println("1GB é igual a "+ new Potenciacao().potencia(2, 10)+" MB");
		System.out.println("A raiz quadrada é "+ new RaizQuadrada().raiz(100));
		System.out.println("o numero sorteado é "+ (int)new NumeroAleatorio().sorteio(10));
		System.out.println("Soma maxima de numero do tipo int "+ new MaxIntSoma().soma(999999999, 999999999));
		
	}

}
