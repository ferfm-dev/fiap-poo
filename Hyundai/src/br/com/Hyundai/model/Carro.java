package br.com.Hyundai.model;

public class Carro {
	public String modelo;
	public String cor;
	public float velocidadeAtual = 0;
	public boolean estaLigado = false;

	public void pintarCarro(String novaCor) {

		if (novaCor == "") {
			System.out.println("Você não inseriu nenhuma cor. Seu carro não será pintado.");
			return;
		}
		this.cor = novaCor;
		System.out.println("Você pintou o carro de: " + this.cor);
	}

	public void ligarCarro() {
		if (this.estaLigado == true) {
			System.out.println("Seu carro já está ligado.");
			return;
		}

		this.estaLigado = true;
		System.out.println("Seu carro foi ligado.");
	}

	public void desligarCarro() {
		if (this.estaLigado == false) {
			System.out.println("Seu carro já está desligado.");
			return;
		}

		this.estaLigado = false;
		System.out.println("Seu carro foi desligado.");
	}

}
