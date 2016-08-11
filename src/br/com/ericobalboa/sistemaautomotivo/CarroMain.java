package br.com.ericobalboa.sistemaautomotivo;

public class CarroMain {

	public static void main(String[] args) {
		
		Carro fusca   = new Carro();
		fusca.ano     = 1965;
		fusca.cor     = "Azul";
		fusca.marca   = "Volkswagen";
		fusca.modelo  = "Fusca Itamar";
		fusca.motor   = 1.3;
		fusca.renavam = "1234567891011";
		
		
		Carro monza   = new Carro();
		monza.ano     = 1987;
		monza.cor     = "Preto";
		monza.marca   = "GM";
		monza.modelo  = "Classic";
		monza.motor   = 2.0;
		monza.renavam = "1234567891012";
		
		Carro corcel = new Carro("Ford",1.6,"Corcel","Amarelo",1970,"44324324235");
		
		System.out.println(fusca);
		System.out.println("");
		System.out.println(monza);
		System.out.println("");
		System.out.println(corcel);
	}
}
