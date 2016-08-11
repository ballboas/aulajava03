package br.com.ericobalboa.sistemaautomotivo;

public class Carro {

	String marca;
	double motor;
	String modelo;
	String cor;
	int    ano;
	String renavam;
	
	public Carro (){
		
	}
	public Carro(String marca, double motor, String modelo, String cor, int ano, String renavam){
		this.marca 	 = marca;
		this.motor 	 = motor;
		this.modelo  = modelo;
		this.cor 	 = cor;
		this.ano 	 = ano;
		this.renavam = renavam;
	}
	
	public void setMarca(String marca){
		this.marca = marca;
	}
	
	@Override
	public String toString(){
		return "Modelo: " + this.modelo + "\n" +
			   "Marca: "  + this.marca  + "\n" + 
			   "Cor: "	  + this.cor;
	}
	
}
