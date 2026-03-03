package br.com.Hyundai.main;
import br.com.Hyundai.model.Carro;

public class SistemaPrincipal {

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		carro1.modelo = "hb20";
		carro1.cor = "branco";

		Carro carro2 = new Carro();
		carro2.modelo = "ix35";
		carro2.cor = "Prata";

		System.out.println("Informações do Carro 1:");
		System.out.println("Modelo: " + carro1.modelo);
		System.out.println("Cor: " + carro1.cor);
		System.out.println("Velocidade Atual: " + carro1.velocidadeAtual);
		System.out.println("Está ligado: " + carro1.estaLigado);

		System.out.println("Informações do Carro 2:");
		System.out.println("Modelo: " + carro2.modelo);
		System.out.println("Cor: " + carro2.cor);
		System.out.println("Velocidade Atual: " + carro2.velocidadeAtual);
		System.out.println("Está ligado: " + carro2.estaLigado);

		System.out.println("Alterações Carro 2:");
		carro2.ligarCarro();
		carro2.pintarCarro("Dourado");

	}

}
