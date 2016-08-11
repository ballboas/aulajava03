package br.com.ericobalboa.sistemabancario;

public class ContaMain {
	public static void main(String[] args) {
		
		Conta contaDoBalboa  = new Conta("Erico Balboa",1000);
		Conta contaDoGustavo = new Conta("Gustavo Lopez",9000000);
		
		contaDoBalboa.depositar(5000);
		
		contaDoGustavo.sacar(170);
		
		contaDoBalboa.imprimirExtratoResumido();
		contaDoGustavo.imprimirExtratoResumido();
	}

}
