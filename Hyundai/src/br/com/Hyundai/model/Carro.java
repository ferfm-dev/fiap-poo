package br.com.Hyundai.model;

public class Carro {
	private String modelo;
	private String cor;
	private float velocidadeAtual = 0;
	private boolean estaLigado = false;

	public Carro(String modelo, String cor) {
		this.setModelo(modelo);
		this.setCor(cor);
	}

	public void pintarCarro(String novaCor) {

		if (novaCor == "") {
			System.out.println("Você não inseriu nenhuma cor. Seu carro não será pintado.");
			return;
		}
		this.setCor(novaCor);
		System.out.println("Você pintou o carro de: " + this.cor);
	}

	public void ligarCarro() {
		if (this.estaLigado) {
			System.out.println("Seu carro já está ligado.");
			return;
		}

		this.estaLigado = true;
		System.out.println("Seu carro foi ligado.");
	}

	public void desligarCarro() {
		if (!this.estaLigado) {
			System.out.println("Seu carro já está desligado.");
			return;
		}

		this.estaLigado = false;
		System.out.println("Seu carro foi desligado.");
	}

	private void acelerar(float velocidade) {
		if (velocidade > 0) {
			this.velocidadeAtual += velocidade;
			return;
		}
		System.out.println("Velocidade inválida.");
	}

	public void desacelerar(float velocidade) {
		if (velocidade > 0) {
			this.velocidadeAtual -= velocidade;
			return;
		}
		System.out.println("Velocidade inválida.");
	}

	public String getModelo() {
		return this.modelo;
	}

	private void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return this.cor;
	}

	private void setCor(String cor) {
		this.cor = cor;
	}

	public String getEstaLigado() {
		if (this.estaLigado) {
			return "ligado";
		}
		return "desligado";
	}

	private void setEstaLigado(boolean estaLigado) {
        this.estaLigado = estaLigado;
	}

	public float getVelocidadeAtual() {
		return this.velocidadeAtual;
	}

	public void setVelocidadeAtual(float velocidade) {
		if (velocidade > 0) {
			this.velocidadeAtual = velocidade;
			return;
		}
		System.out.println("Velocidade inválida");
	}
}
