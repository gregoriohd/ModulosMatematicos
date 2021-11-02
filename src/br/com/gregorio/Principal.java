package br.com.gregorio;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Neste Primeiro exemplo utilizaremos funcões matematicas pronta do java");
		
		System.out.println("Qual o maior entre dois numero: "+ new MaiorMenor().maior(10, 20) );
		System.out.println("Qual o menor entre dois numero: "+ new MaiorMenor().menor(110, 200) );
		System.out.println("1GB é igual a "+ new Potenciacao().potencia(2, 10)+" MB");
		
		
	}

}
