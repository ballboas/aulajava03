package br.com.ericobalboa.sistemabancario;

public class Conta {
	private String nome;
	private double saldo;
	double limiteCredito;
	
	public Conta(String nome, double saldo){
		this.nome 		   = nome;
		this.saldo 		   = saldo;
		this.limiteCredito = saldo * 0.3;
	}
	
	public void depositar(double valor){
		this.saldo += valor;
	}
	
	public void sacar(double valor){
		this.saldo -= valor;
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String nomeBanco(){
		return "BANCO PIRATA";
	}
	
	public String barra(){
		return "=========================";
	}
	
	public String cabecalho(){
		return barra() 	   + "\n" +
			   nomeBanco() + "\n" +
			   barra() ;
	}
	
	public void imprimirExtratoResumido(){
		System.out.println(cabecalho());
		
		System.out.println("Nome do Favorecido: "+ getNome());
		System.out.println("Saldo R$ "+getSaldo());
		System.out.println("Limite de Credito R$ "+limiteCredito);
		System.out.println(barra());
		
	}
	
	@Override
	public String toString(){
		return "Nome " + this.nome + " Saldo " + this.saldo;
	}

}
