package br.com.Hyundai.main;
import br.com.Hyundai.model.Carro;

public class SistemaPrincipal {

	public static void main(String[] args) {
		Carro carro1 = new Carro("hb20", "branco");

		Carro carro2 = new Carro("ix35", "prata");

		System.out.println("Informações do Carro 1:");
		System.out.println("Modelo: " + carro1.getModelo());
		System.out.println("Cor: " + carro1.getCor());
		System.out.println("Velocidade Atual: " + carro1.getVelocidadeAtual());
		System.out.println("Está ligado: " + carro1.getEstaLigado());

		System.out.println("Informações do Carro 2:");
		System.out.println("Modelo: " + carro2.getModelo());
		System.out.println("Cor: " + carro2.getCor());
		System.out.println("Velocidade Atual: " + carro2.getVelocidadeAtual());
		System.out.println("Está ligado: " + carro2.getEstaLigado());

		System.out.println("Alterações Carro 2:");
		carro2.ligarCarro();
		carro2.pintarCarro("Dourado");

	}

}
